<a href="/manage"> back </a>
<!-- <a href="/testlogin"> back </a> -->


<h2>Change Password Page</h2>

<h4>User : ${sessionScope.userid}</h4>

<form method="post" action="updatepwd">
New Password : <input type="password" name="pwd"><br><br>

<input type="submit" value="Update Password">
</form>

<br>

<a href="userhome">Back</a>