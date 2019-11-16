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
      href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.6/css/materialize.min.css"
    />
    <link
      href="https://fonts.googleapis.com/icon?family=Material+Icons"
      rel="stylesheet"
    />
    
  </head>
  <style>
  header, .main, footer {
    padding-left:350px;
    padding-top:100px;
    padding-right:60px;
  }
  @media only screen and(max-width: 992px){
    header, .main, footer{
      padding-left: 0;
    }
  }
  .mera_circle{
    margin-left:30px;
    margin-top:30px;
    height:200px;
    width:200px;
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
      

  }
  .grid{
      height:30px;
      background-color: white;
      margin:10px;
      
      
      
  }
  .grid-parent{
      
      
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
            <li><a href="MarkAttendanceController">Back</a></li>
            <li>
              <a
                a
                class="dropdown-button"
                data-beloworigin="true"
                data-hover="true"
                data-constrainwidth="false"
                href="#!"
                data-activates="dropdown2"
                >Notofications</a
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
                <div class="background " style="align-content: center;">
                  <img
                    src="DownloadImage"
                    alt=""
                    class="mera_circle circle"
                  />
                    <h6>&nbsp;</h6>
                  <h6 class="center-align white-text"style="font-size:18px;" ><b>${sessionScope.Faculty.getF_name()}</b> </br>
                    ${sessionScope.Faculty.getEmail()} 
                  </h6>
                  <h6>
                    &nbsp;
                  </h6>
                </div>
                
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
                      <li><a href="#">Mark Attendance</a></li>
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
                      <li><a href="StudentDetailList">Student_Details</a></li>
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
    <!------------------------side nav finished------------>
    <div class="main grey lighten-1">
            
      <div class="inner card-panel  hover">
            
          <h3 class="center-align  " style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">MARK ATTENDANCE</h3>
           <form name="MarkAttendance2" id="MarkAttendance2" action="MarkAttendanceController2">
          <div class="row">
                    <div class="col l6 offset-l3 m9 offset-m1">
                      <div class="card-panel teal">
                           <div class="input-field">
                               <i class="material-icons prefix white-text">library_books</i>
                          <select class="white-text " name="subject" id="subject" >
                          <option value="" ><b>Select Subject</b></option>
                          <c:forEach items="${requestScope.sublist}" var="sub">
                            <option value="${sub}">${sub}</option>
                            </c:forEach>
                            
                          </select>
                        </div>
                      </div>
                    </div>
                  </div>
                  
                  <div>&nbsp;</div>
                  
                  <div class="row grid-parent">
                        <div class="col s2 z-depth-2  grid"><i class=" material-icons teal-text">group</i><span> &nbsp; &nbsp; &nbsp;<b>${sessionScope.dept.dept_name}&nbsp;${sessionScope.dept.sec}&nbsp;${sessionScope.dept.sem}</b></span></div>
                        <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">date_range</i><span> &nbsp; &nbsp; &nbsp;<B>${sessionScope.tDate}</B></span></div>
                    </div>
                    <div class="divider teal"></div>
     <!------------------------------------------------------------------------------------------------->
                  
     
                  <table class=" z-depth-3 bordered highlight responsive-table " style=> 
<thead class="  teal-text">
    <th>S.no</th>
    <th>Enroll No</th>
    <th>Name</th>
    <th>log</th>
</thead>
	<c:forEach items="${requestScope.studentList}" var="stud" varStatus="loop">
<tr>
    <td>${loop.count}</td>
    <td>${stud.enrollno}<input type="hidden" value="${stud.s_id}" name="enroll${loop.count}" id="enroll${loop.count}" ></td>
    <td>${stud.s_name}</td>
    <td><input type="radio" class="with-gap" name="${loop.count}" id="${loop.count}a"value="1"><label for="${loop.count}a">P</label><input type="radio" class="with-gap" name="${loop.count}" id="${loop.count}d"value="0"><label for="${loop.count}d">A</label></td>
</tr>
</c:forEach>
               </table>
               <input type="hidden" value="${loop.count}" name="count" id="count" >
                  
                  <div>&nbsp;</div>
                  <button class="btn waves-effect waves-light" type="submit" value="submit" id="submit"name="submit">Submit
                        <i class="material-icons right">send</i>
                      </button>
                      </form>
      </div>
      
             
          
    
    </div>
               
                    

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
    