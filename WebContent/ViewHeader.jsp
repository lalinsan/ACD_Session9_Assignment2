<!-- JSP Page that calls the View Header Page -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Headers</title>
</head>
<body>

<h1 align="center">HTTP Header Request Example</h1>

<form action="ViewHeaders" method="GET"> <!-- Shows button and calls View Header Servel -->
<input type="submit" name="ViewHeaders" value="View Headers"/> <!-- Calls View Headers Servlet -->
</form>

</body>
</html>