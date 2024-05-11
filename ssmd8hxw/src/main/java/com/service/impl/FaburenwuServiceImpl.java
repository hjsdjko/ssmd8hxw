package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FaburenwuDao;
import com.entity.FaburenwuEntity;
import com.service.FaburenwuService;
import com.entity.vo.FaburenwuVO;
import com.entity.view.FaburenwuView;

@Service("faburenwuService")
public class FaburenwuServiceImpl extends ServiceImpl<FaburenwuDao, FaburenwuEntity> implements FaburenwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FaburenwuEntity> page = this.selectPage(
                new Query<FaburenwuEntity>(params).getPage(),
                new EntityWrapper<FaburenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FaburenwuEntity> wrapper) {
		  Page<FaburenwuView> page =new Query<FaburenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FaburenwuVO> selectListVO(Wrapper<FaburenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FaburenwuVO selectVO(Wrapper<FaburenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FaburenwuView> selectListView(Wrapper<FaburenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FaburenwuView selectView(Wrapper<FaburenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
