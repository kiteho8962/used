<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<sec:authorize access="isAuthenticated()">
    <sec:authentication property="principal" var="principal"/>
</sec:authorize>

<!DOCTYPE html>
<html lang="en">
<head>

    <!-- Basic Page Needs
    ================================================== -->
    <meta charset="UTF-8">
    <title>Aviato | E-commerce template</title>

    <!-- Mobile Specific Metas
    ================================================== -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Construction Html5 Template">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=5.0">
    <meta name="author" content="Themefisher">
    <meta name="generator" content="Themefisher Constra HTML Template v1.0">

    <!-- Favicon -->
    <link rel="shortcut icon" type="image/x-icon" href="/images/favicon.png" />

    <!-- Themefisher Icon font -->
    <link rel="stylesheet" href="/plugins/themefisher-font/style.css">
    <!-- bootstrap.min css -->
    <link rel="stylesheet" href="/plugins/bootstrap/css/bootstrap.min.css">

    <!-- Animate css -->
    <link rel="stylesheet" href="/plugins/animate/animate.css">
    <!-- Slick Carousel -->
    <link rel="stylesheet" href="/plugins/slick/slick.css">
    <link rel="stylesheet" href="/plugins/slick/slick-theme.css">

    <!-- Main Stylesheet -->
    <link rel="stylesheet" href="/css/style.css">
    <%-- JQuery --%>
    <script
            src="https://code.jquery.com/jquery-3.6.0.js"
            integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
            crossorigin="anonymous"></script>

</head>

<body id="body">

<!-- Start Top Header Bar -->
<section class="top-header">
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-xs-12 col-sm-4">
                <div class="contact-number">
                    <i class="tf-ion-ios-telephone"></i>
                    <span>010-2578-8962</span>
                </div>
            </div>
            <div class="col-md-4 col-xs-12 col-sm-4">
                <!-- Site Logo -->
                <div class="logo text-center">
                    <a href="/">
                        <!-- replace logo here -->
                        <svg width="135px" height="29px" viewBox="0 0 155 29" version="1.1" xmlns="http://www.w3.org/2000/svg"
                             xmlns:xlink="http://www.w3.org/1999/xlink">
                            <g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" font-size="40"
                               font-family="AustinBold, Austin" font-weight="bold">
                                <g id="Group" transform="translate(-108.000000, -297.000000)" fill="#000000">
                                    <text id="AVIATO">
                                        <tspan x="108.94" y="325">USED</tspan>
                                    </text>
                                </g>
                            </g>
                        </svg>
                    </a>
                </div>
            </div>
            <div class="col-md-4 col-xs-12 col-sm-4">
                <!-- Cart -->
                <ul class="top-menu text-right list-inline">
                    <li class="dropdown cart-nav dropdown-slide">
                        <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
                                class="tf-ion-android-cart"></i>Cart</a>
                        <div class="dropdown-menu cart-dropdown">
                            <!-- Cart Item -->
                            <div class="media">
                                <a class="pull-left" href="#!">
                                    <img class="media-object" src="/images/shop/cart/cart-1.jpg" alt="image" />
                                </a>
                                <div class="media-body">
                                    <h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
                                    <div class="cart-price">
                                        <span>1 x</span>
                                        <span>1250.00</span>
                                    </div>
                                    <h5><strong>$1200</strong></h5>
                                </div>
                                <a href="#!" class="remove"><i class="tf-ion-close"></i></a>
                            </div><!-- / Cart Item -->
                            <!-- Cart Item -->
                            <div class="media">
                                <a class="pull-left" href="#!">
                                    <img class="media-object" src="/images/shop/cart/cart-2.jpg" alt="image" />
                                </a>
                                <div class="media-body">
                                    <h4 class="media-heading"><a href="#!">Ladies Bag</a></h4>
                                    <div class="cart-price">
                                        <span>1 x</span>
                                        <span>1250.00</span>
                                    </div>
                                    <h5><strong>$1200</strong></h5>
                                </div>
                                <a href="#!" class="remove"><i class="tf-ion-close"></i></a>
                            </div><!-- / Cart Item -->

                            <div class="cart-summary">
                                <span>Total</span>
                                <span class="total-price">$1799.00</span>
                            </div>
                            <ul class="text-center cart-buttons">
                                <li><a href="/pages/cart" class="btn btn-small">View Cart</a></li>
                                <li><a href="/pages/checkout" class="btn btn-small btn-solid-border">Checkout</a></li>
                            </ul>
                        </div>

                    </li><!-- / Cart -->

                    <!-- Search -->
                    <li class="dropdown search dropdown-slide">
                        <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown"><i
                                class="tf-ion-ios-search-strong"></i> Search</a>
                        <ul class="dropdown-menu search-dropdown">
                            <li>
                                <form action="post"><input type="search" class="form-control" placeholder="Search..."></form>
                            </li>
                        </ul>
                    </li><!-- / Search -->

                    <!-- Languages -->
                    <li class="commonSelect">
                        <select class="form-control">
                            <option>EN</option>
                            <option>DE</option>
                            <option>FR</option>
                            <option>ES</option>
                        </select>
                    </li><!-- / Languages -->

                </ul><!-- / .nav .navbar-nav .navbar-right -->
            </div>
        </div>
    </div>
