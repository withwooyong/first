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
<!-- 	</section>	 -->
<!-- 	<section class="content"> -->
		<div class="row">	
		<!-- left column -->
        	<div class="col-md-6">
				<div class="col-md-6 box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">프로그램목록</h3>
					</div>
					<!-- /.box-header -->
<!-- 					<div class="box-body" style="overflow:scroll;height:auto;max-height:250px;overflow:auto"> -->
					<div class="box-body">
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

	  	<!-- program detail -->
		<div class="row">	
			<div class="col-md-6">
		      <div class="box box-primary" id="contents_detail">
		        <div class="box-header with-border">
		          <h3 class="box-title">프로그램상세</h3>          		
		          <div class="box-tools pull-right">          	  
			          <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
			          <button type="submit" id="program_save" class="btn btn-info pull-right">저장</button>	          
			        </div>	          
		        </div>
		        <!-- /.box-header -->
		        <div>
		        	<!-- form start -->			
					<form class="form-horizontal" id="program_detail_form" name="program_detail_form" role="form">
						<div class="box-body">
							<div class="form-group">
								<label for="i_pgm_cd" class="col-md-2 control-label">프로그램코드:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_pgm_cd" name="i_pgm_cd" type="text" placeholder="M00551">
								</div>
								<label for="i_pgm_nm" class="col-md-2 control-label">프로그램명:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_pgm_nm" name="i_pgm_nm" type="text" placeholder="쇼미더머니 5">
								</div>
								<label for="i_pgm_nm_en" class="col-md-2 control-label">영문명:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_pgm_nm_en" name="i_pgm_nm_en" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_production" class="col-md-2 control-label">제작사:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_production" name="i_production" type="text" placeholder="">
								</div>
								<label for="i_cate1_cd" class="col-md-2 control-label">카테고리1:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_cate1_cd" name="i_cate1_cd" type="text" placeholder="">
								</div>
								<label for="i_cate2_cd" class="col-md-2 control-label">카테고리2:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_cate2_cd" name="i_cate2_cd" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_first_broad_cd" class="col-md-2 control-label">채널코드:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_first_broad_cd" name="i_first_broad_cd" type="text" placeholder="CPCS0100">
								</div>						
								<label for="i_product_yr" class="col-md-2 control-label">제작년도:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_product_yr" name="i_product_yr" type="text" placeholder="">
								</div>
								<label for="i_nation_nm" class="col-md-2 control-label">제작국가:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_nation_nm" name="i_nation_nm" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_director" class="col-md-2 control-label">제작자(감독/PD):</label>
								<div class="col-md-2">
									<input class="form-control" id="i_director" name="i_director" type="text" placeholder="">
								</div>
								<label for="i_broad_dt" class="col-md-2 control-label">방영일:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_broad_dt" name="i_broad_dt" type="text" placeholder="">
								</div>
								<label for="i_grade_cd" class="col-md-2 control-label">등급:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_grade_cd" name="i_grade_cd" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_actor" class="col-md-2 control-label">출연인물(배우):</label>
								<div class="col-md-10">
									<input class="form-control" id="i_actor" name="i_actor" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_synop" class="col-md-2 control-label">시놉시스:</label>
								<div class="col-md-10">
									<input class="form-control" id="i_synop" name="i_synop" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_kwd" class="col-md-2 control-label">검색키워드:</label>
								<div class="col-md-10">
									<input class="form-control" id="i_kwd" name="i_kwd" type="text" placeholder="">
								</div>
							</div>
						</div>
					</form>
		        </div>
		        <!-- /.box-body -->
		      </div>
	      </div> <!-- end col -->
	      <div class="col-md-6">
		      <div class="box box-primary" id="contents_detail">
		        <div class="box-header with-border">
		          <h3 class="box-title">에피소드상세</h3>          		
		          <div class="box-tools pull-right">          	  
			          <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
			          <button type="submit" id="program_save" class="btn btn-info pull-right">저장</button>	          
			        </div>	          
		        </div>
		        <!-- /.box-header -->
		        <div>
		        	<!-- form start -->			
					<form class="form-horizontal" id="episode_detail_form" name="episode_detail_form" role="form">
						<div class="box-body">
							<div class="form-group">
								<label for="i_epi_cd" class="col-md-2 control-label">에피소드코드:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_epi_cd" name="i_epi_cd" type="text" placeholder="M00551">
								</div>
								<label for="i_epi_nm" class="col-md-2 control-label">에피소드명:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_epi_nm" name="i_epi_nm" type="text" placeholder="쇼미더머니 5">
								</div>
								<label for="i_epi_nm_en" class="col-md-2 control-label">영문명:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_epi_nm_en" name="i_epi_nm_en" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_frequency" class="col-md-2 control-label">회차:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_frequency" name="i_frequency" type="text" placeholder="">
								</div>
								<label for="i_vod_amt" class="col-md-2 control-label">가격:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_vod_amt" name="i_vod_amt" type="text" placeholder="">
								</div>
								<label for="i_cate1_cd" class="col-md-2 control-label">카테고리1:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_cate1_cd" name="i_cate1_cd" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_cate2_cd" class="col-md-2 control-label">카테고리2:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_cate2_cd" name="i_cate2_cd" type="text" placeholder="">
								</div>
								<label for="i_broad_dt" class="col-md-2 control-label">방송일자:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_broad_dt" name="i_broad_dt" type="text" placeholder="CPCS0100">
								</div>						
								<label for="i_grade_cd" class="col-md-2 control-label">등급코드:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_grade_cd" name="i_grade_cd" type="text" placeholder="">
								</div>								
							</div>
							<div class="form-group">
								<label for="i_runtime_mi" class="col-md-2 control-label">재생시간(분):</label>
								<div class="col-md-2">
									<input class="form-control" id="i_runtime_mi" name="i_runtime_mi" type="text" placeholder="">
								</div>
								<label for="i_mcp_cd" class="col-md-2 control-label">MCP:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_mcp_cd" name="i_mcp_cd" type="text" placeholder="">
								</div>
								<label for="i_scp_cd" class="col-md-2 control-label">SCP:</label>
								<div class="col-md-2">
									<input class="form-control" id="i_scp_cd" name="i_scp_cd" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_actor" class="col-md-2 control-label">출연인물(배우):</label>
								<div class="col-md-10">
									<input class="form-control" id="i_actor" name="i_actor" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_synop" class="col-md-2 control-label">시놉시스:</label>
								<div class="col-md-10">
									<input class="form-control" id="i_synop" name="i_synop" type="text" placeholder="">
								</div>
							</div>
							<div class="form-group">
								<label for="i_kwd" class="col-md-2 control-label">검색키워드:</label>
								<div class="col-md-10">
									<input class="form-control" id="i_kwd" name="i_kwd" type="text" placeholder="">
								</div>
							</div>
						</div>
					</form>
		        </div>
		        <!-- /.box-body -->
		      </div>
	      </div> <!-- end col -->
	    </div> <!-- end row -->
      
      <!-- START CUSTOM TABS -->
      <h2 class="page-header">AdminLTE Custom Tabs</h2>

      <div class="row">
        <div class="col-md-6">
          <!-- Custom Tabs -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs">
              <li class="active"><a href="#tab_1" data-toggle="tab">프로그램</a></li>
              <li><a href="#tab_2" data-toggle="tab">에피소드</a></li>              
              <li class="pull-right"><a href="#" class="text-muted"><i class="fa fa-gear"></i></a></li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane active" id="tab_1">
                <b>How to use:</b>
                <p>Exactly like the original bootstrap tabs except you should use
                  the custom wrapper <code>.nav-tabs-custom</code> to achieve this style.</p>
                A wonderful serenity has taken possession of my entire soul,
                like these sweet mornings of spring which I enjoy with my whole heart.
                I am alone, and feel the charm of existence in this spot,
                which was created for the bliss of souls like mine. I am so happy,
                my dear friend, so absorbed in the exquisite sense of mere tranquil existence,
                that I neglect my talents. I should be incapable of drawing a single stroke
                at the present moment; and yet I feel that I never was a greater artist than now.
              </div>
              <!-- /.tab-pane -->
              <div class="tab-pane" id="tab_2">
                The European languages are members of the same family. Their separate existence is a myth.
                For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
                in their grammar, their pronunciation and their most common words. Everyone realizes why a
                new common language would be desirable: one could refuse to pay expensive translators. To
                achieve this, it would be necessary to have uniform grammar, pronunciation and more common
                words. If several languages coalesce, the grammar of the resulting language is more simple
                and regular than that of the individual languages.
              </div>
              <!-- /.tab-pane -->
            </div>
            <!-- /.tab-content -->
          </div>
          <!-- nav-tabs-custom -->
        </div>
        <!-- /.col -->

        <div class="col-md-6">
          <!-- Custom Tabs (Pulled to the right) -->
          <div class="nav-tabs-custom">
            <ul class="nav nav-tabs pull-right">
              <li class="active"><a href="#tab_1-1" data-toggle="tab">Tab 1</a></li>
              <li><a href="#tab_2-2" data-toggle="tab">Tab 2</a></li>
              <li><a href="#tab_3-2" data-toggle="tab">Tab 3</a></li>
              <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                  Dropdown <span class="caret"></span>
                </a>
                <ul class="dropdown-menu">
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
                  <li role="presentation" class="divider"></li>
                  <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
                </ul>
              </li>
              <li class="pull-left header"><i class="fa fa-th"></i> Custom Tabs</li>
            </ul>
            <div class="tab-content">
              <div class="tab-pane active" id="tab_1-1">
                <b>How to use:</b>

                <p>Exactly like the original bootstrap tabs except you should use
                  the custom wrapper <code>.nav-tabs-custom</code> to achieve this style.</p>
                A wonderful serenity has taken possession of my entire soul,
                like these sweet mornings of spring which I enjoy with my whole heart.
                I am alone, and feel the charm of existence in this spot,
                which was created for the bliss of souls like mine. I am so happy,
                my dear friend, so absorbed in the exquisite sense of mere tranquil existence,
                that I neglect my talents. I should be incapable of drawing a single stroke
                at the present moment; and yet I feel that I never was a greater artist than now.
              </div>
              <!-- /.tab-pane -->
              <div class="tab-pane" id="tab_2-2">
                The European languages are members of the same family. Their separate existence is a myth.
                For science, music, sport, etc, Europe uses the same vocabulary. The languages only differ
                in their grammar, their pronunciation and their most common words. Everyone realizes why a
                new common language would be desirable: one could refuse to pay expensive translators. To
                achieve this, it would be necessary to have uniform grammar, pronunciation and more common
                words. If several languages coalesce, the grammar of the resulting language is more simple
                and regular than that of the individual languages.
              </div>
              <!-- /.tab-pane -->
              <div class="tab-pane" id="tab_3-2">
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                It has survived not only five centuries, but also the leap into electronic typesetting,
                remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset
                sheets containing Lorem Ipsum passages, and more recently with desktop publishing software
                like Aldus PageMaker including versions of Lorem Ipsum.
              </div>
              <!-- /.tab-pane -->
            </div>
            <!-- /.tab-content -->
          </div>
          <!-- nav-tabs-custom -->
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
      <!-- END CUSTOM TABS -->
      		
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




