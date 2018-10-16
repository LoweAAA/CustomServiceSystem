$(function() {
	var Accordion = function(el, multiple) {
		this.el = el || {};
		this.multiple = multiple || false;

		// Variables privadas
		var links = this.el.find('.link');
		// Evento
		links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown)
	}

	Accordion.prototype.dropdown = function(e) {
		var $el = e.data.el;
			$this = $(this),
			$next = $this.next();

		$next.slideToggle();
		$this.parent().toggleClass('open');

		if (!e.data.multiple) {
			$el.find('.submenu').not($next).slideUp().parent().removeClass('open');
		};
	}	

	var accordion = new Accordion($('#accordion'), false);
});


$(function(){
	var dom = document.getElementById("container");
        var myChart = echarts.init(dom);
        var app = {};
        option = null;
        app.title = '堆叠柱状图';

        option = {
            tooltip : {
                trigger: 'axis',
                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            legend: {
                data:['非常满意','比较满意','一般满意','不满意','很不满意']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    data : ['人工客服']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'非常满意',
                    type:'bar',
                    data:[1018]
                },
                {
                    name:'比较满意',
                    type:'bar',
                    data:[432]
                },
                {
                    name:'一般满意',
                    type:'bar',
                    data:[182]
                },
                {
                    name:'不满意',
                    type:'bar',
                    data:[102]
                },
                {
                    name:'很不满意',
                    type:'bar',
                    data:[110]
                }
            ]
        };
        if (option && typeof option === "object") {
            myChart.setOption(option, true);
        }
});

$(function(){
	var don = document.getElementById("question");
	var secondChart = echarts.init(don);
	var app = {};
	option = null;
	app.title = '堆叠条形图';

	option = {
	    tooltip : {
	        trigger: 'axis',
	        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
	            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
	        }
	    },
	    legend: {
	        data: ['智能客服正答量', '智能客服误答量','人工客服正答量','人工客服误答量']
	    },
	    grid: {
	        left: '3%',
	        right: '4%',
	        bottom: '3%',
	        containLabel: true
	    },
	    xAxis:  {
	        type: 'value'
	    },
	    yAxis: {
	        type: 'category',
	        data: ['第一周','第二周','第三周','第四周','第五周','第六周','第七周']
	    },
	    series: [
	        {
	            name: '智能客服正答量',
	            type: 'bar',
	            stack: '总量',
	            label: {
	                normal: {
	                    show: true,
	                    position: 'insideRight'
	                }
	            },
	            data: [622, 637, 542, 602, 422, 568, 580]
	        },
	        {
	            name: '智能客服误答量',
	            type: 'bar',
	            stack: '总量',
	            label: {
	                normal: {
	                    show: true,
	                    position: 'insideRight'
	                }
	            },
	            data: [120, 132, 101, 134, 90, 230, 210]
	        },
	        {
	            name: '人工客服正答量',
	            type: 'bar',
	            stack: '总量',
	            label: {
	                normal: {
	                    show: true,
	                    position: 'insideRight'
	                }
	            },
	            data: [322,237, 342, 102, 222, 268, 280]
	        },
	        {
	            name: '人工客服误答量',
	            type: 'bar',
	            stack: '总量',
	            label: {
	                normal: {
	                    show: true,
	                    position: 'insideRight'
	                }
	            },
	            data: [150, 212, 201, 154, 190, 220, 78]
	        }
	    ]
	};
	if (option && typeof option === "object") {
	    secondChart.setOption(option, true);
	}
});


$("#file").on("change",function(){  
            //截取路径，获取上传文件名  
            var urlArr = this.value.split("\\");  
            if (this && this.files && this.files[0]) {  
                document.getElementById("fileName").innerHTML = urlArr[urlArr.length-1];  
                var fileUrl = URL.createObjectURL(this.files[0]);  
                document.getElementById("fileImg").src = fileUrl;  
            }else{  
                //兼容IE9以下  
                document.getElementById("fileName").innerHTML = urlArr[urlArr.length-1];  
                document.getElementById("fileImg").style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";  
                document.getElementById("fileImg").filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = this.value;  
            }  
        }); 


function getObjectURL(file) {
    var url = null;
    if (window.createObjectURL != undefined) { // basic
        url = window.createObjectURL(file);
    } else if (window.URL != undefined) { // mozilla(firefox)
        url = window.URL.createObjectURL(file);
    } else if (window.webkitURL != undefined) { // webkit or chrome
        url = window.webkitURL.createObjectURL(file);
    }
    return url;
}
//用户的头像立即查看
$("#fileInput").change(function() {
    var objUrl = getObjectURL(this.files[0]);
    if (objUrl) {
        $("#headImg").attr("src", objUrl);
    }
});