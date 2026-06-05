<jsp:include page="header.jsp"></jsp:include>

<form action="/contact" method="post">
Name : <input type="text" name="name"/>
<br/>
Email : <input type="text" name="email"/>
<br/>
Mobile : <input type="text" name="mobile"/>
<br/>
Message : <textarea name="message" rows="4" cols="30"></textarea>
<br/>
<input type="submit" value="save"/>
</form>
${sms}

<jsp:include page="footer.jsp"></jsp:include>
