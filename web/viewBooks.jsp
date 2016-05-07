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
                <th>ISBN</th>
                <th>Title</th>
                <th>Published</th>
                <th>Description</th>
                <th>Cover Art</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="book" items="${books.book}">
                <tr>
                    <td>${book.isbn}</td>
                    <td><a target="_blank" href="${book.link}">${book.title}</a></td>
                    <td>${book.published}</td>
                    <td>${book.description}</td>
                    <td><img src="${book.imageUrl}" alt="Image of book"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
</div>


</body>
<c:import url="footer.jsp"/>
</html>