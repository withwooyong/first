<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>PP<small>Optional description</small></h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> PP사관리</a></li>
			<li><a href="#">PP[메타]</a></li>
			<li class="active">PP정보관리</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content-header">
		<!-- Your Page Content Here -->					
		<!-- general form elements -->
		<div class="box box-primary">
			<div class="box-header with-border">
				<h3 class="box-title">PP정보관리</h3>
				<button type="submit" id="search" class="btn btn-info pull-right">검색</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->			
			<form action="" class="form-horizontal" id="searchForm" name="searchForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="s_cd_cust" class="col-md-1 control-label">거래처번호:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_cd_cust" name="search_cd_cust" type="text" placeholder="1115">
						</div>						
						<label for="search_kn_cust" class="col-md-1 control-label">PP사명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_kn_cust" name="search_kn_cust" type="text" placeholder="CJ E&M">
						</div>
					</div>
				</div>
			</form>
		</div>
	</section>
	
	<section class="content">
		<div class="row">	
		<!-- left column -->
        	<div class="col-md-6">
				<div class="col-md-6 box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">MCP목록</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="mcp_list" class="table table-bordered table-striped">
			              	<thead>
			              		<tr>
									<th>번호</th>
									<th>거래처번호</th>
									<th>법인유무</th>
									<th>거래처명</th>
									<th>업태</th>
									<th>업종</th>
									<th>사업자번호</th>
									<th>대표자명</th>
									<th>사용여부</th>
								</tr>
							</thead>
							<tbody>
								<!-- 리스트내용 들어감 -->
							</tbody>
						</table>
					</div>
					<!-- /.box-body -->
				</div>
			</div>
			<!-- /.box -->
			<!-- right column -->
	        <div class="col-md-6">
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">SCP목록</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="scp_list" class="table table-bordered table-striped">            
							<thead>
								<tr>
									<th>번호</th>
									<th>거래처번호</th>
									<th>거래처명</th>
									<th>사업자번호</th>
									<th>대표자명</th>
									<th>사용여부</th>
								</tr>
							</thead>
							<tbody>
								<!-- 리스트내용 들어감 -->
							</tbody>
						</table>
					</div>
					<!-- /.box-body -->
				</div>
			</div>	
			<!-- /.box -->
		  </div>
	  </section>
	  
	  <!-- pp detail -->
	  <section class="content">
      <div class="box box-primary" id="contents_detail">
        <div class="box-header with-border">
          <h3 class="box-title">PP사정보</h3>
        </div>
        <!-- /.box-header -->
		<div class="box-body">
			<table class="table table-bordered">
				<!-- tr th success, info, warning, danger -->
				<tr class="success">
					<th>거래처번호</th>
					<td><label id="corpid"></label></td>
					<th>거래처명</th>
					<td colspan="3"><label id="kn_cust"></label></td>
				</tr>
				<tr class="warning">
					<th>사업자번호</th>
					<td><label id="O_NO_TAX"></label></td>
					<th>대표자명</th>
					<td colspan="3"><label id="O_KN_PRESIDENT"></label></td>
				</tr>
				<tr class="info">
					<th>업태</th>
					<td><label id="O_KN_BUSINESSCOND"></label></td>
					<th>종목</th>
					<td><label id="O_KN_ITEM"></label></td>
					<th>거래처분류</th>
					<td><label id="O_CL_CUST_NM"></label></td>
				</tr>
				<tr class="success">
					<th>우편번호</th>
					<td><label id="O_NO_POST"></label></td>
					<th>주소</th>
					<td colspan="3"><label id="O_KN_ADDRESS"></label></td>
				</tr>
				<tr class="warning">
					<th>전화번호</th>
					<td><label id="NO_TEL"></label></td>
					<th>팩스번호</th>
					<td><label id="NO_FAX"></label></td>
					<th>사용유무</th>
					<td><label id="O_YN_USE"></td>
				</tr>
				<tr class="info">
					<th>담당자이름</th>
					<td><label id="KN_CUSTEMP"></td>
					<th>담당자연락처</th>
					<td><label id="KN_CUSTTEL"></td>
					<th>담당자이메일</th>
					<td><label id="E_MAIL"></td>
				</tr>
			</table>
		</div>
		<!-- /.box-body -->
        <div class="box-footer">
        	footer
        </div>
      </div>
      <!-- /.box -->
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script type="text/javascript" src="${ctx}/js/page.pp.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function(){
	//fn_selectMovieList(1);
	
	$("#search").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();		
		fn_selectMovieList("searchForm");
	});
	
// 			$("a[name='delete']").on("click", function(e){ //삭제 버튼
	$("#save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("detailForm");
	});
});	
</script>




