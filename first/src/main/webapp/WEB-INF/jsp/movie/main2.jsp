<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/config/taglib.jsp" %>
<div id="container">
	<div id="contents" class="sub_live">
		<h2 class="tit_sub" title="실시간TV 지상파, CJ E&amp;M, 종편 등 국내 최대 280여개 채널" >실시간TV 지상파, CJ E&amp;M, 종편 등 국내 최대 280여개 채널</h2>
		<div id="div_nav_tab" class="nav_tab">
			<ul class="depth1">
				<li class="l1"><a href="#id=viewrate" title="시청률순" >시청률순</a></li>
				<li class="l2"><a href="#id=free" title="무료채널" >무료채널</a></li>
				<li class="l3"><a href="#id=my" title="마이 채널" >마이 채널</a></li>
				<li class="l4"><a href="#id=purchase" title="구매한 채널" >구매한 채널</a></li>
				<li class="l5">
					<a href="javascript:;" title="카테고리 더보기" >카테고리 더보기</a>
					<div class="category">
						<ul>
							<li><a href="#id=viewrate" title="시청률순" >시청률순 <span></span></a></li>
							<li><a href="#id=free" title="무료 채널" >무료 채널</a></li>
							<li><a href="#id=my" title="마이 채널" >마이 채널</a></li>
							<li><a href="#id=purchase" title="구매한 채널" >구매한 채널</a></li>
						</ul>
						<span>장르별</span>
						<ul>
							<li><a href="#id=onair" title="지상파/쇼핑" >지상파/쇼핑</a></li>
							<li><a href="#id=cjenm" title="CJ E&amp;M" >CJ E&amp;M</a></li>
							<li><a href="#id=art" title="음악/연예오락" >음악/연예오락</a></li>
							<li><a href="#id=story" title="드라마/영화/애니" >드라마/영화/애니</a></li>
							<li><a href="#id=leisure" title="스포츠/취미" >스포츠/취미</a></li>
							<li><a href="#id=news" title="종편/뉴스/경제/해외" >종편/뉴스/경제/해외</a></li>
							<li><a href="#id=child" title="어린이/만화/교육" >어린이/만화/교육</a></li>
							<li><a href="#id=education" title="다큐/정보/여성/종교" >다큐/정보/여성/종교</a></li>
							<li><a href="#id=adult" title="성인" >성인</a></li>
						</ul>
					</div>
				</li>
			</ul>
			<ul class="add">
				<li class="l1"><a href="#id=all" title="전체 채널 보기" >전체 채널 보기</a></li>
			</ul>
		</div>
		<!-- //nav_sub -->
			
		<div id="div_tit_2depth" class="tit_2depth">
			<h3 id="sub_title" ></h3>
			<div id="div_sorting" class="sorting">
				<a href="javascript:;" data-order="rating" class="on"  title="시청률순" >시청률순</a> <span class="dv">|</span> 
				<a href="javascript:;" data-order="chno"  title="채널순" >채널순</a>
			</div>
		</div>
		<!-- //tit_2depth -->
		
		<div id="contents_list_area" class="sub_list_area">
			<ul id="list_sub" class="list_sub" ></ul>
			<!-- //list_sub -->
			<div id="div_more" class="bt_more_list">
				<a href="javascript:;"  title="더보기" ><span>더보기</span></a>
			</div>
			<!-- //bt_more_list -->
		</div>	
		
		<div id="all_channel" class="sub_list_area" style="display: none;">
			<div class="tit_2depth" data-category="onair"><h3>지상파/쇼핑</h3></div>
			<div class="list_ch_all"><ul class="onair"></ul></div>
			<div class="tit_2depth" data-category="cjenm"><h3>CJ E&amp;M</h3></div>
			<div class="list_ch_all"><ul class="cjenm"></ul></div>
			<div class="tit_2depth" data-category="art"><h3>음악/연예오락</h3></div>
			<div class="list_ch_all"><ul class="art"></ul></div>
			<div class="tit_2depth" data-category="story"><h3>드라마/영화/애니</h3></div>
			<div class="list_ch_all"><ul class="story"></ul></div>
			<div class="tit_2depth" data-category="leisure"><h3>스포츠/취미</h3></div>
			<div class="list_ch_all"><ul class="leisure"></ul></div>
			<div class="tit_2depth" data-category="news"><h3>종편/뉴스/경제/해외</h3></div>
			<div class="list_ch_all"><ul class="news"></ul></div>
			<div class="tit_2depth" data-category="child"><h3>어린이/만화/교육</h3></div>
			<div class="list_ch_all"><ul class="child"></ul></div>
			<div class="tit_2depth" data-category="education"><h3>다큐/정보/여성/종교</h3></div>
			<div class="list_ch_all"><ul class="education"></ul></div>
		</div>
		
		<div id="div_recommend" class="sub_list_area" style="display: none;">
			<p class="alert none_ch">등록된 마이채널이 없습니다. 아래 채널을 클릭해 마이채널을 등록 하시면, TV를 편리하게 이용할 수 있습니다.</p>
			<fieldset>
				<legend>마이채널 등록 영역</legend>
				<ul class="list_ch"></ul>
				<div class="proc"><button id="recommend_add" class="bt_img reg_ch" title="마이채널 등록">마이채널 등록</button></div>
			</fieldset>
		</div>
		
		<div id="div_none_pass" class="none_pass sub_list_area" style="display: none;">
			<p>사용중인 실시간TV 이용권이 없습니다. 이용권을 구매하시면, 언제 어디서나 실시간TV를 무제한으로 시청할 수 있습니다.</p>
			<div><button class="bt_img view_pass" title="이용권 자세히 보기">이용권 자세히 보기</button></div>
		</div>
		
	</div>
	<!--// contents -->
</div>
<!-- //container -->	
<div class="ctrl_scroll">
	<div class="inner">
		<a href="javascript:;" onclick="$(document).scrollTop(0);return;" title="TOP">TOP</a>
		<span><input type="checkbox" id="dynamic" checked="checked" > <label for="dynamic">자동 더보기</label></span>
	</div>
</div>
<script type="text/javascript" src="${publicDomain}/public_v4/portal/js/live/page.live.main.js?v=${version}"></script>
<script type="text/javascript">
	$(function(){
		
		LiveMedia.init();
		
        History.Adapter.bind(window,'hashchange',function(){
        	var idx = location.href.indexOf('#');
        	if (idx > -1 &&  location.href.substring(idx) != '#' ){
	        	LiveMedia.pageInit();
        	}
        });
	});
</script>