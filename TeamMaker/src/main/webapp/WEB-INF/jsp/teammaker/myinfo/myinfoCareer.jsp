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
  <div class="card-header">�� Ŀ���� ī��</div>
  <div class="card-body">
    <h5 class="card-title">������ : ${row.contestName}</h5>
    <h5 class="card-title">���� : ${row.rule}</h5>
    <h5 class="card-title">���� ���� : ${row.isAward}</h5>
  	<p class="card-text">������ �Ⱓ : <fmt:formatDate value="${row.startDate}" pattern="yy-MM-dd"/> ~ <fmt:formatDate value="${row.endDate}" pattern="yy-MM-dd"/></p>
  </div>
</div>
</c:forEach>
</div>
</body>
</html>