<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加用户</title>
<script  src="js/jquery.min.js"></script>
<script type="text/javascript">
function submitForm() {
	//$.post("advanceCheck.html",$('#mainForm').serialize(), function(data) {
	//	console.info(data);
	//});
	$.ajax({
		type: "POST",
		dataType: "json", 
		url : "addUserAction",
		data : $('#mainForm').serialize(),
		async : true,
		error : function(request) {
			alert("错误");
		},
		success : function(data) {
			console.info(data);
			if (data.code == 200) {
				alert(data.message);
			} else {
				alert(data.message);
			}
		}
	});
	return false;
}
</script>
</head>
<body>
        增加用户:
	<form action="#" method="post" onsubmit="return false" id="mainForm">
		用户名 : <input name="username" type="text" /><br />
		密码 : <input type="password" type="password" /><br />
		<button type="button" onClick="javascript:submitForm()">提交 </button>
	</form>
</body>
</html>