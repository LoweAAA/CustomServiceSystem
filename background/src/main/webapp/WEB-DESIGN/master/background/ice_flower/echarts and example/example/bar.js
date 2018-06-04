source=[['one',12],['two',13],['three',10],['four',16],['five',14]];
option = {
    title: {
        text: 'Style Bar',
        left:'center'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend:{
        data:['item'],
        right:20
    },
    xAxis: {
         name:'name of x',
        data: source.map(function (item) {
            return item[0];
        })
    },
    yAxis: {
        name:'name of y'
    },
    series: {
        name: 'item',
        type: 'bar',
        barWidth:'40%',
        data: source.map(function (item) {
            return item[1];
        }),

    }
};

