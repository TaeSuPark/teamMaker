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
<div style="width:300px; margin:25px auto">
<c:forEach var="row" items="${cList}">
<div class="card border-secondary mb-3" style="max-width: 20rem;">
  <div class="card-header">내 커리어 카드</div>
  <div class="card-body">
    <h5 class="card-title">공모전 : ${row.contestName}</h5>
    <h5 class="card-title">역할 : ${row.rule}</h5>
    <h5 class="card-title">수상 여부 : ${row.isAward}</h5>
  	<p class="card-text">공모전 기간 : <fmt:formatDate value="${row.startDate}" pattern="yy-MM-dd"/> ~ <fmt:formatDate value="${row.endDate}" pattern="yy-MM-dd"/></p>
  </div>
</div>
</c:forEach>
</div>
</body>
</html>