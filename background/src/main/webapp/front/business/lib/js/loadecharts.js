var myChart1 = echarts.init(document.getElementById('production'));
var myChart2 = echarts.init(document.getElementById("keywords"));
var myChart3 = echarts.init(document.getElementById('Evaluation'));
var count1=0;  
var count2=0;  
myChart1.setOption(option1);
myChart2.setOption(option2);
myChart3.setOption(option3);
$(document).ready(function(){
  $.post("../lib/php/get.php",{type:1},function(data,status){
      datas=[['production', 'last  month', 'two month ', 'three month ']].concat(JSON.parse(data).map(function(e){
        return [e.pro_id,e.one_ago,e.two_ago,e.three_ago];}));   
      myChart1.setOption({
          dataset: {
              source: datas
      }});
  });
    $.post("../lib/php/get.php",{type:2},function(data,status){
        datas=JSON.parse(data).map(function(e){ return {name:e.word_class,value:e.one_ago};});  
        myChart2.setOption({
            series : {
                name:'关键词',
                data:datas, 
            }}); });  
    $.post("../lib/php/get.php",{type:3},function(data,status){
      datas=[['servicer','socre']].concat(JSON.parse(data).map(function(e){
             return [e.service_id,e.one_ago];}));   
        myChart3.setOption({
          dataset: {
                source: datas
              }}); });
    $.post("../lib/php/get.php",{type:4},function(data,status){
        count1=JSON.parse(data)[0].online_count; //在线客服数
        count2=JSON.parse(data)[0].view_count;   //访问量
        //document.get……
    });


  }); 
