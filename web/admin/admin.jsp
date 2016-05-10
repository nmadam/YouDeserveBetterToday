<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="head-tagAdmin.jsp"/>

<html>

<head>
    <title>Admin</title>
</head>

<body>
<c:import url="navbarAdmin.jsp"/>

<div class="container-fluid">
    <h1 class="text-center fancy-title">You Deserve Better</h1><br>

    <div class="row">
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
            <div class="panel panel-success">
                <div class="panel-heading text-center"><h3>Administer Website</h3></div>
                <div class="panel-body">
                    <h4><a class="fancy-title" href="/admin/viewMailingList">View Mailing List</a></h4>
                    <br />
                    <h4><a class="fancy-title" href="/admin/viewReviews">View Reviews</a></h4>
                </div>
            </div>
        </div>
     </div>
</body>
<c:import url="footerAdmin.jsp"/>
</html>
