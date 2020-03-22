<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			url : '<%=path%>/users/querUserAndRole',
			fitColumns:true,
			striped:true,
			pagination:true,
			pageSize:3,
			pageList:[1,2,3,4,5],
			idField:"uId",
			sortName:"uId",
			sortOrder:"asc",
			columns : [ [ {
				field : "uId",
				title : "编号",
				width : 100
			}, {
				field : "uName",
				title : "账号",
				width : 100
			}, {
				field : "uTrueName",
				title : "真实姓名",
				width : 100
			}
			, {
				field : "role",
				title : "角色",
				width : 100,
				formatter:function(value,row,index){
					return value.roleName;
				}
			}

			] ]
		});
	})
</script>
</head>
<body>
	<table id="dg"></table>
</body>
</html>