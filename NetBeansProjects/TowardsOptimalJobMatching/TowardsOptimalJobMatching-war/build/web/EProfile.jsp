<%-- 
    Document   : EProfile
    Created on : Nov 2, 2013, 7:16:30 PM
    Author     : user
--%>

<%@page import="jobamatching.DBClass"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Profile</title>
    </head>
    <body>
        <div class="entry">
            <form action="EditProfile.jsp">
                
                <% session.setAttribute("gender", request.getParameter("gender"));
                session.setAttribute("ethnicity", request.getParameter("ethicity"));
                session.setAttribute("disability", request.getParameter("disability"));
                session.setAttribute("POAddress", request.getParameter("POAddress"));
                session.setAttribute("country", request.getParameter("country"));
                session.setAttribute("hphone", request.getParameter("hphone"));
                session.setAttribute("wphone", request.getParameter("wphone"));
                session.setAttribute("mphone", request.getParameter("mphone"));
                session.setAttribute("comoption", request.getParameter("comoption"));
                session.setAttribute("province", request.getParameter("province"));
                session.setAttribute("city", request.getParameter("city"));
                session.setAttribute("region", request.getParameter("region"));
                session.setAttribute("surburb", request.getParameter("surburb"));
                session.setAttribute("zip", request.getParameter("zip")); 
                int age = 
        new Date().getYear()-(Integer.valueOf(session.getAttribute("idnum").toString().substring(0,2)));
                String location=request.getParameter("province")+"%"+request.getParameter("city")+"%"+
                        request.getParameter("region")+"%"+request.getParameter("surburb")+"%"+request.getParameter("zip");
                
                String sql = "UPDATE userprofile SET gender='"+request.getParameter("gender")+"',ethnicity='"+request.
                        getParameter("ethicity")+"',disability='"+request.getParameter("disability")+"',mobilenumber='"+request.getParameter("mphone")+"',homeNumber='"+request.
                        getParameter("hphone")+"',worknumber='"+request.getParameter("wphone")+"',"
                        + "communicationoption='"+request.getParameter("comoption")+"',location='"+location+"',poaddress='"+request.getParameter("POAddress")+"',age='"+age+"' WHERE apid='"+session.getAttribute("appid")+"'";
                DBClass db = new DBClass();
                db.update(sql);
                %>
 <h2><%out.println(session.getAttribute("name"));   %></h2>
 <p><% out.println(session.getAttribute("mphone")); %></p>
 <p><% out.println(session.getAttribute("email")); %> </p>
<p>
<a href="">Change email address</a>
</p> 
<h3>Personal Details</h3>

<a href="/resume/personaldetails?branded=1&amp;external_view=False#">
Edit
</a>
  <table>
    <tr>
        <td>Name:</td>
        <td><%out.println(session.getAttribute("name"));   %></td>
    </tr>
    <tr>
        <td>Mobile Number:</td>
        <td> <%out.println(session.getAttribute("mphone"));   %></td>
    </tr>
    <tr>
        <td>Home Number:</td>
        <td> <%out.println(session.getAttribute("hphone"));   %></td>
    </tr>
    <tr>
        <td>Work Number:</td>
        <td> <%out.println(session.getAttribute("wphone"));   %></td>
    </tr>
        <tr>
        <td>Email Address:</td>
        <td><% session.getAttribute("email"); %></td>
    </tr>
        <tr>
        <td>Location: </td>
        <td><% out.println(session.getAttribute("province")); %>, 
            <% out.println(session.getAttribute("city")); %>, 
            <% out.println(session.getAttribute("region"));%>,
            <% out.println(session.getAttribute("surburb")); %>,
            <% out.println(session.getAttribute("zip")); %>
        </td>
    </tr>
        <tr>
        <td>Nationality:</td>
        <td><% out.println(session.getAttribute("country")); %></td>
    </tr>
        <tr>
        <td>Age: </td>
        <td> <% 
        out.println(age);    %>
        </td>
    </tr>
        <tr>
        <td>EE/AA Status:</td>
        <td><% out.println(session.getAttribute("ethnicity")); %> <% out.println(session.getAttribute("gender")); %></td>
    </tr>
