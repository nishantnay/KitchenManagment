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
<table>
<tr><th>Item Name</th></tr>
<%  
ArrayList<MasterItems> items= new ArrayList<MasterItems>(); 

items=(ArrayList<MasterItems>)request.getAttribute("itemlist");

for(MasterItems item:items){
	
	out.println("<tr><td>"+item.getItemName()+"</td></tr>");  
}

%>
</table> 
</body>
</html>