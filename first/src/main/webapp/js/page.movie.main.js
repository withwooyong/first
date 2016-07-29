
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
					+ "<td id='MOVIE_CD'>" + value.MOVIE_CD + "</td>"
					+ "<td>" 
					+	"<a href='#this' name='MOVIE_NM'>" + value.MOVIE_NM	+ "</a>" 
					+	"<input type='hidden' id='MOVIE_NM' value=" + value.MOVIE_CD + ">"
					+ "</td>" 
					+ "<td>" + value.GENRE_CD + "</td>" 
					+ "<td>" + value.PRODUCTION + "</td>" 
					+ "<td>" + value.INS_DT + "</td>" 
					+ "<td>" + value.DEL_YN + "</td>" 
					+ "</tr>";
		});
		body.append(str);

		$("a[name='MOVIE_NM']").on("click", function(e) { // 채널명 클릭시 상세 조회
			e.preventDefault();
			fn_selectMovieDetail($(this));
		});
	}
	$('#movie_list').dataTable();
}

// 영화상세
function fn_selectMovieDetail(obj) {			
	var comAjax = new ComAjax();
	comAjax.setUrl("detail.do");
	comAjax.addParam("movie_cd", obj.parent().find("#MOVIE_NM").val());
	comAjax.setCallback("fn_selectMovieDetailCallback");
	comAjax.ajax();
}

// 영화상세
function fn_selectMovieDetailCallback(data) {			
	document.getElementById("movie_cd_detail").value = data.map.MOVIE_CD;
	document.getElementById("movie_nm_detail").value = data.map.MOVIE_NM;
	document.getElementById("genre_cd_detail").value = data.map.GENRE_CD;
	document.getElementById("production_detail").value = data.map.PRODUCTION;
	document.getElementById("ins_dt_detail").value = data.map.INS_DT;
	document.getElementById("del_yn_detail").value = data.map.DEL_YN;
}		

// 저장
function fn_save(frmObj) {
	var comSubmit = new ComSubmit(frmObj);
	comSubmit.setUrl("save.do");
	comSubmit.submit();
}