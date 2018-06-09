source=[
    { name:'直接访问',value:335,},
    { name:'邮件营销',value:310},
    { name:'联盟广告',value:274},
    { name:'视频广告',value:235,},
    { name:'搜索引擎',value:400,}
];
option = {
backgroundColor: '#cccccc',
title: {
text: 'Style Pie',
left: 'center',
top: 20,
textStyle: {
    color: '#000000',
    fontSize:'20'
}
},

tooltip : {
trigger: 'item',
formatter: "{a} <br/>{b} : {c} ({d}%)"
},

visualMap: {
show: false,
min: 100,  //change min  and max
max: 600,
inRange: {
    colorLightness: [0, 1]
}
},
series : [
{
    name:'访问来源',
    type:'pie',
    radius : '60%',
    center: ['50%', '50%'],
    data:source.sort(function (a, b) { return a.value - b.value; }),
    roseType: 'radius',
    label: {
       textStyle:{
           color:'#000000'
       }
    },
    labelLine: {
        lineStyle: {
            color: '#02020280'
        },
        length: 15,
        length2: 20
    },
    itemStyle: {
        normal: {
            color: '#c23531',
            shadowBlur: 150,
            shadowColor: '#00000080'
        }
    },
    animationType: 'scale',
    animationEasing: 'elasticOut',
    animationDelay: function (idx) {
        return Math.random() * 200;
    }
}
]
};