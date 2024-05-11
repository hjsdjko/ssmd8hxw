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


import com.dao.RenwudingdanDao;
import com.entity.RenwudingdanEntity;
import com.service.RenwudingdanService;
import com.entity.vo.RenwudingdanVO;
import com.entity.view.RenwudingdanView;

@Service("renwudingdanService")
public class RenwudingdanServiceImpl extends ServiceImpl<RenwudingdanDao, RenwudingdanEntity> implements RenwudingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwudingdanEntity> page = this.selectPage(
                new Query<RenwudingdanEntity>(params).getPage(),
                new EntityWrapper<RenwudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwudingdanEntity> wrapper) {
		  Page<RenwudingdanView> page =new Query<RenwudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwudingdanVO> selectListVO(Wrapper<RenwudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwudingdanVO selectVO(Wrapper<RenwudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwudingdanView> selectListView(Wrapper<RenwudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwudingdanView selectView(Wrapper<RenwudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
