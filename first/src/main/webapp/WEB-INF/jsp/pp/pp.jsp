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
							<input class="form-control" id="s_cd_cust" name="s_cd_cust" type="text" placeholder="1115" onkeypress="if(event.keyCode==13) { enterKey(); return false;}" >
						</div>						
						<label for="search_kn_cust" class="col-md-1 control-label">PP사명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_kn_cust" name="s_kn_cust" type="text" placeholder="CJ E&M" onkeypress="enterKey();">
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
					<div class="box-body" style="overflow:scroll;height:auto;max-height:250px;overflow:auto">
						<table id="mcp_list" class="table table-bordered table-hover">
			              	<thead>
			              		<tr>
									<th>거래처번호</th>
									<th>거래처명</th>
									<th>법인유무</th>									
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
					<th class="col-md-1">거래처번호</th>
					<td class="col-md-2"><label id="i_corpid"></label></td>
					<th class="col-md-1">거래처명</th>
					<td class="col-md-2"><label id="i_kn_cust"></label></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
				<tr class="warning">
					<th class="col-md-1">사업자번호</th>
					<td class="col-md-2"><label id="i_no_tax"></label></td>
					<th class="col-md-1">대표자명</th>
					<td class="col-md-2"><label id="i_kn_president"></label></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
				<tr class="info">
					<th class="col-md-1">업태</th>
					<td class="col-md-2"><label id="i_kn_businesscond"></label></td>
					<th class="col-md-1">종목</th>
					<td class="col-md-2"><label id="i_kn_item"></label></td>
					<th class="col-md-1">거래처분류</th>
					<td class="col-md-2"><label id="i_cl_cust"></label></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
				<tr class="success">
					<th class="col-md-1">우편번호</th>
					<td class="col-md-2"><label id="i_no_post"></label></td>
					<th class="col-md-1">주소</th>
					<td class="col-md-2"><label id="i_kn_address"></label></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
				<tr class="warning">
					<th class="col-md-1">전화번호</th>
					<td class="col-md-2"><label id="i_no_tel"></label></td>
					<th class="col-md-1">팩스번호</th>
					<td class="col-md-2"><label id="i_no_fax"></label></td>
					<th class="col-md-1">사용유무</th>
					<td class="col-md-2"><label id="i_yn_use"></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
				<tr class="info">
					<th class="col-md-1">담당자이름</th>
					<td class="col-md-2"><label id="i_kn_custemp"></td>
					<th class="col-md-1">담당자연락처</th>
					<td class="col-md-2"><label id="i_kn_custtel"></td>
					<th class="col-md-1">담당자이메일</th>
					<td class="col-md-2"><label id="i_e_mail"></td>
					<th class="col-md-1"></th>
					<td class="col-md-2"></td>
				</tr>
			</table>
		</div>
		
		<section class="content">
			<div class="box-header with-border">
				<h3 class="box-title">PP사채널목록</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body">
				<table id="channel_list" class="table table-bordered table-striped">
	              	<thead>
	              		<tr>
							<th>번호</th>
							<th>채널코드</th>
							<th>채널명</th>
							<th>채널구분</th>
							<th>방송구분</th>
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
				
	  </section>
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

function enterKey() {
    if (event.which == 13 || event.keyCode == 13) {
        //code to execute here
        fn_selectMCPList("searchForm");
        return false;
    }
    return true;
};

// $('input[type=text]').on('keyup', function(e) {
//     if (e.which == 13) {
//         e.preventDefault();
//     }
// });

$(document).ready(function(){
	fn_selectMCPList(1);
	
	$("#search").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();		
		fn_selectMCPList("searchForm");
	});
	
// 			$("a[name='delete']").on("click", function(e){ //삭제 버튼
	$("#save").on("click", function(e){ //파일 추가 버튼
		e.preventDefault();
		fn_save("detailForm");
	});
});	
</script>




