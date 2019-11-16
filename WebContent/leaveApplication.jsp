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
      height:1000px;
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
                >Notifications</a
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
                    src="DownloadImage"
                    alt=""
                    class="mera_circle circle" style="height:200px; width:200px;"
                  />
                  <h6>&nbsp;</h6>
                  <h6 class="center-align white-text" style="font-size:18px;"><b>${sessionScope.Student.getS_name()}</b></br>
                   ${sessionScope.Student.getEmail()} 
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
                    ><i class="material-icons">dashboard</i>Attendance</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="StudentTotalAttendance">View Total Attendance</a></li>
                      <li><a href="UpdateAttendanceController">Suject Attendance</a></li>
                      
                    </ul>
                  </div>
                </li>
                <li class="bold">
                  <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Marks</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="StudentViewMarks">View Marks</a></li>
                      
                    </ul>
                  </div>
                </li>
                <li class="bold">
                  <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Apply Applications</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="StudentDetailList">Medical Certificates</a></li>
                      <li><a href="TotalStudentAttendance">Leave Applications</a></li>
                      
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
                <div class="row"><h4 class="center z-depth-3 teal white-text" style="line-height:55px;">
                        Leave Application</h4></div>
                    <div class="row" style="margin-left:60px;margin-right:60px; border-radius:5%">
                            <form class="col s12 z-depth-3" style="padding-top:20px;" action="Registerstudent" method="post">
                            <div class="row"><h5 class="center">Oriental Institute Of Science And Technology, Bhopal </h5></div>
                              <div class="row  black-text" style="padding-left:400px;"><div class=" white col l4" style="height:100px;width:130px;border-radius:5%; padding-left:55px;padding-right:30px;  "><img style="height:100px;width:100px" src="images/clglogo.png"></div></div>
                    
                    
                    <div class="divider teal"></div>
                    <div class="con" style="padding-left: 20px; padding-right:20px;">
                                            <p>To,<br>
                            <br>
                        The HOD,<br>
                        <div class="row">
                        <input class="input-field col s1" type="text">
                        <div class="col s0">Department</div>
                        </div>
                    Oriental Institute of Science and Technology, Bhopal<br>
                <br>
                    <div class="row">
                   <div class="col s0">Date:</div>
                  
                        <input class="input-field col s2 datepicker" id="wdate" name="wdate" type="date">
                    
                    </div>
                    <br>
                    <div class="row">
                            <div class="col s0">Subject:</div>
                                <input class="input-field col s11" id="sub" name="sub" type="text">
                                </div>
                                <br>
                                Respected Sir/Madam,
                                <br>
                                <div class="row">
                                        <div class="col s0">I,</div>
                                            <input class="input-field col s4" id="name" name="name" type="text">
                                            <div class="col S6">, am a student of branch</div>
                                            <input class="input-field col s2" id="branch" name="branch" type="text">
                                            <div class="col S6">semester</div>
                                            <input class="input-field col s1" id="sem" name="sem" type="text">
                                            <div class="col S6">.</div>
                                            </div>
                                            <div class="row">
                                                    <div class="col s0">I am writing this application to inform you or bring to your notice that</div>    
                                                    <input class="input-field col s6" id="reason" name="reason" type="text">
                                                    </div>
                                                    <br>
                                                    <div class="row">
                                                   <div class= col s0> Sir, I would like to humbly request you to grant me leave from</div>
                                                   <div class="input-field col s1">
                                                   <input  id="fdate" name="fdate" type="text" class="datepicker">
                                                   </div>
                                                  <div class="col s0">to</div>
                                                  <div class="input-field col s1">
                                                        <input class="datepicker" id="tdate" name="tdate" type="text">
                                                        </div>
                                                    </div>
                                                        Thank You.
                                                        <br><br>
                                                       <div> Yours faithfully,</div>
                                                        <br>
                                                        <div class="row">
                                                            <div class="col s0">Name:</div>
                                                            <input type="text" class="input-field col s4" name="name">
                                                        </div>
                                                        <div class="row">
                                                        <div class="row col s0">Enrollment No.:</div>
                                                        <input type="text" class="input-field col s3" name="name">
                                                        <div class="row col s2"> &nbsp;</div>
                                                        <div class="row col s0">Submitted To: Name:-</div>
                                                        <input class="input-field col s3" type="text" name="f_name">
                                        
                                                    </div>
                                                    <div class="row">
                                                            <div class="row col s7"> &nbsp;</div>  
                                                            <div class="row col s0">Phone No.:-</div>
                                                            <input class="input-field col s3" type="text" name="f_name">
                                                    </div>
                                                        <button class="btn waves-effect waves-light" type="submit" name="action">Submit
                                                                <i class="material-icons right">send</i>
                                                              </button>
                </p>
                </div>
                </form>         
            </div> 
                    
                          
                        
            </div></div>
        

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
    