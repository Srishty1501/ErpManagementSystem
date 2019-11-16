<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
            <li><a href="FacultyHomepage.jsp">Home</a></li>
            <li>
              <a
                a
                class="dropdown-button"
                data-beloworigin="tdue"
                data-hover="tdue"
                data-constdainwidth="false"
                href="#!"
                data-activates="dropdown2"
                >Notifications</a
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
                    src="DownloadImage"
                    alt=""
                    class="mera_circle circle" style="height:200px; width:200px;"
                  />
                  <h6>&nbsp;</h6>
                  <h6 class="center-align white-text" style="font-size:18px;"><b>${sessionScope.Faculty.getF_name()}</b></br>
                   ${sessionScope.Faculty.getEmail()} 
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
                      <li><a href="MarkAttendanceController">Mark Attendance</a></li>
                      <li><a href="UpdateAttendanceController">Update Attendance</a></li>
                      
                    </ul>
                  </div>
                </li>
                <li class="bold">
                  <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Marks</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="UpdateMarksController">Update Marks</a></li>
                      
                    </ul>
                  </div>
                </li>
                <li class="bold">
                  <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i> Report</a
                  >
                  <div class="collapsible-body">
                    <ul>
                      <li><a href="#">Student_Details</a></li>
                      <li><a href="TotalStudentAttendance">Student-Attendance</a></li>
                      
                    </ul>
                  </div>
                </li>
                 <li class="bold">
                  <a class="collapsible-header  waves-effect waves-teal"
                    ><i class="material-icons">dashboard</i>Student's Applications</a
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
    <!-----------------------------------------------Side Nav Finished---------------------------------------------->
    <div class="main grey lighten-1">
        <div class="inner card-panel  hover z-depth-4">
                <h3 class="center-align  " style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">Students Report</h3>
                <form name="StudentdetailList" id="StudentdetailList" action="StudentDetailList" method="post">
                <div class="row">
                        <div class="col l6 offset-l3 m9 offset-m1">
                          <div class="card-panel teal  ">
                            <div class="row">
                                <div class="input-field col s12">
                                    <i class="material-icons prefix white-text">create</i>   
                                    <input placeholder="department" id="dept" name="dept"type="text">
                                    <label for="Department" class="white-text">Department</label>
                                </div>
                            </div>  
                            <div class="row">
                               <div class="input-field col s6">
                                      <i class="material-icons prefix white-text">create</i>   
                                      <input placeholder="section" id="sec" name="sec"type="text" >
                                      <label for="sec" class="white-text">Sec</label>
                               </div>
                               <div class="input-field col s6">
                                    <i class="material-icons prefix white-text">create</i>   
                                    <input placeholder="Semester" id="sem" name="sem"type="text" >
                                    <label for="sem" class="white-text">Sem</label>
                             </div>
                               </div>
                               <div class="row center"><button class="btn white teal-text waves-effect waves-light" type="submit" value="submit" id="submit"name="submit">Submit
                        <i class="material-icons right">send</i>
                      </button></div>
                               </div></div></div></form>
 <!-----------------------------------------form khtm-------------------------------------------------------->
 <h4 class="center z-depth-3 amber white-text">REPORT</h4>
 <div class="divider teal"></div>  
 <!----------------------------------------------Table----------------------------------------------------------------->                            
 <div class="row">
        <div class="col s2 z-depth-2  black-text grid" style=""><i class=" material-icons teal-text">perm_contact_calendar</i><span> &nbsp; &nbsp; &nbsp;<b>${sessionScope.dept2}</b></span></div>
        <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">offline_pin</i><span> &nbsp; &nbsp; &nbsp;<B>${sessionScope.sec2}</B></span></div>
        <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">offline_pin</i><span> &nbsp; &nbsp; &nbsp;<B>${sessionScope.sem2}</B></span></div> </div>          
       
        <table class="bordered highlight centered responsive-table " style=>
                <thead class="  teal-text">
                        <th>S.no</th>
                        
                        <th>Name</th>
                        <th>Enroll No.</th>
                        <th>Father's Name</th>
                        <th>Email</th>
                        <th>Mobile No</th>
                        <th>DOB</th>
                        <th>More</th>
                    </thead> 
                    <c:forEach items="${sessionScope.studentDetailList1}" var="stud" varStatus="loop">
                    <tr>
                    <td>${loop.count}</td>
                    <td>${stud.enrollno} }</td>
                    <td>${stud.s_name}</td>
                    <td>${stud.fathername}</td>
                    <td>${stud.email}</td>
                    <td>${stud.phoneno}</td>
                    <td>${stud.dob}</td>
                    <td><form name="detail" id="detail" action="StudentDetail" method="post">
                    <input type="hidden" value="${stud.s_id}" id="student" name="student">
                    <input value="+" type="submit" class="btn-floating" name="more"></form></td>
</tr>
</c:forEach>

        </table>
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
    