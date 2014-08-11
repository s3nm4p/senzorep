<%@page import="javax.swing.table.DefaultTableModel"%>
<%@page import="jobamatching.DBClass"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Job Recommender
Description: A three-column, fixed-width blog design.
Version    : 1.0
Released   : 20090303

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Job Recommender</title>
<meta name="keywords" content="" />
<meta name="Job Recommender" content="" />
<link href="default.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
<!-- start header -->
<div id="header">
	<div id="logo">
		<h1><a href="#"><span>Job</span>Recommender</a></h1>
		
	</div>
	<div id="menu">
		<ul id="main">
			<li class="current_page_item"><a href="#">Homepage</a></li>
			<li><a href="#">Products</a></li>
			<li><a href="#">Services</a></li>
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
		</ul>
		<ul id="feed">
			<li><a href="#">Entries RSS</a></li>
			<li><a href="#">Comments RSS</a></li>
		</ul>
	</div>
	
</div>
<!-- end header -->
<div id="wrapper">
	<!-- start page -->
	<div id="page">
		<div id="sidebar1" class="sidebar">
			<ul>
				<li>
					<h2>Recent Posts</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
				<li>
					<h2>Recent Comments</h2>
					<ul>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Aliquam libero</a></li>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Free CSS Templates</a> on <a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
				<li>
					<h2>Categories</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
					</ul>
				</li>
				<li>
					<h2>Archives</h2>
					<ul>
						<li><a href="#">September</a> (23)</li>
						<li><a href="#">August</a> (31)</li>
						<li><a href="#">July</a> (31)</li>
						<li><a href="#">June</a> (30)</li>
						<li><a href="#">May</a> (31)</li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- start content -->
		<div id="content">
			<div class="flower"><img src="images/img06.jpg" alt="" width="510" height="250" /></div>
			<div class="post">
                            <form action="applications.jsp" method="POST">
                            
    <% 
    String ref = request.getParameter("id");
    session.setAttribute("ref", ref);
    DBClass db = new DBClass();
    DefaultTableModel tbmodel = db.query("select * from job where jobref='"+ref+"'");
    DefaultTableModel cand = db.query("select * from idealcand where jobref='"+ref+"'");
    %>
    <h1 class="title"><a href="#"> <% out.println(tbmodel.getValueAt(0, 2)); %></a></h1>				
<div class="entry">
    <table>
      <tr>
        <td><h2><% out.println(tbmodel.getValueAt(0, 1)); %></h2></td>        
    </tr>
    <tr>
        <td><h3><% out.print(request.getParameter("id")); %></h3></td>  
        
    </tr>
    
</table>
<table>
      <tr>
        <td>Date Posted:</td>
        <td><% out.println(tbmodel.getValueAt(0, 13)); %></td>
    </tr>
    <tr>
        <td>Closing Date</td>  
        <td><% out.println(tbmodel.getValueAt(0, 14)); %></td>
    </tr>
    
</table>
<h3>Job Details</h3>


