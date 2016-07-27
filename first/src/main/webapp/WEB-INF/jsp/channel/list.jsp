<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/include/include-header.jspf"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>Channel<small>Channel Optional description</small></h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> 채널관리</a></li>
			<li><a href="#">채널[메타]</a></li>
			<li class="active">채널정보관리</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- Your Page Content Here -->

		<!-- general form elements -->
		<div class="box box-primary">
			<div class="box-header with-border">
				<h3 class="box-title">채널정보관리</h3>
				<button type="submit" id="search" class="btn btn-default pull-right">검색</button>
                <button type="submit" id="save" class="btn btn-info pull-right">저장</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			
			<form class="form-horizontal" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="ch_cd" class="col-md-1 control-label">코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="ch_cd" type="text" placeholder="C00551">
						</div>						
						<label for="ch_nm" class="col-md-1 control-label">채널명:</label>
						<div class="col-md-2">
							<input class="form-control" id="ch_nm" type="text" placeholder="KBS">
						</div>						
						<label for="ch_kind_cd" class="col-md-1 control-label">종류코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="ch_kind_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="ch_no" class="col-md-1 control-label">채널번호:</label>
						<div class="col-md-2">
							<input class="form-control" id="ch_no" type="text" placeholder="18">
						</div>
					</div>
					<div class="form-group">
						<label for="ratio_cd" class="col-md-1 control-label">화면비율:</label>
						<div class="col-md-2">
							<input class="form-control" id="ratio_cd" type="text" placeholder="CVPR0100">
						</div>
						<label for="sort_no" class="col-md-1 control-label">정렬번호:</label>
						<div class="col-md-2">
							<input class="form-control" id="sort_no" type="text" placeholder="315">
						</div>
						<label for="payfree_yn" class="col-md-1 control-label">유무료:</label>
						<div class="col-md-2">
							<input class="form-control" id="payfree_yn" type="text" placeholder="N">
						</div>
						<label for="hd_yn" class="col-md-1 control-label">HD유무:</label>
						<div class="col-md-2">
							<input class="form-control" id="hd_yn" type="text" placeholder="Y">
						</div>
					</div>
				</div>
			</form>
		</div>
				
		<div class="box">
			<div class="box-header">
				<h3 class="box-title">채널리스트</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body table-responsive ">
				<table id="channel_list" class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th>CH_CD</th>
							<th>CH_NM</th>
							<th>CH_KIND_CD</th>
							<th>CH_NO</th>
							<th>RATIO_CD</th>
							<th>SORT_NO</th>							
							<th>PAYFREE_YN</th>
							<th>HD_YN</th>
							<th>DEL_YN</th>
						</tr>
					</thead>
					<tbody>
						<!-- 리스트내용 들어감 -->
					</tbody>
					<tfoot>
						<tr>
							<th>CH_CD</th>
							<th>CH_NM</th>
							<th>CH_KIND_CD</th>
							<th>CH_NO</th>
							<th>RATIO_CD</th>
							<th>SORT_NO</th>							
							<th>PAYFREE_YN</th>
							<th>HD_YN</th>
							<th>DEL_YN</th>
						</tr>
					</tfoot>
				</table>
				
				<div id="PAGE_NAVI"></div>
				<input type="hidden" id="PAGE_INDEX" name="PAGE_INDEX"/>
				
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->

		<%@ include file="/WEB-INF/include/include-body.jspf"%>
		<script type="text/javascript">
		$(document).ready(function(){
			fn_selectChannelList(1);
			
			$("#save").on("click", function(e){ //저장 버튼
				e.preventDefault();
				fn_selectChannelWrite();
			});
		});
		
		function fn_selectChannelDetail(obj) {
			
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/channel/selectChannelDetail.do' />");
			comSubmit.addParam("CH_CD", obj.parent().find("#CH_NM").val());
			comSubmit.submit();
		}
		
		function fn_selectChannelList(pageNo){
			var comAjax = new ComAjax();
			comAjax.setUrl("<c:url value='/channel/selectChannelList.do' />");
			comAjax.setCallback("fn_selectChannelListCallback");
			comAjax.addParam("PAGE_INDEX",$("#PAGE_INDEX").val());
			comAjax.addParam("PAGE_ROW", 10);
			comAjax.addParam("IDX_FE", $("#IDX_FE").val());
			comAjax.ajax();
		}
		
		function fn_selectChannelListCallback(data){
			var total = data.TOTAL;
// 			var body = $("table>tbody");
			var body = $('#channel_list tbody');
			if(total == 0){
				var str = "<tr>" + 
								"<td colspan='9'>조회된 결과가 없습니다.</td>" + 
							"</tr>";
				body.append(str);
			}
			else{
				var params = {
					divId : "PAGE_NAVI",
					pageIndex : "PAGE_INDEX",
					totalCount : total,
					eventName : "fn_selectChannelList"
				};
				gfn_renderPaging(params);
				
				var str = "";
				
				$.each(data.list, function(key, value) {
					str += "<tr>" + 
								"<td id='CH_CD'>" + value.CH_CD + "</td>" +
								"<td>" + 
									"<a href='#this' name='CH_NM'>" + value.CH_NM + "</a>" +
									"<input type='hidden' id='CH_NM' value=" + value.CH_CD + ">" +
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
				body.append(str);
				
				$("a[name='CH_NM']").on("click", function(e){ // 채널명 클릭시 상세 조회
					e.preventDefault();
					fn_selectChannelDetail($(this));
				});
			}
		}
		
		function fn_selectChannelWrite(){
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/channel/selectChannelWrite.do' />");
			comSubmit.submit();
		}
		
	</script>

	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->
