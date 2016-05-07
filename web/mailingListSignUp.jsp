<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">

    <div class="container">
        <h2>Please Enter Sign Up Information</h2>
    </div>

    <form action="signUp" method="get" >

        <!-- Text input-->
        <div class="form-group">
            <label for="username">User Name:</label>
                <div class="row">
                    <div class="col-md-5">
                        <input id="username" type="text" class="form-control" name="username" />
                    </div>
                </div>
        </div>
        <div class="form-group">
            <label for="userpass">Password:</label>
                <div class="row">
                    <div class="col-md-5">
                        <input id="userpass" type="password" class="form-control" name="userpass">
                    </div>
                </div>
        </div>
        <div class="form-group">
            <label for="userpass1">Re-Enter Password:</label>
            <div class="row">
                <div class="col-md-5">
                    <input id="userpass1" type="password" class="form-control" name="userpass1">
                </div>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="firstname">First Name</label>
                <div class="row">
                    <div class="col-md-5">
                        <input id="firstname"  type="text" class="form-control" name="firstname">
                    </div>
                </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="lastname">Last Name</label>
                <div class="row">
                    <div class="col-md-5">
                        <input id="lastname"  type="text" class="form-control" name="lastname">
                    </div>
                </div>
        </div>
        <div class="form-group">
            <label for="email">Email Address:</label>
                <div class="row">
                    <div class="col-md-5">
                        <input id="email"  type="text" class="form-control" name="email">
                    </div>
                </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <div class="row">
                <div class="col-md-4">
                    <input type="submit" id="mailingListSignUp" class="btn btn-warning btn-primary-outline" value="Sign Up"/>
                </div>
            </div>
        </div>
    </form>
</div>

</body>
<c:import url="footer.jsp"/>
</html>