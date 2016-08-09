<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<style>
/* table th td { */
/*     border: 1px solid black; */
/* } */

/* table.space { */
/* 	border-collapse:collapse; */
/* } */

/* table.space tr td { */
/* 	padding:0px; */
/* 	style="font-size:12px;" */
/* } */

</style>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>클립<small>클립 Optional description</small></h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> 클립관리</a></li>
			<li><a href="#">클립[메타]</a></li>
			<li class="active">클립정보관리</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- Your Page Content Here -->
					
		<!-- general form elements -->
		<div class="box box-primary" id="contents_info">
			<div class="box-header with-border">
				<h3 class="box-title">클립정보관리</h3>
				<button type="submit" id="search" class="btn btn-info pull-right">검색</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->			
			<form action="" class="form-horizontal" id="search_form" name="search_form" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="s_clip_nm" class="col-md-1 control-label">클립명:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_clip_nm" name="s_clip_nm" type="text" placeholder="부산행" onkeypress="enterKey();" autofocus>
						</div>
						<label for="s_clip_cd" class="col-md-1 control-label">클립코드:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_clip_cd" name="s_clip_cd" type="text" placeholder="M00551" onkeypress="enterKey();">
						</div>				
						<label for="s_epi_nm" class="col-md-1 control-label">에피소드명:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_epi_cd" name="s_epi_nm" type="text" placeholder="E&M">
						</div>
						<label for="s_epi_cd" class="col-md-1 control-label">에피소드코드:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_epi_cd" name="s_epi_cd" type="text" placeholder="CPCS0100">
						</div>				
						<label for="s_mast_nm" class="col-md-1 control-label">마스터명:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_mast_nm" name="s_mast_nm" type="text" placeholder="E&M">
						</div>
						<label for="s_mast_cd" class="col-md-1 control-label">마스터코드:</label>
						<div class="col-md-1">
							<input class="form-control" id="s_mast_cd" name="s_mast_cd" type="text" placeholder="CPCS0100">
						</div>
					</div>
				</div>
			</form>
		</div>
		
		<div class="box box-primary" id="contents_list">
			<div class="box-header with-border">
				<h3 class="box-title">클립리스트</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body">
              <table id="clip_list" class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>클립코드</th>
							<th>클립명</th>
<!-- 							<th>채널코드</th> -->
							<th>채널명</th>
<!-- 							<th>마스터코드</th> -->
							<th>마스터명</th>
<!-- 							<th>에피소드코드</th> -->
							<th>에피소드명</th>
							<th>회차</th>
<!-- 							<th>방송일자</th> -->
<!-- 							<th>방송시간</th> -->
<!-- 							<th>등록일</th> -->
<!-- 							<th>삭제유무</th> -->
						</tr>
					</thead>
					<tbody>
						<!-- 리스트내용 들어감 -->
					</tbody>
				</table>
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->
      	<div>
			<table id="jq_grid_list"></table>
		</div>
		<div>
			<table id="jqGrid"></table>
			<div id="jqGridPager"></div>
		</div>	
	</section>
	<!-- /.content -->
	
</div>

<!-- /.content-wrapper -->
<script type="text/javascript" src="${ctx}/js/page.clip.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function(){
	fn_selectClipList(1);
	
	$("#search").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();		
		fn_selectClipList("search_form");
	});

	$("#save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("detailForm");
	});
});	
</script>




