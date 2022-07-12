<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP_page1</title>
</head>
<body>
MyPage one 1
<%
int i=10;
out.print("Sending from servlet" + i);
RequestDispatcher disp = request.getRequestDispatcher("MyPage2.jsp");
disp.include(request,response);
%>

</body>
</html>