<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Channel
        <small>Channel Optional description</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
        <li class="active">Here</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
      <!-- Your Page Content Here -->
      
      
      <body>
	<h2>게시판 목록</h2>
	<table class="channel_list">
		<colgroup>
			<col width="10%"/>
			<col width="*"/>
			<col width="15%"/>
			<col width="20%"/>
		</colgroup>
		<thead>
			<tr>
				<th scope="col">글번호</th>
				<th scope="col">제목</th>
				<th scope="col">조회수</th>
				<th scope="col">작성일</th>
			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
	
	<div id="PAGE_NAVI"></div>
	<input type="hidden" id="PAGE_INDEX" name="PAGE_INDEX"/>
	
	<br/>
	<a href="#this" class="btn" id="write">글쓰기</a>
	
	<%@ include file="/WEB-INF/include/include-body.jspf" %>
	<script type="text/javascript">
		$(document).ready(function(){
			fn_selectChannelList(1);
			
			$("#write").on("click", function(e){ //글쓰기 버튼
				e.preventDefault();
				fn_openChannelWrite();
			});	
			
			$("a[name='title']").on("click", function(e){ //제목 
				e.preventDefault();
				fn_openChannelDetail($(this));
			});
		});
		
		
		function fn_openChannelWrite(){
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/channel/openChannelWrite.do' />");
			comSubmit.submit();
		}
		
		function fn_openChannelDetail(obj){
			var comSubmit = new ComSubmit();
			comSubmit.setUrl("<c:url value='/channel/openChannelDetail.do' />");
			comSubmit.addParam("IDX", obj.parent().find("#IDX").val());
			comSubmit.submit();
		}
		
		function fn_selectChannelList(pageNo){
			var comAjax = new ComAjax();
			comAjax.setUrl("<c:url value='/channel/selectChannelList.do' />");
			comAjax.setCallback("fn_selectChannelListCallback");
			comAjax.addParam("PAGE_INDEX",$("#PAGE_INDEX").val());
			comAjax.addParam("PAGE_ROW", 15);
			comAjax.addParam("IDX_FE", $("#IDX_FE").val());
			comAjax.ajax();
		}
		
		function fn_selectChannelListCallback(data){
			var total = data.TOTAL;
			var body = $("table>tbody");
			body.empty();
			if(total == 0){
				var str = "<tr>" + 
								"<td colspan='4'>조회된 결과가 없습니다.</td>" + 
							"</tr>";
				body.append(str);
			}
			else{
				var params = {
					divId : "PAGE_NAVI",
					pageIndex : "PAGE_INDEX",
					totalCount : total,
					eventName : "fn_selectChannelList"
				};
				gfn_renderPaging(params);
				
				var str = "";
				$.each(data.list, function(key, value){
					str += "<tr>" + 
								"<td>" + value.IDX + "</td>" + 
								"<td class='title'>" +
									"<a href='#this' name='title'>" + value.TITLE + "</a>" +
									"<input type='hidden' name='title' value=" + value.IDX + ">" + 
								"</td>" +
								"<td>" + value.HIT_CNT + "</td>" + 
								"<td>" + value.CREA_DTM + "</td>" + 
							"</tr>";
				});
				body.append(str);
				
				$("a[name='title']").on("click", function(e){ //제목 
					e.preventDefault();
					fn_openChannelDetail($(this));
				});
			}
		}
	</script>	
</body>
      
      
      
      
      
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
 