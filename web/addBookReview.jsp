<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">

    <div class="container">
        <h2 class="fancy-title">Please Add Your Book Review</h2>
    </div>

    <form action="addBookReview" method="get" >

        <!-- Text input-->
        <div class="form-group">
            <label for="title">Title:</label>
            <div class="row">
                <div class="col-md-5">
                    <input id="title" type="text" class="form-control" name="title" />
                </div>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="author">Author:</label>
            <div class="row">
                <div class="col-md-5">
                    <input id="author" type="text" class="form-control" name="author" />
                </div>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="rating">Rate the Book:</label>
            <div class="row">
                <div class="col-md-5">
                    <input id="rating" type="text" class="form-control" name="rating" />
                </div>
            </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
            <label for="bookComment">Comment on Book:</label>
            <div class="row">
                <div class="col-md-5">
                    <input id="bookComment" type="text" class="form-control" name="bookComment" />
                </div>
            </div>
        </div>

        <!-- Button -->
        <div class="form-group">
            <div class="row">
                <div class="col-md-4">
                    <input type="submit" id="addBookReview" class="btn btn-warning btn-primary-outline" value="Add Review"/>
                </div>
            </div>
        </div>

    </form>
</div>
</body>
<c:import url="footer.jsp"/>
</html>