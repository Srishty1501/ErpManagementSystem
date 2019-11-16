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
    padding-top:100px;
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
.logo{
    background-image: url("images/clglogo.png");
    height:70px;
    width:70px;
    background-size: contain;
    padding-left: 15px;
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
<script>
	function changeFun() {
			     
	 document.getElementById("updateMarks").submit();}
</script>
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
          <a href="#" class="brand-logo center"><div class=" btn-floating large logo"></div>Oriental Institute Of Science And Technology </a>
          <a href="#" data-activates="mobile-demo" class="button-collapse"
            ><i class="material-icons">menu</i></a
          >
          <ul class="right hide-on-med-and-down">
            <li><a href="FacultyHomepage.jsp">Home</a></li>
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
                  <h6 class="center-align white-text"style="font-size:18px;" ><b>${sessionScope.Faculty.getF_name()}</b> </br>
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
                      <li><a href="#">Update Marks</a></li>
                      
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
                      <li><a href="TotalStudentAttendance">Time-Table</a></li>
                      
                    </ul>
                  </div>
                </li><li class="bold">
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
        <div class="inner card-panel  hover z-depth-4">
        <h3 class="center-align  " style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">Update Marks</h3>
        <form name="updateMarks" id="updateMarks" action="UpdateMarksController">
                <div class="row">
                          <div class="col l6 offset-l3 m9 offset-m1">
                            <div class="card-panel teal">
                                <div class="input-field">
                                    <i class="material-icons prefix white-text">create</i>
                                    <input placeholder="sub" id="subject" name="subject"type="text">
                                    <label for="sub" class="white-text">sub</label>
                            </div>
                              <div class="input-field">
                                    <i class="material-icons prefix white-text">create</i>
                               <select class="white-text " name="exam" id="exam" >
                                 <option value="" ><b>Select Exam Type</b></option>
                                 <option value="Mid-semester1">Mid-semester1</option>
                                 <option value="Mid-semester2" >Mid-semester2</option>
                                 <option value="Unit-Test1">Unit-Test1</option>
                                 <option value="Unit-Test2">Unit-Test2</option>
                               
                               </select>
                             </div>
                             
                             <div class="input-field">
                                     <i class="material-icons prefix white-text">library_books</i>
                                <select class="white-text " name="category" id="category" onChange="changeFun();" >
                                  <option value="" ><b>Select Department</b></option>
                                   <c:forEach items="${requestScope.deptlist}" var="cat">
                             <option value="${cat.dept_id}">${cat.dept_name}&nbsp;${cat.sec}&nbsp;${cat.sem}th sem</span></option>
                             </c:forEach>
                                </select>
                              </div>
                          </div>
                        </div>
                        </div> 
                        <input type="hidden" name="msg1" id="msg1" value="not-updated" >
                        </form>  
     <!--------------------------------------------------------------------------------------------------->                    
     <h4 class="center z-depth-3 amber brown-text">STUDENT LIST</h4>
     <div class="divider teal"></div>
     <div class="row grid-parent">
            <div class="col s2 z-depth-2  grid"><i class=" material-icons teal-text">offline_pin</i><span> &nbsp; &nbsp; &nbsp;<b>dept:${requestScope.dept.dept_name}&nbsp;${requestScope.dept.sec}&nbsp;${requestScope.dept.sem} </b></span></div>
            <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">offline_pin</i><span> &nbsp; &nbsp; &nbsp;<b>sub:${requestScope.sub}</B></span></div>
            <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">offline_pin</i><span> &nbsp; &nbsp; &nbsp;<B>${requestScope.exam}</B></span></div>
            
        </div>
     <!-- --------------------------------------------------------------------------------------------------------- -->
      <form name="updatedMarks2" id="updatedMarks2" action="UpdateMarksController">
     <table class="  z-depth-3 bordered highlight responsive-table " style=> 
            <thead class="  teal-text">
                <th>S.no</th>
                <th>Enroll No</th>
                <th>Name</th>
                <th>F.M</th>
                <th class="grey lighten-2">Marks Obtained</th>
            </thead>
            <c:forEach items="${requestScope.studentList}" var="stud" varStatus="loop">
<tr>
    <td>${loop.count}</td>
    <td>${stud.enrollno}<input type="hidden" value="${stud.s_id}" name="enroll${loop.count}" id="enroll${loop.count}" ></td>
    <td>${stud.s_name}</td>
    <td>20</td>
    
    <td> <input type="text" class="black-text " name="${loop.count}" id="${loop.count}" value="">
                             </td>
</tr>
</c:forEach>
          
            </table>
            <input type="hidden" value="updated" name="msg1" id="msg1" >
            <input type="hidden" value="${requestScope.sub}" name="sub" id="sub" >
            <input type="hidden" value="${requestScope.exam}" name="examtype" id="examtype" >
           
                  
                  <div>&nbsp;</div>
                  <button class="btn waves-effect waves-light" type="submit" value="submit" id="submit"name="submit">Submit
                        <i class="material-icons right">send</i>
                      </button>
            
            </form>
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