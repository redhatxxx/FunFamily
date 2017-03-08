/**
 * cookie操作
 * */
function loginaddcookie(){
	var username = document.getElementById("username").value;
	addcookie("username",username,10);
	alert(username);
	//window.open("http://127.0.0.1:8020/WebPractice/index.html");
}
function logoutdeletecookie(){
	delCookie("username");
}
function loginaddcookie(paramarry){
	alert("2"+paramarry);
	addcookie("username",paramarry,10);
	alert("3"+paramarry);
	//window.open("http://127.0.0.1:8020/WebPractice/index.html");
}
//添加cookie
function addcookie(paraname,paravalue,parahour){
	alert("4"+paraname+paravalue);
	var str = paraname+"="+escape(paravalue);
	alert("5"+str);
	if(parahour>0){
		var date = new Date();
		var ms = parahour*3600*1000;
		date.setTime(date.getTime()+ms);
		str+=";expires="+date.toGMTString();
	}
	document.cookie=str+";path=/";
	alert("cookie添加成功");
	getCookie("username");
}
//获取cookie
function getCookie(paraname){
	alert(paraname);
	var arrStr = document.cookie.split(";");
	alert(arrStr);
	for(var i=0;i<arrStr.length;i++){
		var tmp =arrStr[i].split("=");
		if(tmp[0]==paraname)
			return unescape(tmp[1]);
	}
	return "null";
}
//删除cookie;将指定名称的cookie的过期时间设置为已过去的时间，使其过期
function delCookie(paraname){
	alert("cookie删除");
	var datetime = new Date;
	datetime.setTime(datetime.getTime()-1000);
	document.cookie=paraname+"=a;expires="+datetime.toGMTString()+";path=/";
}
