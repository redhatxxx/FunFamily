/**
 * 
 */

function jumptologin(){
	//window.location.href='/FunFamily/user/login';
	setTimeout("javascript:location.href='/FunFamily/user/login'", 0); 
}

function deleteuser(id){
	alert(id);
	$.get("/FunFamily/user/deleteuser?userId="+id,function(result){
		if(result.flag=="1"){
			alert("删除成功");
			window.location.reload();
		}else{
			alert("删除失败");
		}
	});
}

function submituser(){
	var param = $("#loginform").serializeArray();
	$.ajax({
		type: "GET",
		url:"/FunFamily/user/user_login",
		data:param,
		success: function(data){
			alert("****");
			if(data.flag=="1"){
				alert("1"+data.showname+data.user_id);
				loginaddcookie(data.showname+data.user_id);
				setTimeout("javascript:location.href='/FunFamily/index'", 0); 
			}
			else{
				alert(data.errormsg);
				document.getElementById("login_message").style.color="red";
				document.getElementById("login_message").innerHTML=data.errormsg;
			}
		},
		error:function(data){
			alert("###");
			if(data.flag=="1")
				setTimeout("javascript:location.href='/FunFamily/user/welcome'", 0); 
			else
				$("#login_message").innerHTML="XXXXXX";
		}
	});
}