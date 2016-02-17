
<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.util.Map.Entry, java.util.HashMap"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Solucion</title>
</head>
<body>
<h1>Solucion</h1>
<%
    HashMap<String, Integer>bebidas=(HashMap<String, Integer>)(request.getAttribute("bebidas"));
    for(Entry<String, Integer> bebida: bebidas.entrySet()){
%>

<%=bebida.getKey()%> : <%=bebida.getValue()%> <br> <% } %>

</body>
</html>





