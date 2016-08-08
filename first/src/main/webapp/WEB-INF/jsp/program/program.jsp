<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>방송<small>방송 Optional description</small></h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> 방송관리</a></li>
			<li><a href="#">방송[메타]</a></li>
			<li class="active">방송정보관리</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- Your Page Content Here -->
		<!-- general form elements -->
		<div class="box box-primary" id="contents_info">
			<div class="box-header with-border">
				<h3 class="box-title">프로그램정보관리</h3>
				<button type="submit" id="search" class="btn btn-info pull-right">검색</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->			
			<form action="" class="form-horizontal" id="searchForm" name="searchForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="s_pgm_nm" class="col-md-1 control-label">프로그램명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_pgm_nm" name="s_pgm_nm" type="text" placeholder="쇼미더머니 5" onkeypress="enterKey();" autofocus>
						</div>
						
						<label for="s_pgm_cd" class="col-md-1 control-label">프로그램코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_pgm_cd" name="s_pgm_cd" type="text" placeholder="P000275558" onkeypress="enterKey();">
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
						<h3 class="box-title">프로그램목록</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body" style="overflow:scroll;height:auto;max-height:250px;overflow:auto">
						<table id="program_list" class="table table-bordered table-hover">
			              	<thead>
			              		<tr>
									<th>프로그램코드</th>
									<th>프로그램명</th>
									<th>채널</th>
									<th>제작사</th>
									<th>등록일</th>
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
						<h3 class="box-title">에피소드목록</h3>
					</div>
					<!-- /.box-header -->
					<div class="box-body">
						<table id="episode_list" class="table table-bordered table-striped">            
							<thead>
								<tr>
									<th>에피소드코드</th>
									<th>에피소드명</th>
									<th>회차</th>
									<th>가격</th>
									<th>등록일</th>
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
	  <section class="content">
	  <!-- program detail -->
      <div class="box box-primary" id="contents_detail">
        <div class="box-header with-border">
          <h3 class="box-title">프로그램상세</h3>
          	<button type="submit" id="program_save" class="btn btn-info pull-right">저장</button>          
        </div>
        <!-- /.box-header -->
        <div>
        	<!-- form start -->			
			<form class="form-horizontal" id="program_detail_form" name="program_detail_form" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="i_pgm_cd" class="col-md-1 control-label">프로그램코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_pgm_cd" name="i_pgm_cd" type="text" placeholder="M00551">
						</div>
						<label for="i_pgm_nm" class="col-md-1 control-label">프로그램명:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_pgm_nm" name="i_pgm_nm" type="text" placeholder="쇼미더머니 5">
						</div>
						<label for="i_pgm_nm_en" class="col-md-1 control-label">영문명:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_pgm_nm_en" name="i_pgm_nm_en" type="text" placeholder="">
						</div>				
						<label for="i_production" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_production" name="i_production" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_cate1_cd" class="col-md-1 control-label">카테고리1:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_cate1_cd" name="i_cate1_cd" type="text" placeholder="">
						</div>
						<label for="i_cate2_cd" class="col-md-1 control-label">카테고리2:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_cate2_cd" name="i_cate2_cd" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_first_broad_cd" class="col-md-1 control-label">채널코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_first_broad_cd" name="i_first_broad_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="i_product_yr" class="col-md-1 control-label">제작년도:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_product_yr" name="i_product_yr" type="text" placeholder="">
						</div>
						<label for="i_nation_nm" class="col-md-1 control-label">제작국가:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_nation_nm" name="i_nation_nm" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_director" class="col-md-1 control-label">제작자(감독/PD):</label>
						<div class="col-md-2">
							<input class="form-control" id="i_director" name="i_director" type="text" placeholder="">
						</div>
						<label for="i_broad_dt" class="col-md-1 control-label">방영일:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_broad_dt" name="i_broad_dt" type="text" placeholder="">
						</div>
						<label for="i_grade_cd" class="col-md-1 control-label">등급:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_grade_cd" name="i_grade_cd" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_actor" class="col-md-1 control-label">출연인물(배우):</label>
						<div class="col-md-11">
							<input class="form-control" id="i_actor" name="i_actor" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_synop" class="col-md-1 control-label">시놉시스:</label>
						<div class="col-md-11">
							<input class="form-control" id="i_synop" name="i_synop" type="text" placeholder="">
						</div>
					</div>
					<div class="form-group">
						<label for="i_kwd" class="col-md-1 control-label">검색키워드:</label>
						<div class="col-md-11">
							<input class="form-control" id="i_kwd" name="i_kwd" type="text" placeholder="">
						</div>
					</div>
				</div>
			</form>
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
        	프로그램상세
        </div>
      </div>
      
		
      <!-- /.box -->
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script type="text/javascript" src="${ctx}/js/page.program.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function(){
	fn_selectProgramList(1);
	
	$("#search").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();		
		fn_selectProgramList("searchForm");
	});
	
// 			$("a[name='delete']").on("click", function(e){ //삭제 버튼
// 	$("#save").on("click", function(e){ //파일 추가 버튼
// 		e.preventDefault();
// 		fn_save("program_detail_form");
// 	});
	$("#program_save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("program_detail_form");
	});
	
	$("#episode_save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("episode_detail_form");
	});
	
});	
</script>




