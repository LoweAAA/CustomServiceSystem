<?php 
$x=$_POST['type'];
$con=mysqli_connect("118.25.100.232","root","Aa123456","CustomerSurvice"); 
if (mysqli_connect_errno($con)) 
{ 
    echo "连接失败:".mysqli_connect_error(); 
} 
$res=array();
if($x==1)   $result=$con->query("SELECT * FROM pro_ques_stat");
else if($x==2)  $result=$con->query("SELECT word_class,one_ago FROM keyword_stat");
else if($x==3)  $result=$con->query("SELECT service_id,one_ago FROM service_stat");
else if($x==4)  $result=$con->query("SELECT * FROM count");
while($row = $result->fetch_assoc()) {
    $res[]=$row;
}
echo json_encode($res);
mysqli_close($con);
?>

