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
    padding-top:40px;
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
      height:2000px;
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
  <script>
	function changeFun() {
			     
	 document.getElementById("updateAttendance").submit();}
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
                      <li><a href="#">Update Attendance</a></li>
                      
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
                      <li><a href="StudentDetaillist">Student_Details</a></li>
                      <li><a href="TotalStudentAttendance">Student-Attendance</a></li>
                      
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
      <h3 class="center-align  " style="font-family:-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif">UPDATE ATTENDANCE</h3>
        <form name="updateAttendance" id="updateAttendance" action="UpdateAttendanceController">
            <div class="row">
                      <div class="col l6 offset-l3 m9 offset-m1">
                        <div class="card-panel teal ">
                        <div class="row">
                             <div class="input-field col s6">
                                    <i class="material-icons prefix white-text">insert_invitation</i>   
                                    <input placeholder="dd/mm/yyyy" id="tDate" name="tDate"type="text" class="datepicker">
                                    <label for="tDate" class="white-text">Date</label>
                             </div>
                             
                             
                             <div class="input-field col s6">
                                    <i class="material-icons prefix white-text">library_books</i>   
                                    <input placeholder="sub" id="subject" name="subject"type="text">
                                    <label for="subject" class="white-text">subject</label>
                             </div>
                             </div>
                           
                           <div class="row">
                            <div class="input-field col s12">
                                <i class="material-icons prefix white-text">library_books</i>
                           <select class="white-text " name="category" id="category" onChange="changeFun();">
                             <option value="" ><b>Select Department</b></option>
                             <c:forEach items="${requestScope.deptlist}" var="cat">
                             <option value="${cat.dept_id}">${cat.dept_name}&nbsp;${cat.sec}&nbsp;${cat.sem}th sem</span></option>
                             </c:forEach>
                           </select>
                         </div>
                           </div>
                            <input type="hidden" value="not-edited" name="msg" id="msg" >
                             </div></div></div></form>
   <!-- --------------------------------------------------------------------------------------------------------- -->       
        <div>&nbsp;</div>
                  
                  <div class="row grid-parent">
                        <div class="col s2 z-depth-2  grid"><i class=" material-icons teal-text">group</i><span> &nbsp; &nbsp; &nbsp;<b>${sessionScope.dept.dept_name}&nbsp;${sessionScope.dept.sec}&nbsp;${sessionScope.dept.sem}</b></span></div>
                        <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">date_range</i><span> &nbsp; &nbsp; &nbsp;<B>${sessionScope.tDate}</B></span></div>
                   <div class="col s2 z-depth-2 grid"><i class=" material-icons teal-text">library_books</i><span> &nbsp; &nbsp; &nbsp;<B>${sessionScope.sub}</B></span></div>
                   
                    </div>
                    <div class="divider teal"></div>
  <!-- --------------------------------------------------------------------------------------------------------------- -->  
          <form name="updatedAttendance" id="updatedAttendance" action="UpdateAttendanceController">
          <table class=" z-depth-3 bordered highlight responsive-table " style=> 
<thead class="  teal-text">
    <th>S.no</th>
    <th>Enroll No</th>
    <th>Name</th>
    <th>log</th>
    <th>&nbsp;</th>
</thead>
	<c:forEach items="${requestScope.report}" var="report" varStatus="loop">
<tr>
    <td>${loop.count}</td>
    <td>${report.key.enrollno}<input type="hidden" value="${report.key.s_id}" name="enroll${loop.count}" id="enroll${loop.count}" ></td>
    <td>${report.key.s_name}</td>
    <td> <select class="black-text " name="${loop.count}" id="${loop.count}">
                             <option value="${report.value}" ><b>${report.value}</b></option>
                             <option value="P">P</option>
                             <option value="A">A</option>
                           </select></td>
</tr>
</c:forEach>
               </table>
               <input type="hidden" value="edited" name="msg" id="msg" >
                  
                  <div>&nbsp;</div>
                  <button class="btn waves-effect waves-light" type="submit" value="submit" id="submit"name="submit">Submit
                        <i class="material-icons right">send</i>
                      </button>
                      </form>             
      
      </div>
      </div>
    <!-- --------------------------------------------------- -->
     <script src="http://code.jquery.com/jquery-latest.min.js"></script>

    <!-- Compiled and minified JavaScript -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>

 
      <script>
      $(document).ready(function() {
        $(".button-collapse").sideNav(); 
        $("select").material_select();

         $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15, // Creates a dropdown of 15 years to control year,
    today: 'Today',
    clear: 'Clear',
    close: 'Ok',
    closeOnSelect: false, // Close upon selecting a date,
    container: undefined, // ex. 'body' will append picker to body
  });
      });
    </script>
    
  </body>
</html>
    