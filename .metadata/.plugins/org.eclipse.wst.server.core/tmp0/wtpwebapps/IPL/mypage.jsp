<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>jQuery Orbitlist Plugin Example</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="http://www.jqueryscript.net/css/jquerysctipttop.css" rel="stylesheet" type="text/css">
        <script src="http://code.jquery.com/jquery-1.12.1.min.js"></script>
        
        <spring:url value="/CSS/style.css" var="styleCss" />
	<spring:url value="/CSS/orbitlist.css" var="orbitCss" />
	<spring:url value="/CSS/orbitlist.js" var="orbitJs" />

	<link href="${styleCss}" rel="stylesheet" />
	<link href="${orbitCss}" rel="stylesheet" />
   
    <script src="${orbitJs}"></script>
    </head>
    <body>
    <div id="jquery-script-menu">
<div class="jquery-script-center">
<ul>
<li><a href="http://www.jqueryscript.net/menu/Multilevel-Orbital-Navigation-Plugin-With-jQuery-Orbitlist.html">Download This Plugin</a></li>
<li><a href="http://www.jqueryscript.net/">Back To jQueryScript.Net</a></li>
</ul>
<div class="jquery-script-ads"><script type="text/javascript"><!--
google_ad_client = "ca-pub-2783044520727903";
/* jQuery_demo */
google_ad_slot = "2780937993";
google_ad_width = 728;
google_ad_height = 90;
//-->
</script>
<script type="text/javascript"
src="http://pagead2.googlesyndication.com/pagead/show_ads.js">
</script></div>
<div class="jquery-script-clear"></div>
</div>
</div>
    <h1 style="margin:150px auto 30px auto;">jQuery Orbitlist Plugin Example</h1>
        <div class="container">
        
            <ul class="orbit">
            <c:forEach var="team" items="${teamInfo}">
                <li><a href="<c:url value="teamDetails"/>?teamName=${team.name}"></a></li>
                </c:forEach>
            
                <li>Item 3</li>
                <li>Item 4
                    <ul>
                        <li>4.1</li>
                        <li>4.2
                            <ul>
                                <li>4.2.1</li>
                                <li>4.2.2</li>
                                <li>4.2.3</li>
                                <li>4.2.4</li>
                            </ul>
                        </li>
                        <li>4.3
                            <ul>
                                <li>4.3.1</li>
                                <li>4.3.2</li>
                                <li>4.3.3</li>
                                <li>4.3.4</li>
                                <li>4.3.5</li>
                                <li>4.3.6</li>
                                <li>4.3.7</li>
                                <li>4.3.8</li>
                                <li>4.3.9</li>
                                <li>4.3.10</li>
                                <li>4.3.11</li>
                                <li>4.3.12</li>
                                <li>4.3.13</li>
                                <li>4.3.14</li>
                                <li>4.3.15</li>
                               
                            </ul>
                        </li>
                        <li>4.4</li>
                        <li>4.5</li>
                    </ul>
                </li>
                <li>Item 5</li>
                <li>Item 6</li>
                <li>Item 7
                    <ul>
                        <li>Item 7.1</li>
                        <li>Item 7.2</li>
                    </ul>
                </li>
                <li>Item 8</li>
                <li>Item 9</li>
            </ul>
        </div>
    </body>
    <script type="text/javascript">

  
  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>
</html>