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
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/easyui-lang-zh_CN.js"></script>
<title>角色管理</title>
<style type="text/css">
button{
  cursor:pointer;
}
	.myButton{
		color:#0E2D5F;
		border: 2px solid #E5EFFF;
		padding: 8px;
		text-decoration: none;
		border-radius: 10px;
		box-shadow: 10px 10px 10px #12B7F5;
		font-weight: bolder;
		margin-top:-20px;
	}
	#myRoleUL{
		list-style: none;
	}
	
	#myRoleUL li{
		float: left;
		margin-bottom: 10px;
		margin-top: 10px;
		margin-right: 10px;
	}
	
</style>
<script type="text/javascript">
	//加载角色   完成
	$(function (){
		$.get(
			"<%=path%>/role/queryRoleJson", 
			function(data){
			 	for(i=0;i<data.length;i++){
			 		var thisRole=JSON.stringify(data[i]);
			 		var bt;
			 		if(data[i].roleFlag==1){
			 			bt=$("<li><button onclick='queryRoleById("+thisRole+",this)' class='myButton'>"+data[i].roleName+"</button></li>");
			 		}else{
			 			bt=$("<li><button style='color:red;' onclick='queryRoleById("+thisRole+",this)' class='myButton'>"+data[i].roleName+"</button></li>");
			 		}
			 		$("#myRoleUL").append(bt);
			 	}
			},
			"json"
		);
	})
	//根据ID查询角色 点击角色按钮
	function queryRoleById(thisRole,obj){
		//console.info(thisRole);
		var rid=thisRole.roleId;
		//选中角色的样式
		$(".myButton").css("background-color","white");
		$(obj).css("background-color","#12B7F5");
		//得到页面全部的权限
		var allRights=$("input[name=allRight]");
		//清空上一个角色的权限
		allRights.each(function (){
				$(this).prop("checked","");
		});
		//选中当前角色的权限
		$.get(
				"<%=path%>/role/queryRoleAndRightByRoleId", 
				{roleId:rid},
				function(data){
					//得到当前角色的权限
					var rights=data.rights;
					for(i=0;i<rights.length;i++){
						/* var node = $('#rights').tree('find',rights[i].right_code);
						$('#rights').tree('select', node.target);*/
						allRights.each(function (){
							//得到指定页面的权限的value值
							var va=$(this).val()
							if(va==rights[i].rightCode){
								$(this).prop("checked","checked");
							}
						})
						
					} 
					
				},
				"json"
		);
		//显示自己相关的数据
		$("#roleUpdatePanel").panel("open");
		//修改模态框中角色赋值
		$("#update_role_name").textbox({value:thisRole.roleName});
		$("#update_role_id").val(thisRole.roleId);
		$("#update_role_desc").textbox({value:thisRole.roleDesc?thisRole.roleDesc:''});
		$("#update_role_flag").combobox("select",thisRole.roleFlag);
	}
	//加载所有的权限  完成
	$(function (){
		$('#rights').tree({    
		    url:'<%=path%>/SysRight/queryRightAll',
		    animate:true,
		    lines:true,
		    formatter:function(node){
		    	//设置一个自定义属性方便后面的操作
		    	return "<input type='checkbox' data-parentid='"+node.attributes.pid+"' name='allRight' id='right"+node.id+"' value='"+node.id+"'/>"+node.text;
		    }
		}); 
	})
	
	//弹出添加角色模态框
	function showSaveRole(){
		$("#insertRoleDiv").dialog("open"); 
	}
	//重置添加角色表单关闭模态窗
	function reSetRoleForm(){
		 $('#insertRoleForm').form("reset");//重置表单数据
  	     $("#insertRoleDiv").dialog("close");//关闭模态框
	}
	//点击添加角色
	function insertRoleSubmit(){
		$('#insertRoleForm').submit();  
	}
	//初始化表单
	$(function (){
		$('#insertRoleForm').form({    
		    url:"<%=path%>/role/insertRole",  
		    success:function(data){    
		       if(data==1){
		    	   $.messager.alert('温馨提示','添加成功！'); 
		    	   location.reload();
		       }else{
		    	   $.messager.alert('温馨提示','添加失败！'); 
		       }
		    }    
		});  
	})
	//清空所有的权限
	function clearMenu(){
		//得到页面全部的权限
		var allRights=$("input[name=allRight]");
		//清空上一个角色的权限
		allRights.each(function (){
				$(this).prop("checked","");
		});
		$.messager.alert('温馨提示','重置当前角色权限！'); 
	}
	//找父亲：点击子菜单选中父菜单
	function checkedParentMenu(obj){
		//找当前菜单的主菜单
		var f=$(obj).parent().parent().parent().parent().parent();
		var pid=$(obj).data("parentid");
		var menuName=f[0].nodeName;
		var bl=0;
		//判断不是根菜单，也就是父亲的id不为0的
		if(menuName=="LI"){
			$("input[data-parentid="+pid+"]").each(function (){
				if($(this).prop("checked")){
					bl=1;
					return false;
				}
			})
			if(bl){
				//选中自己的父亲
				$("#right"+pid).prop("checked","checked");
			}else{
				//父亲没选中
				$("#right"+pid).prop("checked","");
			}
			checkedParentMenu($("#right"+pid)[0]);
		}
		//取消自己取消儿子,不需要做点中自己选中儿子
		var id=$(obj).prop("id");
			id=id.substring(5);
		if($(obj).prop("checked")==false){
			$("input[data-parentid="+id+"]").each(function (){
				$(this).prop("checked","");
			})
		}
	}
	//由于复选框都是后面生成的，所以只能通过父容器去委托事件
	$(function (){
		$("#rights").on("click","input[name=allRight]",function (){
			checkedParentMenu(this);
		});
	})
	//删除角色所有权限
    //删除角色
	function deleteRoleRight(){
		if(confirm("您确定删除该角色所有权限吗?")){
			$.get(
					"<%=path%>/role/deleteRoleRight", 
					{roleId:$("#update_role_id").val()},
					function (data){
						if(data){
							$.messager.alert('温馨提示','删除成功！'); 
							location.reload();
						}else{
							$.messager.alert('温馨提示','删除失败！');    
						}
						
					},
					"json"
			);
		}
	}
	//删除角色
	function deleteRole(){
		//alert("要删除的角色是："+$("#update_role_id").val()+";确定角色下是否用户，删除角色的同时请删除角色和权限中间表的数据");
		if(confirm("您确定删除："+$("#update_role_name").textbox("getText")+"吗?")){
			$.get(
					"<%=path%>/role/deleteRoleById", 
					{roleId:$("#update_role_id").val()},
					function (data){
						if(data){
							$.messager.alert('温馨提示','删除成功！'); 
							location.reload();
						}else{
							$.messager.alert('温馨提示','该角色带有用户不能删除！');    
						}
						
					},
					"json"
			);
		}
	}
	//修改角色和权限
	function updateRoleCommit(){
		//封装成对象
		var obj=new Object();
		obj.roleId=eval($("#update_role_id").val());
		obj.roleName=$("#update_role_name").textbox("getText");
		obj.roleDesc=$("#update_role_desc").textbox("getText");
		obj.roleFlag=$("#update_role_flag").combobox("getValue");
		
		//保存选中的权限
		var arr=[];
		var index=0;
		$("input[name=allRight]").each(function (){
			if($(this).prop("checked")){
			  arr[index]=eval($(this).val());
			  index++;
			}
		});
		//转成json
		//提交数据
		$.ajax({
			url:"<%=path%>/role/updateRoleAndRoleRight",
			type:"post",
			traditional:true,//防止深度序列化,默认是false
			data:$.param(obj)+"&arr="+arr,
			success:function (data){
				console.info(data);
				if(data){
					 $.messager.alert('温馨提示','修改成功！');
					location.reload();
				}else{
					 $.messager.alert('温馨提示','修改失败！'); 
				}
			},
			dataType:"json"
		});
	}
