<jsp:include page="header.jsp"></jsp:include>

<form action="/register" method="post">
Name : <input type="text" name="name"/>
<br/>
Email : <input type="text" name="email"/>
<br/>
Mobile : <input type="text" name="mobile"/>
<br/>
Password : <input type="text" name="password"/>
<br/>
Role : <input type="radio" name="role" value="Student" /> Student
<input type="radio" name="role" value="Faculty"/> Faculty
<br/>
<input type="submit" value="save"/>
</form>
${sms}




<jsp:include page="footer.jsp"></jsp:include>
