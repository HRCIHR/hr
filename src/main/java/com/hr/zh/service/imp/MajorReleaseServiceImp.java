package com.hr.zh.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hr.entity.EngageMajorRelease;
import com.hr.util.MasterTool;
import com.hr.util.pagination;
import com.hr.zh.mapper.MajorReleaseMapper;
import com.hr.zh.service.MajorReleaseService;

@Service("MajorReleaseServiceImp")
public class MajorReleaseServiceImp implements MajorReleaseService {

	@Resource(name = "MajorReleaseMapper")
	private MajorReleaseMapper majorReleaseMapper;

	@Override
	public List<EngageMajorRelease> pageQueryMajorRelease(pagination page) {
		// TODO Auto-generated method stub

		pagination.pageformat(page);
		List<EngageMajorRelease> pageQueryMajorRelease = majorReleaseMapper.pageQueryMajorRelease(page);

		return pageQueryMajorRelease;
	}

	@Override
	public Integer pageQueryMajorReleaseCount() {
		// TODO Auto-generated method stub
		Integer pageQueryMajorReleaseCount = majorReleaseMapper.pageQueryMajorReleaseCount();
		return pageQueryMajorReleaseCount;
	}

	@Override
	public Boolean saveMajorRelease(EngageMajorRelease MajorRelease) {
		// TODO Auto-generated method stub
		Integer saveMajorRelease = majorReleaseMapper.saveMajorRelease(MajorRelease);
		boolean success = MasterTool.isSuccess(saveMajorRelease);

		return success;
	}

	@Override
	public Boolean updateMajorRelease(EngageMajorRelease MajorRelease) {
		// TODO Auto-generated method stub
		Integer updateMajorRelease = majorReleaseMapper.updateMajorRelease(MajorRelease);
		boolean success = MasterTool.isSuccess(updateMajorRelease);
		return success;
	}

	@Override
	public Boolean delMajorRelease(Integer MajorReleaseID) {
		// TODO Auto-generated method stub
		Integer delMajorRelease = majorReleaseMapper.delMajorRelease(MajorReleaseID);
		boolean success = MasterTool.isSuccess(delMajorRelease);
		return success;
	}

	@Deprecated
	@Override
	public List<EngageMajorRelease> QueryMajorReleaseByMojarKindid(Integer MojarKindid) {
		// TODO Auto-generated method stub
		List<EngageMajorRelease> queryMajorReleaseByMojarKindid = majorReleaseMapper
				.QueryMajorReleaseByMojarKindid(MojarKindid);
		return queryMajorReleaseByMojarKindid;
	}

	@Override
	public EngageMajorRelease QueryMajorReleaseByMreid(Integer mreid) {
		// TODO Auto-generated method stub
		
		return majorReleaseMapper.QueryMajorReleaseByMreid(mreid);
	}

}
