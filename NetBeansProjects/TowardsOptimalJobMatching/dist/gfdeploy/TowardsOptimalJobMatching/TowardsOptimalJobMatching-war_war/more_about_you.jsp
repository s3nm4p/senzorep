<%@page import="jobamatching.DBClass"%>
<%@page import="java.sql.Statement"%>
<%@page import="javax.swing.JPanel"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>More about you</title>
<meta name="generator" content="90 Second Website Builder 8 Trial Version - http://www.90secondwebsitebuilder.com">
<style type="text/css">
body
{
   background-color: #FFFFFF;
   color: #000000;
}
</style>
<style type="text/css">
a
{
   color: #0000FF;
   text-decoration: underline;
}
a:visited
{
   color: #800080;
}
a:active
{   
   color: #FF0000;
}
a:hover
{
   color: #0000FF;
   text-decoration: underline;
}
</style>
<style type="text/css">
#wb_Form1
{
   background-color: #FAFAFA;
   border: 0px #000000 solid;
}
#wb_Text1 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text1 div
{
   text-align: left;
}
#Combobox1
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#wb_Text2 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text2 div
{
   text-align: left;
}
#wb_Text3 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text3 div
{
   text-align: left;
}
#wb_Text4 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text4 div
{
   text-align: left;
}
#TextArea1
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
}
#wb_Text5 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text5 div
{
   text-align: left;
}
#wb_Text6 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text6 div
{
   text-align: left;
}
#Editbox4
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#wb_Text7 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text7 div
{
   text-align: left;
}
#wb_Text8 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text8 div
{
   text-align: left;
}
#Editbox6
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#wb_Text9 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text9 div
{
   text-align: left;
}
#wb_Text10 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text10 div
{
   text-align: left;
}
#Editbox8
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#wb_Text12 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text12 div
{
   text-align: left;
}
#wb_Text14 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text14 div
{
   text-align: left;
}
#wb_Text15 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text15 div
{
   text-align: left;
}
#wb_Text16 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text16 div
{
   text-align: left;
}
#wb_Text17 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text17 div
{
   text-align: left;
}
#wb_Text18 
{
   background-color: transparent;
   border: 0px #000000 solid;
   padding: 0;
}
#wb_Text18 div
{
   text-align: left;
}
#Combobox2
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox3
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox4
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox5
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox6
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox7
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox8
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox9
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Combobox10
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Editbox1
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Button1
{
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
#Image1
{
   border: 0px #000000 solid;
}
#Captcha1Edit
{
   border: 1px #C0C0C0 solid;
   background-color: #FFFFFF;
   color :#000000;
   font-family: Arial;
   font-size: 13px;
   text-align: left;
   vertical-align: middle;
}
#Button2
{
   color: #000000;
   font-family: Arial;
   font-size: 13px;
}
</style>
</head>
<body>
    <%
        Statement stmnt;
     String sql;
   String[] paramValues=new String[100];  
        paramValues[0] = request.getParameter("idnumber");
        DBClass db = new DBClass();
        
        out.print(db.validate(paramValues[0], "login", "username"));
    %>
<div id="wb_Form1" style="position:absolute;left:420px;top:0px;width:570px;height:860px;z-index:37;">
    <form name="contact" method="post" action="userProfile.jsp" id="Form1" target="_top">
<div id="wb_Text1" style="position:absolute;left:10px;top:234px;width:84px;height:16px;z-index:0;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Gender</span></div>
<select name="subject" size="1" id="Combobox1" style="position:absolute;left:250px;top:234px;width:200px;height:25px;z-index:1;">
<option value="male">Male</option>
<option selected value="female">Female</option>
</select>
<div id="wb_Text2" style="position:absolute;left:10px;top:265px;width:84px;height:16px;z-index:2;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Ethnicity</span></div>
<div id="wb_Text3" style="position:absolute;left:10px;top:295px;width:84px;height:16px;z-index:3;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Disability</span></div>
<div id="wb_Text4" style="position:absolute;left:10px;top:325px;width:120px;height:16px;z-index:4;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Postal Address</span></div>
<textarea name="Address" id="TextArea1" style="position:absolute;left:250px;top:324px;width:198px;height:98px;z-index:5;" rows="5" cols="27"></textarea>
<div id="wb_Text5" style="position:absolute;left:10px;top:430px;width:84px;height:16px;z-index:6;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Country</span></div>
<div id="wb_Text6" style="position:absolute;left:140px;top:460px;width:97px;height:16px;z-index:7;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">State/Province</span></div>
<input type="text" id="Editbox4" style="position:absolute;left:250px;top:700px;width:198px;height:23px;line-height:23px;z-index:8;" name="state" value="">
<div id="wb_Text7" style="position:absolute;left:10px;top:460px;width:84px;height:16px;z-index:9;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Location</span></div>
<div id="wb_Text8" style="position:absolute;left:140px;top:520px;width:84px;height:16px;z-index:10;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Region</span></div>
<input type="text" id="Editbox6" style="position:absolute;left:250px;top:660px;width:198px;height:23px;line-height:23px;z-index:11;" name="Home Phone" value="">
<div id="wb_Text9" style="position:absolute;left:140px;top:490px;width:84px;height:16px;z-index:12;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">City/Town</span></div>
<div id="wb_Text10" style="position:absolute;left:140px;top:550px;width:84px;height:16px;z-index:13;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Suburb</span></div>
<input type="text" id="Editbox8" style="position:absolute;left:250px;top:620px;width:198px;height:23px;line-height:23px;z-index:14;" name="Fax Number" value="">
<div id="wb_Text12" style="position:absolute;left:140px;top:580px;width:84px;height:16px;z-index:15;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Postal Code</span></div>
<div id="wb_Text14" style="position:absolute;left:10px;top:670px;width:84px;height:16px;z-index:16;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Work Phone</span></div>
<div id="wb_Text16" style="position:absolute;left:10px;top:620px;width:84px;height:16px;z-index:17;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Home Phone</span></div>
<div id="wb_Text17" style="position:absolute;left:10px;top:710px;width:84px;height:16px;z-index:18;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Mobile Phone</span></div>
<div id="wb_Text18" style="position:absolute;left:10px;top:200px;width:110px;height:16px;z-index:19;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">Choose picture</span></div>
<select name="subject" size="1" id="Combobox2" style="position:absolute;left:250px;top:264px;width:200px;height:25px;z-index:20;">
<option selected value="black">Black</option>
<option value="coloured">Coloured</option>
<option value="indian">Indian</option>
<option value="white">White</option>
</select>
<select name="disability" size="1" id="Combobox3" style="position:absolute;left:250px;top:294px;width:200px;height:25px;z-index:21;">
<option>Autism</option>
<option>Chronic Illness</option>
<option>Hearing Loss and Deafness</option>
<option>Intellectual Disability</option>
<option>Learning Disability</option>
<option>Memory Loss</option>
<option>Mental Illness</option>
<option>Physical Disability</option>
<option>Speech and Language Disorders</option>
<option>Vision Loss and Blindness</option>
<option selected value="none">None</option>
</select>
<select name="country" size="1" id="Combobox4" style="position:absolute;left:250px;top:430px;width:200px;height:25px;z-index:22;">
<option>Abkhazia</option>
<option>Afghanistan</option>
<option>Akrotiri and Dhekelia</option>
<option>Aland</option>
<option>Albania</option>
<option>Algeria</option>
<option>American Samoa</option>
<option>Andorra</option>
<option>Angola</option>
<option>Anguilla</option>
<option>Antigua and Barbuda</option>
<option>Argentina</option>
<option>Armenia</option>
<option>Aruba</option>
<option>Ascension Island</option>
<option>Australia</option>
<option>Austria</option>
<option>Azerbaijan</option>
<option>Bahamas, The</option>
<option>Bahrain</option>
<option>Bangladesh</option>
<option>Barbados</option>
<option>Belarus</option>
<option>Belgium</option>
<option>Belize</option>
<option>Benin</option>
<option>Bermuda</option>
<option>Bhutan</option>
<option>Bolivia</option>
<option>Bosnia and Herzegovina</option>
<option>Botswana</option>
<option>Brazil</option>
<option>Brunei</option>
<option>Bulgaria</option>
<option>Burkina Faso</option>
<option>Burundi</option>
<option>Cambodia</option>
<option>Cameroon</option>
<option>Canada</option>
<option>Cape Verde</option>
<option>Cayman Islands</option>
<option>Central Africa Republic</option>
<option>Chad</option>
<option>Chile</option>
<option>China</option>
<option>Christmas Island</option>
<option>Cocos (Keeling) Islands</option>
<option>Colombia</option>
<option>Comoros</option>
<option>Congo</option>
<option>Cook Islands</option>
<option>Costa Rica</option>
<option>Cote d'lvoire</option>
<option>Croatia</option>
<option>Cuba</option>
<option>Cyprus</option>
<option>Czech Republic</option>
<option>Denmark</option>
<option>Djibouti</option>
<option>Dominica</option>
<option>Dominican Republic</option>
<option>East Timor Ecuador</option>
<option>Egypt</option>
<option>El Salvador</option>
<option>Equatorial Guinea</option>
<option>Eritrea</option>
<option>Estonia</option>
<option>Ethiopia</option>
<option>Falkland Islands</option>
<option>Faroe Islands</option>
<option>Fiji</option>
<option>Finland</option>
<option>France</option>
<option>French Polynesia</option>
<option>Gabon</option>
<option>Cambia, The</option>
<option>Georgia</option>
<option>Germany</option>
<option>Ghana</option>
<option>Gibraltar</option>
<option>Greece</option>
<option>Greenland</option>
<option>Grenada</option>
<option>Guam</option>
<option>Guatemala</option>
<option>Guemsey</option>
<option>Guinea</option>
<option>Guinea-Bissau</option>
<option>Guyana</option>
<option>Haiti</option>
<option>Honduras</option>
<option>Hong Kong</option>
<option>Hungary</option>
<option>Iceland</option>
<option>India</option>
<option>Indonesia</option>
<option>Iran</option>
<option>Iraq</option>
<option>Ireland</option>
<option>Isle of Man</option>
<option>Israel</option>
<option>Italy</option>
<option>Jamaica</option>
<option>Japan</option>
<option>Jersey</option>
<option>Jordan</option>
<option>Kazakhstan</option>
<option>Kenya</option>
<option>Kiribati</option>
<option>Korea, N</option>
<option>Korea, S</option>
<option>Kosovo</option>
<option>Kuwait</option>
<option>Kyrgyzstan</option>
<option>Laos</option>
<option>Latvia</option>
<option>Lebanon</option>
<option>Lesotho</option>
<option>Liberia</option>
<option>Libya</option>
<option>Liechtenstein</option>
<option>Lithuania</option>
<option>Luxembourg</option>
<option>Macao</option>
<option>Macedonia</option>
<option>Madagascar</option>
<option>Malawi</option>
<option>Malaysia</option>
<option>Maldives</option>
<option>Mali</option>
<option>Malta</option>
<option>Marshall Islands</option>
<option>Mauritania</option>
<option>Mauritius</option>
<option>Mayotte</option>
<option>Mexico</option>
<option>Micronesia</option>
<option>Moldova</option>
<option>Monaco</option>
<option>Mongolia</option>
<option>Montenegro</option>
<option>Montserrat</option>
<option>Morocco</option>
<option>Mozambique</option>
<option>Myanmar</option>
<option>Nagorno-Karabakh</option>
<option>Namibia</option>
<option>Nauru</option>
<option>Nepal</option>
<option>Netherlands</option>
<option>Netherlands Antilles</option>
<option>New Caledonia</option>
<option>New Zealand</option>
<option>Nicaragua</option>
<option>Niger</option>
<option>Nigeria</option>
<option>Niue</option>
<option>Norfolk Island</option>
<option>Northern Cyprus</option>
<option>Northern Mariana Islands</option>
<option>Norway</option>
<option>Oman</option>
<option>Pakistan</option>
<option>Palau</option>
<option>Palestine</option>
<option>Panama</option>
<option>Papua New Guinea</option>
<option>Paraguay</option>
<option>Peru</option>
<option>Philippines</option>
<option>Pitcaim Islands</option>
<option>Poland</option>
<option>Portugal</option>
<option>Puerto Rico</option>
<option>Qatar</option>
<option>Romania</option>
<option>Russia</option>
<option>Rwanda</option>
<option>Sahrawi Arab Democratic Republic</option>
<option>Saint-Barthelemy</option>
<option>Saint Helena</option>
<option>Saint Kitts and Nevis</option>
<option>Saint Lucia</option>
<option>Saint Martin</option>
<option>Saint Pierre and Miquelon</option>
<option>Saint Vincent and Grenadines</option>
<option>Samos</option>
<option>San Marino</option>
<option>Sao Tome and Principe</option>
<option>Saudi Arabia</option>
<option>Senegal</option>
<option>Serbia</option>
<option>Seychelles</option>
<option>Sierra Leone</option>
<option>Singapore</option>
<option>Slovakia</option>
<option>Slovenia</option>
<option>Solomon Islands</option>
<option>Somalia</option>
<option>Somaliland</option>
<option>South Africa</option>
<option>South Ossetia</option>
<option>Spain</option>
<option>Sri Lanka</option>
<option>Sudan</option>
<option>Suriname</option>
<option>Svalbard</option>
<option>Swaziland</option>
<option>Sweden</option>
<option>Switzerland</option>
<option>Syria</option>
<option>Tajikistan</option>
<option>Tanzania</option>
<option>Thailand</option>
<option>Togo</option>
<option>Tokelau</option>
<option>Tonga</option>
<option>Transnistria</option>
<option>Trinidad and Tobago</option>
<option>Tristan da Cunha</option>
<option>Tunisia</option>
<option>Turkey</option>
<option>Turkmenistan</option>
<option>Turks and Caicos Islands</option>
<option>Tuvalu</option>
<option>Uganda</option>
<option>Ukraine</option>
<option>United Arab Emirates</option>
<option>United Kingdom</option>
<option>United States</option>
<option>Uruguay</option>
<option>Uzbekistan</option>
<option>Vanuatu</option>
<option>Vatican City</option>
<option>Venezuela</option>
<option>Vietnam</option>
<option>Virgin Islands, British</option>
<option>Virgin Islands, U.S.</option>
<option>Wallis and Futuna</option>
<option>Yemen</option>
<option>Zambia</option>
<option>Zimbabwe</option>
</select>
<select name="province" size="1" id="Combobox5" style="position:absolute;left:250px;top:460px;width:200px;height:25px;z-index:23;">
<option selected value="ec">Eastern Cape</option>
<option value="fs">Free State</option>
<option value="gp">Gauteng</option>
<option value="kzn">KwaZulu-Natal</option>
<option value="lim">Limpopo</option>
<option value="mpu">Mpumalanga</option>
<option value="nc">Northern Cape</option>
<option value="nw">North West</option>
<option value="wc">Western Cape</option>
</select>
<select name="subject" size="1" id="Combobox6" style="position:absolute;left:250px;top:490px;width:200px;height:25px;z-index:24;">
<option selected value="General Feedback">General Feedback</option>
<option value="Contact Request">Contact Request</option>
<option value="Price Quote">Price Quote</option>
<option value="Employment Information">Employment Information</option>
</select>
<select name="subject" size="1" id="Combobox7" style="position:absolute;left:250px;top:520px;width:200px;height:25px;z-index:25;">
<option selected value="General Feedback">General Feedback</option>
<option value="Contact Request">Contact Request</option>
<option value="Price Quote">Price Quote</option>
<option value="Employment Information">Employment Information</option>
</select>
<select name="subject" size="1" id="Combobox8" style="position:absolute;left:250px;top:550px;width:200px;height:25px;z-index:26;">
<option selected value="General Feedback">General Feedback</option>
<option value="Contact Request">Contact Request</option>
<option value="Price Quote">Price Quote</option>
<option value="Employment Information">Employment Information</option>
</select>
<select name="subject" size="1" id="Combobox9" style="position:absolute;left:250px;top:580px;width:200px;height:25px;z-index:27;">
<option selected value="General Feedback">General Feedback</option>
<option value="Contact Request">Contact Request</option>
<option value="Price Quote">Price Quote</option>
<option value="Employment Information">Employment Information</option>
</select>
<div id="wb_Text15" style="position:absolute;left:10px;top:746px;width:230px;height:16px;z-index:28;text-align:left;">
<span style="color:#000000;font-family:Arial;font-size:13px;">What is the best way to contact you?</span></div>
<select name="subject" size="1" id="Combobox10" style="position:absolute;left:250px;top:740px;width:200px;height:25px;z-index:29;">
<option selected value="General Feedback">General Feedback</option>
<option value="Contact Request">Contact Request</option>
<option value="Price Quote">Price Quote</option>
<option value="Employment Information">Employment Information</option>
</select>
<input type="text" id="Editbox1" style="position:absolute;left:250px;top:200px;width:188px;height:18px;line-height:18px;z-index:30;" name="Editbox1" value="">
<input type="button" id="Button1" name="browse" value="Browse" style="position:absolute;left:460px;top:200px;width:96px;height:25px;z-index:31;">
<button id="AdvancedButton1" type="submit" name="" value="" style="position:absolute;left:370px;top:800px;width:150px;height:34px;z-index:32;"><div style="text-align:center"><span style="color:#000000;font-family:Arial;font-size:13px">Create Profile</span></div></button>
<div id="wb_Image1" style="position:absolute;left:390px;top:10px;width:130px;height:140px;z-index:33;">
<img src="images/765-default-avatar.png" id="Image1" alt="" border="0" style="width:130px;height:140px;"></div>
<div id="wb_Captcha1" style="position:absolute;left:20px;top:780px;width:218px;height:48px;z-index:34;">
<img src="captcha1.php" alt="Click for new image" title="Click for new image" style="cursor:pointer;width:100px;height:38px;" onclick="this.src='captcha1.php?'+Math.random()">
<input type="text" id="Captcha1Edit" style="position:absolute;left:105px;top:16px;width:118px;height:20px;line-height:20px;;" name="captcha_code" value=""></div>
<input type="button" id="Button2" name="disabilityAdd" value="+disability" style="position:absolute;left:460px;top:290px;width:96px;height:25px;z-index:35;" accesskey="+">
</form>
</div>

</body>
</html> 