</table>
<p></p>
<h3>Preferred Job</h3>
<a href="/resume/careerobjectives/edit?branded=1&amp;external_view=False#">
Edit
</a>
<table border="1">
    <tr>
<th>Industry</th>
<th>Job Title</th>
<th>Location</th>
<th>Type</th>
<th>Level</th>
<th>Availability</th>

</tr>
    <tr>
    <div><input type="submit" value="Add" /></div>
        <td><select name="industry">
            <option>Animal Care</option>
            <option>Biotechnology</option>
            <option>Database</option>
            <option>Engineering</option>
            <option>Entertainment</option>
            <option>Finance</option>
            <option>Graphics</option>
            <option>Health</option>
            <option>Hospitality</option>
            <option>Internet</option>
            <option>IT</option>
            <option>Legal</option>
              <option>Managerial</option>
                <option>Networking</option>
                 <option>Odd</option>
                  <option>Personnel</option>
                   <option>Programming</option>
                    <option>Public Services</option>
                     <option>Sales</option>
                      <option>Secretarial</option>
                      <option>Service</option>
                      <option>Specialist</option>
                      <option>Teaching</option>
                   
        </select></td>
        <td><select name="title">   
                <option>Accountant </option> 
                <option>Health Scientist </option>
                 <option>Health Insurance Specialist </option>
                 <option>Health Educator </option>
                 <option>Health Communications Specialist </option>                 
                      <option>Internal Program Special</option>
                      <option>Intelligence Specialist </option>
                <option>Intelligence Research Specialist</option>
                <option>Intelligence Operations Specialist </option>
                <option>Intelligence Analyst </option>
                <option>Insurance Specialist</option>
                <option>Insurance Marketing Specialist</option>
                <option>Instructions Methods Specialist </option>
                <option>Instructional Systems Design Specialist </option>
                <option>Information Technology Specialist Inspector </option>
                <option>Information Technology Security Assistant </option>
                <option>Information Technology Policy Analyst</option>
                <option>Information Resource Management Specialist </option>
                <option>Information Research Specialist </option>
                <option>Information Management Specialist </option>
                <option >Hygienist</option>
                <option>Industrial Hygienist </option>
                <option>Import Policy Analyst </option>
                <option>Immigration Officer </option>
                <option>Hydraulic Engineer</option>
                <option>Human Resources Specialist</option>
                <option>Human Resources Representative</option>
                <option>Human Resources Evaluator </option>
                <option>Human Resources Development </option>
                <option>Human Resources Consultant </option>
                <option>Human Resources Advisor Consultant </option>
                <option>Housing Project Manager</option>
                <option>Housing Program Specialist</option>
                <option>Hospital Finance Associate </option>
                <option>Health Systems Specialist</option>
               
            </select></td>
        <td><input type="text" name="location" value="" /></td>
        <td><input type="text" name="type" value="" /></td>
        <td><input type="text" name="level" value="" /></td>
        <td><input type="text" name="availability" value="" /></td>
    </tr>
    
  
   
</table>
<p></p>
<h3>Skills</h3>
<div> <input type="submit" value="Add" /></div>
  
<table border="1">
    <tr>
<th>Name</th>
<th>Level</th>
<th>Duration</th>

</tr>
    <tr>
        <td><input type="text" name="skillName" value="" /></td>
        <td><input type="text" name="skilLevel" value="" /></td>
        <td><input type="text" name="skillDuration" value="" /></td>        
    </tr>
  <tr>
      <td><input type="text" name="skillName2" value="" /></td>
      <td><input type="text" name="skillLevel2" value="" /></td>
      <td><input type="text" name="skillDuration2" value="" /></td>        
    </tr>
     <tr>
      <td><input type="text" name="skillName3" value="" /></td>
      <td><input type="text" name="skillLevel3" value="" /></td>
      <td><input type="text" name="skillDuration3" value="" /></td>        
    </tr>
     <tr>
      <td><input type="text" name="skillName4" value="" /></td>
      <td><input type="text" name="skillLevel4" value="" /></td>
      <td><input type="text" name="skillDuration4" value="" /></td>        
    </tr>
     <tr>
      <td><input type="text" name="skillName5" value="" /></td>
      <td><input type="text" name="skillLevel5" value="" /></td>
      <td><input type="text" name="skillDuration5" value="" /></td>        
    </tr>
     <tr>
      <td><input type="text" name="skillName6" value="" /></td>
      <td><input type="text" name="skillLevel6" value="" /></td>
      <td><input type="text" name="skillDuration6" value="" /></td>        
    </tr>
   <tr>
      <td><input type="text" name="skillName7" value="" /></td>
      <td><input type="text" name="skillLevel7" value="" /></td>
      <td><input type="text" name="skillDuration7" value="" /></td>        
    </tr>
 
       
