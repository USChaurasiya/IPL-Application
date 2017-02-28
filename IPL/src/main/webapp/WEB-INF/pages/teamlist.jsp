<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
tr{
float:left;
padding-left:75px; 
}
</style>

<jsp:include page="afterLogin.jsp"></jsp:include>
<marquee behavior="scroll" direction="left"><h1>IPL 2017 TEAM LIST</h1></marquee>

<table>

	<c:forEach var="team" items="${teamInfo}">
		<tr>
			<td><a href="<c:url value="teamDetails"/>?teamName=${team.name}"><img src="${team.logo}" width="280px" height="280px"/></a></td>
				
				</tr>
	</c:forEach>
</table>
