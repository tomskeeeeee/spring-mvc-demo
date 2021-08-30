<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	<!--  path is same as properties in Student class -->
		First name: <form:input path="firstName" />
		<br><br>
		
		Last name: <form:input path="lastName" />
		<br><br>
		
		
		<br><br>
		State:
		<form:select path="state">
		<form:options items="${student.stateOptions }" />
		</form:select>
		<br><br>
		
		Favorite Programming Language:
		<br>
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  /> <br>
		
		<input type="submit" value="Submit" />
		
		Choose all Operating Systems you use:
		<br>
		<form:checkbox path="operatingSystems" value="OS" /> Mac OS
		<form:checkbox path="operatingSystems" value="PC" /> Microsoft Windows
		<form:checkbox path="operatingSystems" value="Linux" /> Linux
		
	</form:form>
	
</body>

</html>