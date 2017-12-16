<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>

	<title>Student Confirmation</title>

</head>
<body>

The Student is confirmed: ${student.firstName}  ${student.lastName},
  <br><br>
  He is from ${student.country}.
  <br>
  His favorite programming language is ${student.favoriteLanguage}
  
  <br>
  
  He has System experience:
  
  <ul>
  	<c:forEach var="temp" items="${student.operateSystems}">
  	
  		<li> ${temp} </li>
  
  	</c:forEach>	
  </ul>
  	

</body>

</html>