<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">
    <br /><br /><br />


    <form action="searchAuthor" method="get" >

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="Author First Name">Author First Name</label>
            <div class="col-md-3">
                <input id="Author First Name" name="Author First Name" type="text" placeholder="" class="form-control input-md">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="Author Last Name">Author Last Name</label>
            <div class="col-md-4">
                <input id="Author Last Name" name="Author Last Name" type="text" placeholder="" class="form-control input-md">

            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <div class="col-md-3">
                <input type="submit" id="Search" class="btn btn-primary" value="Search"/>
            </div>
        </div>

        </fieldset>
    </form>
</div>

</body>
<c:import url="footer.jsp"/>
</html>