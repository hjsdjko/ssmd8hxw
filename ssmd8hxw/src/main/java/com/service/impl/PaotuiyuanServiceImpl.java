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


import com.dao.PaotuiyuanDao;
import com.entity.PaotuiyuanEntity;
import com.service.PaotuiyuanService;
import com.entity.vo.PaotuiyuanVO;
import com.entity.view.PaotuiyuanView;

@Service("paotuiyuanService")
public class PaotuiyuanServiceImpl extends ServiceImpl<PaotuiyuanDao, PaotuiyuanEntity> implements PaotuiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaotuiyuanEntity> page = this.selectPage(
                new Query<PaotuiyuanEntity>(params).getPage(),
                new EntityWrapper<PaotuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaotuiyuanEntity> wrapper) {
		  Page<PaotuiyuanView> page =new Query<PaotuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaotuiyuanVO> selectListVO(Wrapper<PaotuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaotuiyuanVO selectVO(Wrapper<PaotuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaotuiyuanView> selectListView(Wrapper<PaotuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaotuiyuanView selectView(Wrapper<PaotuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
