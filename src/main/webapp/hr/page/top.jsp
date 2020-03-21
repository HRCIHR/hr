<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/table.css" type="text/css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<style type="text/css">
body {
	margin: 0;
	padding: 0;
	background-color: #12B7F5;
	font-family: 微软雅黑;
}
.my_link_button:hover{
    text-decoration:none;
    color: red;
    font-family: 宋体;
    cursor:hand;
}
a{
  cursor:pointer;
}
</style>
</head>
<body topmargin="0" leftmargin="0">
	<table style="width: 70%; margin-left: 30%;">
		<tr>
			<td style="text-align: right; width: 30%">
				<p
					style="font-size: 40px; margin: 0; color: white; filter: progid:DXImageTransform.Microsoft.Shadow(color=black, direction=120, strength=5); text-shadow: 4px 4px 15px black;">
					人力资源管理系统</p>
			</td>
			<td
				style="text-align: right; font-size: 17px; width: 35%; color: white;"> 
				<a onclick="parent.location.href='<%=path%>/login.jsp'"  data-options="iconCls:'icon-undo'" class="my_link_button">安全退出</a>
				&nbsp;&nbsp;&nbsp;&nbsp;
			</td>
		</tr>
	</table>
</body>
</html>