/**
 * 
 */

function jumptologin(){
	//window.location.href='/FunFamily/user/login';
	setTimeout("javascript:location.href='/FunFamily/user/login'", 0); 
}
function jumptoregister(){
	//window.location.href='/FunFamily/user/login';
	setTimeout("javascript:location.href='/FunFamily/user/register'", 0); 
}
function deleteuser(id){
	$.get("/FunFamily/user/deleteuser?userId="+id,function(result){
		if(result.flag=="1"){
			alert("删除成功");
			window.location.reload();
		}else{
			alert("删除失败");
		}
	});
}
//用户登录
function submituser(){
	var param = $("#loginform").serializeArray();
	$.ajax({
		type: "GET",
		url:"/FunFamily/user/user_login",
		data:param,
		success: function(data){
			if(data.flag=="1"){
				loginaddcookie(data);
				setTimeout("javascript:location.href='/FunFamily/index'", 0); 
			}
			else{
				document.getElementById("login_message").style.color="red";
				document.getElementById("login_message").innerHTML=data.errormsg;
			}
		},
		error:function(data){
			if(data.flag=="1")
				setTimeout("javascript:location.href='/FunFamily/user/welcome'", 0); 
			else
				$("#login_message").innerHTML="XXXXXX";
		}
	});
}
function userlogout(){
	logoutdeletecookie("username");
	logoutdeletecookie("fun_u_uuid");
	window.location.reload(true);
}

function jumptouserinfo(){
	var uuid = getCookie("fun_u_uuid");
	setTimeout("javascript:location.href='/FunFamily/user/edit_userinfo?userId="+uuid+"'", 0); 
}