<%-- 
    Document   : responseRegister
    Created on : Aug 26, 2013, 1:14:06 AM
    Author     : user
--%>

<%@page import="javax.swing.JPanel"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register handler</title>
    </head>
    <body>
        <%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
 
 <%
     Statement stmnt;
     String sql;
   String[] paramValues=new String[100];  
       paramValues[0] = request.getParameter("idnum");
       paramValues[1] = request.getParameter("fname");
       paramValues[2] = request.getParameter("sname");
       paramValues[3] = request.getParameter("password");
       paramValues[4] = request.getParameter("email");
       paramValues[5] = request.getParameter("username");
       paramValues[6] = request.getParameter("question");
       paramValues[7] = request.getParameter("answer");
       
      String fullname = paramValues[1]+ " "+paramValues[2];
               java.util.Date date = new java.util.Date();
               long ApId = date.getTime();
         try
         {
            Class.forName ("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JOBMATCH","root","admin");
            stmnt = con.createStatement();
            sql = "insert into login values('"+ApId+"',"+paramValues[0]+",'"+paramValues[5]+"','"+paramValues[4]+"','"+paramValues[3]+"','"+paramValues[6]+"','"+paramValues[7]+"');";
            stmnt.executeUpdate(sql);
            stmnt.executeUpdate("insert into userprofile(ApId,IDNUMBER,FULLNAME) values('"+ApId+"',"+paramValues[0]+",'"+fullname+"');");
            out.println("successfully registered...");
            stmnt.close();
             String site = new String("more_about_you.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
         }
             catch (Exception c)
            {
               out.println("Unable to execute query!\n"+c.getMessage()+"");               
            }
%>

    </body>
</html>
