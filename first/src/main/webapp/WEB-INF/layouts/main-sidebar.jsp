<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="taglibs.jsp"%>
<!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="${ctx}/dist/img/user3-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>사용자명</p>
          <!-- Status -->
          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
        </div>
      </div>

      <!-- search form (Optional) -->
      <form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form>
      <!-- /.search form -->

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">컨텐츠관리</li>
        <!-- Optionally, you can add icons to the links -->
        <li class="active"><a href="#"><i class="fa fa-link"></i> <span>Link</span></a></li>
        <li><a href="#"><i class="fa fa-link"></i> <span>Another Link</span></a></li>
        <li class="treeview">
          <a href="#"><i class="fa fa-link"></i> <span>Multilevel</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#">Link in level 2</a></li>
            <li><a href="#">Link in level 2</a></li>
          </ul>
        </li>
        <li class="treeview">
          <a href="#"><i class="fa fa-laptop"></i> <span>PP사관리</span>          
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${ctx}/pp/pp.do"><i class="fa fa-circle-o"></i>PP사현황</a></li>
          </ul>
        </li>
        <!-- 공통관리메뉴 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-th"></i> <span>공통관리</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="#"><i class="fa fa-circle-o"></i>공통[코드]</a></li>
          </ul>
        </li>
        <!-- 채널관리메뉴 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-calendar"></i> <span>채널관리</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${ctx}/channel/channel.do"><i class="fa fa-circle-o"></i>채널[메타]</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i>채널[이미지]</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i>채널[노출]</a></li>
            <li><a href="#"><i class="fa fa-circle-o"></i>채널[편성표]</a></li>
          </ul>
        </li>
        <!-- VOD메타관리메뉴 -->
        <li class="treeview">
          <a href="#"><i class="fa fa-edit"></i> <span>VOD메타관리</span>
            <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
          </a>
          <ul class="treeview-menu">
            <li><a href="${ctx}/program/program.do"><i class="fa fa-circle-o"></i>VOD메타[방송]</a></li>
            <li><a href="${ctx}/movie/movie.do"><i class="fa fa-circle-o"></i>VOD메타[영화]</a></li>
            <li><a href="${ctx}/clip/clip.do"><i class="fa fa-circle-o"></i>VOD메타[클립]</a></li>
          </ul>
        </li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>