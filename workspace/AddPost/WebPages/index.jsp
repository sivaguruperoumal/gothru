<%-- 
    Document   : Index
    Created on : Sep 26, 2013, 3:21:30 PM
    Author     : arunmozhi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="KeepGoing">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Keep Going</title>

        <script type="text/javascript">

        </script>
        <link rel="stylesheet" href="Content/Styles/bootstrap.css"/>
        <link rel="stylesheet" href="Content/Styles/bootstrap-responsive.css"/>
        <link rel="stylesheet" href="Content/Styles/MainPage.css"/>
        <script src="Scripts/Lib/Jquery/jquery-1.9.1.js"></script>
        <script src="Scripts/Lib/Angular/angular.js"></script>
        <script src="Scripts/Lib/Angular/angular-loader.js"></script>
        <script src="Scripts/Lib/Angular/angular-resource.js"></script>
        <script src="Scripts/Lib/Angular/bootstrap.js"></script>
        <script src="Scripts/KeepGoing.js"></script>
        <script src="Scripts/Directives/loginPartialBinder.js"></script>
        
    </head>
    <body>
<!--        <div id="topSpace" class=".header-empty-top"></div>
        <div id="menuBar"></div>
        <div id="banner"></div>
        <div id="content"></div>
        <div id="push"></div>
        <div id="footer"></div>-->
<div id="wrap">
            <div ng-cloak>
                <!-- NAVBAR-->

                <div class="navbar-wrapper">
                    <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
                    <div class="container">
                        <div class="navbar navbar-inverse">
                            <div class="navbar-inner">
                                <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
                                <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                    <span class="icon-bar"></span>
                                </button>
                                <a class="brand" href="#">
                                    <img style="max-width: 100px" src="Content/Images/KgLogoTry3.png"/>
                                </a>
                                <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
                                <div class="nav-collapse collapse" nav-highlight-active >
                                    <ul class="nav">
                                        <li data-match-route="/Home/Index" data-match-route-default=""><a href="#/Home">Home</a></li>
                                        <li data-match-route="/AboutUs"><a href="#/AboutUs">About Us</a></li>
                                        <li data-match-route="/Search"><a href="#/Search">Search posts</a></li>
                                        <li data-match-route="/Add post"><a href="#/CabbiePost">Cabbie Post</a></li>
<!--                                        <li class="dropdown">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Services <b class="caret"></b></a>
                                            <ul class="dropdown-menu">
                                                <li class="nav-header">Apartment Services</li>
                                                <li><a href="#">Apartments</a></li>
                                                <li><a href="#">Amenities provided</a></li>
                                                <li><a href="#">Maintenances</a></li>
                                                <li class="divider"></li>
                                                <li class="nav-header">Tenancy Services</li>
                                                <li><a href="#">Tenants</a></li>
                                                <li><a href="#">Rent Payments</a></li>
                                            </ul>
                                        </li>-->

                                    </ul>

                                    <div style="min-width:100px">

                                    </div>
                                    <script type="text/javascript">
                                        services.constant('UserName','<%= request.getSession().getAttribute("Login_UserName")%>');
                                    </script>

                                    <ul login-partial-binder="Account/LoginPartial" id="loginPartial" class="nav pull-right">

                                    </ul>
                                </div>
                                <!-- /.navbar-inner -->
                            </div>
                            <!-- /.navbar -->
                        </div>
                        <!-- /.container -->
                    </div>
                    <!-- /.navbar-wrapper -->
                </div>


                <!-- Header
        ================================================== -->

                <header class="header">
                    <!--<img src="" alt="">-->
                    <div class="container">
                        <div class="header-empty-top">
                            <br />
                        </div>
                        <div class="row-fluid">
                            <div class="span6">
                                <div class="header-caption">
                                    <h2>Keep Going</h2>
                                    <p class="lead hidden-phone">The system serves you as car pooling information...</p>
                                </div>
                            </div>
                            <div class="span4">
                                <div class="header-caption">
                                    <div>
                                        <a class="btn btn-large btn-success" href="#">Start your quest!</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </header>
                <!-- /.header -->

                <div class="content">
                    <div class="container">
                        <!-- To Check MVC Caching -->

                        <div ng-view>

                        </div>


                    </div>
                </div>

            </div>

            <div id="push">

            </div>
        </div>
        <%-- #wrap --%>

        <div id="footer">
            <div class="container">
                <div class="span2 offset2">
                    <h3>Keep going</h3>
                </div>
                <div class="span2">
                    <ul>
                        <li><a href="#">News</a></li>
                    </ul>

                </div>
                <div class="span2">
                    <ul>
                        <li><a href="/Home/About">About Us</a></li>
                        <li><a href="#">Partners</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </body>
</html>
