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