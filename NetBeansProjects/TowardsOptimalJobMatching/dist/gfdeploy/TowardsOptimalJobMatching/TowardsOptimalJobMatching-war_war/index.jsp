    <%-- 
    Document   : index
    Created on : Aug 17, 2013, 9:55:54 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Towards Optimal Job Matching and Profiling</title>
    </head>
    <body>
        <h1>Towards Optimal Job Matching and Profiling</h1>
        <%
   // New location to be redirected
   String site = new String("login.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
%>
        <form action="response.jsp" method="POST">
            <p> Enter your name <input type="text" name="Name" value="" /></p>
            <P> Enter your password <input type="password" name="password" value="" /></p>
            <p> <input type="submit" value="OK" name="submit" /></p>
        </form>
    </body>
</html>
