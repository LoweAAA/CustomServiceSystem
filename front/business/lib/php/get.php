<?php 
$con=mysqli_connect("118.25.100.232","root","Aa123456","CustomerSurvice"); 
if (mysqli_connect_errno($con)) 
{ 
    echo "连接失败:".mysqli_connect_error(); 
} 
$res=array();
$result=$con->query("SELECT word_class,one_ago FROM keyword_stat");
while($row = $result->fetch_assoc()) {
    $res[]=$row;
}
echo json_encode($res);
mysqli_close($con);
?>

