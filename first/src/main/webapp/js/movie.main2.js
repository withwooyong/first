
var LiveMedia = {
	config : {
		id : '',
		defaultId : 'viewrate',
		mode : 'down',
		upGap : 100,
		downGap : 500,
		isBindScroll: true,
		lastScroll : 0
	},
	parameters : {
		viewrate 	: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all"},
		free 		: {pageSize:20,order:"rating",adult:"n",free:"y",guest:"all"},
		my 			: {pageSize:20,contentType:"channel"},
		purchase 	: {pageSize:200},
		onair  		: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",broadType:"CPSE0100"},
		cjenm 		: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",channelCode:"C00544,C00551,C00558,C00575,C00579,C00582,C00590,C00754,C00837,C00924,C00928,C00931,C00932,C01001,C01021,C01081,C01083,C01141,C01142,C01143,C01241,C01345,C01402,C01441,C01722,C01761,C01762,C01221,C01763,C01841,C02041,C02241,C02242,C02401"},
		art 		: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG180"},
		story 		: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG100,CG110"},
		leisure 	: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG120"},
		news : {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG130,CG190"},
		child 		: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG140,CG150"},
		education 	: {pageSize:20,order:"rating",adult:"n",free:"all",guest:"all",categoryCode:"CG160,CG170"},
		adult 		: {pageSize:20,order:"rating",adult:"y",free:"all",guest:"all"},
		all 		: {pageSize:200,order:"chno",adult:"n",free:"all",guest:"all"}
	},
	highlight : [
        'viewrate'
    ],
	init : function() {
		var me = LiveMedia;
		me.pageInit();
		
		// scroll event bind
		$(window).scroll(function(e) {
			me.bindScroll();
		});
		
		// 서브 카테고리 메뉴 이동 event bind
		$('#div_nav_tab').find('a').click(function(e){
	    	e.preventDefault();
	    	var href = $(this).attr('href');
	    	var hash = '#'+ (History.getHash() || 'id=' + me.config.defaultId);
	    	var idx = location.href.indexOf('#');
        	if (idx > -1 &&  location.href.substring(idx) == '#'){
        		hash = '';
        	}
	    	
	    	if (href != hash){
	    		var id = getParameter(href.replace('#',''), 'id');
	    		if (!user_yn && (id == 'my' || id == 'purchase' || id == 'adult') ){
	    			userLoginCheck();
	    			goLoginPage();
	    			history.back();
					return false;	    			
	    		}
	    		location.href = href;
	    	}
	    });
		
		// 더 보기 event bind
		$('#div_more').find('a').click(function(e){
			me.jarvisRequest();
		});
		
		// 정렬 event bind
		var $sorting = $('#div_sorting').find('a');
		$sorting.click(function(e){
			var $order = $(this);
			if (!$order.hasClass('on')){
				$sorting.removeClass('on');
				$order.addClass('on');
				me.pageInit();
			}
		});
		
		// 추천 영역 팬 등록 event bind
		$('#recommend_add').click(function(e){
			me.insertFavorite();
		});
	},
	pageInit : function() {
		var me = LiveMedia;
		
		var id = getParameter(History.getHash(), 'id') || me.config.defaultId;
		me.config.id = id;
		
		if (!user_yn && (id == 'my' || id == 'purchase' || id == 'adult') ){
			userLoginCheck();
			history.back();
			return false;	    			
		}
		
		// 선택 카테고리 타이틀 처리
		var $nav_tab = $('#div_nav_tab');
		$nav_tab.find('li').removeClass('on');
		$nav_tab.find('a[href^="#id='+id+'"]').each(function(){
			var $li = $(this).parent();
			$li.addClass('on');
			var title = '';
			if (!$li.parent().hasClass('depth1')){
				title = $(this).text();
				$(this).html(title + ' <span></span>');
			}
			
			if (id == 'all'){
				$('#sub_title').html('');
			} else if (id == 'my' || id == 'purchase'){
				$('#all_channel').hide();
				$('#sub_title').html(title);
			} else {
				$('#all_channel').hide();
				$('#sub_title').html(title+ ' <span class="dv">|</span> <em id="total_count"></em>');
			}
		});
		
		$('#div_more').show();
		
		if (id == 'viewrate' || id == 'purchase' || id == 'my' || id == 'all'){
			$('#div_sorting').hide();
		} else {
			$('#div_sorting').show();
		}
		
		// highlight 영역 노출
   		if (me.highlight.indexOf(id) > -1){
   			var positionKey = 'PCV4_LIVE_CENTER_' + id.toUpperCase();
   			jarvisHighlight.getList({positionKey : positionKey}, function(response){
   				var result = response.result;
   				
   				var highlightList = new Array();
   				if (result && result.length > 0){
   					var notChannelCode = new Array();
   					$(result).each( function(index, item){
   						if (item.content_type == 'live'){
   							item.highligh_yn = 'Y';
   							highlightList.push(item);
   							notChannelCode.push(item.content.live_code);
   						}
   					});
   					me.parameters[id].notChannelCode = notChannelCode.join(',');
   				}
   					
   				me.jarvisRequest('down', 1, highlightList);
   			});
   		} else {
   			me.jarvisRequest('down', 1);
   		}
	},
	jarvisRequest : function(mode, pageNo, highlightList){
		var me = LiveMedia;
		if (!me.config.isBindScroll || $('#div_more').css('display') == 'none'){
			return false;
		}
		
		var id = me.config.id;
		mode = mode || 'down';
		pageNo = pageNo || me.getPageNo(id, mode);
		highlightList = highlightList || new Array();
		
		me.config.mode = mode;
		
		if (pageNo < 1){
			return false;
		}
		
		var params = $.extend(me.parameters[id], { 'pageNo':pageNo });
		me.setOrder(params);
		
		var jarvisFn;
		if (id=='my'){
			jarvisFn = jarvisCommunity.getFavoriteList;
		} else if (id=='purchase'){
			jarvisFn = jarvisMy.getMyLiveList;
		} else if (id=='all'){
			jarvisFn = jarvisChannel.getList;
		} else {
			jarvisFn = jarvisLive.getLives;
		}
		
		try {
			me.showLoading(pageNo);
			me.unBindScroll();
			jarvisFn(params, function(response){
				if (highlightList && highlightList.length > 0){
					response.result = highlightList.concat(response.result);
				}
				me.jarvisResponse(params, response);
				me.hideLoading();
				me.config.isBindScroll = true;
			});
		} catch(e){
			if (console) console.log(e);
			me.config.isBindScroll = true;
		}
	},
	jarvisResponse : function(params, response){
		
		var me = LiveMedia;
		var id = me.config.id;
		
		if (response.has_more == 'N' || id == 'purchase' || id == 'all'){
			$('#div_more').hide();
		}
		
		if (id != 'my' || id != 'purchase' || id != 'all') {
			$('#total_count').text(response.total_count);
		}
		
		if (me.config.id=='all'){
			me.renderAllChannel(params, response.result);
		} else {
			me.renderContents(params, response.result);
		}
	},
	renderContents : function(params, result){
		var me = LiveMedia;
		var id = me.config.id;
		
		var html = '';
		var gradeNum = 0;
		$(result).each(function (index, item) {
			try {
				var data = item.content || item.live || item ;
				
				if (data && data.schedule){
					
					var schedule = data.schedule;
					var linkUrl = ctx +'/live/player/'+ data.live_code;
                    var channelName = schedule.channel.name.ko.htmlChars();
                    var displayName = '';
                    if (schedule.program && schedule.schedule_type == 'CSMD0100') {
                        displayName = schedule.program.name.ko.htmlChars();
                    } else if (schedule.movie && schedule.schedule_type == 'CSMD0200') {
                        displayName = schedule.movie.name.ko.htmlChars();
                    } else if (schedule.ad && schedule.schedule_type == 'CSMD0300') {
                        displayName = schedule.ad.ad_name.ko.htmlChars();
                    } else if (schedule.clip && schedule.schedule_type == 'CSMD0400') {
                        displayName = schedule.clip.clip_name.ko.htmlChars();
                    }
                    
                    var isHighligh = (item.highligh_yn && item.highligh_yn == 'Y') ? true : false;
                    if (id == 'viewrate' && !isHighligh && params.pageNo == 1){
    					gradeNum++;
    				}
                    
                    var imageUrl =  jarvisCommons.getResizeImageUrl(data, 180, imageOriginDomain);
                    
					html +='<li data-page-no="' + params.pageNo + '" >'
						 + '	<div class="ui_meta live">'
						 + '		<a href="'+ linkUrl +'" title="'+displayName +'">'
						 + '			<div class="thmb">';
					if (isHighligh){
                    	html +='			<em class="label push">추천</em>';
         			}  else if( gradeNum > 0 && gradeNum <= 10){
         				html +='			<em class="label grade num'+ gradeNum +'">'+ gradeNum +'</em>'; 
         			}
					if (schedule.channel.free_yn == 'Y'){	 
						html +='			<span class="ic_area"><em class="ic_type free">무료</em></span>';
					}
					html +='				<img src="'+ imageUrl +'" width="180" height="120" alt="'+displayName +'">'
						 + '				<span class="border_op"></span><span class="ic_play"><span></span><span></span></span>'
						 + '			</div>'
						 + '			<dl>'
						 + '				<dt><span class="ellipsis">'+ channelName  +'</span> '+ (data.live_rating.realtime || '0')  +'%</dt>'
						 + '				<dd>';
					if (schedule.channel.adult_yn == 'Y'){
						html +='				<em class="ic_type adult">19세 이상 관람가</em>';
					}
					html +='	 				<span class="ellipsis">'+ displayName  +'</span>';
					if (schedule.episode && schedule.episode.frequency){
						html +=					schedule.episode.frequency +'화';
					}
					html +='	 			</dd>'
						 + '			</dl>'
						 + '		</a>'
						 + '	</div>'
						 + '</li>';
				}
			} catch(e) {
				if (console) console.log(e);
			}
		});
		
		if (html!=''){
			if (params.pageNo == 1){
				$('#list_sub').html(html);
			} else {
				$('#list_sub').append(html);
			}
			
			if ($('#contents_list_area').css('display')=='none'){
				$('.sub_list_area').hide();
				$('#contents_list_area').show();
			}
		} else if (id=='my'){
			// 추천 컨텐츠 노출
			jarvisMy.getMyLastList( $.extend(me.parameters['my'], {pageNo:1, pageSize:20}), function(response){
				var result = new Array();
				$(response.result).each(function (index, item) {
					if (item.content && item.content.schedule){
						result.push(item);
					}
					if (result.length == 10) return false; 
				});
				
				if (result.length < 10){
					var tempParams = $.extend({}, me.parameters['viewrate']);
					jarvisLive.getLives($.extend(tempParams, {pageNo:1, pageSize:10, notChannelCode:''}), function(response){
						result = response.result;
						me.renderRecommend(result);
					});
				} else {
					me.renderRecommend(result);
				}
			});
		} else if (id=='purchase'){
			$('.sub_list_area').hide();
			$('#div_none_pass').show();
		}
	},
	renderRecommend : function(result){
		var me = LiveMedia;

		var html = '';
		$(result).each(function (index, item) {
			var data = item.content || item;
			if (data && data.schedule){
				var channel = data.schedule.channel;
				
				var id = 'recommend_' + channel.code;
				var channelName = channel.name.ko.htmlChars();
				var imageUrl = imageDomain + jarvisCommons.getImage(channel.image, 'CAIC1200');
				
				html +='<li title="'+ channelName +'">'
					 + '	<input type="checkbox" id="'+ id +'" value="'+ channel.code +'" >'
					 + '	<label for="'+ id +'">'
					 + '		<img src="'+ imageUrl +'" width="90" height="63" alt="'+ channelName +'"><span></span><em></em>'
					 + '	</label>'
					 + '</li>';
				
			}
		});
		
		var $recommend = $('#div_recommend');
		
		$recommend.find('.list_ch').html(html);
		$recommend.find('input:checkbox').click(function() {
			var $checkbox = $(this);
			if ($checkbox.hasClass("on")){
				$checkbox.parent().removeClass("on");
				$checkbox.removeClass("on");
			} else {
				$checkbox.parent().addClass("on");
				$checkbox.addClass("on");
			}
		});
		
		$('.sub_list_area').hide();
		$recommend.show();
	},
	renderAllChannel : function(params, result){

		var me = LiveMedia;
		var $all_channel = $('#all_channel');
		
		var categoryArr = new Array();
		$all_channel.find('.tit_2depth').each(function(){
			categoryArr.push({key : $(this).data('category'), value : new Array()});
		});
		
		$(result).each(function (index, channel) {
			var linkUrl = ctx +'/live/player/'+ channel.code;
			var channelName = channel.name.ko.htmlChars();
			var imageUrl = imageDomain + jarvisCommons.getImage(channel.image, 'CAIC1200');
			
			var html = '<li><a href="'+ linkUrl +'" title="'+ channelName +'"><img src="'+ imageUrl +'" width="90" height="63" alt="'+ channelName +'"></a></li>';
			
			$(categoryArr).each(function(idx, category){
				var key = category.key;
				if (key=='onair'){
					if (me.parameters[key].broadType == channel.broadcast_type){
						category.value.push(html);
					}
				} else if(key=='cjenm'){
					if (me.parameters[key].channelCode.indexOf(channel.code) > -1){
						category.value.push(html);
					}
				} else {
					if (me.parameters[key].categoryCode.indexOf(channel.category_code) > -1){
						category.value.push(html);
					}
				}
			});
		});
		
		$(categoryArr).each(function(idx, category){
			var key = category.key;
			$all_channel.find('.tit_2depth').each(function(){
				if (key == $(this).data('category')){
					$all_channel.find('.' + key).html(category.value.join(''));
				}
			});
		});
		
		if ($all_channel.css('display')=='none'){
			$('.sub_list_area').hide();
			$all_channel.show();
		}
	},
	insertFavorite : function(){
		var count = 0;
		$('#div_recommend').find('input:checkbox').each(function(index, data){
			var $checkbox = $(this);
			if ($checkbox.hasClass("on")){
				jarvisCommunity.insertFavorite($checkbox.val(), function(){});
				count++;
			}
		});
		if (count>0){
			alert('마이채널에 추가했어요.');
		} else {
			alert('마이채널에 등록할 채널을 선택해주세요.');
		}
	},
	showLoading: function(pageNo) {
		var no = pageNo || 1;
		$('#container').after('<div id="div_loading" class="loading">로딩중</div>');
		if (no>1){
			$('#div_loading').css("top", $(document).height() - $(window).height() / 2);
		} else {
			$('#div_loading').css("top", $(window).height() / 2);
		}
	},
	hideLoading: function() {
		$("#div_loading").remove();
	},
	getPageNo : function(id, mode){
		if (id=='all'){
			return -1;
		}
		var $listArea = $('#list_sub');
		
		if (mode=='down'){
			var lastPageNo = $listArea.find('li:last').data('pageNo');
			if(lastPageNo){
				return (lastPageNo + 1);
			}
			return 1;
		} else {
			var firstPageNo = $listArea.find('li:first').data('pageNo');
			if(firstPageNo && firstPageNo > 1){
				return (firstPageNo - 1);
			} 
		}
		return -1;
	},
	setOrder : function(params){
		var $sorting = $('#div_sorting');
		if ($sorting.css('display')!='none'){
			var order = $sorting.find('.on').data('order');
			if (order!=''){
				params.order = order;
			}
		}
	},
	bindScroll : function() {
		var me = LiveMedia;
		var top = $(window).scrollTop();;
		var lastScroll = me.config.lastScroll;
		me.config.lastScroll = top;
		
		var isDynamic = ($("#dynamic:checked").length > 0) ? true : false;
		if (isDynamic){
			
			if (top > lastScroll){
				var gap = $(document).height() - $(window).scrollTop() - $(window).height();
				if(gap <= me.config.downGap) {
					var pageNo = me.getPageNo(me.config.id,'down');
					if (pageNo>1){
						me.jarvisRequest('down');
					}
				}
			} else {
				if(top < me.config.upGap){
					me.jarvisRequest('up');
				}
			}
		}
	},	
	unBindScroll : function() {
		var me = LiveMedia;
		if(me.config.isBindScroll) {
			me.config.isBindScroll = false;
		}
	}
};