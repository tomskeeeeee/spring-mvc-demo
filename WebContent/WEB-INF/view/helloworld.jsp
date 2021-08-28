<!DOCTYPE html>
<html>
<head>
	<title>Hello World Input Form</title>
</head>
<body>
	<h1>Hello World of Spring!</h1>
	<br><br>
	<img src="${pageContext.request.contextPath}/resources/images/sunset2.jpg" height=100px>
	<!-- read name of HTML form field is: studentName -->
	<h2>Hello ${param.studentName}</h2>

	<br><br>
	<!--  access the attribute named message from the model-->
	The message: ${message}
</body>

</html>