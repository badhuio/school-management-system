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
    
    
     <div class="Inputs">

	 	<h1>Class Name <input type="text" id="ClassName"></h1>
	    <h1>Section <input type="text" id="Section"></h1>
		<h1>Academic Year <input type="text" id="AcademicYear"></h1>
		<h1>Status <input type="text" id="Status"></h1>
		
		<input type="submit" id="Submit1">
		
	</div>

        <!-- Page header (breadcrumb / title) -->
        <section class="content-header">
            <div class="container-fluid">
                <div class="row mb-2">
                    <div class="col-sm-6">
                        <h1>Classes</h1>
                    </div>
                </div>
            </div>
        </section>

                       <!-- Example table card -->
                <div class="card">
                   
                    <div class="card-body">
                    
					<table id="userTable"  class="table table-bordered table-striped">
		                 <thead>
		                    <tr>
		                        <th>#</th>
		                        <th>Class Name</th>
		                        <th>Section</th>
		                        <th>Academic Year</th>
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
<script> var path="${pageContext.request.contextPath}"</script>
<script src="${pageContext.request.contextPath }/resource/js/script.js"></script>
<script src="${pageContext.request.contextPath}/resource/adminlte/plugins/jquery/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/adminlte/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resource/adminlte/dist/js/adminlte.min.js"></script>

</body>
</html>
