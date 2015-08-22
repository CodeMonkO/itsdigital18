<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>

<html lang="en" class=" js csstransforms csstransforms3d csstransitions">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon"
	href="http://projects.pulsarmedia.ca/vienna/favicon.png">

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
<link href="./css/theme-color-selector.css" type="text/css"
	rel="stylesheet">
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
	width: 69%;
	height: 640px;
	position: absolute;
	background: #FFFFFF;
	border: solid #000000 0px;
	z-index: 9;
	opacity: 1;
	font-family: arial;
	visibility: visible;
	overflow: scroll;
}
</style>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

<script type="text/javascript">
	var array = new Array();
	var array_str = new Array();
	function addToList() {
		var qty = document.getElementById('qty');
		var item = document.getElementById('item');
		if (qty.value != "" && item.value != "") {
			var array_str = item.value.split('|');
			array.push(array_str[0] + "," + qty.value + "," + array_str[1]
					+ "," + array_str[2]);
			var item = array_str[0];
			var amount = array_str[1].toString();
			var discount = array_str[2].toString();
			addRow(item, qty.value, amount, discount);
		} else {
			alert("Fields can't be left empty");
		}
	}
	function addRow(item, qty, amount, discount) {
		var tabNode = document.getElementById("datatable");
		var tBody = tabNode.getElementsByTagName("tbody")[0];
		var rows = tBody.getElementsByTagName("tr");
		var rowIndex = rows.length;
		var trNode = tabNode.insertRow(rowIndex);
		trNode.id = "rowID_" + rowIndex;

		tdNode = trNode.insertCell(0);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = rowIndex;

		tdNode = trNode.insertCell(1);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = item;

		tdNode = trNode.insertCell(2);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = qty;

		tdNode = trNode.insertCell(3);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = amount;

		tdNode = trNode.insertCell(4);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = discount;

		tdNode = trNode.insertCell(5);
		tdNode.width = '10%';
		tdNode.className = "script_data";
		tdNode.style.color = "0033FF";
		tdNode.innerHTML = "<img src=\"./images/red.gif\" align=\"absmiddle\" border=\"0\" width=\"15\" height=\"15\" onclick=\"javascript:removeRow("
				+ rowIndex + ")\"/>";
		document.getElementById('list').value = array;
		document.getElementById('item').value = "";
		document.getElementById('qty').value = "";

	}

	function removeRow(rowIndex) {
		array.splice(rowIndex - 1, 1);
		document.getElementById('list').value = array;
		var table = document.getElementById("datatable");
		var tBody = table.getElementsByTagName("tbody")[0];
		var rows = tBody.getElementsByTagName("tr");
		var row = rows[rowIndex];
		if (rows.length > 1) {
			tBody.removeChild(row);
			renameRows(tBody);
		} else {
			alert("You cannot delete the last remaining row");
		}
	}

	function renameRows(tBody) {
		var rows = document.getElementById('datatable').rows
		var row, tdNode, j, tdNodes;
		var tabNode = document.getElementById(tBody);

		for (var i = 0; i < rows.length; i++) {
			if (i == 0) {
				continue;
			}
			row = tabNode.getElementsByTagName('tr')[i];
			row.id = "rowID_" + i;

			tdNode = row.getElementsByTagName("td");

			tdNode = trNode.insertCell(0);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = rowIndex;

			tdNode = trNode.insertCell(1);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = document.getElementById('item').value;

			tdNode = trNode.insertCell(2);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = document.getElementById('qty').value

			tdNode = trNode.insertCell(3);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = document.getElementById('qty').value

			tdNode = trNode.insertCell(4);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = document.getElementById('qty').value

			tdNode = trNode.insertCell(5);
			tdNode.width = '10%';
			tdNode.className = "script_data";
			tdNode.style.color = "0033FF";
			tdNode.innerHTML = "<img src=\"./images/red.gif\" align=\"absmiddle\" border=\"0\" width=\"15\" height=\"15\" onclick=\"javascript:removeRow("
					+ rowIndex + ")\"/>";

		}
	}
