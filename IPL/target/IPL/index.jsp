<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

	<title>IPLT20.com</title>
	<link rel="icon" href="images/icon.jpg" />
	<link rel="stylesheet" type="text/css" href="styles.css" />

<style type="text/css">
header,footer,
article,section,
hgroup,nav,
figure{
	/* Giving a display value to the HTML5 rendered elements: */
	display:block;
}

article .line{
	/* The dividing line inside of the article is darker: */
	background-color:#15242a;
	border-bottom-color:#204656;
	margin:1.3em 0;
}

footer .line{
	margin:20em 0;
}

nav{
	background:url(img/gradient_light.jpg) repeat-x 50% 50% #f8f8f8;
	padding:0 5px;
	position:absolute;
	right:0;
	top:4em;

	border:1px solid #FCFCFC;

	-moz-box-shadow:0 1px 1px #333333;
	-webkit-box-shadow:0 1px 1px #333333;
	box-shadow:0 1px 1px #333333;
}

nav ul li{
	display:inline;
}

nav ul li a,
nav ul li a:visited{
	color:#565656;
	display:block;
	float:left;
	font-size:1.25em;
	font-weight:bold;
	margin:5px 2px;
	padding:7px 10px 4px;
	text-shadow:0 1px 1px white;
	text-transform:uppercase;
}

nav ul li a:hover{
	text-decoration:none;
	background-color:#f0f0f0;
}

nav, article, nav ul li a,figure{
	/* Applying CSS3 rounded corners: */
	-moz-border-radius:10px;
	-webkit-border-radius:10px;
	border-radius:10px;
}
#page{
	width:1340px;
	margin:0 auto;
	position:relative;
}

article{
	background-color:#213E4A;
	margin:3em 0;
	padding:20px;

	text-shadow:0 2px 0 black;
}

figure{
	border:3px solid #142830;
	float:right;
	height:300px;
	margin-left:15px;
	overflow:hidden;
	width:500px;
}

figure:hover{
	-moz-box-shadow:0 0 2px #4D7788;
	-webkit-box-shadow:0 0 2px #4D7788;
	box-shadow:0 0 2px #4D7788;
}

figure img{
	margin-left:-60px;
}

/* Footer styling: */

footer{
	margin-bottom:30px;
	text-align:center;
	font-size:0.825em;
}

footer p{
	margin-bottom:-2.5em;
	position:relative;
}

footer a,footer a:visited{
	color:#cccccc;
	background-color:#213e4a;
	display:block;
	padding:2px 4px;
	z-index:100;
	position:relative;
}

footer a:hover{
	text-decoration:none;
	background-color:#142830;
}

footer a.by{
	float:left;

}

footer a.up{
	float:right;
}
body
{
background-color: #F3FAB6;
}


</style>
</head>

<body background="images/Melbourne-Cricket-Ground-01.jpg">

	<section id="page"> <!-- Defining the #page section with the section tag -->

	<header> <!-- Defining the header section of the page with the appropriate tag -->

	<a href="index.jsp"><img src="images/iplLogo.jpg"  alt="logo" width="400px" height="150" /></a>
		

		<nav class="clear"> <!-- The nav link semantically marks your main site navigation -->

			<ul>

				<li><a href="index.jsp">Home</a></li> 
				<li><a href="about">About</a> </li>
				<li><a href="signin">Sign In</a></li>
				<li><a href="contact">Contact</a> </li>
				<li><a href="signup">Sign Up</a></li>

			</ul>

		</nav>

	</header>
	
	<div class="line"></div>  <!-- Dividing line -->

	<article id="article1"> <!-- The new article tag. The id is supplied so it can be scrolled into view. -->

		<h2>IPL Season 2017</h2>

		<div class="line"></div>

		<div class="articleBody clear">

			<figure> <!-- The figure tag marks data (usually an image) that is part of the article -->

				<a href="http://tutorialzine.com/2010/02/photo-shoot-css-jquery/">
					<img src="images/iplimage.jpg" width="750" height="500" alt="img not found"/></a>

			</figure>

			<p><font color="white">The 2017 season of the Indian Premier League, also known as IPL 10
			will be the tenth season of the IPL, a professional Twenty20 cricket
			league established by the Board of Control for Cricket in India (BCCI)
			in 2007. The tournament will feature the eight teams that played in the
			previous season. The 2017 season is scheduled to start on 5 April 2017 
			and finish on 21 May 2017, with Hyderabad hosting the opening match and
			the final</font></p>

			

		</div>

	</article>
	<footer> 

			<div class="line"></div>

			<p>&copy; Vivo IPL 2017 Schedule. All Rights Reserved.</p> <!-- Change the copyright notice -->
			<a href="#" class="up"><input type= "button" value="Go Up"></a>
			

		</footer>

	</section> <!-- Closing the #page section -->

	<!-- JavaScript Includes -->

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js"></script>
	<script src="jquery.scrollTo-1.4.2/jquery.scrollTo-min.js"></script>
	<script src="script.js"></script>

	</body>

</html>