<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
				<button type="submit" id="search" class="btn btn-info pull-right" >검색</button>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			<form action="" class="form-horizontal" id="searchForm" name="searchForm" role="form">
				<div class="box-body">
					<div class="form-group">
						<label for="s_ch_nm" class="col-md-1 control-label">채널명:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_ch_nm" name="s_ch_nm" type="text" placeholder="KBS" onkeypress="enterKey();" autofocus>
						</div>
						<label for="s_ch_cd" class="col-md-1 control-label">코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_ch_cd" name="s_ch_cd" type="text" placeholder="C00551" onkeypress="enterKey();">
						</div>				
						<label for="s_ch_kind_cd" class="col-md-1 control-label">종류코드:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_ch_kind_cd" name="s_ch_kind_cd" type="text" placeholder="CPCS0100" onkeypress="enterKey();">
						</div>						
						<label for="s_ch_no" class="col-md-1 control-label">채널번호:</label>
						<div class="col-md-2">
							<input class="form-control" id="s_ch_no" name="s_ch_kind_cd" type="text" placeholder="18" onkeypress="enterKey();">
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
				</table>
			</div>
			<!-- /.box-body -->
		</div>
		
		<!-- channel detail -->	  
      	<div class="box box-primary" id="channel_detail">
	        <div class="box-header with-border">
	          <h3 class="box-title">채널정보</h3>
	          <button type="submit" id="save" class="btn btn-info pull-right">채널정보저장</button>
	        </div>
	        <!-- /.box-header -->
			<div class="box-body" id="detailForm">
				<table id="channel_info" class="table table-bordered">
					<!-- tr th success, info, warning, danger -->
					<tr>
						<th class="info col-md-1">채널코드</th>
						<td class="col-md-2"><input type="text" id="i_ch_cd" readonly></input></td>
						<th class="info col-md-1">채널명</th>
						<td class="col-md-2"><input type="text" id="i_ch_nm"></input></td>
						<th class="info col-md-1">채널종류</th>
						<td class="col-md-2">
							<select class="form-control select2" id="i_ch_kind_cd" name="i_ch_kind_cd" style="width: 50%;"></select>
						</td>
						<th class="info col-md-1">채널번호</th>
						<td class="col-md-2"><input type="text"  id="i_ch_no"></input></td>
					</tr>
					<tr>
						<th class="info col-md-1">화면비율</th>
						<td class="col-md-2">
							<select class="form-control select2" id="i_ratio_cd" name="i_ratio_cd" style="width: 50%;"></select>
						</td>
						<th class="info col-md-1">SORT_NO</th>
						<td class="col-md-2"><input type="text" id="i_sort_no"></input></td>
						<th class="info col-md-1">PAYFREE_YN</th>
						<td class="col-md-2">
							<select class="form-control select2" id="i_payfree_yn" name="i_payfree_yn" style="width: 50%;">
			                  <option value="Y" selected="selected">Y</option>
			                  <option value="N" >N</option>
			                </select>
						</td>
						<th class="info col-md-1">HD_YN</th>
						<td class="col-md-2">
							<select class="form-control select2" id="i_hd_yn" name="i_hd_yn" style="width: 50%;">
			                  <option value="Y" selected="selected">Y</option>
			                  <option value="N">N</option>
			                </select>
						</td>
					</tr>
				</table>
			</div>
		</div>
		
		<!-- channel image -->	  
      	<div class="box">
			<div class="box-header">
				<h3 class="box-title">채널이미지</h3>
			</div>
			<!-- /.box-header -->
			<div class="box-body table-responsive ">
				<table id="channel_image_list" class="table table-bordered table-striped table-hover">
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
		
		<!-- channel url -->	  
      	<div class="box">
			<div class="box-header">
				<h3 class="box-title">채널URL</h3>
				<button type="submit" id="channel_url_save" class="btn btn-info pull-right">URL저장</button>
			</div>
			<!-- /.box-header -->
			<div class="box-body table-responsive ">
				<table id="channel_url_list" class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th class="info col-md-1">스크린</th>
							<th class="info col-md-4">방송URL</th>
							<th class="info col-md-3">미리보기URL</th>
							<th class="info col-md-3">오디오URL</th>
							<th class="info col-md-1">삭제유무</th>
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
	</section>
	<!-- /.content -->
</div>
<!-- /.content-wrapper -->

<script type="text/javascript" src="${ctx}/js/page.channel.main.js?v=${version}"></script>
<script type="text/javascript">

$(document).ready(function() {	
	
	fn_selectChannelList(1);
	
	$("#search").on("click", function(e) {
		e.preventDefault();
		fn_selectChannelList("searchForm");
	});
	
	$("#save").on("click", function(e){ // 채널저장 버튼
		e.preventDefault();
		fn_updateChannel("channel_info");
	});
	
	$("#channel_info_save").on("click", function(e){ // 저장 버튼
		e.preventDefault();
		fn_updateChannelInfo();
	});
	
	$("#channel_image_save").on("click", function(e){ // 이미지저장 버튼
		e.preventDefault();
		fn_updateChannelImage();
	});
	
	$("#channel_url_save").on("click", function(e){ // URL 저장버튼
		e.preventDefault();
		fn_updateChannelUrl("channel_url_list");
	});
	
	
});
</script>