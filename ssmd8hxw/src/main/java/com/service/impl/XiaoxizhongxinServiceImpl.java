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


import com.dao.XiaoxizhongxinDao;
import com.entity.XiaoxizhongxinEntity;
import com.service.XiaoxizhongxinService;
import com.entity.vo.XiaoxizhongxinVO;
import com.entity.view.XiaoxizhongxinView;

@Service("xiaoxizhongxinService")
public class XiaoxizhongxinServiceImpl extends ServiceImpl<XiaoxizhongxinDao, XiaoxizhongxinEntity> implements XiaoxizhongxinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoxizhongxinEntity> page = this.selectPage(
                new Query<XiaoxizhongxinEntity>(params).getPage(),
                new EntityWrapper<XiaoxizhongxinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoxizhongxinEntity> wrapper) {
		  Page<XiaoxizhongxinView> page =new Query<XiaoxizhongxinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoxizhongxinVO> selectListVO(Wrapper<XiaoxizhongxinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoxizhongxinVO selectVO(Wrapper<XiaoxizhongxinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoxizhongxinView> selectListView(Wrapper<XiaoxizhongxinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoxizhongxinView selectView(Wrapper<XiaoxizhongxinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
