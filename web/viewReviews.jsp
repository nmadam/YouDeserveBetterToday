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
                <th class="fancy-title">Title</th>
                <th class="fancy-title">Author</th>
                <th class="fancy-title">Rating</th>
                <th class="fancy-title">comment</th>
            </tr>
            </thead>
            <tbody>
                <c:forEach var="book" items="${books}">
                    <c:forEach var="userBook" items="${userBooks}">
                    <c:choose>
                        <c:when test="${book.bookId.equals(userBook.bookId)}">
                            <tr>
                                <td>${book.bookId}</td>
                                <td>${book.bookTitle}</td>
                                <td>${book.bookAuthor}</td>
                                <td>${userBook.rating}</td>
                                <td>${userBook.comment}</td>
                            </tr>
                        </c:when>
                     </c:choose>
                    </c:forEach>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
<c:import url="footer.jsp"/>
</html>