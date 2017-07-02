<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.kharcha.itemsBean.MasterItems"%>
    <%@page import="java.util.List"%>
    <%@page import="java.util.ArrayList"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item View</title>
</head>
<body>

<h2 align=center>Welcome to the home management application.</h2><br>

<%=request.getAttribute("item")%> is added to the master item list.

<p>Now we have following items in our database:<a href=ShowData>Get Data</a>

</body>
</html>