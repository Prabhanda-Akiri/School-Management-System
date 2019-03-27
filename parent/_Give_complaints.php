<?php
session_start();
include_once 'server.php';
if(! $con)
{
    die('Connection Failed'.mysql_error());
}
mysqli_select_db($con,'admin');


$name = $_SESSION['username'];
$sname=$_POST['names'];
$su = $_POST['suggestion'];

	$qy=" INSERT INTO complaints (names,namet,complaint) VALUES ('$sname' , '$name' , '$su')";
	mysqli_query($con,$qy);
	header('location:Give_complaints.php');

/*
if($row["username"]==$name && $row["password"]==$pass){
	header('location:Adminhome.php');
    //echo"You are a validated user.";
//$_SESSION['username']=$name;

}
   
else
    echo"Sorry, your credentials are not valid, Please try again.";
    header('location:Adminlogin.php');
*/
?>
