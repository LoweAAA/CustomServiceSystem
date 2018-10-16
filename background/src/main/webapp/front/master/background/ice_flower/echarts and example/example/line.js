//二维数组，其余另说
source=[[2012,12],[2013,13],[2014,10],[2015,16],[2016,14]];
option = {
    title: {
        text: 'Style Line',
        left:'center'
    },
    tooltip: {
        trigger: 'axis'
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
        type: 'line',
        data: source.map(function (item) {
            return item[1];
        })
        /*
        markLine: {
            silent: true,
            data: [{
                yAxis: 12
                },{yAxis: 15
            }]
        }
        */
    }
};

