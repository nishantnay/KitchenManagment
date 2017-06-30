<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Master Item List</title>
</head>
<body>

<h2 span=center>Welcome to the home management application. Please enter the list of items here: </h2>

<form action="AddMasterItem" method="post">

<table>
<tr>
<td>Item Name: </td><td> <input type="text" name ="itemname"> </td><br>
<td></td><td> <input type="submit" value="Add" >  </td>

</tr>


</table>

</form>

<h3><span style="color:red"><%=(request.getAttribute("msg") == null) ? "": request.getAttribute("msg")%></span></h3>

</body>
</html>