<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<script language="JavaScript">
function notService() {
    alert("���� �غ����Դϴ�.");
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
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">�� ����</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="../../teammaker/myinfo/myinfoHome.do">�� ���� ��ȸ</a>
      				<a class="dropdown-item" href="../../teammaker/myinfo/myinfoCareer.do">Ŀ���� ī�� ����</a>
    			</div>
  		</li>
     	<li class="nav-item dropdown">
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">������ Ž��</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="../../teammaker/search/searchHome_A.do">���̳��� ����</a>
      				<a class="dropdown-item" href="../../teammaker/search/searchHome_B.do">�Ϲ� ����</a>
    			</div>
  		</li>
     	<li class="nav-item dropdown">
    		<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false" style="">���� ���̵�</a>
    			<div class="dropdown-menu" style="">
      				<a class="dropdown-item" href="#" onclick="notService()">���� ����</a>
      				<a class="dropdown-item" href="#" onclick="notService()">������ ���̵�</a>
      				<a class="dropdown-item" href="#" onclick="notService()">������ ���̵�</a>
    			</div>
  		</li>
    </ul>
  </div>
</nav>
</body>
</html>