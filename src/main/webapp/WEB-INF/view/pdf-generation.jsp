<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="${context}/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${context}/dist/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="${context}/dist/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="${context}/dist/css/PatsStyle.css">
    <link rel="stylesheet" href="${context}/dist/css/skin-blue.css">
    <link rel="stylesheet" href="${context}/dist/css/customization.css">
  	<script src="${context}/dist/jQuery/jQuery-2.1.4.min.js"></script>
  	<script src="${context}/bootstrap/js/bootstrap.min.js"></script>
	<script src="${context}/dist/js/app.js"></script>
	<style>
	.navbar {position:inherit !important;margin-bottom:0px;}
	</style>
</head>
<body>
	
	<body class="hold-transition skin-blue layout-boxed sidebar-mini">
    
    <div class="wrapper">
    
		<header class="main-header">
			<%@ include file="common/_header.jsp" %>
		</header>
		  
		<aside class="main-sidebar">
			<%@ include file="common/_sidebar.left.jsp" %>
		</aside>
	
		<div class="content-wrapper">
			
			<section class="content-header">
			  <h1>Generate Your Online CV</h1> 
			</section>
			
			<section class="content">
			
			  <div class="box">
				<div class="box-header with-border">
				  <h3 class="box-title">Generate Your CV</h3>
				  <div class="box-tools pull-right">
					<button class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse"><i class="fa fa-minus"></i></button>
					<button class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove"><i class="fa fa-times"></i></button>
				  </div>
				</div>
				
				<div class="box-body">
					Generate your <a href="${context}/generation">Online CV</a> in PDF format.
				
				</div>
			  </div>
			</section>
		</div>
		
		<footer class="main-footer">
			<%@ include file="common/_footer.jsp" %>
		</footer>
		<div class="control-sidebar-bg"></div>
	</div>

</body>

</html>