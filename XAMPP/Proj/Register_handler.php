<?php
$firstname = $_POST['firstname'];
$lastname = $_POST['lastname'];
$email = $_POST['email'];
$password = $_POST['password'];
$age = $_POST['age'];
$phone = $_POST['phone'];

$con = mysqli_connect("localhost","root","") or die("Error in connection");
$db = mysqli_select_db($con , "proj") or die("Error in DB");
$insert = "insert into users(firstname,lastname,email,password,age,phone)
values('$firstname','$lastname','$email','$password','$age','$phone')";
$result = mysqli_query($con , $insert);

if($result){
    echo"<h1>Successfuly</h1>";
    echo "<a href='Login.php'>Click here to login</a> ";
}
else 
echo "Error :" . mysqli_error($con);


?>