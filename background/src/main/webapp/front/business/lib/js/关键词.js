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
