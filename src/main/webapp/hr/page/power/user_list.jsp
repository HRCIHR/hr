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

</script>
<script type="text/javascript">
	$(function() {
		$('#dg').datagrid({
			url : '<%=path%>/users/querUserAndRole',
							fitColumns : true,
							striped : true,
							pagination : true,
							pageSize : 3,
							pageList : [ 1, 2, 3, 4, 5 ,6,7,8,9,10],
							idField : "uId",
							sortName : "uId",
							sortOrder : "asc",
							toolbar : [ {
								iconCls : 'icon-add',
								text : '添加用户',
								handler : function() {
									$('#roleSelect').combobox({    
									    url:'<%=path%>/role/queryRoleJson',
										valueField : 'roleId',
										textField : 'roleName'
									});
									//打开模态框
									$('#insrt').window('open');
								}
							} ],
							columns : [ [
									{
										field : "uId",
										title : "编号",
										width : 100
									},
									{
										field : "uName",
										title : "账号",
										width : 100
									},
									{
										field : "uTrueName",
										title : "真实姓名",
										width : 100
									},
									{
										field : "role",
										title : "角色",
										width : 100,
										formatter : function(value, row, index) {
											return value.roleName;
										}
									},
									{
										field : "operation",
										title : "操作",
										width : 100,
										formatter : function(value, row, index) {
											return "<input type='button' value='删除'> <input type='button' value='修改'>";
										}
									}

							] ]
						});
		 $('#insertUser').form({    
			    url:'<%=path%>/users/insertUser',      
			    success:function(data){    
			       if(data==1){
			    	   $('#insertUser').form('reset'); 
			    	   $('#insrt').dialog('close'); 
			    	   location.reload();
			       }  
			    }    
			});
	})
	
	function submitForm() {
		     $('#insertUser').submit();  
				}
	function gb() {
		//$('#insertUser').form('reset'); 
		 $('#insrt').dialog('close'); 
			}
</script>
</head>
<body>
	<div id="insrt" class="easyui-dialog" title="添加" style="width: 400px; height: 350px;"data-options="iconCls:'icon-save',resizable:true,modal:true,resizable:false,draggable:false,closed:true,
	buttons:[{text:'保存',handler:function(){submitForm()}},{text:'关闭',handler:function(){gb()}}]">
		<form style="margin-top: 40px;" id="insertUser" class="easyui-form"
			method="post">
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uName" style="width: 300px"
					data-options="label:'账户:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uTrueName" style="width: 300px"
					data-options="label:'姓名:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uPassword" style="width: 300px"
					data-options="label:'密码:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input id="roleSelect" name="role.roleId" value="请选择"
					style="width: 300px" data-options="label:'角色'">
			</div>
		</form>
	</div>

	<table id="dg"></table>
	<!-- 用户菜单 -->
</body>
</html>