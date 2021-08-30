<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Confirmation Page</title>
</head>
<body>

The student is confirmed!
<br>
Welcome to class ${student.firstName} ${student.lastName}
<br>
We are happy to have a new student from ${student.state}
<br>
We have many students who enjoy coding in ${student.favoriteLanguage }

Your personal list of operating systems: 
<ul>

<c:forEach var="system" items="${student.operatingSystems}">
<li>${system}</li>
</c:forEach>

</ul>
</body>

</html>