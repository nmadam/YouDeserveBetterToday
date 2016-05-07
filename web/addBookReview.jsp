<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">
    <br /><br /><br />

    <form action="addBookReview" method="get" >

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="title">Book Title</label>
            <div class="col-md-2">
                <input id="title" name="title" type="text" placeholder="" class="form-control input-md">
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="author">Book Author</label>
            <div class="col-md-2">
                <input id="author" name="author" type="text" placeholder="" class="form-control input-md">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="rating">Rate the Book</label>
            <div class="col-md-2">
                <input id="rating" name="rating" type="text" placeholder="" class="form-control input-md">

            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label class="col-md-4 control-label" for="bookComment">Comment on Book</label>
            <div class="col-md-2">
                <input id="bookComment" name="bookComment" type="text" placeholder="" class="form-control input-md">

            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <div class="col-md-4">
                <input type="submit" id="addBookReview" class="btn btn-primary" value="Add Review"/>
            </div>
        </div>

        </fieldset>
    </form>
</div>
</body>
<c:import url="footer.jsp"/>
</html>