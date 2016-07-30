<jsp:include page="head.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="blog-header">
	<h1 class="blog-title">${person.blogTitle}</h1>
	<p class="lead blog-description">${person.blogSubtitle}</p>
</div>

<div class="row">

	<div class="col-sm-8 blog-main">
		<c:forEach items="${articles}" var="article">
			<div class="blog-post">
				<h2 class="blog-post-title"><a href="">${article.title}</a></h2>
				<p class="blog-post-meta">
					<f:formatDate value="${article.createTime}"
						pattern="yyyy-MM-dd HH:mm:ss" />
				</p>

				<p>${article.content}</p>
			</div>
			<!-- /.blog-post -->
		</c:forEach>
		<nav>
			<ul class="pager">
				<li><a href="#">Previous</a></li>
				<li><a href="#">Next</a></li>
			</ul>
		</nav>

	</div>
	<!-- /.blog-main -->

	<div class="col-sm-3 col-sm-offset-1 blog-sidebar">
		<div class="sidebar-module sidebar-module-inset">
			<h4>
				<s:text name="about" />
			</h4>
			<p>
				Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras mattis
				consectetur purus sit amet fermentum. Aenean lacinia bibendum nulla
				sed consectetur.
			</p>
		</div>
		<div class="sidebar-module">
			<h4>
				<s:text name="classify" />
			</h4>
			<ol class="list-unstyled">
				<li><a href="#">March 2014</a></li>
				<li><a href="#">February 2014</a></li>
				<li><a href="#">January 2014</a></li>
				<li><a href="#">December 2013</a></li>
				<li><a href="#">November 2013</a></li>
				<li><a href="#">October 2013</a></li>
				<li><a href="#">September 2013</a></li>
				<li><a href="#">August 2013</a></li>
				<li><a href="#">July 2013</a></li>
				<li><a href="#">June 2013</a></li>
				<li><a href="#">May 2013</a></li>
				<li><a href="#">April 2013</a></li>
			</ol>
		</div>
		<div class="sidebar-module">
			<h4>
				<s:text name="other" />
			</h4>
			<ol class="list-unstyled">
				<li><a href="#">GitHub</a></li>
				<li><a href="#">Twitter</a></li>
				<li><a href="#">Facebook</a></li>
			</ol>
		</div>
	</div>
	<!-- /.blog-sidebar -->

</div>
<!-- /.row -->

<jsp:include page="foot.jsp" />