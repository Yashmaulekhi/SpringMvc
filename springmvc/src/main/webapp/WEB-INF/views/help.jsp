<%@ page import="java.time.LocalDateTime" %>
<%@ page isELIgnored="false" %>
<html>
    <body>
        may you help me

        <%
            String name = (String) request.getAttribute("name");
            LocalDateTime time = (LocalDateTime) request.getAttribute("time");
        %>
		

        <h1>hello my name is
       <%-- <%= name %>--%>  
       ${name}
         </h1>
        <h1>date and time is <%= time %></h1>

    </body>
</html>