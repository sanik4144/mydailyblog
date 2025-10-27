<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register - My Blog</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header>
    <h1>My Blog</h1>
    <nav>
      <a href="/">Home</a>
      <a href="loginPage">Login</a>
      <a href="regPage" class="active">Register</a>
    </nav>
  </header>

  <main class="form-container">
      <c:if test="${not empty failMsg}">
        <h4 style="color:red"> ${failMsg} </h4>
      </c:if>
    <h2>Create an Account</h2>
    <form action="postReg" method="post">
      <label>Full Name</label>
      <input type="text" name="name" required>

      <label>Email</label>
      <input type="email" name="email" required>

      <label>Password</label>
      <input type="password" name="password" required>

      <button type="submit">Register</button>
    </form>
    <p>Already have an account? <a href="loginPage">Login here</a>.</p>
  </main>

  <footer>
    <p>&copy; 2025 My Blog</p>
  </footer>
</body>
</html>
