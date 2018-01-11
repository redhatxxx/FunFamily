function jumptohomepage(){
	setTimeout("javascript:location.href='/FunFamily/index'", 0); 
}
function jumpmanager(){
	setTimeout("javascript:location.href='/FunFamily/reloadmanagerpage?param=0'", 0); 
}

function reloadbyparam(param){
	alert("XX");
	setTimeout("javascript:location.href='/FunFamily/reloadmanagerpage?param="+param+"'", 0); 
}
