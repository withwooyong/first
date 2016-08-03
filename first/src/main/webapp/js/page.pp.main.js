
function fn_selectMCPList(frmObj) {
	var comAjax = new ComAjax(frmObj);			
	comAjax.setUrl("mcp_list.do");
	comAjax.setCallback("fn_selectMCPListCallback");
	comAjax.ajax();
}

// 리스트
function fn_selectMCPListCallback(data) {
	
	$('#mcp_list tbody').empty();	
	var body = $('#mcp_list tbody');
	
	var str = "";
	$.each(data.list, function(key, value) {
		str += "<tr>"
				+ "<td id='CORPID'>" + value.CORPID + "</td>"
				+ "<td>" 
				+ 	"<a href='#this' name='MCP_KN_CUST'>" + value.KN_CUST	+ "</a>" 
				+	"<input type='hidden' id='s_corpid' value=" + value.CORPID + ">" 
				+	"<input type='hidden' id='s_cp_kind' value=" + value.CP_KIND + ">"
				+ "</td>" 
				+ "<td>" + value.YN_LEGAL + "</td>"
				+ "<td>" + value.NO_TAX + "</td>" 
				+ "<td>" + value.KN_PRESIDENT + "</td>" 
				+ "<td>" + value.YN_USE + "</td>" 
				+ "</tr>";
	});
	body.append(str);

	$("a[name='MCP_KN_CUST']").on("click", function(e) { 
		e.preventDefault();
		fn_selectDetail($(this));
	});
}

	function fn_selectSCPList(frmObj) {
		var comAjax = new ComAjax(frmObj);			
		comAjax.setUrl("scp_list.do");
		comAjax.setCallback("fn_selectSCPListCallback");
		comAjax.ajax();
	}
		
// 리스트
function fn_selectSCPListCallback(data) {

	$('#scp_list tbody').empty();
	var body = $('#scp_list tbody');
	
	var str = "";
	$.each(data, function(key, value) {
		str += "<tr>"
				+ "<td id='CORPID'>" + value.CORPID + "</td>"
				+ "<td>" 
				+	"<a href='#this' name='SCP_KN_CUST'>" + value.KN_CUST	+ "</a>" 
				+	"<input type='hidden' id='s_corpid' value=" + value.CORPID + ">"
				+	"<input type='hidden' id='s_cp_kind' value=" + value.CP_KIND + ">"
				+ "</td>" 
				+ "<td>" + value.KN_BUSINESSCOND + "</td>" 
				+ "<td>" + value.KN_PRESIDENT + "</td>" 
				+ "<td>" + value.YN_USE + "</td>" 
				+ "</tr>";
	});
	
	body.append(str);
	
	$("a[name='SCP_KN_CUST']").on("click", function(e) {
		e.preventDefault();
		fn_selectDetail($(this));
	});
	
}

// 상세
function fn_selectDetail(obj) {

	var comAjax = new ComAjax();
	comAjax.setUrl("detail.do");
	comAjax.addParam("s_cp_kind", obj.parent().find("#s_cp_kind").val());
	comAjax.addParam("s_corpid", obj.parent().find("#s_corpid").val());
	comAjax.setCallback("fn_selectDetailCallback");
	comAjax.ajax();
}

// 상세
function fn_selectDetailCallback(data) {
	
	document.getElementById('i_corpid').innerHTML = data.map.CORPID;
	document.getElementById("i_kn_cust").innerHTML = data.map.KN_CUST;
	document.getElementById("i_no_tax").innerHTML = data.map.NO_TAX;
	document.getElementById("i_kn_president").innerHTML = data.map.KN_PRESIDENT;
	document.getElementById("i_kn_businesscond").innerHTML = data.map.KN_BUSINESSCOND;
	document.getElementById("i_kn_item").innerHTML = data.map.KN_ITEM;	
	document.getElementById("i_cl_cust").innerHTML = data.map.CL_CUST;	
	document.getElementById("i_no_post").innerHTML = data.map.NO_POST;
	document.getElementById("i_kn_address").innerHTML = data.map.KN_ADDRESS;
	document.getElementById("i_no_tel").innerHTML = data.map.NO_TEL;
	document.getElementById("i_no_fax").innerHTML = data.map.NO_FAX;
	document.getElementById("i_yn_use").innerHTML = data.map.YN_USE;
	document.getElementById("i_kn_custemp").innerHTML = data.map.KN_CUSTEMP;
	document.getElementById("i_kn_custtel").innerHTML = data.map.KN_CUSTTEL;
	document.getElementById("i_e_mail").innerHTML = data.map.E_MAIL;
	
	if ('CPDS0100' == data.map.CP_KIND) { // MCP
		fn_selectSCPListCallback(data.scp_list);
	} else {
		
	}
	
	fn_selectPPChannelListCallback(data.channel_list);
}

// 리스트
function fn_selectPPChannelListCallback(data) {

	console.log('fn_selectPPChannelListCallback');
	$('#channel_list tbody').empty();	
	var body = $('#channel_list tbody');
	
	var str = "";
	$.each(data, function(key, value) {
		str += "<tr>"
				+ "<td>" + value.CH_CD + "</td>"
				+ "<td>" + value.CH_NM + "</td>" 
				+ "<td>" + value.CH_KIND_CD + "</td>" 
				+ "<td>" + value.BROAD_KIND_CD + "</td>" 
				+ "<td>" + value.CH_NO + "</td>" 
				+ "<td>" + value.HD_YN + "</td>"
				+ "<td>" + value.INS_DT + "</td>"
				+ "</tr>";
	});
	body.append(str);
}

// 저장
function fn_save(frmObj) {
	var comSubmit = new ComSubmit(frmObj);
	comSubmit.setUrl("save.do");
	comSubmit.submit();
}