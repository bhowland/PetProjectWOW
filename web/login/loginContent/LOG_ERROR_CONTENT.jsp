
<!-- CONTENT -->
<div id="content">
  <div id="posts">
    <div class="post">
      <h3 class="title">Name and/or Password</h3>
      <div class="story">
        <p>OH NO!!! There was in error somehow.
          <a href="/login/admin.jsp">Please relog with correct User Name and/or Password</a>
          <%@ page session="true"%>
          <% session.invalidate(); %>
        </p>
      </div>
    </div>
  </div>
</div>

<!-- END CONTENT -->