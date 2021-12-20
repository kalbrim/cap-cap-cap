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
			
			<h3><img src="images/playhole.jpg" alt="car cmon please" width="600"
					height="100"> </h3>
					
					
					
				<div class="container-fluid py-5">
					<!-- <h1 class="display-5 fw-bold">Play</h1> -->
					<p class="col-md-8 fs-4"></p>
					
					
					
					<form:form method="post" action="/play" modelAttribute="hole">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputFirstOnTheGreen">First on the green: </label>
      <form:input path="firstOnTheGreen" type="text" class="form-control" id="inputFirstOnTheGreen" placeholder=""/>
    </div>
    
  </div>
  
  
    <div class="form-row">
    
   <div class="form-group col-md-6">
      <label for="inputEmail4">Closest to the pin: </label>
      <form:input path="closestToThePin" type="text" class="form-control" id="inputClosestToThePin"/>
    </div>
  </div>
  
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputPassword4">First in the hole: </label>
      <form:input path="firstInTheHole" type="text" class="form-control" id="inputFirstInTheHole"/>
    </div>
  </div>
 
  
   
  
  <div class="form-group">

  </div>
  <button type="submit" class="btn btn-primary">Enter</button>
</form:form>
					
						
						
					
				</div>
			</div>
			
			
			

			
			
			
			

			<footer class="pt-3 mt-4 text-muted border-top">  </footer>
		</div>
	</main>





</body>

</html>
