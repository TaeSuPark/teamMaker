<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script language="javascript">
if(${temp} == 1) {
	alert("�α��ο� �����ϼ̽��ϴ�.");
	document.location.href="../../teammaker";
}
else {
	alert("�����̳� ��й�ȣ�� Ȯ�����ּ���.");
	document.location.href="loginHome.do";
}
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title></title>
</head>
<body>

</body>
</html>