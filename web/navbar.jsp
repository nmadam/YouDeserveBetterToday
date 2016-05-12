<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class = "navbar navbar-default"  role = "navigation">

    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">You Deserve Better Today</a>
        </div>

        <c:choose>
            <c:when test="${pageContext.request.isUserInRole('administrator')}">

            <ul class="nav navbar-nav">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="searchAuthor.jsp">Search Book</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="viewMailingList">View Mailing List</a></li>
                <li><a href="viewReviews">View Reviews</a></li>
                <li><a href="/logoutUser"><span class="glyphicon glyphicon-log-out"></span>Logout</a></li>

            </ul>
            </c:when>


        <c:otherwise>
            <ul class="nav navbar-nav">
                <li><a href="index.jsp">Home</a></li>
                <li><a href="searchAuthor.jsp">Search Book</a></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="contact.jsp"><span class="glyphicon glyphicon-envelope"></span>Contact Us</a></li>
                <li><a href="mailingListSignUp.jsp"><span class="glyphicon glyphicon-user"></span>Sign Up</a></li>
                <li><a href="/admin/admin.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
            </c:otherwise>
        </c:choose>
    </div>
</nav>