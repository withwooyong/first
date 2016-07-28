<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<%@page import="first.common.util.Global"%>

<%-- <jsp:useBean id="TvingUtils" class="com.tving.web.util.TvingUtils" /> --%>
<%-- <jsp:useBean id="TvingImageUtils" class="com.tving.web.util.TvingImageUtils" /> --%>
<c:set var="version" value="1" scope="request" />
<c:set var="ctx" value="${pageContext.request.contextPath}" scope="request" />
<c:set var="requestUri" value="${requestScope['javax.servlet.forward.request_uri']}" scope="request" />
<c:set var="queryString" value="${requestScope['javax.servlet.forward.query_string']}" scope="request" />

<c:set var="imageDomain" 	   scope="request" value="<%= Global.IMAGE_DOMAIN %>" />
<c:set var="imageOriginDomain" scope="request" value="<%= Global.IMAGE_ORIGIN_DOMAIN %>" />
<c:set var="publicDomain" scope="request" >
	<s:eval expression="@systemConfig['public.server.domain']" />
</c:set>
<c:if test="${pageContext.request.scheme == 'https'}">
    <c:set var="imageDomain" 		value="${fn:replace(imageDomain		 ,'http://image.tving.com', 'https://a248.e.akamai.net/image-origin.tving.com' )}" scope="request" />
    <c:set var="imageOriginDomain" 	value="${fn:replace(imageOriginDomain,'http://', 'https://' )}" scope="request" />
    <c:set var="publicDomain" 		value="${fn:replace(imageOriginDomain,'http://', 'https://' )}" scope="request" />
</c:if>
<c:choose>
	<c:when test="${pageContext.request.serverPort == 80}">
		<c:set var="serverDomain" scope="request" value="${pageContext.request.scheme}://${pageContext.request.serverName}" />
	</c:when>
	<c:otherwise>
	    <c:set var="serverDomain" scope="request" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}" />
	</c:otherwise>
</c:choose>
