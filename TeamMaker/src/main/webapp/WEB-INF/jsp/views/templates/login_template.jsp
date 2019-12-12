<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="ko">
<head>
<meta charset="UTF-8">  
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">  
<title>Title</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/swiper.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
</head>
<body>
	<!--/Contents 상단/-->
	<!--/Core 부분/-->
	<div>
		<!-- body : 구현부 -->
		<tiles:insertAttribute name="body" />   
	</div>
	<!-- Contents 하단 -->
	<!-- footer : 하단 메뉴 -->
	<tiles:insertAttribute name="footer" />
	<!-- jQuery first, then Popper.js, then Bootstrap JS --> 

    <script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script> 
    <script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script> 
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/swiper.min.js"></script>    
</body>
</html>