</script>
</head>
<body> 
    <!-- 添加角色模态框 -->
	<div id="insertRoleDiv" class="easyui-dialog" title="添加"
		style="width: 400px; height: 260px;"
		data-options="closable:false,top:30,draggable:false,iconCls:'icon-save',resizable:true,modal:true,closed:true,buttons:[{text:'添加',handler:function (){insertRoleSubmit()}},{text:'取消',handler:function (){reSetRoleForm()}}]">
		<form style="margin-top: 20px;" id="insertRoleForm" class="easyui-form"
			method="post">
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input id="role_name" class="easyui-textbox" name="roleName" style="width: 300px"
					data-options="label:'角色名称:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<input id="role_desc" class="easyui-textbox" name="roleDesc" style="width: 300px"
					data-options="label:'角色备注:',required:true">
			</div>
			<div style="margin-bottom: 20px; margin-left: 30px;">
				<select  data-options="label:'是否启用:'" id="roleFlag" class="easyui-combobox" name="roleFlag" style="width:300px;">   
				    <option value="0">禁用</option>
				    <option value="1">启用</option>    
				</select> 
			</div>
		</form>
	</div>
	
	<!-- 自定义工具:添加 -->
	<div id="panelTool">
		<a style="text-decoration:none; margin-top:-6px; height:30px;width: 108px;background-position: 0px 6px" href="javascript:showSaveRole()" class="icon-add">
			<span style="font-weight:bold;margin-left: 18px;line-height: 28px;font-size: 15px">添加新角色</span>
		</a>
	</div>
	
	<!-- 自定义工具:修改 -->
	<div id="panelTool2">
		<a style="text-decoration:none; margin-top:-6px; height:30px;width: 108px;background-position: 0px 6px" href="javascript:clearMenu()" class="icon-remove">
			<span style="font-weight:bold;margin-left: 18px;line-height: 28px;font-size: 15px">清空所选权限</span>
		</a>
	</div>
	<!-- 自定义底部:修改 -->
	<div id="panelTool3" style="height: 40px;padding: 4px">
		<button onclick="deleteRole()" style="float: right;background-color: red;" type="button" class="easyui-linkbutton" data-options="iconCls:'icon-clear'">删除角色</button>
		<button onclick="deleteRoleRight()" style="float: right;margin-right: 20px" type="button" class="easyui-linkbutton" data-options="iconCls:'icon-clear'">删除角色所有权限</button>
		<button onclick="updateRoleCommit()"style="float: right;margin-right: 20px" type="button" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改角色及其权限</button>
	</div>
	
	<!-- 所有角色面板 -->
	<DIV style="position: sticky;width: 100%;top:8px">
		<div id="rolePanel" class="easyui-panel" title="角色管理"
			style="width: 100%;padding-bottom: 10px;padding-top: 5px;"
			data-options="tools:'#panelTool'">
			<ul id="myRoleUL">
			</ul>
		</div>
		
		<!-- 修改角色的面板 -->
		<div style="float: right;">
			<div id="roleUpdatePanel" class="easyui-panel" title="修改角色及其权限"
				style="width: 450px;padding-bottom: 10px;padding-top: 5px;"
				data-options="closed:true,closable:true,openAnimation:'slide',footer:'#panelTool3',tools:'#panelTool2'">
				<form style="margin-top: 20px;" id="updateRoleForm"  class="easyui-form"
					method="post">
					<input type="hidden" id="update_role_id" name="roleId" value="0"/>
					<div style="margin-bottom: 20px; margin-left: 30px;">
						<input id="update_role_name" class="easyui-textbox" name="roleName" style="width: 300px"
							data-options="label:'角色名称:',required:true">
					</div>
					<div style="margin-bottom: 20px; margin-left: 30px;">
						<input id="update_role_desc" class="easyui-textbox" name="roleDesc" style="width: 300px"
							data-options="label:'角色备注:',required:true">
					</div>
					<div style="margin-bottom: 20px; margin-left: 30px;">
						<select id="update_role_flag" data-options="label:'是否启用:'" class="easyui-combobox" name="roleFlag" style="width:300px;">   
						    <option value="0">禁用</option>
						    <option value="1">启用</option>    
						</select> 
					</div>
				</form>
			</div>
		</div>
	</DIV>
	
	<!-- 展示所有的权限 -->
	<ul id="rights"></ul>  
</body>
</html>
</head>
<body>
     
</body>
</html>