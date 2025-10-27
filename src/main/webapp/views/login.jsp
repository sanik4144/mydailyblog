<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login - My Blog</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header>
    <h1>My Blog</h1>
    <nav>
      <a href="/">Home</a>
      <a href="loginPage" class="active">Login</a>
      <a href="regPage">Register</a>
    </nav>
  </header>

  <main class="form-container">
    <c:if test="${not empty successMsg}">
       <h4 style="color:green"> ${successMsg} </h4>
     </c:if>
    <h2>Log In</h2>
    <form action="#" method="post">
      <label>Email</label>
      <input type="email" required>

      <label>Password</label>
      <input type="password" required>

      <button type="submit">Login</button>
    </form>
    <p>Dont have an account? <a href="regPage">Register here</a>.</p>
  </main>

  <footer>
    <p>&copy; 2025 My Blog</p>
  </footer>
</body>
</html>
