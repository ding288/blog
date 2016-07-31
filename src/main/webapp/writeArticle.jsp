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
<link href="resources/css/font-awesome.css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/blog.css" rel="stylesheet">
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.1/summernote.css"
	rel="stylesheet">

</head>

<body>

	<div class="blog-masthead">
		<div class="container">
			<nav class="blog-nav">
				<a class="blog-nav-item" href="main"><s:text name="home" /></a> <a
					class="blog-nav-item" href="#"><s:text name="articleList" /></a> <a
					class="blog-nav-item active" href="writeArticle.jsp"><s:text
						name="writeArticle" /></a> <a class="blog-nav-item" href="#"><s:text
						name="about" /></a>
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
		<form action="writeArticle.do" method="post" id="form1">
			<br />
			<div class="row">
				<label for="inputEmail3" class="col-sm-1 control-label">title</label>
				<div class="col-sm-11">
					<input type="text" class="form-control" id="inputEmail3"
						placeholder="title" name="article.title">
				</div>
			</div>
			<br />
			<div class="row">
				<div id="summernote">Hello Summernote</div>
				<textarea id="content" hidden="true" name="article.content"></textarea>
			</div>
			<input id="sub" type="button" class="btn btn-default" value="保存">
		</form>
	</div>
	<footer class="blog-footer">
		<p>
			Blog template built for <a href="#">me</a> by <a href="#">@me</a>.
		</p>
		<p>
			<a href="#">Back to top</a>
		</p>
	</footer>
	<script src="resources/js/jquery.min.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/ie10-viewport-bug-workaround.js"></script>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.1/summernote.js"></script>
	<script src="resources/js/summernote-zh-CN.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
			//初始化文本框编辑器
			$("#summernote").summernote({
				height : 200,
				callbacks : {
					onImageUpload : function(files) {
						for (var i = 0; i < files.length; i++) {
							sendFile(files[i], this);
						}
					}
				}
			});
			$("#sub").click(function() {
				var text = $('#summernote').summernote('code');
				$("#content").val(text);
				alert(text);
				$("#form1").submit();
			});
		});
		function sendFile(file, el) {
			var formData = new FormData();
			formData.append("img", file);
			var fileData = URL.createObjectURL(file);
			$(el).summernote('insertImage', fileData, function($image) {
				$.ajax({
					url : "upload.do",
					data : formData,
					cache : false,
					contentType : false,
					processData : false,
					dataType : "text",
					type : 'POST',
					success : function(url) {
						if (url == "") {
							$image.attr('src', "");

						} else {
							$image.attr('src', url);
						}
					}
				});
			});
		}
	</script>
</body>
</html>