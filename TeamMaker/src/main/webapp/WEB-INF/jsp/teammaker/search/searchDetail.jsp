<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
<div class="card mb-3" style="width:800px; margin:25px auto">
  <h3 class="card-header">공모전 상세</h3>
  <div class="card-body">
    <h5 class="card-title">${list.contestName}</h5>
    <h6 class="card-subtitle text-muted"></h6>
  </div>
  <div style="height:500px;width:800px;overflow:hidden;">
  	<img style="height:600px; width:auto; margin:auto;display: block;" src="${pageContext.request.contextPath}/resources/images/${list.imageName}" alt="Card image">
  </div>
  <div class="card-body">
    <p class="card-text">${list.contents}</p>
  </div>
  <ul class="list-group list-group-flush">
    <li class="list-group-item"></li>
    <li class="list-group-item"> 기간 : <fmt:formatDate value="${list.startDate}" pattern="yy-MM-dd"/> ~ <fmt:formatDate value="${list.endDate}" pattern="yy-MM-dd"/></li>
  </ul>
  <div class="card-body">
    <a href="../../teammaker" class="card-link">홈으로</a>
  </div>
</div>
</body>
</html>