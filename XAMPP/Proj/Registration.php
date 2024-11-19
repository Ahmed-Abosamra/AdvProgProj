<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up Page</title>
    <link rel="stylesheet" href="RStyle.css">
</head>
<body>
    <div class="container">
        <form class="signup-form" method="post" action="Register_handler.php">
            <h2>SignUp</h2>
            
            <label for="firstname">First Name</label>
            <input type="text" id="firstname" name="firstname" required>
            
            <label for="lastname">Last Name</label>
            <input type="text" id="lastname" name="lastname" required>
            
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required>
            
            <label for="age">Age</label>
            <input type="number" id="age" name="age" required>
            
            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone" required>
            
            <button type="submit">Sign Up</button>
        </form>
    </div>
</body>
</html>
