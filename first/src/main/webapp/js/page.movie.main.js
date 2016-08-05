
	function enterKey() {
	    if (event.which == 13 || event.keyCode == 13) {
	        //code to execute here
	        fn_selectMovieList("search_form");
	        return false;
	    }
	    return true;
	}
	
	function fn_selectMovieList(frmObj) {
		var comAjax = new ComAjax(frmObj);			
		comAjax.setUrl("list.do");
		comAjax.setCallback("fn_selectMovieListCallback");
		comAjax.ajax();
	}
	
	// 영화리스트
	function fn_selectMovieListCallback(data) {
		var total = data.TOTAL; 
		
		$('#movie_list').dataTable().fnDestroy();
		$('#movie_list tbody').empty();
		
		var body = $('#movie_list tbody');
		if (total == 0) {
			var str = "<tr>" + "<td colspan='9'>조회된 결과가 없습니다.</td>"
					+ "</tr>";
			body.append(str);
		} else {
			var str = "";
			$.each(data.list, function(key, value) {
				str += "<tr>"
						+ "<td>" + value.MOVIE_CD + "</td>"
						+ "<td><a href='#this' name='l_movie_nm'>" + value.MOVIE_NM	+ "</a>" 
						+	"<input type='hidden' id='l_movie_cd' value=" + value.MOVIE_CD + ">"
						+ "</td>" 
						+ "<td>" + value.GENRE_CD + "</td>" 
						+ "<td>" + value.PRODUCTION + "</td>" 
						+ "<td>" + value.INS_DT + "</td>" 
						+ "<td>" + value.DEL_YN + "</td>" 
					+ "</tr>";
			});
			body.append(str);
	
			$("a[name='l_movie_nm']").on("click", function(e) { // 채널명 클릭시 상세 조회
				e.preventDefault();
				fn_selectMovieDetail($(this));
			});			
			
//			$( "movie_list" ).delegate( "td", "click", function() {
//				alert('test');
//				$( this ).toggleClass( "chosen" );
//			});			
//			$( '#movie_list' ).on( 'click', 'tr', function(e) {
//				console.log(e);				
//				e.preventDefault();
//				fn_selectMovieDetail($(this));
//			});
		}
		$('#movie_list').dataTable();
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
	