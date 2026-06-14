<%@ page import="java.util.List" %>
<html>
<body>

<h2>Hello World hey bhupal</h2>

<%
    String name = (String) request.getAttribute("name");
    Integer id = (Integer) request.getAttribute("id");
    List<String> f = (List<String>) request.getAttribute("f");
%>

<h2>NAME IS <%=name%></h2>
<h2>Id is <%=id%></h2>

<% for (String s : f) { %>
    <h1><%=s%></h1>
<% } %>

</body>
</html>