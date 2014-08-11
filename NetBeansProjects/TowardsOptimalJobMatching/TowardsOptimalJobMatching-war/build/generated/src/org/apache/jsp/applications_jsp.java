package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.table.DefaultTableModel;
import jobamatching.DBClass;

public final class applications_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<!--\n");
      out.write("Design by Free CSS Templates\n");
      out.write("http://www.freecsstemplates.org\n");
      out.write("Released for free under a Creative Commons Attribution 2.5 License\n");
      out.write("\n");
      out.write("Name       : Job Recommender\n");
      out.write("Description: A three-column, fixed-width blog design.\n");
      out.write("Version    : 1.0\n");
      out.write("Released   : 20090303\n");
      out.write("\n");
      out.write("-->\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Job Recommender</title>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"Job Recommender\" content=\"\" />\n");
      out.write("<link href=\"default.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- start header -->\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<h1><a href=\"#\"><span>Job</span>Recommender</a></h1>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"menu\">\n");
      out.write("\t\t<ul id=\"main\">\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"#\">Homepage</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">My Profile</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">My Applications</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Search Jobs</a></li>\n");
      out.write("\t\t\t<li><a href=\"Recommendations.jsp\">Recommend Jobs</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<ul id=\"feed\">\n");
      out.write("\t\t\t<li><a href=\"#\">About Us</a></li>\n");
      out.write("\t\t\t<li><a href=\"#\">Contact Us</a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("<!-- end header -->\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<!-- start page -->\n");
      out.write("\t<div id=\"page\">\n");
      out.write("\t\t<div id=\"sidebar1\" class=\"sidebar\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Recent Posts</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Recent Comments</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Free CSS Templates</a> on <a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Categories</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Archives</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">September</a> (23)</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">August</a> (31)</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">July</a> (31)</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">June</a> (30)</li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">May</a> (31)</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- start content -->\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<div class=\"flower\"><img src=\"images/img06.jpg\" alt=\"\" width=\"510\" height=\"250\" /></div>\n");
      out.write("\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t<h1 class=\"title\"><a href=\"#\">Welcome to Job Recommender!</a></h1>\n");
      out.write("\t\t\t\t<p class=\"byline\"> </p>\n");
      out.write("\t\t\t\t<div class=\"entry\">\n");
      out.write("                                    ");
 
    String ref = session.getAttribute("ref").toString();
    String apid = session.getAttribute("appid").toString();
 
    DBClass db = new DBClass();
    boolean foundu=false;
    
    DefaultTableModel tbmodel = db.query("select apid from applications where jobref='"+ref+"'");
    if(tbmodel!=null)
    for(int i=0;i<tbmodel.getRowCount();i++)
        if(tbmodel.getValueAt(i, 0).equals(apid))
            foundu=true;
    
    if(foundu==true)
        out.println("you have already applied for this job!");
    else{
       int id= (int)(Math.random()*10000);
        String sql = "insert into applications values('"+id+"','"+ref+"','"+apid+"')";
        db.update(sql);
         
      out.write("<strong>");
 out.println("sucessfully applied for job"+ref); 
      out.write("</strong>\n");
      out.write("         ");

        }
        
    
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"post\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<p class=\"byline\"></p>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end content -->\n");
      out.write("\t\t<!-- start sidebars -->\n");
      out.write("\t\t<div id=\"sidebar2\" class=\"sidebar\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<form id=\"searchform\" method=\"get\" action=\"#\">\n");
      out.write("\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t<h2>Site Search</h2>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"s\" id=\"s\" size=\"15\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Tags</h2>\n");
      out.write("\t\t\t\t\t<p class=\"tag\"><a href=\"#\">dolor</a> <a href=\"#\">ipsum</a> <a href=\"#\">lorem</a> <a href=\"#\">sit amet</a> <a href=\"#\">dolor</a> <a href=\"#\">ipsum</a> <a href=\"#\">lorem</a> <a href=\"#\">sit amet</a></p></li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Calendar</h2>\n");
      out.write("\t\t\t\t\t<div id=\"calendar_wrap\">\n");
      out.write("\t\t\t\t\t\t<table summary=\"Calendar\">\n");
      out.write("\t\t\t\t\t\t\t<caption>\n");
      out.write("\t\t\t\t\t\t\tOctober 2009\n");
      out.write("\t\t\t\t\t\t\t</caption>\n");
      out.write("\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Monday\" scope=\"col\" title=\"Monday\">M</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Tuesday\" scope=\"col\" title=\"Tuesday\">T</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Wednesday\" scope=\"col\" title=\"Wednesday\">W</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Thursday\" scope=\"col\" title=\"Thursday\">T</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Friday\" scope=\"col\" title=\"Friday\">F</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Saturday\" scope=\"col\" title=\"Saturday\">S</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t<th abbr=\"Sunday\" scope=\"col\" title=\"Sunday\">S</th>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td abbr=\"September\" colspan=\"3\" id=\"prev\"><a href=\"#\" title=\"View posts for September 2009\">&laquo; Sep</a></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"pad\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td colspan=\"3\" id=\"next\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tfoot>\n");
      out.write("\t\t\t\t\t\t\t<tbody>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>1</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>2</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>3</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td id=\"today\">4</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>5</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>6</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>7</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>8</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>9</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>10</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>11</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>12</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>13</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>14</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>15</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>16</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>17</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>18</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>19</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>20</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>21</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>22</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>23</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>24</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>25</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>26</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>27</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>28</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>29</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>30</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>31</td>\n");
      out.write("\t\t\t\t\t\t\t\t\t<td class=\"pad\" colspan=\"4\">&nbsp;</td>\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t<h2>Categories</h2>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Aliquam libero</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Consectetuer adipiscing elit</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Suspendisse iaculis mauris</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Urnanet non molestie semper</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Proin gravida orci porttitor</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Metus aliquam pellentesque</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end sidebars -->\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end page -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<p class=\"copyright\">&copy;&nbsp;&nbsp;2009 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a href=\"http://www.freecsstemplates.org/\">Free CSS Templates</a>.</p>\n");
      out.write("\t<p class=\"link\"><a href=\"#\">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href=\"#\">Terms of Use</a></p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
