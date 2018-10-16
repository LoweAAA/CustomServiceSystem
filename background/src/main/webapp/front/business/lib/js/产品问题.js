
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

