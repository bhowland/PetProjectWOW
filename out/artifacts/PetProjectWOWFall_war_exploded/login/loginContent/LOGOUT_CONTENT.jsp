
<!-- CONTENT -->
<div id="content">
  <div id="posts">
    <div class="post">
      <h2 class="title">Welcome to a WOW Pet Battle Page</h2>
      <div class="story">

        <%@ page session="true"%>

        User '<%=request.getRemoteUser()%>' has been logged out.

        <% session.invalidate(); %>

        <br/><br/>
        <a href="admin.jsp">Replay cow Level</a>

      </div>
    </div>
  </div>
</div>
