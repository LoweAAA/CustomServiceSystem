$(function(){
//产品问题  
var option1 = {
    title: {
        text:'产品问题',
        left:'30%'
    },
    legend: {
        right:'10%'
    },
    tooltip:{},
    xAxis:{
        type: 'category'
    },
    xAxis: {
        name:'月份',
        type:'category',
        nameTextStyle:{
            fontSize:16
        }
    },
    yAxis: {
        scale:true,
        name:'次数',
        minInterva:1,
        nameTextStyle:{
            fontSize:16
        }
    },
    dataZoom: {   
            type: 'slider', 
            start: 10,     
            end: 60         
    },
    series:[
       {  name:'一月前', type: 'bar',barMaxWidth:'50%',barMinHeight:50},
       {   name:'两月前', type: 'bar',barMaxWidth:'50%',barMinHeight:50},
       {   name:'三月前', type: 'bar',barMaxWidth:'50%',barMinHeight:50}
    ]
};

//关键词
  var option2 = {
    title: {
    text: '关键词统计',
    top:'10%',
    left: 'center',
    textStyle: {
    color: '#000000',
    fontSize:'20'
}
},

tooltip : {
trigger: 'item',
formatter: "{a} <br/>{b} : {c} ({d}%)"
},


series : {
    name:'关键词',
    type:'pie',
    hoverAnimation:false,
    radius : '60%',
    roseType:'radius',
    minAngle:10,
    center: ['50%', '50%'],
    data:[],
    label: {
       textStyle:{  
           color:'#000000'
       },
       fontSize:14
    },
    labelLine: {
        lineStyle: {
            color: '#02020280'
        },
        length: 15,
        length2: 20
    },
    animationType: 'scale',
    animationEasing: 'elasticOut',
    animationDelay: function (idx) {
        return Math.random() * 200;
    }
}
};
//客服评价
  
option3 = {
    title: {
        text: '客服评价统计',
        left:'center'
    },
    tooltip:{},
    xAxis:{
        name:'客服 ',
        type:'category'
    },
    yAxis:{
        name:'评分',
        scale:true,
      min:function(value) {return (value.min/20).toFixed(0)*10;}
    },
    dataZoom: {   
        type: 'slider', 
        start: 10,     
        end: 60         
    },
    series:{ 
        name:'evaluate', 
        type: 'bar',
        itemStyle: {
            normal: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#83bff6'},
                        {offset: 0.5, color: '#188df0'},
                        {offset: 1, color: '#188df0'}
                    ]
                )
            },
            emphasis: {
                color: new echarts.graphic.LinearGradient(
                    0, 0, 0, 1,
                    [
                        {offset: 0, color: '#2378f7'},
                        {offset: 0.7, color: '#2378f7'},
                        {offset: 1, color: '#83bff6'}
                    ]
                )
            }
        },
        barMaxWidth:'30%',
        barMinHeight:50
    }
};
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
});