<?php 

$con=mysqli_connect("118.25.100.232","root","Aa123456","CustomerSurvice"); 
if (mysqli_connect_errno($con)) 
{ 
    echo "连接失败:".mysqli_connect_error(); 
} 
$res=array();
$result=$con->query("SELECT cs_evaluation_grade,count(cs_evaluation_grade) as evacount FROM cs_evaluation group by cs_evaluation_grade");
while($row = $result->fetch_assoc()) {
   if($row['cs_evaluation_grade']==0)  $row['cs_evaluation_grade']='不满意';
   else if($row['cs_evaluation_grade']==1)  $row['cs_evaluation_grade']='比较满意';
   else if ($row['cs_evaluation_grade']==2)   $row['cs_evaluation_grade']='满意';
    $res[]=$row;
}
echo json_encode($res);
mysqli_close($con);
?>

