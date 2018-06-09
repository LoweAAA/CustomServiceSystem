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




 $(function () {  
    var picker1 = $('#datetimepicker1').datetimepicker({  
        format: 'YYYY-MM-DD',  
        locale: moment.locale('zh-cn'),  
        //minDate: '2016-7-1'  
    });  
    var picker2 = $('#datetimepicker2').datetimepicker({  
        format: 'YYYY-MM-DD',  
        locale: moment.locale('zh-cn')  
    });  
    //动态设置最小值  
    picker1.on('dp.change', function (e) {  
        picker2.data('DateTimePicker').minDate(e.date);  
    });  
    //动态设置最大值  
    picker2.on('dp.change', function (e) {  
        picker1.data('DateTimePicker').maxDate(e.date);  
    });  
});  


