<?php
$email = $_POST['email'];
$password = $_POST['password'];

$con = mysqli_connect("localhost","root","") or die("Error in connection");
$db = mysqli_select_db($con , "proj") or die("Error in DB");
$select = "select email,password from users where email ='$email' and password = '$password '";
$result = mysqli_query($con , $select);

$count = mysqli_num_rows($result);

if($count == 1 ){
    session_start();
    $_SESSION["Logged"] = $email ;
    header('location:Profile.php');
}
else{
    echo "<h1>Invalid Email And Password </h1>";
}


?>