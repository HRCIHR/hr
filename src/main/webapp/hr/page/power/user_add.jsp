<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加用户</title>
<script type="text/javascript"
	src="<%=path%>/hr/javascript/jquery.messager.js"></script>
<script type="text/javascript" src="<%=path%>/hr/javascript/user_add.js"></script>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/easyui-lang-zh_cn.js"></script>
	<style type="text/css">
	        .ta{background-color: #12B7F5;}
			.tableborder {
				border-top-width: 1px;
				border-right-width: 1px;
				border-bottom-width: 1px;
				border-left-width: 1px;
				/*以上分别设置的是表格边框中上右下左的边框宽度*/
				border-top-style: solid;
				border-right-style: solid;
				border-bottom-style: solid;
				border-left-style: solid;
				/*设置边框的表现样式，solid为实线*/
				border-top-color: #95B8E7;
				border-right-color: #95B8E7;
				border-bottom-color: #95B8E7;
				border-left-color: #95B8E7;
				/*设置边框的颜色*/
			}
		</style>
	</head>

	<body>
		<form method="post" action="../users/insertUser">
			<div style="background-color: #F4F4F4;">
				<table width="100%">
					<tr>
						<td>
							<font color="black">您正在做的业务是：人力资源--权限管理--添加用户</font>
						</td>
					</tr>
					<tr>
						<td align="right">
							<input type="submit" value="保存" />
							<input type="button" value="返回" onclick="history.back()"></td>
					</tr>
				</table>
			</div>
			<table width="100%" border="1" class="tableborder">
				<tr>
					<td class="ta">
						<label for="uName">用户名称</label>
					</td>
					<td class="">
						<input class="easyui-validatebox" type="text" name="uName" id="uName"/>
					</td>
					<td  class="ta">
						<label for="uPassword">用户密码</label>
					</td>
					<td >
						<input class="easyui-validatebox" type="text" name="uPassword" id="uPassword" />
					</td>
				</tr>
				<tr>
					<td  class="ta">
						<label for="uTrueName">真实姓名</label>
					</td>
					<td >
						<input class="easyui-validatebox" type="text" name="uTrueName" id="uTrueName"/>
					</td>
					<td  class="ta">
						<label for="role.roleId">用户身份</label>
					</td>
					<td >
						<select id="role.roleId" class="easyui-combobox" name="role.roleId" style="width:161px;height: 20px;">
						 <c:forEach items="${role}" var="r">
							<option value="${r.roleId}">${r.roleName}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
			</table>
		</form>