<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>

    <hr class="horizontal light mt-0 mb-2">
    <div class="w-auto  max-height-vh-100" id="sidenav-collapse-main" style="max-height:100vh; overflow-y:auto;">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link text-white active bg-gradient-primary" href="s-dashboard.jsp">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">dashboard</i>
            </div>
            <span class="nav-link-text ms-1">Dashboard</span>
          </a>
        </li>
        
        
        <li class="nav-item mt-3">
          <h6 class="ps-4 ms-2 text-uppercase text-xs text-white font-weight-bolder opacity-8">Account pages</h6>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " href="viewpendingservices.jsp">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">schedule</i>
            </div>
            <span class="nav-link-text ms-1">Pending Services</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " href="confirmedservices.jsp">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">check_circle</i>
            </div>
            <span class="nav-link-text ms-1">Confirm Services</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " href="completedservices.jsp">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">done</i>
            </div>
            <span class="nav-link-text ms-1">Completed Services</span>
          </a>
        </li>
        
        <li class="nav-item">
          <a class="nav-link text-white " href="s-profile.jsp?servicemanid=<%=session.getAttribute("servicemanid")%>">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">person</i>
            </div>
            <span class="nav-link-text ms-1">Profile</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link text-white " href="slogout.jsp">
            <div class="text-white text-center me-2 d-flex align-items-center justify-content-center">
              <i class="material-icons opacity-10">login</i>
            </div>
            <span class="nav-link-text ms-1">Log out</span>
          </a>
        </li>
       </ul>
    </div>
    
