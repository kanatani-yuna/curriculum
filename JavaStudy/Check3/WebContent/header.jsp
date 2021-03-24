<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header</title>
</head>
<body>
	<header>
	<div class="content">

		<div class="title">login</div>

		<div class="date">
			<%
			Date date = new Date();
			Calendar cl =Calendar.getInstance();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

			String formatDate = sdf.format(date);
			out.print(sdf.format(cl.getTime()));
			%>
		</div>

	</div>
	</header>

</body>
</html>