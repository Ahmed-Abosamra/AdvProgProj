<?php
session_start();
if (!isset($_SESSION["Logged"])) {
    header('Location: Login.php');
}

$email = $_SESSION["Logged"];

$con = mysqli_connect("localhost", "root", "", "proj") or die("Error in connection");

$select = "SELECT * FROM users WHERE email = '$email'";
$result = mysqli_query($con, $select);

if (!$result) {
    die("Error: " . mysqli_error($con));
}

$row = mysqli_fetch_array($result);

$firstname = $row['firstname'];
$lastname = $row['lastname'];
$age = $row['age'];
$phone = $row['phone'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" href="PStyle.css">
</head>
<body>
    <div class="container">
        <h1>User Profile</h1>
        <label>First Name:</label>
        <p><?php echo $firstname; ?></p>

        <label>Last Name:</label>
        <p><?php echo $lastname; ?></p>

        <label>Age:</label>
        <p><?php echo $age; ?></p>

        <label>Phone:</label>
        <p><?php echo $phone; ?></p>
    </div>
</body>
</html>
