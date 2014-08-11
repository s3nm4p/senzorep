package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jobamatching.*;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class responseRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register handler</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" ");

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
            stmnt.close();
            session.setAttribute("idnum", paramValues[0]);
            session.setAttribute("name", fullname);
             session.setAttribute("username", paramValues[5]);
             session.setAttribute("email", paramValues[4]);
             session.setAttribute("appid", ApId);             
             session.setAttribute("password", paramValues[3]);
             session.setAttribute("question", paramValues[6]);
             session.setAttribute("answ", paramValues[7]);
             
            String site = new String("CreateProfile.jsp");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
  
         }
             catch (Exception c)
            {
              sql=c.getMessage();               
            }

      out.write("\n");
      out.write("\n");
      out.write("<p> ");
 out.print(sql); 
      out.write("</p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
