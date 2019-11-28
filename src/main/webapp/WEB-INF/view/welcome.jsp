<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" 	uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" 		uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="dist/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="dist/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="dist/css/PatsStyle.css">
	<link rel="stylesheet" href="dist/css/skin-blue.css">
	<link rel="stylesheet" href="dist/css/customization.css">
	
	<script src="dist/jQuery/jQuery-2.1.4.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script src="dist/js/app.js"></script>
		
	<style>
		.navbar {position:inherit !important;margin-bottom:0px;}
		img.header {
			position: absolute;
			top: 10px; left: 0; right:0;
			margin: auto;
		}
	</style>
	<title>ONLINE VC MAKER</title>
</head>
<body class="hold-transition skin-blue layout-boxed sidebar-mini">
	<img src="images/online-cv-maker.png" class="header"/>
	<div class="login-box">
    	<div class="login-logo" style="font-size:22px;">
        <b>ONLINE VC MAKER</b>
      	</div>
	  
      	<form:form method="POST" action="login" modelAttribute="user">
      	<div class="login-box-body">
        	<p class="login-box-msg">Sign in to start your session</p>
			
			<div class="form-group has-feedback">
				<form:input path="username" cssClass="form-control" />
            	<span class="glyphicon glyphicon-user form-control-feedback"></span>
          	</div>
          	<div class="form-group has-feedback">
          		<form:password path="password" cssClass="form-control" />
            	<span class="glyphicon glyphicon-lock form-control-feedback"></span>
          	</div>
			
			<div class="row">
				<div class="col-xs-8"></div>
				<div class="col-xs-4">
				  <button type="submit" class="btn btn-primary btn-block btn-flat">LogIn</button>
				</div>
          	</div>
      	</div>
		</form:form>
	</div>
		
</body>
</html>	