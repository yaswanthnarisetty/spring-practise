<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title> Customer confirmed</title>
</head>

<body>

The customer is confirmed : ${customer.firstName} ${customer.lastName}
<br><br>

Free passes : ${customer.freePasses}

<br><br>


postal code : ${customer.postalCode}
</body>
</html>