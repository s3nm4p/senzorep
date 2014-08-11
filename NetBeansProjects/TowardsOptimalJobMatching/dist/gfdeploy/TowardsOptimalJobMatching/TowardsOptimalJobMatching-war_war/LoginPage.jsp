<%-- 
    Document   : LoginPage
    Created on : Oct 8, 2013, 10:42:44 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:h="http://java.sun.com/jsf/html" xmlns:f="http://java.sun.com/jsf/core">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login/Register</title>
    </head>
    <body>
        <h1>Login/Register</h1>
    </body>
    <form action="responseRegister.jsp" method="POST">
        <f:view>
            <h:form>
                <input type="text" name="Username" value="" />
                <input type="password" name="Password" value="" />
                <input type="submit" value="Login" name="loginBtn" />
            </h:form>
        </f:view>

    </form>
</html>
