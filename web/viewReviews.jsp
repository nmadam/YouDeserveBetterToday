<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">

    <div class="table-responsive">
        <table class="table">

            <thead>
            <tr>
                <th>Title</th>
                <th>Author</th>
                <th>Rating</th>
                <th>comment</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td>${book.bookTitle}</td>
                    <td>${book.bookAuthor}</td>
                </tr>

            </c:forEach>
            <c:forEach var="userBook" items="${UserBooks}">
                <tr>
                    <td>${userBook.rating}</td>
                    <td>${userBook.comment}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
<c:import url="footer.jsp"/>
</html>