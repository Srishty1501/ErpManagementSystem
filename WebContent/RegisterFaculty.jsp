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
      height:1100px;
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
            <li><a href="AdminHomepage.jsp">Home</a></li>
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
                    src="DownloadImage"
                    alt=""
                    class="mera_circle circle" style="height:200px; width:200px;"
                  />
                  <h6>&nbsp;</h6>
                  <h6 class="center-align white-text" style="font-size:18px;"><b>${sessionScope.Admin.getAdmin_name()}</b></br>
                   ${sessionScope.Admin.getEmail()} 
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
                      <li><a href="AdminTotalStudentAttendance">Student Attendance</a></li>
                      <li><a href="AdminStudentDetailList">Student Report</a></li>
                      
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
    <div class="main grey lighten-1">
            
            <div class="inner card-panel  hover z-depth-4">
                <div class="row"><h4 class="center z-depth-3 teal white-text" style="line-height:55px;">
                        Register Faculty</h4></div>
                     <div class="row" style="padding-left:20px;padding-right:20px;border-radius:5%; margin-left:50px; margin-right:60px; margin-top:30px;">
                    
                            <form name="registration form" class="col s12 z-depth-3" style="border:1px solid teal;border-radius:2%;" action="RegisterFacultyController" method="post">
                                    <div class="row  black-text" style="padding-left:360px;"><div class=" white col l4" style="height:100px;width:130px;border-radius:5%; padding-left:55px;padding-right:30px;padding-top:15px;  "><img style="height:130px;width:130px" src="images/clglogo.png"></div></div>
                    <div class="row">&nbsp;</div>
                    <div class="row"><h5 class="center">Registration Form: </h5></div>
                    <div class="divider teal"></div>
                             <div>&nbsp;</div>
                                       
                                        <div   class="row">
                                <div class="input-field col s6">
                                        <i class="material-icons prefix black-text " 
                                        >person_add</i
                                      >    
                                  <input placeholder="UserName" id="f_username" name="f_username" type="text" class="validate">
                                  <label for="username">Faculty UserName</label>
                                  
                                </div>
                                 <div class="input-field col s6">
                                        <i class="material-icons prefix black-text " 
                                        >person_add</i
                                      >    
                                  <input placeholder="Placeholder" id="password" name="password" type="password" class="validate">
                                  <label for="password">Password</label>
                                  </div>
                                </div>
                              <div class="row">
                                  <div class="input-field col s6">
                                  <i class="material-icons prefix black-text">input</i>
                                  <input placeholder="Faculty Name" id="f_name" name="f_name" type="text" >
                                  <label for="f_name" class="black-text">Faculty Name</label>
                                  </div>
                                  <div class="input-field col s6"></div>
                             <div class="input-field col s6">
                                        <i class="material-icons prefix black-text">person_pin</i>
                                        <input placeholder="Department Name" id="dept_name" name="dept_name" type="text" >
                                        <label for="dept_name" class="black-text">Department Name</label>
                                        </div>
                                        <div class="input-field col s6"></div>
                                      </div>
                              <div class="row">
                                  <div class="input-field col s6">
                                        <i class="material-icons prefix black-text ">email</i >    
                                  <input placeholder="email" id="email" name="email" type="text" class="validate">
                                  <label for="email"  class="black-text">E-mail</label>
                                  </div>  
                                  <div class="input-field col s6">
                                        <i class="material-icons prefix black-text " 
                                        >phone</i
                                      >    
                                  <input placeholder="+91" id="phoneno"name="phoneno" type="text" class="validate">
                                  <label for="phoneno"  class="black-text">Mobile No.</label>
                                  </div>  
                              </div>
                              <div class="row">
                                <div class="input-field col s6">
                                <i class="material-icons prefix black-text ">perm_identity</i >  
                                    <input placeholder="YearOfJoining" id="yearofjoining" name="yearofjoining" type="text" class="validate">
                                  <label for="yearofjoining"  class="black-text">Year Of Joining</label>
                                 </div>
                                  <div class="input-field col s6">
                                <i class="material-icons prefix black-text ">perm_identity</i >  
                                    <input placeholder="DD/MM/YYYY" id="dob" type="text" name="dob" class="validate">
                                  <label for="dob"  class="black-text">DateOfBirth</label>
                                 </div>
                               </div>
                               <div class="row">
                                <div class="file-field input-field col s12">
      <div class="btn">
        <span>File</span>
        <input type="file">
      </div>
      <div class="file-path-wrapper">
        <input class="file-path validate" type="text" id="image" name="image" placeholder="upload profile image"value="">
        
      </div>
                </div></div>
                              
                           <button class="btn waves-effect waves-light" type="submit" name="action">Submit
                        <i class="material-icons right">send</i>
                      </button>
                      <div>&nbsp;</div>
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
    