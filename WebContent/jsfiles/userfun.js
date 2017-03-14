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
//删除用户
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
//用户注册
function userregister(){
	document.getElementById("userregisterform").submit();
}
//用户登录
function submituser(){
	var param = $("#loginform").serializeArray();
	$.ajax({
		type: "post",
		url:"/FunFamily/user/user_login",
		data:param
	});
}
//用户登出
function userlogout(){
	logoutdeletecookie("username");
	logoutdeletecookie("fun_u_uuid");
	setTimeout("javascript:location.href='/FunFamily/user/user_logout'", 0); 
	//window.location.href="/FunFamily/user/user_logout";  
}

function jumptouserinfo(){
	var uuid = getCookie("fun_u_uuid");
	setTimeout("javascript:location.href='/FunFamily/user/edit_userinfo?userId="+uuid+"'", 0); 
}