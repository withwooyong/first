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
		<div class="box box-primary">
			<div class="box-header with-border">
				<h3 class="box-title">영화정보관리</h3>
				<button type="submit" id="search" class="btn btn-default pull-right">검색</button>
                <button type="submit" id="save" class="btn btn-info pull-right">저장</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			
			<form class="form-horizontal" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="movie_cd" class="col-md-1 control-label">영화코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_cd" type="text" placeholder="M00551">
						</div>						
						<label for="movie_nm" class="col-md-1 control-label">영화명:</label>
						<div class="col-md-2">
							<input class="form-control" id="movie_nm" type="text" placeholder="부산행">
						</div>						
						<label for="genre_cd" class="col-md-1 control-label">장르코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="genre_cd" type="text" placeholder="CPCS0100">
						</div>						
						<label for="production" class="col-md-1 control-label">제작사:</label>
						<div class="col-md-2">
							<input class="form-control" id="production" type="text" placeholder="E&M">
						</div>
					</div>
					<div class="form-group">
						<label for="ins_dt" class="col-md-1 control-label">등록일:</label>
						<div class="col-md-2">
							<input class="form-control" id="ins_dt" type="text" placeholder="20160725">
						</div>
						<label for="del_yn" class="col-md-1 control-label">삭제유무:</label>
						<div class="col-md-2">
							<input class="form-control" id="del_yn" type="text" placeholder="N">
						</div>
					</div>
				</div>
			</form>
		</div>
				
		<div class="box">
			<div class="box-header">
				<h3 class="box-title">영화리스트</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body">
              <table id="movie_list" class="table table-bordered table-striped">
            
<!-- 			<div class="box-body table-responsive "> -->
<!-- 				<table id="movie_list" class="table table-bordered table-striped table-hover"> -->
					<thead>
						<tr>
							<th>MOVIE_CD</th>
							<th>MOVIE_NM</th>
							<th>GENRE_CD</th>
							<th>PRODUCTION</th>
							<th>INS_DT</th>
							<th>DEL_YN</th>
						</tr>
					</thead>
					<tbody>
						<!-- 리스트내용 들어감 -->
					</tbody>
					<tfoot>
						<tr>
							<th>MOVIE_CD</th>
							<th>MOVIE_NM</th>
							<th>GENRE_CD</th>
							<th>PRODUCTION</th>
							<th>INS_DT</th>
							<th>DEL_YN</th>
						</tr>
					</tfoot>
				</table>
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->

		<script type="text/javascript">
		$(document).ready(function(){
			fn_selectMovieList(1);
		});
		
		function fn_selectMovieDetail(obj) {			
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("${ctx}/first/movie/selectMovieDetail.do");
			comSubmit.addParam("MOVIE_CD", obj.parent().find("#MOVIE_NM").val());
			comSubmit.submit();
		}
		
		function fn_selectMovieList(obj) {
			var comAjax = new ComAjax();
			comAjax.setUrl("${ctx}/first/movie/selectMovieList.do");
			comAjax.setCallback("fn_selectMovieListCallback");
			comAjax.ajax();
		}

		function fn_selectMovieListCallback(data) {
			var total = data.TOTAL;
			var body = $('#movie_list tbody');
			if (total == 0) {
				var str = "<tr>" + "<td colspan='9'>조회된 결과가 없습니다.</td>"
						+ "</tr>";
				body.append(str);
			} else {
				var str = "";
				$
						.each(
								data.list,
								function(key, value) {
									str += "<tr>"
											+ "<td id='MOVIE_CD'>"
											+ value.MOVIE_CD
											+ "</td>"
											+ "<td>"
											+ "<a href='#this' name='MOVIE_NM'>"
											+ value.MOVIE_NM
											+ "</a>"
											+ "<input type='hidden' id='MOVIE_NM' value=" + value.MOVIE_CD + ">"
											+ "</td>" + "<td>"
											+ value.GENRE_CD + "</td>"
											+ "<td>" + value.PRODUCTION
											+ "</td>" + "<td>"
											+ value.INS_DT + "</td>"
											+ "<td>" + value.DEL_YN
											+ "</td>" + "</tr>";
								});
				body.append(str);

				$("a[name='MOVIE_NM']").on("click", function(e) { // 채널명 클릭시 상세 조회
					e.preventDefault();
					fn_selectMovieDetail($(this));
				});
			}
		}

		function fn_selectMovieWrite() {
			var comSubmit = new ComSubmit();
			comSubmit
					.setUrl("<c:url value='/movie/selectMovieWrite.do' />");
			comSubmit.submit();
		}
		</script>

	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<!-- DataTables -->
<script src="${ctx}/first/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${ctx}/first/plugins/datatables/dataTables.bootstrap.min.js"></script>

<script>
  $(function () {
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    });
  });
</script>