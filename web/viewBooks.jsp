<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head-tag.jsp"/>

<body>

<c:import url="navbar.jsp"/>

<div class="container">
    <br /><br /><br /><br />

    <div class="table-responsive">
    <table class="table">
        <table
        <tbody>
            <c:forEach var="book" items="${books.book}">

                <tr>
                    <td>${book.isbn}</td>
                    <td><a href="${book.link}">${book.title}</a></td>
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