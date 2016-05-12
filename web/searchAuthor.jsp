<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">

    <a>${addErrorMessage}</a>

    <div class="container">
        <h2 class="fancy-title">Search for Your Favorite Author!</h2>
    </div>

    <form action="searchAuthor" method="get" >

        <!-- Text input-->
        <div class="form-group">
            <label for="author_First_Name">Author First Name</label>
            <div class="row">
                <div class="col-md-3">
                    <input id="author_First_Name" name="author_First_Name" type="text" placeholder="" class="form-control input-md">
                </div>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="author_Last_Name">Author Last Name</label>
            <div class="row">
                <div class="col-md-3">
                    <input id="author_Last_Name" name="author_Last_Name" type="text" placeholder="" class="form-control input-md">
                </div>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <div class="row">
                <div class="col-md-3">
                    <input type="submit" id="Search" class="btn btn-warning btn-primary-outline" value="Search"/>
                </div>
            </div>
        </div>

    </form>
</div>

</body>
<c:import url="footer.jsp"/>
</html>