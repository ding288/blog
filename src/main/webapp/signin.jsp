<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="resources/img/favicon.ico">
<title>Blog</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/signin.css" rel="stylesheet">
</head>

<body>

	<div class="container">

		<form class="form-signin" action="login" method="post">
			<h2 class="form-signin-heading">
				<s:text name="pleaseSignIn" />
			</h2>
			<label for="inputEmail" class="sr-only"><s:text name="username" /></label> <input
				type="text" id="inputEmail" class="form-control" name="username"
				placeholder="Email address" required autofocus> <label
				for="inputPassword" class="sr-only"><s:text name="password" /></label> <input
				type="password" id="inputPassword" class="form-control" name="password"
				placeholder="Password" required>
			<div class="checkbox">
				<label> <input type="checkbox" value="remember-me">
				<s:text name="remember" />
					<s:text name="me" />
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>

	</div>
	<!-- /container -->

	<script src="resources/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
