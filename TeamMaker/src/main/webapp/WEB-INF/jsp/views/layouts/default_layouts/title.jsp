<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
</head>
<body>
	<c:set var = "session" value = "${loginvo}"/>
	<c:choose>
		<c:when test="${session == null}">
			<div style="float : right;">
			<button type="submit" class="btn btn-link" onclick="location.href='../../teammaker/login/joinHome.do'">ȸ������</button>
			</div>
			<div style="float : right;">
			<button type="submit" class="btn btn-link" onclick="location.href='../../teammaker/login/loginHome.do'">�α���</button>
			</div>
			<br>
			<br>
		</c:when>
		<c:otherwise>
			<div style="float : right;">
			<h6>${loginvo.userName}�� �ȳ��ϼ���.</h6>
			</div>
			<br>
			<br>
		</c:otherwise>
	</c:choose>
	 <script src="${pageContext.request.contextPath}/resources/js/jquery-3.4.1.min.js"></script> 
    <script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script> 
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>