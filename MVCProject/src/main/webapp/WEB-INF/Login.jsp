<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<style>
  body {
    font-family: Arial, sans-serif;
    background: linear-gradient(135deg, #74ebd5, #ACB6E5);
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 0;
  }

  .login-container {
    background-color: white;
    padding: 40px;
    border-radius: 12px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
    width: 320px;
  }

  .login-container h2 {
    text-align: center;
    margin-bottom: 24px;
    color: #333;
  }

  .login-container input[type="text"],
  .login-container input[type="password"] {
    width: 100%;
    padding: 12px;
    margin: 8px 0 20px 0;
    border: 1px solid #ccc;
    border-radius: 6px;
    font-size: 16px;
  }

  .login-container button {
    width: 100%;
    padding: 12px;
    background-color: #4CAF50;
    border: none;
    border-radius: 6px;
    color: white;
    font-size: 16px;
    cursor: pointer;
    transition: background-color 0.3s;
  }

  .login-container button:hover {
    background-color: #45a049;
  }

  .login-container p {
    text-align: center;
    margin-top: 15px;
    color: #666;
  }

  .login-container a {
    color: #4CAF50;
    text-decoration: none;
  }

  .login-container a:hover {
    text-decoration: underline;
  }
</style>
</head>

<body>
  <div class="login-container">
    <h2>Login</h2>
    <form action="login" method="post">  <%-- Forward form to Servlet or Controller named 'login' --%>
      <input type="text" name="username" placeholder="Enter Username" required>
      <input type="password" name="password" placeholder="Enter Password" required>
      <button type="submit">Login</button>
      <p>Don't have an account? <a href="register.jsp">Sign up</a></p>
      <p><a href="forgotPassword.jsp">Forgot password?</a></p>
    </form>
  </div>
</body>
</html>
