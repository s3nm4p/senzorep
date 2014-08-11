<%-- 
    Document   : userRegistration
    Created on : Oct 29, 2013, 5:16:14 AM
    Author     : user
--%>

<%@page import="java.util.Date"%>
<%@page import="jobamatching.DBClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile registration</title>
    </head>
    <body>
       
        <% 
            String[] paramValues=new String[100];  
       paramValues[0] = request.getParameter("idnum");
       paramValues[1] = request.getParameter("fname");
       paramValues[2] = request.getParameter("sname");
       paramValues[3] = request.getParameter("password");
       paramValues[4] = request.getParameter("email");
       paramValues[5] = request.getParameter("username");
       paramValues[6] = request.getParameter("question");
       paramValues[7] = request.getParameter("answer");
       String appid="213"+String.valueOf(new Date().getTime()).substring(8);
       String fullname = paramValues[1]+ " "+paramValues[2];
            session.setAttribute("idnum", paramValues[0]);
            session.setAttribute("name", fullname);
             session.setAttribute("username", paramValues[5]);
             session.setAttribute("email", paramValues[4]);
             session.setAttribute("appid", appid);             
             session.setAttribute("password", paramValues[3]);
             session.setAttribute("question", paramValues[6]);
             session.setAttribute("answ", paramValues[7]);
       
       
            String sql = "insert into login values('"+appid+"',"+paramValues[0]+",'"+paramValues[5]+"','"+paramValues[4]+"','"+paramValues[3]+"','"+paramValues[6]+"','"+paramValues[7]+"');";            
            DBClass db = new DBClass();
            db.update(sql);
            sql="insert into userprofile(apid,idnumber,fullname,username,hashkey,email) values('"+appid+"','"+paramValues[0]+"','"+fullname+"','"
                    +paramValues[5]+"','"+paramValues[3]+"','"+paramValues[4]+"');";
            db.update(sql);
            
             String site = new String("CreateProfile.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
        %>
    </body>
</html>
