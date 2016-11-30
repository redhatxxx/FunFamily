/**
 * 
 */

function showmsg(){
	alert("test");
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