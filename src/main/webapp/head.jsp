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
<title>${user.userName}<s:text name="blog" /></title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/blog.css" rel="stylesheet">
</head>

<body>

	<div class="blog-masthead">
		<div class="container">
			<nav class="blog-nav">
				<a class="blog-nav-item active" href="#"><s:text name="home" /></a>
				<a class="blog-nav-item" href="#"><s:text name="articleList" /></a>
				<a class="blog-nav-item" href="writeArticle.jsp"><s:text name="writeArticle" /></a>
				<a class="blog-nav-item" href="index.html"><s:text name="about" /></a>
				<c:choose>
					<c:when test="${user==null}">
						<a class="blog-nav-item" style="float: right;" href="signin.jsp"><s:text
								name="login" /></a>
						<a class="blog-nav-item" style="float: right;" href="#"><s:text
								name="rigist" /></a>
					</c:when>
					<c:otherwise>
						<a class="blog-nav-item" style="float: right;" href="logout"><s:text
								name="logout" /></a>
						<a class="blog-nav-item" style="float: right;" href="#"><s:text
								name="personalCenter" /></a>
					</c:otherwise>
				</c:choose>

			</nav>
		</div>
	</div>

	<div class="container">