<?php
session_start();
include_once 'server.php';
if(! $con)
{
    die('Connection Failed'.mysql_error());
}
mysqli_select_db($con,'admin');
$q = "SELECT * FROM tfeedback";
$result = mysqli_query($con,$q);
$num=mysqli_num_rows($result);
$a=1;
?>
<!DOCTYPE html>
<html>
<head>
<title>login</title>
<style>
body {background-color: #ffdead;  
}
.centered {
  text-align:center;
  font-family: Arial, Helvetica, sans-serif;
  font-size:31px;
    color:#ffdead;
    position: absolute;
    top: 80%;
    left: 50%;
    transform: translate(-50%, -50%);
}
.container {
    position: -webkit-sticky; /* Safari */
    position: sticky;
    list-style-type: none;
    overflow: hidden;
    background-color: #f3f3f3;
}
.container2{
  border-style: solid;
    border-width: 2px;
    border-color:#2e8b57;
}

.heading{
  text-align:center;
  font-family: Arial, Helvetica, sans-serif;
  color:#2e8b57;
}


.classadmin{
  text-align:center;
  padding:30px;
  font-family: Arial, Helvetica, sans-serif;
  color:#2e8b57;
  font-size:25px; 
}
ul {
    position: -webkit-sticky; /* Safari */
    position: sticky;
    top: 0;

    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    border: 1px solid #e7e7e7;
    background-color: #f3f3f3;
}

li {
    float: left;
    width:14%;
    font-size:20px;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
   color: #666;
    text-decoration: none;
}

li a:hover {
  color:white;
    background-color:#2e8b57 ;
}

.dropdown-content {
    display: none;
    
}

.dropdown:hover .dropdown-content {
    display: block;
}
.container4{
  border:3px solid #2e8b57;
  padding:10px;
  font-style: oblique;
  color:black;
  font-size:15px; 
}
.center{
  text-align:center;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td,th {
    border: 2px solid #2e8b57;
    text-align: left;
    padding: 8px;
}


tr:nth-child(even) {
    background-color: #dddddd;
}

</style>

</head>
<body>
<div class="container">
<img src="image.png" alt="Norway" height="330" width="100%">
<div class="centered" ><b>SCHOOL MANAGEMENT SYSTEM</b></div>
</div>
<div class="container2">
  <ul>  
  <li><a href="Mark_attendance.php">Upload Attendance</a></li>
  <li><a href="Mark_grades.php">Mark Grades</a></li>
  <li><a href="View_eventst.php">View Events/Notices</a></li>
<li><a href="View_feedbacktt.php">View my Feedback</a></li>
<li><a href="Give_complaints.php">Give Complaints</a></li>
<li><a href="Give_suggestionst.php">Give Suggestions</a></li>

  <li><a href="logout.php">Logout</a></li>
</ul>

</div>
<h2 class="heading">TEACHER FEEDBACK</h2>

<table>
<col width="30">
  <col width="170">
  <tr>
    <th>Teacher Name</th>
    <th>Feedback</th>
  </tr>
<?php 
while ($a <= $num){
$q = "SELECT * FROM tfeedback WHERE id= '$a'";
$result = mysqli_query($con,$q);
$row = mysqli_fetch_array($result);
$fb=$row['tfb'];
$name=$row['tname'];
if($name==$_SESSION['username']){
	


?>

<tr>
    <td><?php echo "$name"; ?></td>
    <td><?php echo "$fb"; ?></td>
  </tr>

<?php }$a=$a+1;} ?>
   
  </table>
 </body>
</html>

