<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>
<div style="width:500px; margin:25px auto">
<div class="card border-secondary mb-3" style=" width:500px;">
  <div class="card-header">내 정보</div>
  <div class="card-body">
    <h5 class="card-title">이름 : ${loginvo.userName}</h5>
    <h5 class="card-title">e-Mail : ${loginvo.eMail}</h5>
    <h5 class="card-title">전화번호 : +82 ${loginvo.phoneNum}</h5>
  </div>
</div>

<div class="card border-secondary mb-3" style=" width:500px;">
  <div class="card-header">내 소개</div>
  <div class="card-body">
    <p class="card-text">${loginvo.introduce}</p>
  </div>
</div>
</div>
</body>
</html>