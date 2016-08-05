<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
		<h1>영화<small>영화 Optional description</small></h1>
		<ol class="breadcrumb">
			<li><a href="#"><i class="fa fa-dashboard"></i> 영화관리</a></li>
			<li><a href="#">영화[메타]</a></li>
			<li class="active">영화정보관리</li>
		</ol>
	</section>

	<!-- Main content -->
	<section class="content">
		<!-- Your Page Content Here -->
					
		<!-- general form elements -->
		<div class="box box-primary" id="contents_info">
			<div class="box-header with-border">
				<h3 class="box-title">영화정보관리</h3>
				<button type="submit" id="search" class="btn btn-info pull-right">검색</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->			
			<form action="" class="form-horizontal" id="search_form" name="searchForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="s_movie_nm" class="col-md-1 control-label">영화명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_movie_nm" name="s_movie_nm" type="text" placeholder="부산행" onkeypress="enterKey();" autofocus>
						</div>
						<label for="s_movie_cd" class="col-md-1 control-label">영화코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_movie_cd" name="s_movie_cd" type="text" placeholder="M00551" onkeypress="enterKey();">
						</div>				
						<label for="s_genre_cd" class="col-md-1 control-label">장르코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_genre_cd" name="s_genre_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="s_production" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_production" name="s_production" type="text" placeholder="E&M">
						</div>
					</div>
					<div class="form-group">
						<label for="s_ins_dt" class="col-md-1 control-label">등록일:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_ins_dt" name="s_ins_dt" type="text" placeholder="20160725">
						</div>
						<label for="s_del_yn" class="col-md-1 control-label">삭제유무:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_del_yn" name="s_del_yn" type="text" placeholder="N">
						</div>
					</div>
				</div>
			</form>
		</div>
		
		<div class="box box-primary" id="contents_list">
			<div class="box-header with-border">
				<h3 class="box-title">영화리스트</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body">
              <table id="movie_list" class="table table-bordered table-striped">            
<!-- 			<div class="box-body table-responsive "> -->
<!-- 				<table id="movie_list" class="table table-bordered table-striped table-hover"> -->
					<thead>
						<tr>
							<th>영화코드</th>
							<th>영화명</th>
							<th>장르코드</th>
							<th>제작사</th>
							<th>등록일</th>
							<th>삭제유무</th>
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
		
		<!-- movie detail -->
      <div class="box box-primary" id="contents_detail">
        <div class="box-header with-border">
          <h3 class="box-title">영화상세</h3>
          	<button type="submit" id="save" class="btn btn-info pull-right">저장</button>          
        </div>
        <!-- /.box-header -->
        <div>
        	<!-- form start -->			
			<form class="form-horizontal" id="detailForm" name="detailForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="i_movie_cd" class="col-md-1 control-label">영화코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_movie_cd" name="i_movie_cd" type="text" placeholder="M00551">
						</div>						
						<label for="i_movie_nm" class="col-md-1 control-label">영화명:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_movie_nm" name="i_movie_nm" type="text" placeholder="부산행">
						</div>						
						<label for="i_genre_cd" class="col-md-1 control-label">장르코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_genre_cd" name="i_genre_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="i_production" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_production" name="i_production" type="text" placeholder="E&M">
						</div>
					</div>
					<div class="form-group">
						<label for="i_ins_dt" class="col-md-1 control-label">등록일:</label>
						<div class="col-md-2">
							<input class="form-control" id="i_ins_dt" name="i_ins_dt" type="text" placeholder="20160725">
						</div>
						<label for="i_del_yn" class="col-md-1 control-label">삭제유무:</label>
						<div class="col-md-2">
							<select class="form-control select2" id="i_del_yn" name="i_del_yn" style="width: 100%;">
			                  <option selected="selected">Y</option>
			                  <option>N</option>
			                </select>
						</div>
					</div>
				</div>
			</form>
        </div>
        <!-- /.box-body -->
        <div class="box-footer">
        	영화상세
        </div>
      </div>
      
      <!-- movie image -->
		<form action="" class="form-horizontal" id="image_form" name="image_form" role="form" enctype="multipart/form-data">
      	<div class="box">
			<div class="box-header">
				<h3 class="box-title">영화이미지</h3>
				<button type="submit" id="movie_image_save" class="btn btn-info pull-right">이미지저장</button>
			</div>
			<!-- /.box-header -->
			<div class="box-body table-responsive ">
				<table id="movie_image_list" class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th class="info">코드</th>
							<th class="info">구좌명</th>
							<th class="info">이미지보기</th>
							<th class="info">등록일</th>
							<th class="info">수정일</th>
						</tr>
					</thead>
					<tbody>
						<!-- 리스트내용 들어감 -->
					</tbody>
				</table>
			</div>
			<!-- /.box-body -->
		</div>
		</form>
      <!-- /.box -->
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script type="text/javascript" src="${ctx}/js/page.movie.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function(){
	fn_selectMovieList(1);
	
	$("#search").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();		
		fn_selectMovieList("search_form");
	});
	
// 			$("a[name='delete']").on("click", function(e){ //삭제 버튼
	$("#save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("detailForm");
	});
	
	$("#movie_image_save").on("click", function(e){ // 이미지저장 버튼
		e.preventDefault();
		fn_updateMovieImage("image_form");
	});
});	
</script>




