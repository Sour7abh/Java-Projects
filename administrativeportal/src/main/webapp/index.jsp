<html>
<body>
<center><h2>Learners Academy</h2></center>
<center><h3>Admin Login</h2></center>
<form action="AdminControllerServlet" method="POST">  
        <div class="container">   
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <br/>
            <input type="text" placeholder="Enter Username" name="username" required>  
            <br/>
            <label>Password : </label>   
            <br/>
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/>
            <button type="submit">Login</button>   
            <br/>
            <input type="checkbox" checked="checked"> Remember me   
             
        </div>   
    </form>     
</body>
</html>