</table>
<p></p>
<h3>Employment</h3>

<table border="1">
    <tr>
<th>Title</th>
<th>Industry</th>
<th>Type</th>
<th>Location</th>
<th>Roles</th>
<th>Duration</th>
<th>Level</th>
<th>Total years</th>
</tr>
    <tr>
        <td><input type="text" name="expTitle" value="" /></td>
        <td><input type="text" name="expIndustry" value="" /></td>
        <td><input type="text" name="expType" value="" /></td>   
        <td><input type="text" name="expLocation" value="" /></td>
        <td><textarea name="expRoles" rows="4" cols="20">
            </textarea></td>
        <td><input type="text" name="expDuration" value="" /></td>
        <td><input type="text" name="expLevel" value="" /></td>
        <td><input type="text" name="expYears" value="" /></td>
    </tr>       
</table>
<p></p>
<div>
<h3>Education</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add</a>
|
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a>
<table border="1">
    <tr>
<th>Level</th>
<th>Qualification</th>
<th>Institution</th>
<th>Duration</th>
<th>Enrollment Type</th>
<th>Subjects</th>
<th>Average Mark</th>
</tr>
    <tr>
        <td><input type="text" name="edLevel" value="" /></td>
        <td><input type="text" name="edQual" value="" /></td>
        <td><input type="text" name="edInst" value="" /></td>   
        <td><input type="text" name="edDuration" value="" /></td>
        <td><input type="text" name="edEnroll" value="" /></td>
        <td><textarea name="subjects" rows="4" cols="20">
            </textarea></td>
        <td><input type="text" name="edAveMark" value="" size="4" />%</td>       
    </tr>       
</table></div>
<p></p>
<h3>Languages</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td><input type="text" name="language1" value="" size="10" /></td> 
        <td><input type="checkbox" name="Speak1" value="ON" />Speak</td> 
        <td><input type="checkbox" name="Read1" value="ON" />Read</td> 
        <td><input type="checkbox" name="Write1" value="ON" />Write</td> 
    </tr>
    <tr>
        <td><input type="text" name="language2" value="" size="10" /></td> 
        <td><input type="checkbox" name="Speak2" value="ON" />Speak</td> 
        <td><input type="checkbox" name="Read2" value="ON" />Read</td> 
        <td><input type="checkbox" name="Write2" value="ON" />Write</td> 
    </tr>
    <tr>
        <td><input type="text" name="language3" value="" size="10" /></td> 
        <td><input type="checkbox" name="Speak3" value="ON" />Speak</td> 
        <td><input type="checkbox" name="Read3" value="ON" />Read</td> 
        <td><input type="checkbox" name="Write3" value="ON" />Write</td> 
    </tr> 
</table>
<p></p>

<h3>Achievements</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td>Award or Achievement Title</td> 
        <td><input type="text" name="achievment" value="" size="35" /></td>         
    </tr>  
     <tr>
         <td>Institution</td> 
        <td><input type="text" name="Institution" value="" size="35"/></td> 
    </tr> 
</table>
<p></p>

<h3>Associations</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td>Association</td> 
        <td><input type="text" name="achievment" value="" size="35" /></td>         
    </tr>  
     <tr>
         <td>Institution/Organization</td> 
        <td><input type="text" name="Institution" value="" size="35"/></td> 
    </tr> 
</table>
<input type="submit" value="Update Profile" name="createProfile" />

            </form>
 </div>

    </body>
</html>
