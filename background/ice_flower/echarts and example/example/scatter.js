
var data = [
    [10.0, 8.04,'point1'],
    [8.0, 6.95,'point2'],
    [13.0, 7.58,'point3']
];

option = {
    backgroundColor: '#cdd0d5',
    title: {    
        text: 'title'
    },
    legend: {
        right: 10,
        data: ['1990']
    },
    xAxis: {
        title:'x'
    },
    yAxis: {
        title:'y',
        scale: true
    },
    series: {
        name: '1990',
        data: data,
        type: 'scatter',
        label: {
            emphasis: {
                show: true,
                formatter: function (param) {
                    return param.data[2];
                },
                position: 'top'
            }
        },
        itemStyle: {
                shadowBlur: 10,
                shadowColor: 'rgba(120, 36, 50, 0.5)',
                shadowOffsetY: 5,
                color: new echarts.graphic.RadialGradient(0.4, 0.3, 1, [{
                    offset: 0,
                    color: 'rgb(251, 118, 123)'
                }, {
                    offset: 1,
                    color: 'rgb(204, 46, 72)'
                }])
        }
    }
};