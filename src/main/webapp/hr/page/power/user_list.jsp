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
							pageSize : 6,
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
										field : "uPassword",
										title : "密码",
										width : 100,
										hidden:true
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
										formatter : function(value, r, index) {
											return "<a href=\"javascript:deleteUser('"+r.uId+"','"+r.uName+"')\">删除</a>  <a href=\"javascript:updateUser('"+r.uId+"','"+r.uName+"','"+r.uTrueName+"','"+r.uPassword+"','"+r.role.roleId+"')\">修改</a>";
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
	function deleteUser(id,uName){
		//alert(uId+uName);
		if(confirm("确认删除"+uName+"吗？")){
			 $.ajax({
				 url:"<%=path%>/users/deleteUser/"+id,
				 type:"DELETE",
				 succeess:function(data){
					 if(data>0){
						 alert("删除成功！");  //怎么不弹窗？
					 }
				 }
			 });
			 location.reload();
		}
	}
	$(function (){
		//初始化修改模态框
		$('#updateUserFrom').form({    
		    url:"<%=path%>/users/updateUserByUname",   
		    success:function(data){    
		       // alert(data); //data就是服务器返回的信息  
		       if(data==1){
		    	   //修改成功
		    	   //重置表单
		    	   gbt()
		    	   //刷新页面
		    	   location.reload();
		       }else{
		    	   $.messager.alert('消息','修改用户失败','error');
		       }
		    }    
		});
	})
	function gb() {
		$('#insertUser').form('reset'); 
		 $('#insrt').dialog('close'); 
			}
	function gbt() {
		$('#updateUserFrom').form('reset'); 
		 $('#update').dialog('close'); 
			}
	function updateUser(id,name,trueName,pwd,roleid){
	  document.getElementById('uId').value=id;
		$('#uName').textbox({    
		      value:name
		})
		$('#uTrueName').textbox({    
		      value:trueName
		})
		$('#uPassword').textbox({    
		      value:pwd
		})
		$('#uName').textbox({    
		      value:name
		})

		<%-- //初始化下拉列表
		$('#roleSelecttwo').combobox({    
		    url:'<%=path%>/role/queryRoleJson',
			valueField : 'roleId',
			textField : 'roleName',

		}); --%>
		//初始化角色下拉列表
		$('#roleSelecttwo').combobox({    
		    url:'<%=path%>/role/queryRoleJson',    
		    valueField:'roleId',    
		    textField:'roleName',
		    loadFilter:function (data){
		    	for(i=0;i<data.length;i++){
		    		if(data[i].roleId==roleid){
		    			data[i].selected=true;
		    			break;
		    		}
		    	}
		    	var obj={};//new Object();
		    	obj.role_id=-1;
		    	obj.role_name="请选择";
		    	//obj.selected=true;//设置selected=true表示选中
		    	data.splice(0,0,obj); //第一个参数是插入的下标,第二个参数是是否替换，0表示不替换,第三个参数是插入的数据
		    	return data;
		    }
		}); 
		//打开模态框
		$('#update').window('open');
	}
	//点击修改按钮
	function clickUpdateBt(){
		$('#updateUserFrom').submit(); 
	}
</script>
</head>
<body>
<!-- 添加模态框 -->
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
  <!-- 修改模态框 -->
<div id="update" class="easyui-dialog" title="修改" style="width: 400px; height: 350px;"data-options="iconCls:'icon-save',resizable:true,modal:true,resizable:false,draggable:false,closed:true,
	buttons:[{text:'修改',handler:function(){clickUpdateBt()}},{text:'关闭',handler:function(){gbt()}}]">
		<form style="margin-top: 40px;" id="updateUserFrom" class="easyui-form"
			method="post">
			<input type="hidden" name="uId" id="uId"/>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uName" style="width: 300px" id="uName"
					data-options="label:'账户:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uTrueName" style="width: 300px" id="uTrueName"
					data-options="label:'姓名:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input class="easyui-textbox" name="uPassword" style="width: 300px" id="uPassword"
					data-options="label:'密码:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input id="roleSelecttwo" name="role.roleId" value="请选择"
					style="width: 300px" data-options="label:'角色'">
			</div>
		</form>
	</div>
	<table id="dg"></table>
	<!-- 用户菜单 -->
</body>
</html>