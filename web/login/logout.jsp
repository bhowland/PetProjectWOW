<%@ page session="true"%>

User '<%=request.getRemoteUser()%>' has been logged out.

<% session.invalidate(); %>

<br/><br/>
<a href="admin.jsp">Cow Level</a>
