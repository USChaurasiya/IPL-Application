<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<spring:url value="/CSS/jquery-1.12.4.min.js" var="orbitJs" />
<script src="${orbitJs}"></script>
<script type="text/javascript">

</script>


</head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>IPLT20.com</title>
<link rel="icon" href="images/icon.jpg" />

<link rel="stylesheet" type="text/css" href="styles.css" />
<style>
tr {
	float: left;
	padding-left: 75px;
}

h3 {
	padding-right: 100px;
}

h4 {
	padding-right: 100px;
	padding-top: 5px;
}

table {
	padding-right: 100px;
	width: 100px;
	height: 50px;
}

header, footer, article, section, hgroup, nav, figure {
	/* Giving a display value to the HTML5 rendered elements: */
	display: block;
}

article .line {
	/* The dividing line inside of the article is darker: */
	background-color: #15242a;
	border-bottom-color: #204656;
	margin: 1.3em 0;
}

footer .line {
	margin: 0em 0;
}

nav {
	background: url(img/gradient_light.jpg) repeat-x 50% 50% #f8f8f8;
	padding: 0 5px;
	position: absolute;
	right: 0;
	top: 4em;
	border: 1px solid #FCFCFC;
	-moz-box-shadow: 0 1px 1px #333333;
	-webkit-box-shadow: 0 1px 1px #333333;
	box-shadow: 0 1px 1px #333333;
}

nav ul li {
	display: inline;
}

nav ul li a, nav ul li a:visited {
	color: #565656;
	display: block;
	float: left;
	font-size: 1.25em;
	font-weight: bold;
	margin: 5px 2px;
	padding: 7px 10px 4px;
	text-shadow: 0 1px 1px white;
	text-transform: uppercase;
}

nav ul li a:hover {
	text-decoration: none;
	background-color: #f0f0f0;
}

nav, article, nav ul li a, figure {
	/* Applying CSS3 rounded corners: */
	-moz-border-radius: 10px;
	-webkit-border-radius: 10px;
	border-radius: 10px;
}

#page {
	width: 1340px;
	margin: 0 auto;
	position: relative;
}

article {
	background-image: url(images/black-and-red-wallpaper-16.jpg);
	margin: 3em 0;
	padding: 20px;
	margin-left: 0px;
}

/* Footer styling: */
footer {
	margin-top: 5px margin-bottom:30px;
	text-align: center;
	font-size: 0.825em;
}

footer p {
	margin-bottom: -2.5em;
	position: relative;
}

footer a, footer a:visited {
	color: #cccccc;
	background-color: #213e4a;
	display: block;
	padding: 2px 4px;
	z-index: 100;
	position: relative;
}

footer a:hover {
	text-decoration: none;
	background-color: #142830;
}

footer a.by {
	float: left;
}

footer a.up {
	float: right;
}

.teamList {
	display: inline-block;
	padding: 2%;
	background-color: #142830;
	margin: 0%;
}

.article2 {
	padding: 0%;
	margin-left: 3%;
}
</style>



<body background="images/wal.jpg">
	<section id="page">
		<header>
			<img src="images/iplLogo.jpg" alt="logo" width="450px" height="150" />
			<nav class="clear">
				<ul>
					<li><a href="index.jsp">Home</a></li>
					<li><a href="about">About</a></li>
					<li><a href="contact">Contact</a></li>
					<li><a href="signout">Logout</a></li>

				</ul>
			</nav>
		</header>


		<div class="line"></div>
		<article id="article1">
			<div class="line"></div>

			<div class="article2">

				<h3 align="center">
					<marquee behavior="scroll" direction="left">
						<font color="white">IPL 2017 Player List</font>
					</marquee>
				</h3>
				<c:forEach var="player" items="${playerInfo}">
					<div class="teamList">
						<div>
							<h1>
								<font color="white">${player.name}</font>
							</h1>

						<a href="<c:url value="playerDetails"/>?playerName=${player.name}" >
						
						<img src="${player.displayPicture}" width="250px" height="250px" />
						
								
						</a>
						<div id="showCount"></div>
						  <div align="center" id="result"></div>
<!-- <p>
            <button onclick="clickCounter();"><span style="font-size:35px;" font face="Face">View Counter </span>
            </button>
        </p> -->
      
						</div>
					</div>
				</c:forEach>
			</div>
			
  </article>
  </section>
	</body>
<footer>
	<div class="line"></div>

	<p>
		<font color="white">&copy; Vivo IPL 2017 Schedule. All Rights
			Reserved.</font>
	</p>
	<!-- Change the copyright notice -->
	<a href="#" class="up"><input type="button" value="Go Up"></a>
</footer>



</html>

