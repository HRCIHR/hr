package com.hr.zh.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hr.entity.HumanFile;
import com.hr.util.HumanFileCase;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.service.HumanFileService;

@Controller
@RequestMapping("HumanFile")
public class HumanFileController {

	@Autowired
	private HumanFileService humanFileService;

	@RequestMapping("saveHumanFile") // HumanFile/saveHumanFile
	public @ResponseBody Boolean saveHumanFile(HumanFile humanFile, MultipartFile imgdata) {
		System.out.println(humanFile);
		if (imgdata != null) {
			String fileUploadTool = MasterTool.FileUploadTool(imgdata);
			humanFile.setHuman_Picture(fileUploadTool);
		}

		Boolean saveHumanFile = humanFileService.saveHumanFile(humanFile);

		return saveHumanFile;
	}

	@RequestMapping("updateHumanFile") // HumanFile/updateHumanFile
	public @ResponseBody Boolean updateHumanFile(HumanFile humanFile, MultipartFile imgdata) {
		System.out.println(humanFile);
		if (imgdata != null) {
			String fileUploadTool = MasterTool.FileUploadTool(imgdata);
			humanFile.setHuman_Picture(fileUploadTool);
		}
		Boolean updateHumanFile = humanFileService.updateHumanFile(humanFile);
		return updateHumanFile;
	}

	@RequestMapping("changeHumanFile") // HumanFile/updateHumanFile
	public @ResponseBody Boolean changeHumanFile(HumanFile humanFile, MultipartFile imgdata) {
		if (imgdata != null) {
			String fileUploadTool = MasterTool.FileUploadTool(imgdata);
			humanFile.setHuman_Picture(fileUploadTool);
		}
		Boolean changeHumanFile = humanFileService.changeHumanFile(humanFile);

		return changeHumanFile;
	}

	@RequestMapping("HumanFileStatus") // HumanFile/updateHumanFile
	public @ResponseBody Boolean HumanFileStatus(HumanFile humanFile) {

		System.out.println(humanFile);
		Boolean deleteHumanFile = humanFileService.HumanFileStatus(humanFile);
		return deleteHumanFile;
	}

	@RequestMapping("delHumanFile") // HumanFile/delHumanFile?humanFileID
	public @ResponseBody Boolean delHumanFile(String humanFileID) {

		System.out.println(humanFileID);
		Boolean delFileStatus = humanFileService.DelFileStatus(humanFileID);
		return delFileStatus;
	}

	@RequestMapping("queryHumanFileByCheckStatus") // HumanFile/queryHumanFileByCheckStatus?status=
	public @ResponseBody Map<String, Object> queryHumanFileByCheckStatus(Integer status, pagination page) {

		List<HumanFile> queryHumanFileByCheckStatus = humanFileService.queryHumanFileByCheckStatus(status, page);
		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("rows", queryHumanFileByCheckStatus);
		map.put("total", humanFileService.queryHumanFileByCheckStatusCount(status));

		return map;

	}

	@RequestMapping("queryHumanFileByCase") // HumanFile/queryHumanFileByCase?status=
	public @ResponseBody Map<String, Object> queryHumanFileByCase(HumanFileCase humanFileCase, pagination page) {

		System.out.println(humanFileCase);
		List<HumanFile> queryHumanFileByCase = humanFileService.queryHumanFileByCase(humanFileCase, page);

		HashMap<String, Object> map = new HashMap<String, Object>();

		map.put("rows", queryHumanFileByCase);
		map.put("total", humanFileService.queryHumanFileByCaseCount(humanFileCase));

		return map;

	}

}
