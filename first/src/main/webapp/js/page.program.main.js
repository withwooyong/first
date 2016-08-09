
	function enterKey() {
	    if (event.which == 13 || event.keyCode == 13) {
	        //code to execute here
	        fn_selectProgramList("searchForm");
	        return false;
	    }
	    return true;
	}

	function fn_selectProgramList(frmObj) {
		var comAjax = new ComAjax(frmObj);			
		comAjax.setUrl("program_list.do");
		comAjax.setCallback("fn_selectProgramListCallback");
		comAjax.ajax();
	}
	
	// 리스트
	function fn_selectProgramListCallback(data) {
		
		var total = data.TOTAL; 
		
		$('#program_list').dataTable().fnDestroy();
		$('#program_list tbody').empty();
		
		var body = $('#program_list tbody');
		if (total == 0) {
			var str = "<tr>" + "<td colspan='6'>조회된 결과가 없습니다.</td>"
					+ "</tr>";
			body.append(str);
		} else {
			var str = "";
			$.each(data.program_list, function(key, value) {
				str += "<tr>"
						+ "<td>" + value.PGM_CD + "</td>"
						+ "<td><a href='#this' name='l_pgm_nm'>" + value.PGM_NM	+ "</a>" 
						+	"<input type='hidden' id='l_pgm_cd' value=" + value.PGM_CD + ">"
						+ "</td>"
						+ "<td>" + value.FIRST_BROAD_CD + "</td>" 
						+ "<td>" + value.PRODUCTION + "</td>"
						+ "<td>" + value.INS_DT + "</td>"
						+ "</tr>";
			});
			body.append(str);
		
			$("a[name='l_pgm_nm']").on("click", function(e) { 
				e.preventDefault();
				fn_selectProgramDetail($(this));
			});
		}	
		$('#program_list').dataTable();
//		$('#program_list').dataTable().fnAdjustColumnSizing();
	}
	
	// 상세
	function fn_selectProgramDetail(obj) {
	
		var comAjax = new ComAjax();
		comAjax.setUrl("program_detail.do");
		comAjax.addParam("s_pgm_cd", obj.parent().find("#l_pgm_cd").val());
		comAjax.setCallback("fn_selectProgramDetailCallback");
		comAjax.ajax();
	}	
	
	// 상세
	function fn_selectProgramDetailCallback(data) {		
		document.getElementById('i_pgm_cd').value = data.map.PGM_CD;
		document.getElementById("i_pgm_nm").value = data.map.PGM_NM;
		document.getElementById("i_pgm_nm_en").value = data.map.PGM_NM_EN;
		document.getElementById("i_production").value = data.map.PRODUCTION;
		document.getElementById("i_cate1_cd").value = data.map.CATE1_CD;
		document.getElementById("i_cate2_cd").value = data.map.CATE2_CD;
		document.getElementById("i_first_broad_cd").value = data.map.FIRST_BROAD_CD;
		document.getElementById("i_product_yr").value = data.map.PRODUCT_YR;
		document.getElementById("i_nation_nm").value = data.map.NATION_NM;
		document.getElementById("i_director").value = data.map.DIRECTOR;
		document.getElementById("i_broad_dt").value = data.map.BROAD_DT;
		document.getElementById("i_grade_cd").value = data.map.GRADE_CD;
		document.getElementById("i_actor").value = data.map.ACTOR;
		document.getElementById("i_synop").value = data.map.SYNOP;
		document.getElementById("i_kwd").value = data.map.KWD;
		
		$('#episode_list').dataTable().fnDestroy();
		$('#episode_list tbody').empty();
		var body = $('#episode_list tbody');
		
		var str = "";
		$.each(data.episode_list, function(key, value) {
			str += "<tr>"
					+ "<td>" + value.EPI_CD + "</td>"
					+ "<td><a href='#this' name='l_epi_nm'>" + value.EPI_NM	+ "</a>" 
					+	"<input type='hidden' id='l_epi_cd' value=" + value.EPI_CD + ">"
					+ "</td>"
					+ "<td>" + value.FREQUENCY + "</td>" 
					+ "<td>" + value.VOD_AMT + "</td>"
					+ "<td>" + value.INS_DT + "</td>"
					+ "</tr>";
		});
		
		body.append(str);
		
		$("a[name='l_epi_nm']").on("click", function(e) {
			e.preventDefault();
			fn_selectEpisodeDetail($(this));
		});	
		$('#episode_list').dataTable();
	}	
	
	// 상세
	function fn_selectEpisodeDetail(obj) {
	
		var comAjax = new ComAjax();
		comAjax.setUrl("episode_detail.do");
		comAjax.addParam("s_epi_cd", obj.parent().find("#l_epi_cd").val());
		comAjax.setCallback("fn_selectEpisodeDetailCallback");
		comAjax.ajax();
	}	
		
	// 상세
	function fn_selectEpisodeDetailCallback(data) {
		
		document.getElementById('i_epi_cd').value = data.map.EPI_CD;
		document.getElementById("i_epi_nm").value = data.map.EPI_NM;
		document.getElementById("i_epi_nm_en").value = data.map.EPI_NM_EN;
		document.getElementById("i_frequency").value = data.map.FREQUENCY;
		document.getElementById("i_vod_amt").value = data.map.VOD_AMT;
		document.getElementById("i_cate1_cd").value = data.map.CATE1_CD;
		document.getElementById("i_cate2_cd").value = data.map.CATE2_CD;
		document.getElementById("i_broad_dt").value = data.map.BROAD_DT;
		document.getElementById("i_grade_cd").value = data.map.GRADE_CD;
		document.getElementById("i_runtime_mi").value = data.map.RUNTIME_MI;
		document.getElementById("i_mcp_cd").value = data.map.MCP_CD;
		document.getElementById("i_scp_cd").value = data.map.SCP_CD;
		document.getElementById("i_actor").value = data.map.ACTOR;
		document.getElementById("i_synop").value = data.map.SYNOP;
		document.getElementById("i_kwd").value = data.map.KWD;
	}
	
	// 저장
	function fn_save(frmObj) {
		var comSubmit = new ComSubmit(frmObj);
		comSubmit.setUrl("program_save.do");
		comSubmit.submit();
	}
	