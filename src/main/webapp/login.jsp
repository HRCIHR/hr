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
<style type=text/css>
body {
	font-size: 12px;
	color: #ffffff;
	font-family: 宋体;
}

td {
	font-size: 12px;
	color: #ffffff;
	font-family: 宋体
}
</style>
</head>
<body >
	<form action="users/querUserByNameAndPwd" method="post">
		<div>
			<table cellspacing=0 cellpadding=0 width=900 align=center border=0>
				<tbody>
					<tr>
						<td style="height: 105px"><img src="hr/images/login_11.gif"
							border=0></td>
					</tr>
					<tr>
						<td background=hr/images/login_22.jpg height=300>
							<table height=300 cellpadding=0 width=900 border=0>
								<tbody>
									<tr>
										<td colspan=2 height=35></td>
									</tr>
									<tr>
										<td width=360></td>
										<td>
											<table cellspacing=0 cellpadding=2 border=0>
												<tbody>
													<tr>
														<td style="height: 28px" width=80>登 录 名：</td>
														<td style="height: 28px" width=150><input
															name="uName" style="width: 130px" type="text" id="uName"/></td>
													</tr>
													<tr>
														<td style="height: 28px">登录密码：</td>
														<td style="height: 28px"><input name="uPassword"
															style="width: 130px" type="password" id="u_password"/></td>
													</tr>

													<tr>
														<td style="height: 18px"></td>
														<td style="height: 18px"></td>
														<td style="height: 18px"></td>
													</tr>
													<tr>
                                                        <td></td>
														<td  style="margin: center"><input id=btn onClick="document.form.submit()"
															style="border-top-width: 0px; border-left-width: 0px;
															 border-bottom-width: 0px; border-right-width: 0px"
															type=image src="hr/images/login_button.gif" name=btn>
														</td>
													</tr>
												</tbody>
											</table>
										</td>
									</tr>
								</tbody>
							</table>
						</td>
					</tr>
					<tr>
						<td><img src="hr/images/login_33.jpg" border=0></td>
					</tr>
				</tbody>
			</table>
		</div>
	</form>
</body>
</html>
