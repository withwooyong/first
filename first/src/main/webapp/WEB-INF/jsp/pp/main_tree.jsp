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
							<input class="form-control" id="s_cd_cust" name="s_cd_cust" type="text" placeholder="1115">
						</div>						
						<label for="search_kn_cust" class="col-md-1 control-label">PP사명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_kn_cust" name="s_kn_cust" type="text" placeholder="CJ E&M">
						</div>
					</div>
				</div>
			</form>
		</div>
	</section>
	
	
	<section class="content">
		<div class="row">
		<!-- left column -->
        	<div class="col-md-3">
				<div class="col-md-3 box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">PP목록</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body" style="overflow:scroll;height:auto;max-height:600px;overflow:auto">
						<table id="pp_tree" class="table tree">
							<tbody>
								<!-- 리스트내용 들어감 -->
							</tbody>
						</table>	
					</div>
					<!-- /.box-body -->
			        <div class="box-footer">
			        	footer
			        </div>
			      <!-- /.box -->
				</div>
			</div>
			<div class="col-md-9">
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
		      <div class="box box-primary" id="contents_detail">
		        <div class="box-header with-border">
		          <h3 class="box-title">PP사채널목록</h3>
		        </div>
		        <!-- /.box-header -->
				<div class="box-body">
					<table id="pp_channel" class="table table-bordered">
						<thead>
						<tr>
							<th>번호</th>
							<th>채널구분</th>
							<th>방송구분</th>
							<th>채널명</th>
							<th>HD</th>
							<th>등록일시</th>
						</tr>
						</thead>
						<tbody>
								<!-- 리스트내용 들어감 -->
						</tbody>
					</table>
				</div>
				<!-- /.box-body -->
		        <div class="box-footer">
		        	footer
		        </div>
		      </div>
		    </div>
		</div>
	</section>	  
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->


<link rel="stylesheet" href="${ctx}/css/jquery.treegrid.css">
<script type="text/javascript" src="${ctx}/js/jquery/jquery.treegrid.js"></script>
<script type="text/javascript" src="${ctx}/js/jquery/jquery.treegrid.bootstrap3.js"></script>

<script type="text/javascript" src="${ctx}/js/page.pp.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	fn_selectList(1);
	$('.tree').treegrid();
	$('.tree').treegrid('collapseAll');
	
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




