
function fn_selectList(frmObj) {
	var comAjax = new ComAjax(frmObj);			
	comAjax.setUrl("lists.do");
	comAjax.setCallback("fn_selectListCallback");
	comAjax.ajax();
}

// 트리/리스트
function fn_selectListCallback(data) {
	var total = data.TOTAL; 
	
	//$('#pp_tree').dataTable().fnDestroy();
	$('#pp_tree tbody').empty();
	
	var body = $('#pp_tree tbody');
	if (total == 0) {
		var str = "<tr>" + "<td colspan='9'>조회된 결과가 없습니다.</td>"
				+ "</tr>";
		body.append(str);
	} else {
		var str = "";
		$.each(data.list, function(key, value) {			
//			TreeGrid Bootstrap 3 examples
//			http://maxazan.github.io/jquery-treegrid/examples/example-bootstrap-3.html 참고
			if (value.PARENT_CP == null || value.PARENT_CP == '') {
			   str += "<tr class='treegrid-" + value.CORPID + "'>"
		    	   //+ 	"<td>" + value.KN_CUST + "</td><td>" + value.CORPID + "</td>"
			       + "<td>" 
			       + 	"<a href='#this' name='KN_CUST'>" + value.KN_CUST	+ "</a>" 
			       +	"<input type='hidden' id='KN_CUST' value=" + value.CORPID + ">"
				   + "</td>"
				   + "<td>" + value.CORPID + "</td>"  
				   
		    	   + "</tr>"
		    } else {
		       str += "<tr class='treegrid-" + value.CORPID + " treegrid-parent-" + value.PARENT_CP + "'>"
		    	   //+ 	"<td>" + value.KN_CUST + "</td><td>" + value.CORPID + "</td>"
		           + "<td>" 
		           +	"<a href='#this' name='KN_CUST'>" + value.KN_CUST	+ "</a>" 
		           +	"<input type='hidden' id='KN_CUST' value=" + value.CORPID + ">"
				   + "</td>"
				   + "<td>" + value.CORPID + "</td>"
		    	   + "</tr>"
		    }
		});
		
		body.append(str);
		

//		$("a[name='YN_LEGAL_NM']").on("click", function(e) { // 채널명 클릭시 상세 조회
//			e.preventDefault();
//			fn_selectDetail($(this));
//		});
	}
	//$('#movie_list').dataTable();
}

// 상세
function fn_selectDetail(obj) {			
	var comAjax = new ComAjax();
	comAjax.setUrl("detail.do");
	comAjax.addParam("corpid", obj.parent().find("#YN_LEGAL_NM").val());
	comAjax.setCallback("fn_selectDetailCallback");
	comAjax.ajax();
}

// 상세
function fn_selectDetailCallback(data) {			
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