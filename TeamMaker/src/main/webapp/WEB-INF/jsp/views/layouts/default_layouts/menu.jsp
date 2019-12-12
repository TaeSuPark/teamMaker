<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script language="JavaScript">
function notService() {
    alert("서비스 준비중입니다.");
    return;
}
</script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="../../teammaker"style="">Home</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto" style="width:400px; margin: 0 auto">
     	<li class="nav-item dropdown">
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">내 정보</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="../../teammaker/myinfo/myinfoHome.do">내 정보 조회</a>
      				<a class="dropdown-item" href="../../teammaker/myinfo/myinfoCareer.do">커리어 카드 관리</a>
    			</div>
  		</li>
     	<li class="nav-item dropdown">
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">공모전 탐색</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="../../teammaker/search/searchHome_A.do">세미나형 모집</a>
      				<a class="dropdown-item" href="../../teammaker/search/searchHome_B.do">일반 모집</a>
    			</div>
  		</li>
     	<li class="nav-item dropdown">
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">서비스 가이드</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="#" onclick="notService()">서비스 개요</a>
      				<a class="dropdown-item" href="#" onclick="notService()">주최자 가이드</a>
      				<a class="dropdown-item" href="#" onclick="notService()">참가자 가이드</a>
    			</div>
  		</li>
    </ul>
  </div>
</nav>
</body>
</html>