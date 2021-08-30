<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>New Customer Confirmation Page</title>
</head>
<body>

Your sign up was successful!
<br>
Welcome to our community ${customer.firstName} ${customer.lastName}!
<br>
Your order for ${customer.freePasses } free passes has been recorded.
<br>
Your order will be sent to zip code: ${customer.zipCode }.
</body>

</html>