</section><!-- End Top Header Bar -->
<!-- Main Menu Section -->
<section class="menu">
    <nav class="navbar navigation">
        <div class="container">
            <div class="navbar-header">
                <h2 class="menu-title">Main Menu</h2>
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>

            </div><!-- / .navbar-header -->

            <!-- Navbar Links -->
            <div id="navbar" class="navbar-collapse collapse text-center">
                <ul class="nav navbar-nav">

                    <!-- Home -->
                    <li class="dropdown ">
                        <a href="/">Home</a>
                    </li><!-- / Home -->


                    <!-- Elements -->
                    <li class="dropdown dropdown-slide">
                        <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                           role="button" aria-haspopup="true" aria-expanded="false">Shop <span
                                class="tf-ion-ios-arrow-down"></span></a>
                        <div class="dropdown-menu">
                            <div class="row">

                                <!-- Basic -->
                                <div class="col-lg-6 col-md-6 mb-sm-3">
                                    <ul>
                                        <li class="dropdown-header">Pages</li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="/pages/shop">Shop</a></li>
                                        <li><a href="/pages/checkout">Checkout</a></li>
                                        <li><a href="/pages/cart">Cart</a></li>
                                        <li><a href="/pages/pricing">Pricing</a></li>
                                        <li><a href="/pages/confirmation">Confirmation</a></li>

                                    </ul>
                                </div>

                                <!-- Layout -->
                                <div class="col-lg-6 col-md-6 mb-sm-3">
                                    <ul>
                                        <li class="dropdown-header">Layout</li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="/pages/product-single">Product Details</a></li>
                                        <li><a href="/pages/shop-sidebar">Shop With Sidebar</a></li>

                                    </ul>
                                </div>

                            </div><!-- / .row -->
                        </div><!-- / .dropdown-menu -->
                    </li><!-- / Elements -->


                    <!-- Pages -->
                    <li class="dropdown full-width dropdown-slide">
                        <a href="#!" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="350"
                           role="button" aria-haspopup="true" aria-expanded="false">Pages <span
                                class="tf-ion-ios-arrow-down"></span></a>
                        <div class="dropdown-menu">
                            <div class="row">

                                <!-- Introduction -->
                                <div class="col-sm-3 col-xs-12">
                                    <ul>
                                        <li class="dropdown-header">Introduction</li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="/pages/regist">Product Regist</a></li>
                                        <li><a href="/pages/about">About Us</a></li>
                                        <li><a href="../../../../resources/error/404.jsp">404 Page</a></li>
                                        <li><a href="/pages/coming-soon">Coming Soon</a></li>
                                        <li><a href="/pages/faq">FAQ</a></li>
                                    </ul>
                                </div>

                                <!-- Contact -->
                                <div class="col-sm-3 col-xs-12">
                                    <ul>
                                        <li class="dropdown-header">Dashboard</li>
                                        <li role="separator" class="divider"></li>
                                        <li><a href="/pages/dashboard">User Interface</a></li>
                                        <li><a href="/pages/order">Orders</a></li>
                                        <li><a href="/pages/address">Address</a></li>
                                        <li><a href="/user/${principal.user.id}/profile-details">Profile Details</a></li>
                                        <li><a href="/logout">LogOut</a></li>
                                    </ul>
                                </div>

                                <!-- Mega Menu -->
                                <div class="col-sm-3 col-xs-12">
                                    <a href="../pages/shop.jsp">
                                        <img class="img-responsive" src="/images/shop/header-img.jpg" alt="menu image" />
                                    </a>
                                </div>
                            </div><!-- / .row -->
                        </div><!-- / .dropdown-menu -->
                    </li><!-- / Pages -->

                </ul><!-- / .nav .navbar-nav -->

            </div>
            <!--/.navbar-collapse -->
        </div><!-- / .container -->
    </nav>
</section>