<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Dept ID</th>
<th>Dept name</th>
<th>Dept loc</th>
</tr>

<c:forEach items="${dept}" var="dept">
<tr><td>${dept.deptNo}</td>
<td>${dept.deptNm}</td>
<td>${dept.deptLoc}</td>
</tr>
</c:forEach>

</table>

</body>
</html>