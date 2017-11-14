<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Foodies Application</title>
</head>
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body,h1,h5 {font-family: "Raleway", sans-serif}
body, html {height: 100%}
.bgimg {
    background-image: food.jpg;
    min-height: 100%;
    background-position: center;
    background-size: cover;
}

html { 
  background: food.jpg no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}
</style>
<body style="background-image: food.jpg">
<h5 style="font-family:Raleway;font-size: 100px;font-weight:bold;background-color: grey; ">Foodies</h5>
<div class="bgimg w3-display-container w3-text-white">
  <div class="w3-display-middle w3-jumbo w3-padding-jumbo">
    <p>logo</p>
  </div>
  <div class="w3-display-topleft w3-padding-jumbo w3-xlarge">
    
    <p><button onclick="document.getElementById('Login').style.display='block'" class="w3-btn w3-hover-light-grey">Login</button></p>
    <p><button onclick="document.getElementById('Admin').style.display='block'" class="w3-btn w3-hover-light-grey">Admin</button></p>
    <p><button onclick="document.getElementById('SignUp').style.display='block'" class="w3-btn w3-hover-light-grey">Sign Up</button></p>
  </div>
  <div class="w3-display-bottomleft w3-padding-jumbo">
   
  </div>
</div>




<!-- Contact Modal -->
<div id="Login" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom">
    <div class="w3-container w3-black">
      <span onclick="document.getElementById('Login').style.display='none'" class="w3-closebtn w3-xxlarge w3-hover-text-grey">x</span>
      <h1>Login</h1>
    </div>
    <div class="w3-container">
      <p>Login</p>
      <form action="userLoginServlet">
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="UserName" required name="username"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="password" placeholder="Password" name="password"></p>
        <p><button class="w3-btn w3-light-grey w3-padding" type="submit">SUBMIT</button></p>
      </form>
    </div>
  </div>
</div>
<div id="Admin" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom">
    <div class="w3-container w3-black">
      <span onclick="document.getElementById('Admin').style.display='none'" class="w3-closebtn w3-xxlarge w3-hover-text-grey">x</span>
      <h1>Admin</h1>
    </div>
    <div class="w3-container">
      <p>Admin</p>
      <form action="testServlet">
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="UserName" required name="adminName"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="password" placeholder="Password" name="password"></p>
        <p><button class="w3-btn w3-light-grey w3-padding" type="submit">SUBMIT</button></p>
      </form>
    </div>
  </div>
</div>
<div id="SignUp" class="w3-modal">
  <div class="w3-modal-content w3-animate-zoom">
    <div class="w3-container w3-black">
      <span onclick="document.getElementById('SignUp').style.display='none'" class="w3-closebtn w3-xxlarge w3-hover-text-grey">x</span>
      <h1>Sign Up</h1>
    </div>
    <div class="w3-container">
      <p>Sign Up</p>
      <form action="signUpLoginServlet">
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="UserName" required="required" name="username"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="password" placeholder="Password" name="password"></p>
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Mobile" name="mobile"></p>
        <p><button class="w3-btn w3-light-grey w3-padding" type="submit">SUBMIT</button></p>
      </form>
    </div>
  </div>
</div>
</body>
</html>