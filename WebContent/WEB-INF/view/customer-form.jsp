<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Customer Registration Form</title>
	<style>
	.error{color:red}
	</style>
</head>

<body>

<h2> New Customers</h2><br>
Please fill out this form. * means required information.
<br>
	<form:form action="processForm" modelAttribute="customer">
	<!--  path is same as the property/attribute in Customer class -->
		First name: <form:input path="firstName" />
		<br><br>
		
		Last name*: <form:input path="lastName" />
		
		<form:errors path="lastName" cssClass="error" />
		<br><br>
		
		How many free passes would you like? (10 max)
		<br>
		Number of passes: <form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		
		Zip code to send passes: <form:input path="zipCode" />
		<form:errors path="zipCode" cssClass="error" />
		<br>
		
		<input type="submit" value="Submit" />
	</form:form>
	
</body>

</html>