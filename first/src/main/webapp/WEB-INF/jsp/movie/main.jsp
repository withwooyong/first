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
			<form action="" class="form-horizontal" id="searchForm" name="searchForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="movie_cd" class="col-md-1 control-label">영화코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_cd" name="movie_cd" type="text" placeholder="M00551">
						</div>						
						<label for="movie_nm" class="col-md-1 control-label">영화명:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_nm" name="movie_nm" type="text" placeholder="부산행">
						</div>						
						<label for="genre_cd" class="col-md-1 control-label">장르코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="genre_cd" name="genre_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="production" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="production" name="production" type="text" placeholder="E&M">
						</div>
					</div>
					<div class="form-group">
						<label for="ins_dt" class="col-md-1 control-label">등록일:</label>
						<div class="col-md-2">
							<input class="form-control" id="ins_dt" name="ins_dt" type="text" placeholder="20160725">
						</div>
						<label for="del_yn" class="col-md-1 control-label">삭제유무:</label>
						<div class="col-md-2">
							<input class="form-control" id="del_yn" name="del_yn" type="text" placeholder="N">
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
						<label for="movie_cd_detail" class="col-md-1 control-label">영화코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_cd_detail" name="movie_cd_detail" type="text" placeholder="M00551">
						</div>						
						<label for="movie_nm_detail" class="col-md-1 control-label">영화명:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_nm_detail" name="movie_nm_detail" type="text" placeholder="부산행">
						</div>						
						<label for="genre_cd_detail" class="col-md-1 control-label">장르코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="genre_cd_detail" name="genre_cd_detail" type="text" placeholder="CPCS0100">
						</div>						
						<label for="production_detail" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="production_detail" name="production_detail" type="text" placeholder="E&M">
						</div>
					</div>
					<div class="form-group">
						<label for="ins_dt_detail" class="col-md-1 control-label">등록일:</label>
						<div class="col-md-2">
							<input class="form-control" id="ins_dt_detail" name="ins_dt_detail" type="text" placeholder="20160725">
						</div>
						<label for="del_yn_detail" class="col-md-1 control-label">삭제유무:</label>
						<div class="col-md-2">
							<select class="form-control select2" id="del_yn_detail" name="del_yn_detail" style="width: 100%;">
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
		fn_selectMovieList("searchForm");
	});
	
// 			$("a[name='delete']").on("click", function(e){ //삭제 버튼
	$("#save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("detailForm");
	});
});	
</script>



