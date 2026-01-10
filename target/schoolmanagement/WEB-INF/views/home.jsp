<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clinic System - AdminLTE</title>

    <!-- AdminLTE + Font Awesome CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/adminlte/plugins/fontawesome-free/css/all.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resource/adminlte/dist/css/adminlte.min.css">

    <!-- Optional: Google Font -->
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
</head>

<body class="hold-transition sidebar-mini layout-fixed">
<div class="wrapper">

    <!-- NAVBAR -->
    <nav class="main-header navbar navbar-expand navbar-white navbar-light">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#" role="button">
                    <i class="fas fa-bars"></i>
                </a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="${pageContext.request.contextPath}/" class="nav-link">Home</a>
            </li>
        </ul>

        <!-- Right navbar -->
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <span class="nav-link">Welcome Admin</span>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- MAIN SIDEBAR -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">

        <!-- Brand Logo -->
        <a href="${pageContext.request.contextPath}/" class="brand-link">
            <span class="brand-text font-weight-light">School Datas</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu">
                    <li class="nav-item">
                        <a href="${pageContext.request.contextPath}/" class="nav-link active">
                            <i class="nav-icon fas fa-tachometer-alt"></i>
                            <p>Dashboard</p>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="${pageContext.request.contextPath}/students" class="nav-link">
                            <i class="nav-icon fas fa-user-injured"></i>
                            <p>Students</p>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="${pageContext.request.contextPath}/classes" class="nav-link">
                            <i class="nav-icon fas fa-user-md"></i>
                            <p>Classes</p>
                        </a>
                    </li>
                    
                     <li class="nav-item">
                        <a href="${pageContext.request.contextPath}/fees" class="nav-link">
                            <i class="nav-icon fas fa-user-md"></i>
                            <p>Fees</p>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="${pageContext.request.contextPath}/transaction" class="nav-link">
                            <i class="nav-icon fas fa-calendar-check"></i>
                            <p>Transactions</p>
                        </a>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->

        </div>
        <!-- /.sidebar -->
    </aside>
    <!-- /.main-sidebar -->

    <!-- CONTENT WRAPPER -->
    <div class="content-wrapper">

        <!-- Page header (breadcrumb / title) -->
        <section class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1>Dashboard</h1>
                    </div>
                </div>
            </div>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="container-fluid">

                <!-- Example small card -->
                <div class="row">
                    <div class="col-lg-3 col-6">
                        <div class="small-box bg-info">
                            <div class="inner">
                                <h3>Students</h3>
                            </div>
                            <div class="icon">
                                <i class="fas fa-user-injured"></i>
                            </div>
                            <a href="${pageContext.request.contextPath}/students" class="small-box-footer">
                                More info <i class="fas fa-arrow-circle-right"></i>
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-6">
                        <div class="small-box bg-success">
                            <div class="inner">
                                <h3>Classes</h3>
                            </div>
                            <div class="icon">
                                <i class="fas fa-user-md"></i>
                            </div>
                            <a href="${pageContext.request.contextPath}/classes" class="small-box-footer">
                                More info <i class="fas fa-arrow-circle-right"></i>
                            </a>
                        </div>
                    </div>
                    
                    
                    <div class="col-lg-3 col-6">
                        <div class="small-box bg-info">
                            <div class="inner">
                                <h3>Fees</h3>
                            </div>
                            <div class="icon">
                                <i class="fas fa-user-injured"></i>
                            </div>
                            <a href="${pageContext.request.contextPath}/fees" class="small-box-footer">
                                More info <i class="fas fa-arrow-circle-right"></i>
                            </a>
                        </div>
                    </div>
                    
                    
                     <div class="col-lg-3 col-6">
                        <div class="small-box bg-success">
                            <div class="inner">
                                <h3>Transactions</h3>
                            </div>
                            <div class="icon">
                                <i class="fas fa-user-md"></i>
                            </div>
                            <a href="${pageContext.request.contextPath}/transaction" class="small-box-footer">
                                More info <i class="fas fa-arrow-circle-right"></i>
                            </a>
                        </div>
                    </div>
                    
                </div>
                
                
                
                
              
                

                <!-- Example table card -->
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title">Available Courses</h3>
                    </div>
                    <div class="card-body">
                    
					<table id="userTable"  class="table table-bordered table-striped">
		                 <thead>
		                    <tr>
		                        <th>#</th>
		                        <th>Class Name</th>
		                        <th>Selection</th>
		                        <th>Academic</th>
		                        <th>Status</th>
		                    </tr>
		                 </thead>
		                <tbody id="userTableBody">
		   
		                </tbody>
		            </table>
                    </div>
                </div>

            </div><!-- /.container-fluid -->
        </section>
        <!-- /.content -->

    </div>

</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->
<script src="${pageContext.request.contextPath}/resource/adminlte/plugins/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/adminlte/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/adminlte/dist/js/adminlte.min.js"></script>

</body>
</html>
