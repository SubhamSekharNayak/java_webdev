<jsp:include page="header.jsp" ></jsp:include>
<% String name=(String)session.getAttribute("name"); %>
<% String email=(String)session.getAttribute("email"); %>
Admin Dashboard
<hr />
welcome, <%=name %>
<jsp:include page="afooter.jsp" ></jsp:include> 