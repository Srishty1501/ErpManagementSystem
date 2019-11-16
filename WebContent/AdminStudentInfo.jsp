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
    padding-left:350px;
    padding-top:60px;
    padding-right:60px;
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
      height:1600px;
      border-radius: 2%;
      padding-left: 0%;
      padding-right:0%;
}
.inner2{
    height:1300px;
      border-radius: 2%;
      margin-top:50px;
      margin-left:80px;
      margin-right:80px;
      border:1px solid teal;
      
}
  .grid{
      height:40px;
      background-color: white;
      margin-top:10px;
      margin-left:20px;
      
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
            <li><a href="AdminStudentDetailList">Back</a></li>
            <li>
              <a
                a
                class="dropdown-button"
                data-beloworigin="tdue"
                data-hover="tdue"
                data-constdainwidth="false"
                href="#!"
                data-activates="dropdown2"
                >Portfolio</a
              >
            </li>

            
            
            <li>
              <a class="dropdown-button"
              data-beloworigin="tdue"
              data-hover="tdue"
              data-constdainwidth="false"
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
                    src="images/Admin3.jpg"
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
    <!-----------------------------------------------Side Nav Finished---------------------------------------------->
    <div class="main grey lighten-1">
        <div class="inner card-panel  hover z-depth-4">
        <h3 class="center-align  " style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">Students Report</h3>
        <div class="card-panel inner2 z-depth-4 grey lighten-3">
                <div class="row center black-text" style="padding-left:340px;"><div class=" white col l4" style="height:180px;width:200px;border-radius:5%; padding-left:23px;padding-right:30px; padding-top:10px; "><img style="height:150px; width:150px;" src="images/clglogo.png"></div></div> 
                <div class="divider black">  </div>
                <div>&nbsp;</div>
                <table class="" style="">
                    <thead><th colspan="6" class="teal centered white-text z-depth-4"><h5 style="max-height: 15px; padding-left:350px;">${requestScope.student.s_name}</h5></th></thead>
                    <tr style="font-size:15px;">
                        <td colspan="1"class="black-text"><i class="material-icons prefix black-text">person_pin</i>&nbsp; &nbsp;<b>Enroll:</b></td>
                        <td colspan="5"><input type="text" id="enroll" name="enroll" value="${requestScope.student.enrollno}"></td>
                    </tr>
                    <tr style="font-size:15px;">
                            <td class="black-text"><i class="material-icons prefix black-text">perm_identity</i>&nbsp; &nbsp;<b>Department:</b></td>
                            <td><input type="text" id="dept" name="dept" value="${requestScope.department.dept_name}"></td>
                            <td class="black-text"><i class="material-icons prefix black-text">perm_identity</i>&nbsp; &nbsp;<b>Sec:</b></td>
                            <td><input type="text" id="sec" name="s
                            .0
                            ec" value="${requestScope.department.sec}"></td>
                            <td class="black-text"><i class="material-icons prefix black-text">edit</i>&nbsp; &nbsp;<b>Sem:</b></td>
                            <td><input type="text" id="sem" name="sem" value="${requestScope.department.sem}th"></td>
                        </tr>
                     <tr style="font-size:15px;">
                                <td colspan="1"class="black-text"><i class="material-icons prefix black-text">email</i>&nbsp; &nbsp;<b>Email:</b></td>
                                <td colspan="3"><input type="text" id="email" name="email" value="${requestScope.student.email}"></td>
                                <td colspan="1"class="black-text"><i class="material-icons prefix black-text">phone</i>&nbsp; &nbsp;<b>Mobile:</b></td>
                                <td colspan="1"><input type="text" id="mobile" name="mobile" value="${requestScope.student.phoneno}"></td>

                         </tr>  
                         <tr style="font-size:15px;">
                                <td colspan="1"class="black-text"><i class="material-icons prefix black-text">control_point_duplicate</i>&nbsp; &nbsp;<b>Category:</b></td>
                                <td colspan="3"><input type="text" id="cat" name="cat" value="${requestScope.student.category}"></td>
                                <td colspan="1"class="black-text"><i class="material-icons prefix black-text">date_range</i>&nbsp; &nbsp;<b>DOB:</b></td>
                                <td colspan="1"><input type="text" id="dob" name="dob" value="${requestScope.student.dob}"></td>

                         </tr>  
                    <tr style="font-size:15px;">
                                <td class="black-text"><i class="material-icons prefix black-text">perm_identity</i>&nbsp; &nbsp;<b>Father's Name:</b></td>
                                <td colspan="3"><input type="text" id="Fname" name="Fname" value="${requestScope.student.marks10}"></td>
                                <td class="black-text"><i class="material-icons prefix black-text">phone</i>&nbsp; &nbsp;<b>Father's No:</b></td>
                                <td><input type="text" id="Fno" name="Fno" value="${requestScope.student.marks12}"></td>
                        </tr>
                        <tr style="font-size:15px;">
                                <td colspan="1"class="black-text"><i class="material-icons prefix black-text">add_location</i>&nbsp; &nbsp;<b>Local Address:</b></td>
                                <td colspan="5"><input type="text" id="ladress" name="ladress" value="${requestScope.student.locaddress}"></td>
                            </tr>
                        <tr style="font-size:15px;">
                                    <td colspan="1"class="black-text"><i class="material-icons prefix black-text">add_location</i>&nbsp; &nbsp;<b>Permanent Address:</b></td>
                                    <td colspan="5"><input type="text" id="Padd" name="Padd" value="${requestScope.student.peraddress}"></td>
                            </tr> 

                       <tr><td colspan="6"><div class="divider black"></div></td></tr>
                       <tr><td colspan="6"><h5><b>Marks:</b></h5></td></tr>
                       <tr style="font-size:15px;">
                            <td class="black-text"><b>10th Marks:</b></td>
                            <td colspan="2"><input type="text" id="marks1" name="marks1" value="${requestScope.student.fathername}"></td>
                            <td class="black-text"><b>12th Marks:</b></td>
                            <td colspan="2"><input type="text" id="marks2" name="marks2" value="${requestScope.student.fatherphoneno}"></td>
                    </tr>
                </table> 
        </div>  
        </div>
    </div>    
    <!--------------------------------------------------main part-------------------------------------------->
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>

    <!-- Compiled and minified JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<script>
        $(document).ready(function() {
          $("select").material_select();
          $(".button-collapse").sideNav();
          $('.datepicker').pickadate();
        });
      </script>
</body>
</html>