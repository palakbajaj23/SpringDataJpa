<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/saveEmployee" method="post" modelAttribute="employee">
<form:label path="employeeName">Employee Name</form:label>
<form:input path="employeeName"/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>