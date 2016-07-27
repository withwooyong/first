<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<tiles:insertAttribute name="include-header" />
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">
	<tiles:insertAttribute name="main-header" />
	<tiles:insertAttribute name="main-sidebar" />
	<tiles:insertAttribute name="control-sidebar" />
	<tiles:insertAttribute name="body" />
  	<tiles:insertAttribute name="main-footer" />
  	<tiles:insertAttribute name="control-sidebar" />    
</div>
<!-- ./wrapper -->
</body>
</html>
