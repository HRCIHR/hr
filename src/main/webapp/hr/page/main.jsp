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
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/easyui/themes/icon.css">
<script type="text/javascript" src="<%=path%>/easyui/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/easyui/jquery.easyui.min.js"></script>
<style type="text/css">
a {
	text-decoration: none
}
</style>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',title:'欢迎'"
		style="height: 150px; overflow: hidden">
		<iframe src="<%=path%>/hr/page/top.jsp"
			style='width: 100%; height: 100%; border: 0px;'> </iframe>
	</div>
	<div data-options="region:'west',title:'菜单'"
		style="width: 200px; background-color: #D1E0EF">
		<ul id="tt"></ul>
		<script type="text/javascript">
				$(function (){
					$('#tt').tree({    
					    url:'<%=path%>/SysRight/querySysRightJson',
							animate : true,
							lines : true,
							formatter : function(node) {
								console.log(node);
								if (node.state == "open") {
									return '<a href="javascript:tabs(\''
											+ node.text + '\',\''
											+ node.attributes.url + '\')">'
											+ node.text + "</a>";
								}
								return node.text;
							}
						});

			})
			function tabs(name, url) {
				var num = 0;
				var ts = $("#tt2").tabs("tabs");
				for (i = 0; i < ts.length; i++) {
					t = ts[i];
					var title = t.panel("options").title;
					if (title == name) {
						num = 1;
						break;
					}
				}
				if (num > 0) {
					$("#tt2").tabs("select", name);
				} else {
					$('#tt2')
							.tabs(
									'add',
									{
										title : name,
										content : "<iframe style='width:100%;height:100%;border:0px' src='"
												+ url + "'></iframe>",
										closable : true
									});
				}
			}
		</script>
	</div>
	<div data-options="region:'center'">
		<div id="tt2" class="easyui-tabs" style="width: 100%; height: 100%;">
			<div title="首页"
				style="padding: 20px; display: none; background: url(<%=path%>/hr/images/onepice.jpg) no-repeat 0 0;">

			</div>
		</div>
	</div>
</body>
</html>