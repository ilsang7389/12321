<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ICT Main</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
</head>
<body>
	<nav>
	<a href="<%-- <%= application.getContextPath()%>/ --%>main">main page</a>
		<a href="<%= application.getContextPath()%>/memForm">member</a>
		<a href="">paramTest</a>
		<a href="">DBTest</a>
	</nav>
</body>
</html>