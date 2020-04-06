$(function() {
	$("#firstcheckbox").combobox({
		url: 'http://127.0.0.1:8080/HR/First/findFirstKindAll',
		valueField: "firstKindId",
		method: "get",
		textField: "firstKindName",
		onSelect: function(record) {

			$("#secondcheckbox").combobox({
				url: 'http://127.0.0.1:8080/HR/SecondKind/querySecondKindByFirstId?firstKindId=' + record.firstKindId,
				valueField: "secondKindId",
				method: "get",
				textField: "secondKindName", //thirdcheckbox
				onSelect: function(record) {
					console.log(record);
					$("#thirdcheckbox").combobox({
						url: 'http://127.0.0.1:8080/HR/Third/queryThirdKindByIDList?secondKindId=' + record.secondKindId,
						valueField: "thirdKindId",
						method: "get",
						textField: "thirdKindName"
					})

				}
			});
		}

	});
	$("#zhaopinType").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=招聘类型',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#guoji").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=国籍',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#mingzu").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=民族',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#zhengzhimianmao").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=政治面貌',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#xueli").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=学历',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#jiaoyunianxian").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=教育年限',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#zhuanye").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=专业',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#techang").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=特长',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#aihao").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=爱好',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	//zhicheng
	$("#zhicheng").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=职称',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});

	$("#zongjiao").combobox({
		url: 'http://127.0.0.1:8080/HR/PublicChar/queryPublicChar?type=宗教信仰',
		valueField: "attributeName",
		method: "get",
		textField: "attributeName"
	});
	$("#zhiweiClass").combobox({
		url: 'http://127.0.0.1:8080/HR/MajorKind/queryMajorKind',
		valueField: "majorKindId",
		method: "get",
		textField: "majorKindName",
		onSelect: function(record) {
			console.log(record);
			$("#zhiweiName").combobox({
				url: 'http://127.0.0.1:8080/HR/Major/QueryMajor?majorKindId=' + record.majorKindId,
				valueField: "majorId",
				method: "get",
				textField: "majorName"
			})
		}
	});

})