<table>
      <tr>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td><strong>Location </strong></td>
        <td><% out.println(tbmodel.getValueAt(0, 10).toString().replace('%', ' ').replace(',', ' ')); %></td>
    </tr>
    <tr>
        <td><strong>Employment Type </strong></td>
        <td><% out.print(tbmodel.getValueAt(0, 4)); %></td>
    </tr>
    
        <tr>
        <td><strong>Job Level </strong></td>
        <td><% out.print(tbmodel.getValueAt(0, 3)); %></td>
    </tr>
        <tr>
        <td><strong>Remuneration Type</strong> </td>
        <td><% out.print(tbmodel.getValueAt(0, 5)); %></td>
    </tr>
        <tr>
        <td><strong>Salary Range</strong></td>
        <td>from <% out.print(tbmodel.getValueAt(0, 7)); %> to <% out.println(tbmodel.getValueAt(0, 8)); %></td>
    </tr>
        <tr>
        <td><strong>Benefits </strong> </td>
        <td><% out.println(tbmodel.getValueAt(0, 6).toString().replace('~', '\n')); %></td>
    </tr>
      
    <tr>
        <tr>
           <td><strong>Minimum Requirements </strong></td>         
        </tr>
        <tr>
            <td>Disability</td>
            <td><% out.print(cand.getValueAt(0, 2).toString().replace('~', ' ')); %></td>
        </tr>        
        
         
        <tr>   
             <td>Achievements</td>
        <td><% out.print(cand.getValueAt(0, 3).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Personality</td>
        <td><% out.print(cand.getValueAt(0, 4).toString().replace('~', ',')); %></td>
        
        </tr><tr>   
             <td>Education</td>
        <td><% out.print(cand.getValueAt(0, 5).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Experience</td>
        <td><% out.print(cand.getValueAt(0, 6).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Skills</td>
        <td><% out.print(cand.getValueAt(0, 7).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Associations</td>
        <td><% out.print(cand.getValueAt(0, 8).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Age Range</td>
        <td><% out.print(cand.getValueAt(0, 9).toString().replace('~', ' ')); %></td>
        
        </tr>
         <tr>   
             <td>Gender</td>
        <td><% out.print(cand.getValueAt(0, 12).toString().replace('~', ' ')); %></td>
        
        </tr>
        <tr>   
             <td>Nationality</td>
        <td><% out.print(cand.getValueAt(0, 10).toString().replace('~', ' ')); %></td>
        
        </tr>
         <tr>   
             <td>Ethnicity</td>
        <td><% out.print(cand.getValueAt(0, 13).toString().replace('~', ' ')); %></td>
        
        </tr>
         <tr>   
             <td>Languages</td>
        <td><% out.print(cand.getValueAt(0, 11).toString().replace('~', ' ')); %></td>
        
        </tr>
    </tr>
         
      <tr>
        <td><strong>Key Roles/Responsibilities </strong></td>
        <td><% out.print(tbmodel.getValueAt(0, 12).toString().replace('~', ' ')); %></td>
    </tr>
</table>
<p><span style="padding: 0 200px">&nbsp;</span><input name="register" type="submit" value="Apply" /></p>

</form>
                           </div>
			</div>
		
			<div class="post">
				
				<p class="byline"></p>
				
			</div>
		</div>
		<!-- end content -->
		<!-- start sidebars -->
		<div id="sidebar2" class="sidebar">
			<ul>
				<li>
					<form id="searchform" method="get" action="#">
						<div>
							<h2>Site Search</h2>
							<input type="text" name="s" id="s" size="15" value="" />
						</div>
					</form>
				</li>
				<li>
					<h2>Tags</h2>
					<p class="tag"><a href="#">dolor</a> <a href="#">ipsum</a> <a href="#">lorem</a> <a href="#">sit amet</a> <a href="#">dolor</a> <a href="#">ipsum</a> <a href="#">lorem</a> <a href="#">sit amet</a></p></li>
				<li>
					<h2>Calendar</h2>
					<div id="calendar_wrap">
						<table summary="Calendar">
							<caption>
							October 2009
							</caption>
							<thead>
								<tr>
									<th abbr="Monday" scope="col" title="Monday">M</th>
									<th abbr="Tuesday" scope="col" title="Tuesday">T</th>
									<th abbr="Wednesday" scope="col" title="Wednesday">W</th>
									<th abbr="Thursday" scope="col" title="Thursday">T</th>
									<th abbr="Friday" scope="col" title="Friday">F</th>
									<th abbr="Saturday" scope="col" title="Saturday">S</th>
									<th abbr="Sunday" scope="col" title="Sunday">S</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<td abbr="September" colspan="3" id="prev"><a href="#" title="View posts for September 2009">&laquo; Sep</a></td>
									<td class="pad">&nbsp;</td>
									<td colspan="3" id="next">&nbsp;</td>
								</tr>
							</tfoot>
							<tbody>
								<tr>
									<td>1</td>
									<td>2</td>
									<td>3</td>
									<td id="today">4</td>
									<td>5</td>
									<td>6</td>
									<td>7</td>
								</tr>
								<tr>
									<td>8</td>
									<td>9</td>
									<td>10</td>
									<td>11</td>
									<td>12</td>
									<td>13</td>
									<td>14</td>
								</tr>
								<tr>
									<td>15</td>
									<td>16</td>
									<td>17</td>
									<td>18</td>
									<td>19</td>
									<td>20</td>
									<td>21</td>
								</tr>
								<tr>
									<td>22</td>
									<td>23</td>
									<td>24</td>
									<td>25</td>
									<td>26</td>
									<td>27</td>
									<td>28</td>
								</tr>
								<tr>
									<td>29</td>
									<td>30</td>
									<td>31</td>
									<td class="pad" colspan="4">&nbsp;</td>
								</tr>
							</tbody>
						</table>
					</div>
				</li>
				<li>
					<h2>Categories</h2>
					<ul>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
						<li><a href="#">Aliquam libero</a></li>
						<li><a href="#">Consectetuer adipiscing elit</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
						<li><a href="#">Suspendisse iaculis mauris</a></li>
						<li><a href="#">Urnanet non molestie semper</a></li>
						<li><a href="#">Proin gravida orci porttitor</a></li>
						<li><a href="#">Metus aliquam pellentesque</a></li>
					</ul>
				</li>
			</ul>
		</div>
		<!-- end sidebars -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end page -->
</div>
<div id="footer">
	<p class="copyright">&copy;&nbsp;&nbsp;2009 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a href="http://www.ukzn.ac.za/">Senzo Maphumulo</a>.</p>
	<p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a></p>
</div>
</body>
</html>
