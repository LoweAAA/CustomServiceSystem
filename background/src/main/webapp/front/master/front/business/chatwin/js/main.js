var ws;
var count=0;
function turnper(){
	var n=document.getElementsByClassName("chat-input");
	var x=document.getElementsByClassName("change");
	var y=document.getElementsByClassName("top-name");
	var h=document.getElementsByClassName("kefu-pic");
	var c=document.getElementsByClassName("chat-one");
	x[1].style.display="none";
	y[0].innerHTML="客服001";
	h[0].style.display="block"; 
	c[1].style.display="block";
     ws = new WebSocket("ws://localhost:8081");
               ws.onmessage = function (evt) 
      { 
         // document.getElementById('te').value=evt.data;
         var div1 = document.createElement('div');
         div1.innerHTML=evt.data;
         div1.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       var divtime=document.getElementById('time');

       divtime.parentNode.insertBefore(div1,divtime);
      }
}
 			function send()
               {	
               		var m=document.getElementsByClassName("panel");
               		var h=document.getElementsByClassName("kefu-pic");
               		if(document.getElementById('te').value==""){
               			alert("请在对话框输入聊天内容。");
               			return;
               		}
               		if(h[0].style.display=="block"){
               			var data=document.getElementById('te').value;
       					ws.send(data);
       					var div1 = document.createElement('div');
       					div1.innerHTML=data;
       					div1.style.cssText="padding: 10px;height: 20px;color: white;background: rgb(0,170,236);font-size: 14px;margin-top: 20px;margin-right:20px;float:right;clear:both";
       					var divtime=document.getElementById('time');
       					divtime.parentNode.insertBefore(div1,divtime);
       					document.getElementById('te').value="";
       					m[0].scrollTop=m[0].scrollHeight;
               		}
               		else{
               			var data=document.getElementById('te').value;
               			var div1 = document.createElement('div');
               			div1.innerHTML=data;
               			div1.style.cssText="padding: 10px;height: 20px;color: white;background: rgb(0,170,236);font-size: 14px;margin-top: 20px;margin-right:20px;float:right;clear:both";
       					var divtime=document.getElementById('time');
       					divtime.parentNode.insertBefore(div1,divtime);
       					document.getElementById('te').value="";
       					m[0].scrollTop=m[0].scrollHeight;
       					if(count==0){
       						if(div1.innerHTML=="SBT47"||div1.innerHTML=="sbt47"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="输入序号进行查询：1、产品信息 2、常见故障 3、产品使用 4、售后服务";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       							count=1;
       						}
       						else{
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="没有找到该产品，请核对产品型号是否正确。";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}	
       					}
       					else if(count==1){
       						if(div1.innerHTML=="1"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="产品名称：鑫安刷卡锁 优点：外壳金属保护,抗破坏,集成度高,稳定性好,功能强大.";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="2"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="输入序号进行查询：1、手指按在指纹窗口上，门锁没有反应 2、手指按在窗口上，门锁亮红灯，蜂鸣器响4短声 3、按下手指（或输入密码）时，红蓝灯交替闪 4、经常验证指纹失败";
         						div2.style.cssText="margin-top:20px;padding: 10px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;max-width:300px;word-wrap:break-word;word-break:break-all;overflow: hidden;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
      						 	count=2;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="3"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="使用方法详情请参照说明书";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="4"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="售后详情请拨打售后热线030-7788636";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else{
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="请输入正确的序号。";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						
       					}
       					else if(count==2){
       						if(div1.innerHTML=="1"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="1、先按一下“0”键再按下手指 2、用手指快速轻点两下窗口，再按下手指";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="2"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="这说明当前指纹与预先设定好的不相同，请使用有效的指纹";
         						div2.style.cssText="margin-top:20px;padding: 10px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;max-width:300px;word-wrap:break-word;word-break:break-all;overflow: hidden;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
      						 	count=2;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="3"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="请先取消反锁设置";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else if(div1.innerHTML=="4"){
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="请尝试以下方法：1、清洁手指 2、湿润手指 3、擦拭手指 4、清洁采集窗口";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       						else{
       							function a(){
       							var div2 = document.createElement('div');
         						div2.innerHTML="请输入正确的序号。";
         						div2.style.cssText="margin-top:20px;padding: 10px;height: 20px;color: #333;background: #e9f0ef;width: auto;display: inline;float: left;font-size: 14px;clear:both;margin-left:20px;";
       							var divtime=document.getElementById('time');
      						 	divtime.parentNode.insertBefore(div2,divtime);
      						 	m[0].scrollTop=m[0].scrollHeight;
       							}
       							setTimeout(a,1000);
       						}
       					}
       					

               		}
                	           	
               }



var z=0;
	var h=0;
	function clicksend(){
		var x=document.getElementsByClassName("chat-one");
		var y=document.getElementsByClassName("chat-two");
		var m=document.getElementsByClassName("panel");
		var n=document.getElementsByClassName("chat-input");
		var q=document.getElementsByClassName("right-entity");
		

		function a(){
			x[1].style.display='block';
		}

		function b(){
			x[4].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}
		function c(){
			x[5].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}
		function d(){
			x[6].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}
		function e(){
			x[7].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}
		function f(){
			x[8].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}
		function g(){
			x[9].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
		}



		if(n[0].value==''){

		}
		else if(h==0){
			q[2].innerHTML=n[0].value;
			y[2].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
			setTimeout(c,1000);
			h=1;
			// y[0].style.display="block";
		}
		else if(h==1){
			q[3].innerHTML=n[0].value;
			y[3].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
			setTimeout(d,1000);
			h=2;
			// y[0].style.display="block";
		}
		else if(h==2){
			q[4].innerHTML=n[0].value;
			y[4].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
			setTimeout(e,1000);
			h=3;
			// y[0].style.display="block";
		}
		else if(h==3){
			q[5].innerHTML=n[0].value;
			y[5].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
			setTimeout(f,1000);
			h=4;
			// y[0].style.display="block";
		}
		else if(h==4){
			q[6].innerHTML=n[0].value;
			y[6].style.display='block';
			m[0].scrollTop=m[0].scrollHeight;
			setTimeout(f,1000);
			h=5;
			// y[0].style.display="block";
		}
		else if(z==2){
			z=3;
		}
		else if(z==3){
			z=4;
		}
		else if(z==4){
			z=5;
		}
		n[0].value="";
	}
	function clickcom(){
		var x=document.getElementsByClassName("chat-one");
		var y=document.getElementsByClassName("chat-two");
		var m=document.getElementsByClassName("panel");
		var n=document.getElementsByClassName("chat-input");
		var q=document.getElementsByClassName("right-entity");
		x[2].style.display='block';
		m[0].scrollTop=m[0].scrollHeight;
	}

	function clickquesone(){
		var x=document.getElementsByClassName("chat-one");
		var y=document.getElementsByClassName("chat-two");
		var m=document.getElementsByClassName("panel");
		var n=document.getElementsByClassName("chat-input");
		var q=document.getElementsByClassName("right-entity");
		x[3].style.display="block";
		m[0].scrollTop=m[0].scrollHeight;
	}