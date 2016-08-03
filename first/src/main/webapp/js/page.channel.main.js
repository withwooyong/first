	
	function enterKey() {
	    if (event.which == 13 || event.keyCode == 13) {
	        //code to execute here
	        fn_selectChannelList("searchForm");
	        return false;
	    }
	    return true;
	}
	
	function fn_selectChannelList(frmObj) {
		var comAjax = new ComAjax(frmObj);			
		comAjax.setUrl("channel_list.do");	
		comAjax.setCallback("fn_selectChannelListCallback");
		comAjax.ajax();
	}
	
	function fn_selectChannelListCallback(data) {
	
		$('#channel_list').dataTable().fnDestroy();
		$('#channel_list tbody').empty();
		var channel_list = $('#channel_list tbody');
		
		var str = "";
		$.each(data.channel_list, function(key, value) {
			str += "<tr>" + 
						"<td id='CH_CD'>" + value.CH_CD + "</td>" +
						"<td>" + 
							"<a href='#this' name='CH_NM'>" + value.CH_NM + "</a>" +
							"<input type='hidden' id='s_ch_cd' value=" + value.CH_CD + ">" +
							"</td>" +
						"<td>" + value.CH_KIND_CD + "</td>" + 
						"<td>" + value.CH_NO + "</td>" +
						"<td>" + value.RATIO_CD + "</td>" +
						"<td>" + value.SORT_NO + "</td>" +
						"<td>" + value.PAYFREE_YN + "</td>" +
						"<td>" + value.HD_YN + "</td>" +
						"<td>" + value.DEL_YN + "</td>" +
					"</tr>";
		});
		channel_list.append(str);
			
		$("a[name='CH_NM']").on("click", function(e){ // 채널명 클릭시 상세 조회
			e.preventDefault();
			fn_selectChannelDetail($(this));
		});
		$('#channel_list').dataTable();
		
		// 채널종류
		$('#i_ch_kind_cd').empty(); // 초기화
		var channel_kind_cd_list = $('#i_ch_kind_cd');
		str = "";
		$.each(data.channel_kind_cd_list, function(key, value) {
			str += "<option value='" + value.CODE + "'>" + value.CODE_NAME + "</option>"
		});
		channel_kind_cd_list.append(str);
		
		// 화면비율
		$('#i_ratio_cd').empty(); // 초기화
		var channel_ratio_cd_list = $('#i_ratio_cd');
		str = "";
		$.each(data.channel_ratio_cd_list, function(key, value) {
			str += "<option value='" + value.CODE + "'>" + value.CODE_NAME + "</option>"
		});
		channel_ratio_cd_list.append(str);
	}
	
	// 상세
	function fn_selectChannelDetail(obj) {
	
		var comAjax = new ComAjax();
		comAjax.setUrl("detail.do");
		comAjax.addParam("s_ch_cd", obj.parent().find("#s_ch_cd").val());
		comAjax.setCallback("fn_selectChannelDetailCallback");
		comAjax.ajax();
	}
	
	// 상세
	function fn_selectChannelDetailCallback(data) {
		
		// 채널 메타정보
		document.getElementById('i_ch_cd').value = data.map.CH_CD;
		document.getElementById('i_ch_nm').value = data.map.CH_NM;
		document.getElementById('i_ch_kind_cd').value = data.map.CH_KIND_CD;
		document.getElementById('i_ch_no').value = data.map.CH_NO;
		document.getElementById('i_ratio_cd').value = data.map.RATIO_CD;
		document.getElementById('i_sort_no').value = data.map.SORT_NO;
		document.getElementById('i_payfree_yn').value = data.map.PAYFREE_YN;
		document.getElementById('i_hd_yn').value = data.map.HD_YN;
		
		// 채널 이미지
		$('#channel_image_list tbody').empty();
		var channel_image_list = $('#channel_image_list tbody');
		
		var str = "";
		
		$.each(data.channel_image_list, function(key, value) {
			
			str += "<tr>"
					+	"<td>" + value.CODE + "</td>" 
					+	"<td>" + value.CODE_NAME + "</td>"
					+	"<td><img src='" + imageDomain + value.WEB_URL + "'></td>"
					+	"<td>" + value.INS_DT + "</td>"
					+	"<td>" + value.UPD_DT + "</td>"
					+"</tr>";
		});
		channel_image_list.append(str);
		
		// 채널 URL
		$('#channel_url_list tbody').empty();
		var channel_url_list = $('#channel_url_list tbody');
		
		var str = "";
		var channel_url_list_option = $('#channel_url_list option');
		$.each(data.channel_url_list, function(key, value) {			
			console.log(key);
			var selectY = null;
			var selectN = null;
			if (value.DEL_YN == "N") {
				selectY = "";
				selectN = "selected='selected'";
			} else { // Y undefined
				selectY = "selected='selected'";
				selectN = "";				
			}
			
			str += "<tr>"
					+	"<td class='col-md-1'><input class='form-control' type='text' value='" + value.CODE_NAME + "' style='border:none' readonly></input></td>"
					+	"<td class='col-md-4'><input class='form-control' type='text' value='" + value.BROAD_URL + "'></input></td>"
					+	"<td class='col-md-3'><input class='form-control' type='text' value='" + value.PREVIEW_URL + "'></input></td>"
					+	"<td class='col-md-3'><input class='form-control' type='text' value='" + value.AUDIO_ONLY_URL + "'></input></td>"				
					+	"<td class='col-md-1'>"
					+ 		"<select class='form-control select2' style='width: 50%;'>"
					+ 			"<option value='Y' " + selectY + ">Y</option>"
					+ 			"<option value='N' " + selectN + ">N</option>"				
					+ 		"</select>"
					+ 	"</td>"
					+"</tr>";
		});
		channel_url_list.append(str);
	
	}
	
	function fn_updateChannel(frmObj) {
		var comAjax = new ComAjax(frmObj);
		comAjax.setUrl("updateChannel.do");
		comAjax.addParam("s_ch_cd", document.getElementById('i_ch_cd').value);
		comAjax.addParam("s_ch_nm", document.getElementById('i_ch_nm').value);
		comAjax.setCallback("fn_updateChannelCallback");
		comAjax.ajax();
	}
	
	function fn_updateChannelInfo(frmObj) {		
		var comAjax = new ComAjax(frmObj);
		comAjax.setUrl("updateChannelInfo.do");
		comAjax.addParam("s_ch_cd", document.getElementById('i_ch_cd').value);
		comAjax.addParam("s_ch_nm", document.getElementById('i_ch_nm').value);
		comAjax.setCallback("fn_updateChannelCallback");
		comAjax.ajax();
	}
	
	function fn_updateChannelImage(frmObj) {		
		var comAjax = new ComAjax(frmObj);
		comAjax.setUrl("updateChannelImage.do");
		comAjax.addParam("s_ch_cd", document.getElementById('i_ch_cd').value);
		comAjax.addParam("s_ch_nm", document.getElementById('i_ch_nm').value);
		comAjax.setCallback("fn_updateChannelCallback");
		comAjax.ajax();
	}
	
	function fn_updateChannelUrl(obj) {
		
		var dataArr = [];
//	    $(frmObj + " td").each(function() {
//	        dataArr.push($(this).html());
//	        console.log($(this).html());
//	    });

		$("#" + obj + " td").each(function() {
	    	
	    });
	    console.log(dataArr);

//	    $("#" + obj + " tbody tr").find("input").each(function() {
//	    	dataArr.push(this.value);
//	    	console.log("value=" + this.key + ":" + this.value);
//	    });
	    
	    
//	    $.each(dataArr,function(index,value){
//	    	alert(dataArr[index]);
//	    });  
	
//		var comAjax = new ComAjax(obj);
//		comAjax.setUrl("updateChannelUrl.do");
//		comAjax.addParam("s_ch_cd", document.getElementById('i_ch_cd').value);
//		comAjax.setCallback("fn_updateChannelCallback");
//		comAjax.ajax();
	}	
		
	function fn_updateChannelCallback(data) {
		alert('success');
	}
	
	
