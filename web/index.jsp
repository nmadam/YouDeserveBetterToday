<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

  <c:import url="head-tag.jsp"/>

<body>

  <c:import url="navbar.jsp"/>


  <div class="container-fluid">
      <h1 class="text-center fancy-title">You Deserve Better</h1><br>

      <div class="row">
          <div class="col-sm-4 center-block">
              <div class="img-responsive no-pad">
                  <img class="img-circle" src="backtoback.jpg" alt="Silouhette of Break Up" width="400" height="300">
                  <hr />
                  <h4 class="fancy-title text-center">&quot;You Deserve Better&quot;</h4>
                  <h4 class="text-center">Author: CJ LacLov</h4>
              </div>
          </div>


          <div class="col-sm-4">
              <div class="text-justify">
                  <blockquote> A toxic relationship can be as blatant as your partner having an affair or physically
                               abusing you, as confusing as your partner treating you kindly in front of others yet
                               making you doubt yourself or your reality in private, or as subtle as the unanticipated
                               desire to crawl into bed and sleep as soon as your partner walks in the door. Whether
                               your bruises are external or internal, there comes a time when you realize that
                               <span class="fancy-title">YOU DESERVE BETTER</span>. It may take you days, months,
                               or years to leave a bad relationship, but when you do, these words of encouragement
                               will remind you of your worth and your value; reminders that are critical after the
                               exhausting and often devastating impacts of a relationship that, simply put, is not good
                               for you.
                  </blockquote>
                  <blockquote>
                               &quot;You have suffered enough. You deserve so much more. Today is the day to take
                               control of your life and start living again.&quot;
                  </blockquote>
              </div>
          </div>

          <div class="col-sm-4">
              <div class="panel panel-success">
                  <div class="panel-heading text-center"><h2 class="fancy-title">Search for Books</h2></div>
                  <div class="panel-body">
                      <h4><a class = "href="#">Search for books similiar to <span class="fancy-title">&quot;YOU DESERVE BETTER.&quot;</span></a></h4>
                      <h4><a href="searchAuthor.jsp">Searh for <span class="fancy-title">&quot;OTHER.&quot;</span> inspirational books.</a></h4>
                      <h4><a href="addBookReview.jsp">Add a Book Review</a></h4>
                  </div>
              </div>
          </div>
      </div>
    </div>


</body>
  <c:import url="footer.jsp"/>
</html>