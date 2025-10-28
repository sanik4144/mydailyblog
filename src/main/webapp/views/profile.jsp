<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>User Profile - My Blog</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header>
    <h1>My Blog</h1>
    <nav>
      <a href="/">Home</a>
      <a href="loginPage">Login</a>
      <a href="regPage">Register</a>
      <a href="profilePage" class="active">Profile</a>
    </nav>
  </header>

  <main class="profile-container">
    <h2>User Profile</h2>
    <div class="profile-card">
      <div class="profile-info">
        <p><strong>Name:</strong> <span id="userName">${userName}</span></p>
        <p><strong>Email:</strong> <span id="userEmail">${userEmail}</span></p>

        <input type="submit" value="Log Out">
      </div>
    </div>
  </main>

  <footer>
    <p>&copy; 2025 My Blog</p>
  </footer>
</body>
</html>
