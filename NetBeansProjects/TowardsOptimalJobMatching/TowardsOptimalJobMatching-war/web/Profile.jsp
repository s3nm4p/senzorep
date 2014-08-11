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
			<li><a href="#">My Profile</a></li>
			<li><a href="#">My Applications</a></li>
			<li><a href="#">Search Jobs</a></li>
			<li><a href="Recommendations.jsp">Recommend Jobs</a></li>
		</ul>
		<ul id="feed">
			<li><a href="#">About Us</a></li>
			<li><a href="#">Contact Us</a></li>
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
				<h1 class="title"><a href="#">View or edit your profile</a></h1>
				
    <div class="entry">
        <% 
            String apid = session.getAttribute("appid").toString();
            String sql = "select * from userprofile where apid='"+apid+"'";            
        DBClass db = new DBClass();
        DefaultTableModel tbmodel = db.query(sql);
        String mobile = tbmodel.getValueAt(0, 6).toString();
        String email = tbmodel.getValueAt(0, 5).toString();
        String fullname = tbmodel.getValueAt(0, 2).toString();String gender = tbmodel.getValueAt(0, 7).toString();String ethn = tbmodel.getValueAt(0, 8).toString();
        String disability = tbmodel.getValueAt(0, 9).toString();String languages = tbmodel.getValueAt(0, 10).toString();
        String achvmnts = tbmodel.getValueAt(0, 11).toString();
        String personality = tbmodel.getValueAt(0, 5).toString();String worknum = tbmodel.getValueAt(0, 21).toString();String location= tbmodel.getValueAt(0, 22).toString();
        String education = tbmodel.getValueAt(0, 5).toString();
        String exp = tbmodel.getValueAt(0, 5).toString();
        String skills = tbmodel.getValueAt(0, 5).toString();
        String prefjob = tbmodel.getValueAt(0, 5).toString();
        String avail = tbmodel.getValueAt(0, 5).toString();
        String comopt = tbmodel.getValueAt(0, 5).toString();
        String assocs = tbmodel.getValueAt(0, 5).toString();
        String age = tbmodel.getValueAt(0, 20).toString();
        String homnum = tbmodel.getValueAt(0, 23).toString();
        String address = tbmodel.getValueAt(0, 5).toString();
        String nationality = tbmodel.getValueAt(0, 24).toString();
        
        %>
 <h2><%out.println(session.getAttribute("name"));   %></h2>
<p><% out.println(mobile); %>  </p>
<p><% out.println(email); %> </p>
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
        <td><% out.println(fullname); %></td>
    </tr>
    <tr>
        <td>Mobile Number:</td>
        <td> <% out.println(mobile); %></td>
    </tr>
    <tr>
        <td>Home Number:</td>
        <td><% out.println(homnum); %></td>
    </tr>
    <tr>
        <td>Work Number:</td>
        <td><% out.println(worknum); %></td>
    </tr>
    <tr>
        <td>Email Address:</td>
        <td><% out.println(email); %></td>
    </tr>
        <tr>
        <td>Location: </td>
        <td><% out.println(location.replace('%', ' ')); %></td>
    </tr>
        <tr>
        <td>Nationality:</td>
        <td><% out.println(nationality); %></td>
    </tr>
        <tr>
        <td>Age: </td>
        <td><% out.println(age); %></td>
    </tr>
        <tr>
        <td>EE/AA Status:</td>
        <td><% out.println(ethn); %> <% out.println(gender); %></td>
    </tr>
    <tr>
        <td>Disability:</td>
        <td><% out.println(disability);%></td>
    </tr>
</table>
<p></p>
<h3>Preferred Job</h3>
<a href="/resume/careerobjectives/edit?branded=1&amp;external_view=False#">
Edit
</a>
<table border="1">
    <tr>
<th>Job Title</th>
<th>Industry</th>
<th>Location</th>
<th>Type</th>
<th>Level</th>
<th>Availability</th>

</tr>
    <tr>
    <%  
        
    %>
        <td>Developer</td>
        <td>Information Technology</td>
        <td>Gauteng (South Africa)</td>
        <td>Junior</td>
        <td>Permanent </td>
        <td>Immediately</td>
    </tr>
 
  
   
</table>
<p></p>
<h3>Skills</h3>
<a href="/resume/relevantskills?current=1&amp;branded=1&amp;external_view=False">Edit</a>
<table border="1">
    <tr>
<th>Name</th>
<th>Level</th>
<th>Duration</th>

</tr>
    <tr>
        <td>Java</td>
        <td>Intermediate</td>
        <td>2007 - 2013</td>        
    </tr>
  <tr>
        <td>Database</td>
        <td>Junior</td>
        <td>2008 - 2013</td>        
    </tr>
  <tr>
        <td>C/C++</td>
        <td>Junior</td>
        <td>2010 - 2010</td>        
    </tr>
       
</table>
<p></p>
<h3>Employment</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">Add</a>
|
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a>
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
        <td>Java Developer</td>
        <td>Information Technology</td>
        <td>Permanent</td>   
        <td>Durban</td>
        <td>Write Java Software,Write Java Software,Write Java Software</td>
        <td></td>
        <td></td>
        <td></td>
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
        <td>B Sc</td>
        <td>Computer Science & Information Technology</td>
        <td>UKZN</td>   
        <td>2007 - 2010</td>
        <td>Full Time</td>
        <td>too many</td>
        <td>100</td>       
    </tr>       
</table></div>
<p></p>
<h3>Languages</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td><% out.println(languages);%></td> 
        <td><a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a></td> 
    </tr>
    <tr>
        <td>English (Read,Speak,Write)</td>
         <td><a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a></td> 
     </tr>
    
        <tr><td>IsiXhosa (Speak)</td>
             <td><a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a></td> 
        </tr> 
    
</table>
<p></p>

<h3>Achievements</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td>Best Student in Maths and Physics (Protect Umkomaas)</td> 
        <td><a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a></td> 
    </tr>   
</table>
<p></p>

<h3>Associations</h3>
<a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Add
</a> 
<table>   
    <tr>
        <td>Witbank Association</td> 
        <td><a href="/resume/employmenthistory/4783936?branded=1&amp;external_view=False#">
Edit
</a> |
<a href="#">
Delete
</a></td> 
    </tr>   
</table>
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
