
	function enterKey() {
	    if (event.which == 13 || event.keyCode == 13) {
	        //code to execute here
	        fn_selectClipList("search_form");
	        return false;
	    }
	    return true;
	}
	
	function fn_selectClipList(frmObj) {
		var comAjax = new ComAjax(frmObj);			
		comAjax.setUrl("list.do");
		comAjax.setCallback("fn_selectClipListCallback");
		comAjax.ajax();
	}
	
	// 리스트
	function fn_selectClipListCallback(data) {
		
		$('#clip_list').dataTable().fnDestroy();
		$('#clip_list tbody').empty();
		
		var body = $('#clip_list tbody');
		
		var str = "";
		$.each(data.list, function(key, value) {
			str += "<tr>"
					+ "<td>" + value.SHORTCLIP_CD + "</td>"
					+ "<td><a href='#this' name='l_shortclip_nm'>" + value.SHORTCLIP_NM	+ "</a>" 
					+	"<input type='hidden' id='l_shortclip_cd' value=" + value.SHORTCLIP_CD + ">"
					+ "</td>" 
//					+ "<td>" + value.CH_CD + "</td>" 
					+ "<td>" + value.CH_NM + "</td>" 
//					+ "<td>" + value.MAST_CD + "</td>" 
					+ "<td>" + value.MAST_NM + "</td>"
//					+ "<td>" + value.EPI_CD + "</td>" 
					+ "<td>" + value.EPI_NM + "</td>"
					+ "<td>" + value.FREQUENCY + "</td>"
//						+ "<td>" + value.BROAD_DT + "</td>" 
//						+ "<td>" + value.BROAD_TIME + "</td>"
//						+ "<td>" + value.INS_DT + "</td>" 
//						+ "<td>" + value.DEL_YN + "</td>" 
				+ "</tr>";
		});
		body.append(str);

		$("a[name='l_clip_nm']").on("click", function(e) { // 채널명 클릭시 상세 조회
			e.preventDefault();
			fn_selectClipDetail($(this));
		});
		$('#clip_list').dataTable();		
//		$('#clip_list').dataTable().fnAdjustColumnSizing();
		
		//fn_jqGrid();
	}
	
	function fn_jqGrid() {
		$("#jq_grid_list").jqGrid({
			datatype: "local",
			height: 250,
		   	colNames:['컬럼1','컬럼2'],
		   	colModel:[
		   		{name:'col1',index:'col1'},
		   		{name:'col2',index:'col2'},
		   	],
		   	caption: "그리드 배열 데이터 샘플링"
		});
		
		$("#jqGrid").jqGrid({
                url: 'http://trirand.com/blog/phpjqgrid/examples/jsonp/getjsonp.php?callback=?&qwery=longorders',
                mtype: "GET",
				styleUI : 'Bootstrap',
                datatype: "jsonp",
                colModel: [
                    { label: 'OrderID', name: 'OrderID', key: true, width: 75 },
                    { label: 'Customer ID', name: 'CustomerID', width: 150 },
                    { label: 'Order Date', name: 'OrderDate', width: 150 },
                    { label: 'Freight', name: 'Freight', width: 150 },
                    { label:'Ship Name', name: 'ShipName', width: 150 }
                ],
				viewrecords: true,
                height: 250,
                rowNum: 20,
                pager: "#jqGridPager"
        });
	}
	
	
	// 영화상세
	function fn_selectMovieDetail(obj) {
		var comAjax = new ComAjax();
		comAjax.setUrl("detail.do");
		comAjax.addParam("s_movie_cd", obj.parent().find("#l_movie_cd").val());
		comAjax.setCallback("fn_selectMovieDetailCallback");
		comAjax.ajax();
	}
	
	// 영화상세
	function fn_selectMovieDetailCallback(data) {
		document.getElementById("i_movie_cd").value = data.map.MOVIE_CD;
		document.getElementById("i_movie_nm").value = data.map.MOVIE_NM;
		document.getElementById("i_genre_cd").value = data.map.GENRE_CD;
		document.getElementById("i_production").value = data.map.PRODUCTION;
		document.getElementById("i_ins_dt").value = data.map.INS_DT;
		document.getElementById("i_del_yn").value = data.map.DEL_YN;
		
		// 영화 이미지
		$('#movie_image_list tbody').empty();
		var movie_image_list = $('#movie_image_list tbody');
		
		var str = "";
		
		$.each(data.movie_image_list, function(key, value) {
			var image_path = "";
			
			if (value.WEB_URL != null) {
				image_path += "<td class='col-md-7'>"
					       + 	"<img src='" + imageDomain + value.WEB_URL + "'>"
				           + 	"<button type='submit' id='movie_image_del' class='btn btn-info pull-right'>이미지삭제</button>"
				           +  "</td>";
			} else {
				image_path = "<td class='col-md-7'><input type='file' name='" + value.CODE + "' id='" + value.CODE + "'></td>";
			}
			
			str += "<tr>"
					+   "<td class='col-md-1'><input class='form-control' type='text' name='code' value='" + value.CODE + "' style='border:none' readonly></input></td>"
					+	"<td class='col-md-2'>" + value.CODE_NAME + "</td>"
					+   image_path
					+	"<td class='col-md-1'>" + value.INS_DT + "</td>"
					+	"<td class='col-md-1'>" + value.UPD_DT + "</td>"
					+"</tr>";
		});
		movie_image_list.append(str);
	}
	
	// 이미지저장
	function fn_updateMovieImage(frmObj) {
		// imageForm
		var ajaxSubmit = new ComAjaxSubmit(frmObj);
		ajaxSubmit.addParam("content_code", document.getElementById('i_movie_cd').value);
		ajaxSubmit.setUrl("updateMovieImage.do");
		ajaxSubmit.setMimeType("multipart/form-data");
		ajaxSubmit.submit();
	}
	
	// 이미지삭제
	function fn_deleteMovieImage(frmObj) {
		// imageForm
		var comSubmit = new ComSubmit(frmObj);
		comSubmit.addParam("content_code", document.getElementById('i_movie_cd').value);
		comSubmit.setUrl("deleteMovieImage.do");
		comSubmit.submit();
	}
	
	// 저장
	function fn_save(frmObj) {
		var comSubmit = new ComSubmit(frmObj);
		comSubmit.setUrl("save.do");
		comSubmit.submit();
	}
	