<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="EUC-KR">
  <title>TeamMaker</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

  <!-- Link Swiper's CSS -->
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/swiper.min.css">

  <!-- Demo styles -->
  <style>
    body {
      background: #fff;
      font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
      font-size: 14px;
      color:#000;
      margin: 0;
      padding: 0;
    }
    .swiper-container {
      width: 100%;
      padding-top: 50px;
      padding-bottom: 50px;
    }
    .swiper-slide {
      background-position: center;
      background-size: cover;
      width: 300px;
      height: 300px;
    }
  </style>
</head>
<body>
<!-- 카드 입력 -->
<div>
<hr>
<br>
<br>
<h3>세미나형 모집</h3>
<c:forEach var="row_A" items="${List_A}">
	<div class="card mb-3" style="height:400px; width:300px; margin-left:20px; float:left">
  		<h3 class="card-header"></h3>
  		<div class="card-body">
   	 		<h5 class="card-title">${row_A.contestName}</h5>
   	 		<h6 class="card-subtitle text-muted">세미나형 모집</h6>
  		</div>
  		<div style="height:200px;width:300px;overflow:hidden;">
  			<img style="height:300px; width:auto; margin:auto;display: block;" src="${pageContext.request.contextPath}/resources/images/${row_A.imageName}" alt="Card image">
 	 	</div>
 	 	<div class="card-body">
   	 		<p class="card-text">${row_A.contents}</p>
  		</div>
 	 	<div class="card-body">
   	 		<a href="searchDetail.do?contestId=${row_A.contestId}" class="card-link">상세 보기</a>
  		</div>
  		<div class="card-footer text-muted">
  		</div>
	</div>
</c:forEach>
</div>
<div style="clear:both"></div>
<br>
<br>

  <!-- Swiper JS -->
  <script src="resources/js/swiper.min.js"></script>

  <!-- Initialize Swiper -->
  <script>
    var swiper = new Swiper('.swiper-container', {
      effect: 'coverflow',
      grabCursor: true,
      centeredSlides: true,
      slidesPerView: 'auto',
      coverflowEffect: {
        rotate: 50,
        stretch: 0,
        depth: 100,
        modifier: 1,
        slideShadows : true,
      },
      pagination: {
        el: '.swiper-pagination',
      },
    });
  </script>
</body>
</html>