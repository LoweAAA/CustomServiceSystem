function changeRightOne(){
	var x=document.getElementsByClassName("workbar-right-option-son");
	x[0].style.background="rgb(54,168,255)";
	x[1].style.background="rgb(242,242,247)";
	x[2].style.background="rgb(242,242,247)";
	x[0].style.color="white";
	x[1].style.color="black";
	x[2].style.color="black";
	var y=document.getElementsByClassName("workbar-right-option-entity");
	y[0].style.display="block";
	y[1].style.display="none";
	y[2].style.display="none";

}
function changeRightTwo(){
	var x=document.getElementsByClassName("workbar-right-option-son");
	x[1].style.background="rgb(54,168,255)";
	x[0].style.background="rgb(242,242,247)";
	x[2].style.background="rgb(242,242,247)";
	x[1].style.color="white";
	x[0].style.color="black";
	x[2].style.color="black";
	var y=document.getElementsByClassName("workbar-right-option-entity");
	y[0].style.display="none";
	y[1].style.display="block";
	y[2].style.display="none";
}
function changeRightThree(){
	var x=document.getElementsByClassName("workbar-right-option-son");
	x[2].style.background="rgb(54,168,255)";
	x[0].style.background="rgb(242,242,247)";
	x[1].style.background="rgb(242,242,247)";
	x[2].style.color="white";
	x[0].style.color="black";
	x[1].style.color="black";
	var y=document.getElementsByClassName("workbar-right-option-entity");
	y[0].style.display="none";
	y[2].style.display="block";
	y[1].style.display="none";
}






function changeLeftOne(){
	var x=document.getElementsByClassName("workbar-left-option-son");
	x[0].style.background="rgb(54,168,255)";
	x[1].style.background="rgb(242,242,247)";
	x[2].style.background="rgb(242,242,247)";
	x[0].style.color="white";
	x[1].style.color="black";
	x[2].style.color="black";
	var y=document.getElementsByClassName("workbar-left-option-entity");
	y[0].style.display="block";
	y[1].style.display="none";
	y[2].style.display="none";

}
function changeLeftTwo(){
	var x=document.getElementsByClassName("workbar-left-option-son");
	x[1].style.background="rgb(54,168,255)";
	x[0].style.background="rgb(242,242,247)";
	x[2].style.background="rgb(242,242,247)";
	x[1].style.color="white";
	x[0].style.color="black";
	x[2].style.color="black";
	var y=document.getElementsByClassName("workbar-left-option-entity");
	y[0].style.display="none";
	y[1].style.display="block";
	y[2].style.display="none";
}
function changeLeftThree(){
	var x=document.getElementsByClassName("workbar-left-option-son");
	x[2].style.background="rgb(54,168,255)";
	x[0].style.background="rgb(242,242,247)";
	x[1].style.background="rgb(242,242,247)";
	x[2].style.color="white";
	x[0].style.color="black";
	x[1].style.color="black";
	var y=document.getElementsByClassName("workbar-left-option-entity");
	y[0].style.display="none";
	y[2].style.display="block";
	y[1].style.display="none";
}
var ws;
        
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
 function send()
      {
       var data=document.getElementById('te').value;
       ws.send(data);
       var div1 = document.createElement('div');
       div1.innerHTML=data;
       div1.style.cssText="padding: 10px;height: 20px;color: white;background: rgb(0,170,236);font-size: 14px;margin-top: 20px;margin-right:20px;float:right;clear:both";
       var divtime=document.getElementById('time');

       divtime.parentNode.insertBefore(div1,divtime);
       document.getElementById('te').value="";
      }