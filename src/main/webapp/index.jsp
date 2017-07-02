<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Master Item List</title>
</head>
<body>

<h2 align=center>Welcome to the home management application. Please enter the list of items here: </h2>

<form action="AddMasterItem" method="post">

<table align =center>
<tr>
<td>Item Name: </td><td> <input type="text" name ="itemname"> </td></tr>
<tr><td></td><td> <input type="submit" value="Add" >  </td></tr>

</table>

</form>

<!-- <h3>style="color:red"><%=(request.getAttribute("msg") == null) ? "": request.getAttribute("msg")%></h3> -->

</body>
</html>