<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">


    <div class="container">
        <h2 class="text-info">Please Enter Login</h2>
    </div>

    <form action = "j_security_check" method = "post">

        <div class="form-group">
            <label for="username">User Name:</label>
            <div class="row">
                <div class="col-md-4">
                    <input id="username" type="text" class="form-control" name="j_username" />
                </div>
            </div>
        </div>
        <div class="form-group">
            <label for="userpass">Password:</label>
            <div class="row">
                <div class="col-md-4">
                    <input id="userpass" type="password" class="form-control" name="j_password">
                </div>
            </div>
        </div>
        <div class="form-group">
            <div class="row">
                <div class="col-md-4">
                    <input type="submit" id="login" class="btn btn-warning" value="Login"/>
                </div>
            </div>
        </div>
    </form>
</div>

</body>
<c:import url="footer.jsp"/>
</html>
