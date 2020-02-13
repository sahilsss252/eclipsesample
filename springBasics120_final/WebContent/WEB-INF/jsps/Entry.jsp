<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createDept.do">
		<table border=5px align="center" bordercolapse=0px>
			<tr>
			<td>Department No</td>
			<td><input type="text" value="" name="deptNo"></td>
			</tr>
			<tr>
			<td>Department Name</td>
			<td><input type="text" value="" name="dName"></td>
			</tr>
			<tr>
			<td>Location</td>
			<td><input type="text" value="" name="dLoc"></td>
			</tr>
			<tr><td colspan=2 align="center"><input type="submit" value="Add"></td></tr>

		</table>
	</form>
	<h3 style="color:red" align="center">${msg}</h3> 
</body>
</html>