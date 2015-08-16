<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en" class=" js csstransforms csstransforms3d csstransitions"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="http://projects.pulsarmedia.ca/vienna/favicon.png">

    <title>FINE DINE :: Growing Majestic</title>
    
    <link href="./css/bootstrap.css" rel="stylesheet">

    <!-- main css --> 
    <link href="./css/bootstrap-fileupload.css" rel="stylesheet">
    <link href="./css/main.css" rel="stylesheet">
    <link href="./css/form.css" rel="stylesheet">
    <!-- mobile css -->
    <link href="./css/responsive.css" rel="stylesheet">
    
    <!-- FontAwesome Support -->
    <link rel="stylesheet" type="text/css" href="./css/font-awesome.min.css">
    <!-- FontAwesome Support -->
    
    <!-- Btns -->
    <link rel="stylesheet" type="text/css" href="./css/btn.css">
    <!-- Btns -->
    
    <!-- Superfish menu -->
    <link rel="stylesheet" type="text/css" href="./css/superfish.css">
    <!-- Superfish menu -->
    
    <!-- Theme Color selector -->
    <link href="./css/theme-color-selector.css" type="text/css" rel="stylesheet">
    <!-- Theme Color selector -->
    
    <!-- Owl Carousel -->
    <link rel="stylesheet" type="text/css" href="./css/owl.carousel.css">
    <!-- Owl Carousel -->
    
    <!-- Twitter feed -->
    <link rel="stylesheet" type="text/css" href="./css/twitterfeed.css">
    <!-- Twitter feed -->
    
    <!-- Typicons -->
    <link rel="stylesheet" type="text/css" href="./css/typicons.min.css">
    <!-- Typicons -->
    
    <!-- WOW animations -->
    <link rel="stylesheet" type="text/css" href="./css/animate.css">
    <!-- WOW animations -->
    
    <!-- Forms -->
    <link rel="stylesheet" type="text/css" href="./css/forms.css">
    <!-- Forms -->
    
    <!-- Flickr feed -->
    <link rel="stylesheet" type="text/css" href="./css/flickrfeed.css">
    <!-- Flickr feed -->
    
    <!-- Pulse Slider -->
    <link rel="stylesheet" type="text/css" href="./css/pm-slider.css">
    <!-- Pulse Slider -->
        
    <!-- Development Google Fonts -->
    <link href="./css/css" rel="stylesheet" type="text/css">
    <!-- Development Google Fonts -->
    <style type="text/css">
    #popupbox {
	margin: 0 auto;
	margin-left: 15%;
	margin-top: 1.5%;
	width:69%;
	height: 640px;
	position: absolute;
	background: #FFFFFF;
	border: solid #000000 0px;
	z-index: 9;
	opacity:1;
	font-family: arial;
	visibility: visible;
	overflow: scroll;
}</style>
 <script type="text/javascript">
    function timezones(){  	
	    var date = new Date();
	    var offset = date.getTimezoneOffset();
	    offset = offset/60;
	    document.getElementById('timezone').value = offset;
	    }
    </script>
  </head>

  <body onload="timezones()">
  
  <!-- Mobile Menu -->
  <div class="pm-mobile-menu-overlay" id="pm-mobile-menu-overlay"></div>
  
  <div class="pm-mobile-global-menu" style="height: 4263px;">
                	
    <div class="pm-mobile-global-menu-logo">
        <a href="http://projects.pulsarmedia.ca/vienna/index.html"><img src="./css/vienna-logo.png" alt="Vienna Restaurant"></a> 
    </div>
    
    <div class="pm-mobile-global-menu-search">
    	<form action="http://projects.pulsarmedia.ca/vienna/#" method="post">
            <input name="" type="text" class="pm-search-field-mobile" placeholder="Type Keywords...">
        </form>
    </div>
    
    <ul class="sf-menu pm-nav sf-js-enabled">
                        
        <li><a href="home.im">Home</a></li>
        <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">About Us</a></li>
        <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">Client & Partners</a></li>
        <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">News</a></li>
        <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">Contact Us</a></li>
        <!-- <li>
            <a href="http://projects.pulsarmedia.ca/vienna/#" class="sf-with-ul">About Us<span class="sf-sub-indicator"> »</span></a>
            <ul style="display: none;">
                <li><a href="menus.jsp">Breakfast</a></li>
                <li><a href="menus.jsp">Lunch</a></li>
                <li><a href="menus.jsp">Dinner</a></li>
            </ul>
        </li> -->
    </ul>
        
  </div><!-- /pm-mobile-nav-overlay -->
  
  <!-- Theme color selector -->
  <!-- <div id="pm_theme_color_selector">
        <a class="pm_theme_color_selector_btn"><i class="typcn typcn-cog"></i></a>
        <p class="pm_theme_color_selector_title">Style Sampler</p>

        <div class="pm_theme_color_selector_container">
        	<p>Layout Style</p>
        	<select name="pm_theme_color_selector_mode" id="pm_theme_color_selector_mode">
        	  <option value="pm-full-mode" selected="">Fullscreen</option>
              <option value="pm-boxed-mode">Boxed Mode</option>
        	</select>
        </div>
        <div class="pm_theme_color_selector_container">
        	<p>Patterns for Boxed Mode</p>
        	<ul class="pm_theme_img_selector" id="pm_theme_pattern_selector">
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern1"><img src="./images/pattern1.png" alt="pattern1"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern2"><img src="./images/pattern2.png" alt="pattern2"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern3"><img src="./images/pattern3.png" alt="pattern3"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern4"><img src="./images/pattern4.png" alt="pattern4"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern5"><img src="./images/pattern5.png" alt="pattern5"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pattern6"><img src="./images/pattern6.png" alt="pattern6"></a></li>
            </ul>
        </div>
        
        <div class="pm_theme_color_selector_container">
        	<p>Backgrounds for Boxed Mode</p>
        	<ul class="pm_theme_img_selector" id="pm_theme_background_selector">
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="1a"><img src="./images/1.jpg" alt="bg1"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="2a"><img src="./images/2.jpg" alt="bg2"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="3a"><img src="./images/3.jpg" alt="bg3"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="4a"><img src="./images/4.jpg" alt="bg4"></a></li>
                <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="5a"><img src="./images/5.jpg" alt="bg5"></a></li>
            </ul>
        </div>
   
    </div> -->
    <!-- Theme color selector -->
    

	<div id="pm_layout_wrapper" class="pm-full-mode"><!-- Use wrapper for wide or boxed mode -->
    
    	<!-- Search overlay -->
        <div class="pm-search-container" id="pm-search-container">
        	
            <div class="container">
            	<div class="row">
                	
                    <div class="col-lg-10 col-md-10 col-sm-10">
                    </div>
                    <div class="col-lg-2 col-md-2 col-sm-2">
                    	<ul class="pm-search-controls">
                        	<li><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-search"></i></a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/#" id="pm-search-collapse"><i class="fa fa-times"></i></a></li>
                        </ul>
                    </div>
                    
                </div>
            </div>
            
        </div>
        <!-- Search overlay end -->
    
    	<!-- Sub-header -->
    	<div class="pm-sub-menu-container">
        
        	<div class="container">
            
            	<div class="row">
                	
                    <div class="col-lg-5 col-md-5 col-sm-6">
                    	
                        <div class="pm-sub-menu-info">
                        	<p class="pm-address"><i class="fa fa-map-marker"></i> 4 Main Street, New York, NY 02489</p>
                            <p class="pm-contact"><i class="fa fa-mobile-phone"></i> 1-(800)-555-5555</p>
                        </div>
                                                
                    </div>
                    
                    <div class="col-lg-2 col-md-2 col-sm-6 visible-lg visible-md pm-book-event">
                    	<!-- <div class="pm-sub-menu-book-event">
                        	<a href="http://projects.pulsarmedia.ca/vienna/book-an-event.html">Book an Event <i class="fa fa-calendar"></i></a>
                        </div> -->
                    </div>
                    
                    <div class="col-lg-5 col-md-5 col-sm-6">
                    	<ul class="pm-sub-navigation">
                        	<li>
                                <div class="pm-dropdown pm-language-selector-menu">
                                    <div class="pm-dropmenu">
                                        <p class="pm-menu-title">Language</p>
                                        <i class="fa fa-angle-down"></i>
                                    </div>
                                    <div class="pm-dropmenu-active">
                                        <ul>
                                           <li><a href="http://projects.pulsarmedia.ca/vienna/#">English</a></li>
                                           <li><a href="http://projects.pulsarmedia.ca/vienna/#">Italian</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <li><a href="signin.im">Sign&nbsp;In</a></li>
                            <!-- <li><a href="signup.im">Sign&nbsp;Up</a></li> -->
                            <!-- <li class="pm-search-btn-li"><a href="http://projects.pulsarmedia.ca/vienna/#" class="pm-search-btn" id="pm-search-btn"><i class="fa fa-search"></i></a></li> -->
                            <!-- <li class="pm-cart-btn-li"><a href="http://projects.pulsarmedia.ca/vienna/cart.html" class="pm-cart-btn"><i class="fa fa-shopping-cart"></i></a></li> -->
                        </ul>
                    </div>
                    
                    
                </div>
            
            </div>
            
        </div>
        <!-- /Sub-header -->
    
    	<!-- Main navigation -->
        <header>
                
        	<div class="container">
            
            	<div class="row">
                	
                    <div class="col-lg-4 col-md-4 col-sm-12">
                    	
                        <div class="pm-header-logo-container">
                    		<a href="http://projects.pulsarmedia.ca/vienna/index.html"><img src="./images/vienna-logo.png" class="img-responsive pm-header-logo" alt="Vienna Restaurant"></a> 
                        </div>
                        
                        <div class="pm-header-mobile-btn-container">
                        	<!--<button type="button" class="navbar-toggle pm-main-menu-btn" id="pm-main-menu-btn" data-toggle="collapse" data-target=".navbar-collapse"><i class="fa fa-bars"></i></button>-->
                            <button type="button" class="navbar-toggle pm-main-menu-btn" id="pm-mobile-menu-trigger"><i class="fa fa-bars"></i></button>
                        </div>
                    
                    </div>
                    
                    <div class="col-lg-8 col-md-8 col-sm-8 pm-main-menu">
                                        
                    	<nav class="navbar-collapse collapse">
                        
                        	<ul class="sf-menu pm-nav sf-js-enabled">
                        
                                 <li><a href="home.im">Home</a></li>
						         <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">About Us</a></li>
						         <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">Client & Partners</a></li>
						         <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">News</a></li>
						         <li><a href="http://projects.pulsarmedia.ca/vienna/index.html">Contact Us</a></li>
                               <!--  <li>
                                    <a href="http://projects.pulsarmedia.ca/vienna/#" class="sf-with-ul">Menus<span class="sf-sub-indicator"> »</span></a>
                                    <ul style="display: none;">
                                        <li><a href="http://projects.pulsarmedia.ca/vienna/menus.html">Breakfast</a></li>
                                        <li><a href="http://projects.pulsarmedia.ca/vienna/menus.html">Lunch</a></li>
                                        <li><a href="http://projects.pulsarmedia.ca/vienna/menus.html">Dinner</a></li>
                                    </ul>
                                </li> -->
                                                
                            </ul>
                        
                        </nav>  
                                              
                    </div>
                    <div id="bind">
                    <div id="popupbox">
				    	<div id="deviceId">
				    	<form:form method="POST" action="signupform.im" modelAttribute="signupform" enctype="multipart/form-data">
				        <!-- <span style="font-size:14px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center">Order Device Form:</span> -->
				   		   				   		    
				   		    <div id="row" >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="country" /></span>
				                	<div id="text_setting">
				              		Country 
				                    </div>
				              	</div>
				            	<div id="col">
 									<form:select path="country"  multiple="false" id="text_setting" required="required" title="Please select country of restaurant">
										<form:option value="" label="Select" />
									    <form:options items="${countryList}" />
									</form:select>
				                </div>
				   		 	</div>
				   			<div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="state" /></span>
				                	<div id="text_setting">
				         			State/Province
				                    </div>
				                </div>
				                <div id="col">
				                	<form:select path="state"  multiple="false" id="text_setting" required="required" title="Please select state of restaurant">
										<form:option value="" label="Select" />
									    <form:options items="${statesList}" />
									</form:select>
				                </div>
				             </div>
				    		 <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="city" /></span>
				                	<div id="text_setting">
				         			City
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="city"  type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="30" required="required" title="Please enter city of restaurant" placeholder="Enter city of Restaurant"/>
				                </div>
				             </div>
				      		<div id="row" >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="address" /></span>
				                	<div id="text_setting">
				         			Address
				                    </div>
				                </div>
				                <div id="col">
				                	<form:textarea path="address" type="text" id="textfield2" cols="46" rows="5" onkeyup="autoTab(this, document.form_device.locality)" required="required" title="Please enter address of restaurant" placeholder="Enter Address of Restaurant"></form:textarea>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="zipcode" /></span>
				                	<div id="text_setting">
				         			Zipcode
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="zipcode" type="tel" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)"  maxlength="6" pattern="\d{6}" title="Please enter 6 digit zipcode" required="required" placeholder="Enter 6 digit pincode"/>
				                </div>
				             </div>		
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rname" /></span>
				                	<div id="text_setting">
				         			Restaurant Name
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="rname" type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10" title="Please enter name of restaurant" required="required" placeholder="Name of restaurant"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rmailid" /></span>
				                	<div id="text_setting">
				         			Restaurant Email-ID
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path= "rmailid" type="email" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="100" title="Please enter email-ID of restaurant" required="required" placeholder="eg. abc@swapnil.com"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="password" /></span>
				                	<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center">${password_match}</span>
				                	<div id="text_setting">
				         			Password
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path= "password" type="password" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" title="Min 8 characters Max 20, one number, one uppercase and one lowercase letter" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" maxlength="20" required="required"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="cpassword" /></span>
				                	<div id="text_setting">
				         			Confirm Password
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path= "cpassword" type="password" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" title="Min 8 characters Max 20, one number, one uppercase and one lowercase letter" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*" maxlength="20" required="required"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rcontact" /></span>
				                	<div id="text_setting">
				         			Restaurant Contact
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="rcontact" type="tel" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10" pattern="\d{10}" title="Please enter contact number of restaurant" required="required" placeholder="Enter 10 Digit mobile number"/>
				                </div>
				             </div>
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="raltcontact" /></span>
				                	<div id="text_setting">
				         			Restaurant Alternative Contact
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="raltcontact" type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10" pattern="\d{10}"  title="Please enter alternate contact number of restaurant" required="required" placeholder="Enter 10 Digit alternate mobile number"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rtype" /></span>
				                	<div id="text_setting">
				         			Restaurant Type
				                    </div>
				                </div>
				                <div id="col">
				                	<form:select path="rtype"  multiple="false" id="text_setting" required="required" title="Please select type of restaurant">
										<form:option value="" label="Select" />
									    <form:options items="${restroTypeList}" />
									</form:select>
				                	<%-- <form:input path="rtype" type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10"/> --%>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<!-- <div id="col">
				                	<div id="text_setting">
				         			Restaurant Sub Type
				                    </div>
				                </div> -->
				                <div id="col">
				                	<form:input path="rsubtype" type="hidden" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10" value=" . "/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rmaxseats" /></span>
				                	<div id="text_setting">
				         			Restaurant Max Seating
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="rmaxseats" type="tel" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" min="5" title="Please enter max vacancy of restaurant" maxlength="8" required="required" placeholder="Enter max vacancy"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="opentime" /></span>
				                	<div id="text_setting">
				         			Open Time
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="opentime" type="time" step="900" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" required="required" title="Please enter open time of restaurant"/>
				                </div>
				             </div>
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="closetime" /></span>
				                	<div id="text_setting">
				         			Close Time
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="closetime" type="time" step="900" size="60" onkeyup="autoTab(this, document.form_device.address)" id="text_setting" required="required" title="Please enter close time of restaurant"/>
				                </div>
				             </div>	
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="rrating" /></span>
				                	<div id="text_setting">
				         			Restaurant Rating
				                    </div>
				                </div>
				                <div id="col">
				                	<%-- <form:input path="rrating" type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10"/> --%>
				                	<form:select path="rrating"  multiple="false" id="text_setting" required="required" title="Please select rating of restaurant">
										<form:option value="" label="Select" />
									    <form:option value="1" label="1 Star" />
									    <form:option value="2" label="2 Star" />
									    <form:option value="3" label="3 Star" />
									    <form:option value="4" label="4 Star" />
									    <form:option value="5" label="5 Star" />
									    <form:option value="6" label="6 Star" />
									    <form:option value="7" label="7 Star" />
									</form:select>
				                </div>
				             </div>	
				             <%-- <div id="row"  >
				      			<div id="col">
				                	<div id="text_setting">
				         			Status
				                    </div>
				                </div>
				                <div id="col">
				                	<form:input path="status" type="text" id="textfield" size="60" onkeyup="autoTab(this, document.form_device.address)" maxlength="10"/>
				                	<form:select path="status"  multiple="false">
										<form:option value="" label="Select" />
									    <form:option value="O" label="Currently Active" />
									    <form:option value="C" label="Currently Shutdown" />
									</form:select>
				                </div>
				             </div>	 --%>
				             <div id="row"  >
				      			<div id="col">
				      				<span style="font-size:12px;font-family:Georgia, 'Times New Roman', Times, serif;color:red; text-align:center"><form:errors path="files" /></span>
				                	<div id="text_setting">
				         			Upload Menu
				                    </div>
				                </div>
				                <div id="col">
				                	<%-- <form:input path="files" type="file" id="textfield" onkeyup="autoTab(this, document.form_device.address)"/> --%>
				                		<div class="fileupload fileupload-new" data-provides="fileupload">
											<div class="input-append">
												<div class="uneditable-input span2">
													<i class="icon-file fileupload-exists"></i> <span
														class="fileupload-preview"></span>
												</div>
												<span class="btn btn-file btn-danger" id="text-button">
													<span class="fileupload-new">Upload file</span> 
												       <input name="files[0]" type="file" required id="text_setting" required="required" title="Please upload menu of restaurant"/>
												</span> 
											</div>	
										</div>
				                </div>
				             </div>	
				             <div id="row"  >
				             	<form:input path="timezone" type="hidden" id="timezone" onkeyup="autoTab(this, document.form_device.address)"/>
				                <button type="submit" class="pm-rounded-btn animated pm-primary">Submit</button>
				             </div>							
			        	</form:form>
			        </div>
            </div>
              </div>   
              </div>
            
            </div>
                    
        </header>
        <!-- /Main navigation -->
                
        <!-- SLIDER AREA -->
        
        <div class="pm-pulse-container" id="pm-pulse-container">
        
            <div id="pm-pulse-loader" style="display: none;">
                <img src="./images/ajax-loader.gif" alt="slider loading">
            </div>
            
            <div id="pm-slider" class="pm-slider" style="height: auto; opacity: 1;">
                
                
            
                <ul class="pm-slides-container" id="pm_slides_container" style="width: 300%; position: relative;">
                    
                    <!-- FULL WIDTH slides -->
                    <li data-thumb="img/slider/1a.jpg" class="pmslide_0" style="height: 800px; width: 33.3333333333333%; display: block; background-image: url(./images/skins/2.jpg); background-position: 50% 50%;">
                    
                        <div class="pm-holder">
                            <div class="pm-caption">
                                  <h1 style="opacity: 1; margin-top: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;"><span>Welcome to Fine Dine</span></h1>
                                  <span class="pm-caption-decription" style="opacity: 1; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
                                    Growing Majestically
                                  </span>
                                  <!-- <a href="http://projects.pulsarmedia.ca/vienna/menus.html" class="pm-slide-btn animated" style="opacity: 1; margin-top: 80px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">Unlock <i class="fa fa-chevron-right"></i></a> -->
                            </div>
                        </div>
                    
                    </li>
                    
                    <li data-thumb="img/slider/2a.jpg" class="pmslide_1" style="height: 800px; width: 33.3333333333333%; display: none; background-image: url(http://projects.pulsarmedia.ca/vienna/img/slider/slide2.jpg); background-position: 50% 50%;">
                        
                        <div class="pm-holder">
                            <div class="pm-caption">
                                  <h1 style="opacity: 0; margin-top: -50px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;"><span>Witness the beauty</span></h1>
                                  <span class="pm-caption-decription" style="opacity: 0; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
                                    Browse our gallery and see what makes Vienna great!
                                  </span>
                                  <a href="http://projects.pulsarmedia.ca/vienna/gallery.html" class="pm-slide-btn animated" style="opacity: 0; margin-top: 200px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">View our Gallery <i class="fa fa-chevron-right"></i></a>
                                  
                            </div>
                        </div>
                                            
                    </li>
                    
                    <li data-thumb="img/slider/3a.jpg" class="pmslide_2" style="height: 800px; width: 33.3333333333333%; display: none; background-image: url(http://projects.pulsarmedia.ca/vienna/img/slider/slide3.jpg); background-position: 50% 50%;">
                        
                        <div class="pm-holder">
                            <div class="pm-caption">
                                  <h1 style="opacity: 0; margin-top: -50px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;"><span>Book with us!</span></h1>
                                  <span class="pm-caption-decription" style="opacity: 0; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
                                    Book your next private party or event with Vienna
                                  </span>
                                  <a href="http://projects.pulsarmedia.ca/vienna/book-an-event.html" class="pm-slide-btn animated" style="opacity: 0; margin-top: 200px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">Book Your Event Now <i class="fa fa-chevron-right"></i></a>
                                  
                            </div>
                        </div>
                                            
                    </li>
                                    
                </ul>
               
            <nav id="pm-nav-arrows"><span class="pm-prev reset-pulse-sizing"><div class="pm-slide-count">1 / 3</div><i class="fa fa-angle-left"></i></span><span class="pm-next reset-pulse-sizing"><div class="pm-slide-count">1 / 3</div><i class="fa fa-angle-right"></i></span></nav><div class="pm-dots"><span class="pm-currentDot"></span><span class=""></span><span class=""></span></div><div id="pm-slider-progress-bar" style="display: none; width: 73%;"></div></div>
        
        </div>
        
 		<!-- SLIDER AREA end -->
        
        <!-- BODY CONTENT starts here -->
        
        <!-- Overview boxes -->
        
        <!-- Overview boxes end -->
        
        <!-- Menu filter system -->
        
        <!-- Menu filter system end -->
        
        <!-- Upcoming events filter system -->
        
        <!-- Upcoming events filter system end -->
        
        
        <!-- News filter system -->
        
        <!-- News filter system end -->
        
        
        <!-- BODY CONTENT end -->
        
        <div class="pm-fat-footer">
        	
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
                    	<img src="./images/vienna-logo.png" class="img-responsive" alt="Vienna Restaurant"> 
                        <p>
                        Vienna a premium restaurant theme designed for restaurant and bar owners. This theme features many practical elements such as a catering and event form, photo gallery, events system, blog system and a menu system. Vienna is also WordPress and Woocommerce ready and is designed on an 1170 grid for bootstrap 3.
                        </p>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
                      <h6>Recent Posts</h6>
                      <ul class="pm-recent-blog-posts">
                            <!-- Post -->
                            <li>
                                <div class="pm-recent-blog-post-thumb" style="background-image:url(img/posts/p1.jpg);"></div>
                                <div class="pm-recent-blog-post-details">
                                    <a href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">Picking the best spices and ingredients for your next dish</a>
                                    <p class="pm-comment-count"><i class="fa fa-comment"></i> 8 Comments</p>
                                </div>
                            </li>
                            <!-- Post end -->
                            <!-- Post -->
                            <li>
                                <div class="pm-recent-blog-post-thumb" style="background-image:url(img/posts/p2.jpg);"></div>
                                <div class="pm-recent-blog-post-details">
                                    <a href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">The secrets to creating the perfect Italian dish</a>
                                    <p class="pm-comment-count"><i class="fa fa-comment"></i> 12 Comments</p>
                                </div>
                            </li>
                            <!-- Post end -->
                            <!-- Post -->
                            <li>
                                <div class="pm-recent-blog-post-thumb" style="background-image:url(img/posts/p3.jpg);"></div>
                                <div class="pm-recent-blog-post-details">
                                    <a href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">The life and culture of Venice, Italy</a>
                                    <p class="pm-comment-count"><i class="fa fa-comment"></i> 4 Comments</p>
                                </div>
                            </li>
                            <!-- Post end -->
                        </ul>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
                      <h6>Flickr Gallery</h6>
                      
                      <div class="flickr_badge_wrapper clearfix">
                      
                      	<div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/1(1).jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/2(1).jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/3(1).jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/4(1).jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/5(1).jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/6.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/7.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/8.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/9.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/10.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/11.jpg">
                            </a>
                        </div>
                        
                        <div class="flickr_badge_image">
                            <a href="http://projects.pulsarmedia.ca/vienna/#">
                            	<span></span>
                                <i class="fa fa-search-plus"></i>
                            	<img width="63" height="63" title="" alt="A photo on Flickr" src="./images/12.jpg">
                            </a>
                        </div>
                        
                      
                      </div>
                      
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
                      <h6>Next Event</h6>        
                      
                      <div class="pm-event-widget-container">
                      	
                        <div class="pm-event-widget-img" style="background-image:url(img/events/1.jpg);">
                        	<div class="pm-event-widget-date-container">
                            	<p class="pm-event-widget-month">JUL</p>
                                <p class="pm-event-widget-day">28</p>
                            </div>
                        </div>
                        
                        <div class="pm-event-widget-desc">
                        	
                            <p class="pm-event-widget-desc-title">Live music performance</p>
                            
                            <p class="pm-event-widget-desc-excerpt">Nam pharetra diam eu dolor vestibulum volutpat. Aliquam non turpis non leo euismod sollicitudin. Pellentesque eget…<a href="http://projects.pulsarmedia.ca/vienna/#">{...}</a> </p>
                            
                        </div>
                        
                        <ul class="pm-event-widget-btns">
                        	<li><a href="http://projects.pulsarmedia.ca/vienna/#" class="pm-rounded-btn small pm-primary">More Info</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/#" class="pm-rounded-btn small pm-secondary"><i class="fa fa-facebook"></i> &nbsp;Fan page</a></li>
                        </ul>
                        
                      </div>
                                     
                    </div>
                </div>	
            </div>
            
        </div>
        
        <footer>
        
        	<div class="container">
                <div class="row">
                    
                   <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="pm-footer-social-info-container">
                            <h6>Follow us and stay connected!</h6>
                            <ul class="pm-footer-social-icons">
                                <li title="Twitter" class="pm_tip_static_top"><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-twitter tw"></i></a></li>
                                <li title="Facebook" class="pm_tip_static_top"><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-facebook fb"></i></a></li>
                                <li title="Google Plus" class="pm_tip_static_top"><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-google-plus gp"></i></a></li>
                                <li title="Linkedin" class="pm_tip_static_top"><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-linkedin linked"></i></a></li>
                                <li title="YouTube" class="pm_tip_static_top"><a href="http://projects.pulsarmedia.ca/vienna/#"><i class="fa fa-youtube yt"></i></a></li>
                            </ul>
                        </div>
                        
                   </div>
                   
                   <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="pm-footer-subscribe-container">
                            <h6>Subscribe to our newsletter</h6>
                            
                            <div class="pm-footer-subscribe-form-container">
                                <form action="http://projects.pulsarmedia.ca/vienna/#" method="post" id="pm-footer-subscribe">
                                    <input class="pm-footer-subscribe-field" type="text" placeholder="Email Address" value="">
                                    <div class="pm-footer-subscribe-submit-btn">
                                        <i class="fa fa-paper-plane"></i>
                                    </div>
                                </form>
                            </div>
                        </div>
                   </div>
                    
                </div>
            </div>	

                
        </footer>
                
        <div class="pm-footer-copyright">
        	
            <div class="container">
                <div class="row">
                    <div class="col-lg-5 col-md-5 col-sm-12 pm-footer-copyright-col">
                        <p>©2014 VIENNA. Produced by <a href="http://www.pulsarmedia.ca/" target="_blank">Pulsar Media</a></p>
                    </div>
                    <div class="col-lg-7 col-md-7 col-sm-12 pm-footer-navigation-col">
                        <ul class="pm-footer-navigation l_tinynav1" id="pm-footer-nav">
                            <li><a href="home.im">Home</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/menus.html">Menus</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/gallery.html">Gallery</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/events.html">Browse Events</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/news.html">News</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/store.html">Store</a></li>
                            <li><a href="http://projects.pulsarmedia.ca/vienna/catering.html">Catering</a></li>
                        </ul><select id="tinynav1" class="tinynav tinynav1"><option value="GO">MENU</option><option value="index.html">Home</option><option value="menus.html">Menus</option><option value="gallery.html">Gallery</option><option value="events.html">Browse Events</option><option value="news.html">News</option><option value="store.html">Store</option><option value="catering.html">Catering</option></select>
                    </div>
                </div>
            </div>
            
        </div>
    
    </div><!-- /pm_layout-wrapper -->
    
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="./js/jquery-2.1.1.min.js"></script>
    <script src="./js/jquery.viewport.mini.js"></script>
    <script src="./js/jquery.easing.1.3.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script src="./js/modernizr.custom.js"></script>
    <script src="./js/owl.carousel.js"></script>
    <script src="./js/main.js"></script>
    <script src="./js/jquery.tooltip.js"></script>
    <script src="./js/jquery.hoverPanel.js"></script>
    <script src="./js/superfish.js"></script>
    <script src="./js/hoverIntent.js"></script>
    <script src="./js/tinynav.js"></script>
    <script src="./js/jquery.stellar.js"></script>
    <script src="./js/countdown.js"></script>
    <script src="./js/theme-color-selector.js"></script>
	<script src="./js/wow.min.js"></script>
    <script src="./js/jquery.PMSlider.js"></script>
    <script src="./js/Show_faded_box.js"></script>
    <p id="back-top" class="visible-lg visible-md visible-sm" style="right: -70px;"> </p>
   
  

</body></html>