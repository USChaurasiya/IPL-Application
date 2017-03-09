<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<spring:url value="/CSS/jquery-1.12.4.min.js" var="orbitJs" />
 <script src="${orbitJs}"></script>
<script type="text/javascript">
$(function () { function moveItems(origin, dest) {
    $(origin).find(':selected').appendTo(dest);
}
 
function moveAllItems(origin, dest) {
    $(origin).children().appendTo(dest);
}
 
$('#left').click(function () {
    moveItems('#sbTwo', '#sbOne');
});
 
$('#right').on('click', function () {
    moveItems('#sbOne', '#sbTwo');
});
 
$('#leftall').on('click', function () {
    moveAllItems('#sbTwo', '#sbOne');
});
 
$('#rightall').on('click', function () {
    moveAllItems('#sbOne', '#sbTwo');
});
});


$(document).ready(function(){  
    $("option").mouseover(function(){  
        $("option").css("background-color", "lightgreen");  
    });  
    $("option").mouseout(function(){  
        $("option").css("background-color", "orange");  
      });  
});  
</script>
<style type="text/css">
.box{
display: inline-block;
margin-left:5%;

}
.box1{
display: inline-block;
margin-left:3%;
}
.box2{
display: inline-block;
margin-left:3%;
margin-top: 5%;
}
option {
	font-size:14px;
	font-style: inherit;
	}
	li.nostyle {
    list-style-type: none;
}
.mainDiv{

border-color: maroon;
}
</style>
</head>
<body>
<div class="mainDiv"> 


<h2>Create Your Own Dream Team By Selecting Player</h2>
<div class="box">
   <select id="sbOne" multiple="multiple" size="35px">
     <optgroup label="Player List">
   <c:forEach var="player" items="${dreamPlayerInfo}">
 <option> ${player.name}</option>
   
  <%--   <option>${player.role}</option> --%>
    </c:forEach>
    </optgroup>
    </select>
  
    </div>
    <div class="box2">
    
    <input type="button" id="left" value="<"/><br>
    <input type="button" id="right" value=">"/><br>
    <input type="button" id="leftall" value="<<"/><br>
   <input type="button" id="rightall" value=">>"/><br>
    
    </div>
    <div class="box1">
		<form:form action="dreamPlayer" method="Post">
		<!-- Enter Your Dream Team Name:<input type="text" name="dreamTeamName"> -->
   		 <select id="sbTwo" name="myPlayer" multiple="multiple" size="35px">
     	 	<optgroup label="Selected Dream Player List">
      	 	</optgroup>
  	     </select>
   		 <input type="submit" value="Confirm">
		</form:form>
	</div>
 </div>
 <div>
 
 <c:forEach var="dPlayer" items="dreamp">
 
 ${dplayer.displayPicture}
 </c:forEach>
 
 </div>
 
</body>

</html>