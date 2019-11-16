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
    padding-top:40px;
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
      height:900px;
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
    <!------------------------side nav finished------------>
    <div class="main grey lighten-1">
            
      <div class="inner card-panel  hover z-depth-4">
            <div class="carousel carousel-slider center z-depth-2" >
                    
                    <div class="carousel-item " href="#four!">
                
                            <img src="images/slide-bg10.jpg" style="height:400px;">
                          </div>
                    <div class="carousel-item amber white-text" href="#one!">
                      <h4>First Panel</h4>
                      <div class="row  black-text" style="padding-left:430px;"><div class=" white col l4" style="height:280px;width:300px;border-radius:5%"><img src="images/clglogo.png"></div></div>
                    </div>
                    <div class="carousel-item teal white-text" href="#two!">
                      <h2>Second Panel</h2>
                      <p class="white-text">This is your second panel</p>
                    </div>
                    <div class="carousel-item red lighten-2 white-text" href="#three!">
                      <h2>Third Panel</h2>
                      <p class="white-text">This is your third panel</p>
                    </div>
                    
                  </div> 
                   <h4 class="center z-depth-3 amber brown-text">ADMIN ACCOUNT</h4>    
                 <div class="container" style="padding-top: 30px;"> <div class="row"> <div class="col l6"><div class="card medium z-depth-5" style="border-radius:2%">
                        <div class="card-image waves-effect waves-block waves-light">
                          <img class="activator responsive-img" src="images/Admin2.jpg"style="border-radius:2%">
                        </div>
                        <div class="card-content">
                          <span class="card-title activator grey-text text-darken-4"><b>Admin</b><i class="material-icons right">more_vert</i></span>
                          <p><a href="#">ADMIN admin12345@gmail.com</a></p>
                        </div>
                        <div class="card-reveal teal">
                          <span class="card-title white-text text-darken-4"><i class="material-icons right">close</i>PROFILE:</span>
                           <table>
                          <tr>
                          <td><b>Name:</b></td>
                          <td>${sessionScope.Admin.getAdmin_name()}</td>
                          </tr>
                          <tr>
                          <td><b>Email:</b></td>
                          <td>${sessionScope.Admin.getEmail()}</td>
                          </tr>
                           <tr>
                          <td><b>Mobile No:</b></td>
                          <td>${sessionScope.Admin.getMobile()}</td>
                          </tr>
                          
                          </table>
                        </div>
                      </div></div>
                      <div class="col l6">
                    
                    </div></div></div>
      </div>
      </div>
               
                    

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
    