<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>BBbongo</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/4.4/examples/cover/">

<!-- Bootstrap core CSS -->
<link
	href="https://getbootstrap.com/docs/4.4/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">


<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>
<!-- Custom styles for this template -->
<link href="cover.css" rel="stylesheet">
</head>


<!--<body style="background-color:floralwhite;"> -->
 <body>
 
 

	<main>
		<div class="container py-4">
			<header class="pb-3 mb-4 border-bottom">

				<img src="images/bbb.jpg" alt="car cmon please" width="200"
					height="60"> 
					
					
					<!-- ggggggggggggggggggg -->
					

    
      <nav class="nav nav-masthead justify-content-center">
        <a class="nav-link active" href="/">Home</a>
        <a class="nav-link" href="/scores">Scores</a>
        
      </nav>


					




			</header>

			
			
			
			<div class="p-5 mb-4 bg-light rounded-3">
			
			
					<h1 class="cover-heading">Scores Below</h1>

			<!-- End -->
			<!-- table try -->
			<c:if test="${playersArrayList != null }">
				<table class="table">
					<caption></caption>
					<thead>
						<tr>
							<th scope="col">Name</th>
							<th scope="col">Bingos</th>
							<th scope="col">Bangos</th>
							<th scope="col">Bongos</th>
							<th scope="col">Total</th>
							
							<!-- try thing -->
							<th></th>
							
							<!-- try thing -->
							
						</tr>
					</thead>
					<tbody>
					
					
					
					
					
					
					<!-- try thing -->
					<c:set var="count" value="0" scope="page" />
					<!-- try thing -->
					
					
					
					
					
					
						<c:forEach items="${playersArrayList}" var="item">
							<tr>
								<td><c:out value="${item.name}" /></td>
								<td><c:out value="${item.numberOfBingos}" /></td>
								<td><c:out value="${item.numberOfBangos}" /></td>
								<td><c:out value="${item.numberOfBongos}" /></td>
								<td><c:out value="${item.total}" /></td>
								
								
								
								
								
								<!-- try thing -->
								<td>
								
								
								<c:if test="${count == 0}">
 									<img src="images/gold.jpg" alt="yea" width="39" height="39">
								</c:if>
								
								<c:if test="${count == 1}">
 									<img src="images/silver.jpg" alt="yea" width="39" height="39">
								</c:if>
								
								<c:if test="${count == 2}">
 									<img src="images/bronze.jpg" alt="yea" width="39" height="39">
								</c:if>


								<c:set var="count" value="${count + 1}" scope="page"/>
								
								
								</td>
							
							
							<!-- try thing -->
							
							
							
								
								
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</c:if>
			<!-- still table try -->



			<p class="lead"></p>
					
					
					
				<div class="container-fluid py-5">
					<!-- <h1 class="display-5 fw-bold">Play</h1> -->
					<p class="col-md-8 fs-4"></p>
					
					
						
					
				</div>
			</div>
			
			
			

			
			
			
			

			<footer class="pt-3 mt-4 text-muted border-top">  </footer>
		</div>
	</main>





</body>

</html>