</script>
</head>

<body>

	<!-- Mobile Menu -->
	<div class="pm-mobile-menu-overlay" id="pm-mobile-menu-overlay"></div>

	<div class="pm-mobile-global-menu" style="height: 4263px;">

		<div class="pm-mobile-global-menu-logo">
			<a href="http://projects.pulsarmedia.ca/vienna/index.html"><img
				src="./css/vienna-logo.png" alt="Vienna Restaurant"></a>
		</div>

		<div class="pm-mobile-global-menu-search">
			<form action="http://projects.pulsarmedia.ca/vienna/#" method="post">
				<input name="" type="text" class="pm-search-field-mobile"
					placeholder="Type Keywords...">
			</form>
		</div>

		<ul class="sf-menu pm-nav sf-js-enabled">

			<li><a href="home.im">Home</a></li>
			<li><a href="bookingform.im">Table Reservation</a></li>
			<li><a href="billingform.im">Billing</a></li>
			<li><a href="customerform.im">Checked-IN-Customers</a></li>
		</ul>

	</div>
	<div id="pm_layout_wrapper" class="pm-full-mode">
		<!-- Use wrapper for wide or boxed mode -->

		<!-- Search overlay -->
		<div class="pm-search-container" id="pm-search-container">

			<div class="container">
				<div class="row">
					<div class="col-lg-10 col-md-10 col-sm-10"></div>
					<div class="col-lg-2 col-md-2 col-sm-2">
						<ul class="pm-search-controls">
							<li><a href="http://projects.pulsarmedia.ca/vienna/#"><i
									class="fa fa-search"></i></a></li>
							<li><a href="http://projects.pulsarmedia.ca/vienna/#"
								id="pm-search-collapse"><i class="fa fa-times"></i></a></li>
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
							<p class="pm-address">
								<i class="fa fa-map-marker"></i> 4 Main Street, New York, NY
								02489
							</p>
							<p class="pm-contact">
								<i class="fa fa-mobile-phone"></i> 1-(800)-555-5555
							</p>
						</div>

					</div>

					<div
						class="col-lg-2 col-md-2 col-sm-6 visible-lg visible-md pm-book-event">
						<!-- <div class="pm-sub-menu-book-event">
                        	<a href="http://projects.pulsarmedia.ca/vienna/book-an-event.html">Book an Event <i class="fa fa-calendar"></i></a>
                        </div> -->
					</div>

					<div class="col-lg-5 col-md-5 col-sm-6">
						<ul class="pm-sub-navigation">
							<li>
								<div class="pm-dropdown pm-language-selector-menu">
									<div class="pm-dropmenu"></div>
									<div class="pm-dropmenu-active">
										<ul>
											<li><a href="http://projects.pulsarmedia.ca/vienna/#">English</a></li>
											<li><a href="http://projects.pulsarmedia.ca/vienna/#">Italian</a></li>
										</ul>
									</div>
								</div>
							</li>
							<li><a href="updateprofile.im">Update&nbsp;Profile</a></li>
							<li><a href="signout.im">Sign&nbsp;Out</a></li>
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
							<a href="http://projects.pulsarmedia.ca/vienna/index.html"><img
								src="./images/vienna-logo.png"
								class="img-responsive pm-header-logo" alt="Vienna Restaurant"></a>
						</div>

						<div class="pm-header-mobile-btn-container">
							<!--<button type="button" class="navbar-toggle pm-main-menu-btn" id="pm-main-menu-btn" data-toggle="collapse" data-target=".navbar-collapse"><i class="fa fa-bars"></i></button>-->
							<button type="button" class="navbar-toggle pm-main-menu-btn"
								id="pm-mobile-menu-trigger">
								<i class="fa fa-bars"></i>
							</button>
						</div>

					</div>

					<div class="col-lg-8 col-md-8 col-sm-8 pm-main-menu">

						<nav class="navbar-collapse collapse">

							<ul class="sf-menu pm-nav sf-js-enabled">
								<li><a href="home.im">Home</a></li>
								<li><a href="bookingform.im">Table Reservation</a></li>
								<li><a href="billingform.im">Billing</a></li>
								<li><a href="customerform.im">Checked-IN-Customers</a></li>
							</ul>

						</nav>

					</div>
					<div id="bind">
						<div id="popupbox">
							<div id="deviceId3">
								<!-- <div id="show"></div> -->
								<form:form action="customerform.im"
									modelAttribute="customerform" id="customerform">
									<div id="row">
										<button type="submit">Refresh</button>
									</div>
									<div id="row">
										<div id="text_setting">
											<table style="width: 100%">
												<tr>
													<td><b>Flag Number</b></td>
													<td><b>Customer Name</b></td>
													<td><b>Booking Src</b></td>
													<td><b>Event</b></td>
													<td><b>Billing Amount</b></td>
													<td><b>Payment Status</b></td>
												</tr>
												<tr></tr>

												<c:if test="${not empty usersEntity}">

													<c:forEach var="usersEntity" items="${usersEntity}">
														<%-- <li>${listValue}</li> --%>
														<tr>
															<td><span style="color: red; text-align: center">${usersEntity.fnumber}</span></td>
															<td><span style="color: red; text-align: center">${usersEntity.name}</span></td>
															<td><span style="color: red; text-align: center">${usersEntity.bookingmode}</span></td>
															<td><span style="color: red; text-align: center">${usersEntity.occasion}</span></td>
															<td><span style="color: red; text-align: center">${usersEntity.billamt}</span></td>
															<td><span style="color: red; text-align: center">${usersEntity.billpayed}</span></td>
														</tr>
													</c:forEach>
												</c:if>

											</table>
										</div>
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

			<div id="pm-slider" class="pm-slider"
				style="height: auto; opacity: 1;">



				<ul class="pm-slides-container" id="pm_slides_container"
					style="width: 300%; position: relative;">

					<!-- FULL WIDTH slides -->
					<li data-thumb="img/slider/1a.jpg" class="pmslide_0"
						style="height: 800px; width: 33.3333333333333%; display: block; background-image: url(./images/skins/2.jpg); background-position: 50% 50%;">

						<div class="pm-holder">
							<div class="pm-caption">
								<h1
									style="opacity: 1; margin-top: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									<span>Welcome to Fine Dine</span>
								</h1>
								<span class="pm-caption-decription"
									style="opacity: 1; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									Growing Majestically </span>
								<!-- <a href="http://projects.pulsarmedia.ca/vienna/menus.html" class="pm-slide-btn animated" style="opacity: 1; margin-top: 80px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">Unlock <i class="fa fa-chevron-right"></i></a> -->
							</div>
						</div>

					</li>

					<li data-thumb="img/slider/2a.jpg" class="pmslide_1"
						style="height: 800px; width: 33.3333333333333%; display: none; background-image: url(http://projects.pulsarmedia.ca/vienna/img/slider/slide2.jpg); background-position: 50% 50%;">

						<div class="pm-holder">
							<div class="pm-caption">
								<h1
									style="opacity: 0; margin-top: -50px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									<span>Witness the beauty</span>
								</h1>
								<span class="pm-caption-decription"
									style="opacity: 0; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									Browse our gallery and see what makes Vienna great! </span> <a
									href="http://projects.pulsarmedia.ca/vienna/gallery.html"
									class="pm-slide-btn animated"
									style="opacity: 0; margin-top: 200px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">View
									our Gallery <i class="fa fa-chevron-right"></i>
								</a>

							</div>
						</div>

					</li>

					<li data-thumb="img/slider/3a.jpg" class="pmslide_2"
						style="height: 800px; width: 33.3333333333333%; display: none; background-image: url(http://projects.pulsarmedia.ca/vienna/img/slider/slide3.jpg); background-position: 50% 50%;">

						<div class="pm-holder">
							<div class="pm-caption">
								<h1
									style="opacity: 0; margin-top: -50px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									<span>Book with us!</span>
								</h1>
								<span class="pm-caption-decription"
									style="opacity: 0; margin-left: 0px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">
									Book your next private party or event with Vienna </span> <a
									href="http://projects.pulsarmedia.ca/vienna/book-an-event.html"
									class="pm-slide-btn animated"
									style="opacity: 0; margin-top: 200px; transition: all 0.6s ease 0s; -webkit-transition: all 0.6s ease 0s;">Book
									Your Event Now <i class="fa fa-chevron-right"></i>
								</a>

							</div>
						</div>

					</li>

				</ul>

				<nav id="pm-nav-arrows">
					<span class="pm-prev reset-pulse-sizing"><div
							class="pm-slide-count">1 / 3</div> <i class="fa fa-angle-left"></i></span><span
						class="pm-next reset-pulse-sizing"><div
							class="pm-slide-count">1 / 3</div> <i class="fa fa-angle-right"></i></span>
				</nav>
				<div class="pm-dots">
					<span class="pm-currentDot"></span><span class=""></span><span
						class=""></span>
				</div>
				<div id="pm-slider-progress-bar" style="display: none; width: 73%;"></div>
			</div>

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
						<img src="./images/vienna-logo.png" class="img-responsive"
							alt="Vienna Restaurant">
						<p>Vienna a premium restaurant theme designed for restaurant
							and bar owners. This theme features many practical elements such
							as a catering and event form, photo gallery, events system, blog
							system and a menu system. Vienna is also WordPress and
							Woocommerce ready and is designed on an 1170 grid for bootstrap
							3.</p>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
						<h6>Recent Posts</h6>
						<ul class="pm-recent-blog-posts">
							<!-- Post -->
							<li>
								<div class="pm-recent-blog-post-thumb"
									style="background-image: url(img/posts/p1.jpg);"></div>
								<div class="pm-recent-blog-post-details">
									<a
										href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">Picking
										the best spices and ingredients for your next dish</a>
									<p class="pm-comment-count">
										<i class="fa fa-comment"></i> 8 Comments
									</p>
								</div>
							</li>
							<!-- Post end -->
							<!-- Post -->
							<li>
								<div class="pm-recent-blog-post-thumb"
									style="background-image: url(img/posts/p2.jpg);"></div>
								<div class="pm-recent-blog-post-details">
									<a
										href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">The
										secrets to creating the perfect Italian dish</a>
									<p class="pm-comment-count">
										<i class="fa fa-comment"></i> 12 Comments
									</p>
								</div>
							</li>
							<!-- Post end -->
							<!-- Post -->
							<li>
								<div class="pm-recent-blog-post-thumb"
									style="background-image: url(img/posts/p3.jpg);"></div>
								<div class="pm-recent-blog-post-details">
									<a
										href="http://projects.pulsarmedia.ca/vienna/blog-single-post.html">The
										life and culture of Venice, Italy</a>
									<p class="pm-comment-count">
										<i class="fa fa-comment"></i> 4 Comments
									</p>
								</div>
							</li>
							<!-- Post end -->
						</ul>
					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
						<h6>Flickr Gallery</h6>

						<div class="flickr_badge_wrapper clearfix">

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/1(1).jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/2(1).jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/3(1).jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/4(1).jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/5(1).jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/6.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/7.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/8.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/9.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/10.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/11.jpg">
								</a>
							</div>

							<div class="flickr_badge_image">
								<a href="http://projects.pulsarmedia.ca/vienna/#"> <span></span>
									<i class="fa fa-search-plus"></i> <img width="63" height="63"
									title="" alt="A photo on Flickr" src="./images/12.jpg">
								</a>
							</div>


						</div>

					</div>
					<div class="col-lg-3 col-md-6 col-sm-12 pm-widget-footer">
						<h6>Next Event</h6>

						<div class="pm-event-widget-container">

							<div class="pm-event-widget-img"
								style="background-image: url(img/events/1.jpg);">
								<div class="pm-event-widget-date-container">
									<p class="pm-event-widget-month">JUL</p>
									<p class="pm-event-widget-day">28</p>
								</div>
							</div>

							<div class="pm-event-widget-desc">

								<p class="pm-event-widget-desc-title">Live music performance</p>

								<p class="pm-event-widget-desc-excerpt">
									Nam pharetra diam eu dolor vestibulum volutpat. Aliquam non
									turpis non leo euismod sollicitudin. Pellentesque eget…<a
										href="http://projects.pulsarmedia.ca/vienna/#">{...}</a>
								</p>

							</div>

							<ul class="pm-event-widget-btns">
								<li><a href="http://projects.pulsarmedia.ca/vienna/#"
									class="pm-rounded-btn small pm-primary">More Info</a></li>
								<li><a href="http://projects.pulsarmedia.ca/vienna/#"
									class="pm-rounded-btn small pm-secondary"><i
										class="fa fa-facebook"></i> &nbsp;Fan page</a></li>
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
								<li title="Twitter" class="pm_tip_static_top"><a
									href="http://projects.pulsarmedia.ca/vienna/#"><i
										class="fa fa-twitter tw"></i></a></li>
								<li title="Facebook" class="pm_tip_static_top"><a
									href="http://projects.pulsarmedia.ca/vienna/#"><i
										class="fa fa-facebook fb"></i></a></li>
								<li title="Google Plus" class="pm_tip_static_top"><a
									href="http://projects.pulsarmedia.ca/vienna/#"><i
										class="fa fa-google-plus gp"></i></a></li>
								<li title="Linkedin" class="pm_tip_static_top"><a
									href="http://projects.pulsarmedia.ca/vienna/#"><i
										class="fa fa-linkedin linked"></i></a></li>
								<li title="YouTube" class="pm_tip_static_top"><a
									href="http://projects.pulsarmedia.ca/vienna/#"><i
										class="fa fa-youtube yt"></i></a></li>
							</ul>
						</div>

					</div>

					<div class="col-lg-6 col-md-6 col-sm-6">
						<div class="pm-footer-subscribe-container">
							<h6>Subscribe to our newsletter</h6>

							<div class="pm-footer-subscribe-form-container">
								<form action="http://projects.pulsarmedia.ca/vienna/#"
									method="post" id="pm-footer-subscribe">
									<input class="pm-footer-subscribe-field" type="text"
										placeholder="Email Address" value=""> <input
										class="pm-rounded-btn pm-primary" type="submit"
										value="Subscribe">
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
						<p>
							©2014 VIENNA. Produced by <a href="http://www.pulsarmedia.ca/"
								target="_blank">Pulsar Media</a>
						</p>
					</div>
					<div class="col-lg-7 col-md-7 col-sm-12 pm-footer-navigation-col">
						<ul class="pm-footer-navigation l_tinynav1" id="pm-footer-nav">
							<li><a href="home.im">Home</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/menus.html">Menus</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/gallery.html">Gallery</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/events.html">Browse
									Events</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/news.html">News</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/store.html">Store</a></li>
							<li><a
								href="http://projects.pulsarmedia.ca/vienna/catering.html">Catering</a></li>
						</ul>
						<select id="tinynav1" class="tinynav tinynav1"><option
								value="GO">MENU</option>
							<option value="index.html">Home</option>
							<option value="menus.html">Menus</option>
							<option value="gallery.html">Gallery</option>
							<option value="events.html">Browse Events</option>
							<option value="news.html">News</option>
							<option value="store.html">Store</option>
							<option value="catering.html">Catering</option></select>
					</div>
				</div>
			</div>

		</div>

	</div>
	<!-- /pm_layout-wrapper -->

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
	<p id="back-top" class="visible-lg visible-md visible-sm"
		style="right: -70px;"></p>



</body>
</html>