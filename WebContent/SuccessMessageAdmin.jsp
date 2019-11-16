<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8" />
    <title>Untitled Document</title>
    <!-- Compiled and minified CSS -->
    <link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css"
  />
    <link
      href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet"
    />
    
  </head>
  <style>
  header, .main, footer {
    padding-left:320px;
    padding-top:100px;
    padding-right:40px;
  }
  @media only screen and(max-width: 992px){
    header, .main, footer{
      padding-left: 0;
    }
  }
  .mera_circle{
   
    border-radius: 50%;
    border: 3px solid white;

  }
  nav{
    height:80px;
    line-height: 80px;
  }
  .side-nav{
    width:280px;
  }
  .inner{
      height:800px;
      border-radius: 2%;
      padding-left: 0%;
      padding-right:0%;
    

      

  }
  .grid{
      height:30px;
      background-color: white;
      margin:10px;
      
}
  .user-view{
      height:320px;
  }
      
      
  
  </style>

  <body>
    <div class="navbar-fixed">
      <nav class="teal">
        <ul id="dropdown2" class="dropdown-content">
          <li><a href="#!">Book Cover Design</a></li>
          <li><a href="#!">Icon Design</a></li>
          <li><a href="#!">Poster Design</a></li>
          <li><a href="#!">Print Design</a></li>
          <li><a href="#!">Stationery Design</a></li>
          <li><a href="#!">Sticker Design</a></li>
          <li><a href="#!">T-Shirt Design</a></li>
          <li><a href="#!">Banner Design</a></li>
          <li><a href="#!">Magazine Design</a></li>
          <li><a href="#!">Business Cards</a></li>
          <li><a href="#!">Logo Design</a></li>
          <li><a href="#!">Brochures</a></li>
        </ul>
        <ul id="dropdown3" class="dropdown-content">
                <li><a href="#!">Change Password</a></li> 
        </ul>
        <div class="nav-wrapper">
          <a href="#" class="brand-logo center">Oriental Institute Of Science And Technology </a>
          <a href="#" data-activates="mobile-demo" class="button-collapse"
            ><i class="material-icons">menu</i></a
          >
          <ul class="right hide-on-med-and-down">
            <li><a href="Login.html">Log Out</a></li>
            <li>
              <a
                a
                class="dropdown-button"
                data-beloworigin="true"
                data-hover="true"
                data-constrainwidth="false"
                href="#!"
                data-activates="dropdown2"
                >Portfolio</a
              >
            </li>

            
            
            <li>
              <a class="dropdown-button"
              data-beloworigin="true"
              data-hover="true"
              data-constrainwidth="false"
              href="#!"
              data-activates="dropdown3"
                ><i class="material-icons large white-text "
                  >settings</i
                ></a
              >
            </li>
          </ul>
          <ul id="mobile-demo" class="side-nav fixed ">
            <li>
              <div class="user-view teal">
                
                <img
                    src="images/Admin2.jpg"
                    alt=""
                    class="mera_circle circle" style="height:200px; width:200px;"
                  />
                  <h6>&nbsp;</h6>
                  <h6 class="center-align white-text" style="font-size:18px;"><b>Admin</b></br>
                   admin12345@gmail.com
                  </h6>
                  <h6>
                    &nbsp;
                  </h6>
                
                                
                
              </div>
            </li>
            <li class="no-padding ">
              <ul class="collapsible collapsible-accordion">
                <li class="bold">
                 <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Register</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="RegisterStudentController">Register Student</a></li>
                      <li><a href="RegisterFacultyController">Register Faculty</a></li>
                      
                    </ul>
                  </div>
                </li>
                <li class="bold">
                   <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Report</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="TotalStudentAttendance">Student Attendance</a></li>
                      <li><a href="StudentDetailList">Student Report</a></li>
                      
                    </ul>
                  </div>
                 
                </li>
                
                <div class="divider"></div>
                
              </ul>
            </li>
          </ul>
        </div>
      </nav>
    </div>
    <!-- ------------------------------------------------------------------------------------------ -->
 <div class="main grey lighten-1">
            
      <div class="inner card-panel  hover z-depth-4">
      <h3 class="center-align  red-text" style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">SUCCESS</h3>
       <div class="row">
                      <div class="col l6 offset-l3 m9 offset-m1">
                        <div class="card-panel amber">
      
                   <div class="center Black-text" style="font-size:25px;"><P>${sessionScope.msg}</P></div>
                   <a href="${sessionScope.dispatcher}"
                class="waves-effect waves-light btn-large pulse teal white-text center"
              >
                <i class="material-icons left">near_me</i>Back
              </a>
              </div>
              </div>
              </div>
      </div>
      </div>
 <!-- ------------------------------------------------------------------------------------------ -->

 <script src="http://code.jquery.com/jquery-latest.min.js"></script>

    <!-- Compiled and minified JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>

 
      <script>
      $(document).ready(function() {
        
        $(".button-collapse").sideNav();
        $(".carousel.carousel-slider").carousel({
          fullWidth: true,
          indicators: true
        });
      });
    </script>
    
  </body>
</html>
    