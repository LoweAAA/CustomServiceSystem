
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

