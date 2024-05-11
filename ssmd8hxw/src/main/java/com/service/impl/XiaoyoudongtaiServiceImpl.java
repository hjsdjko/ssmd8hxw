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


import com.dao.XiaoyoudongtaiDao;
import com.entity.XiaoyoudongtaiEntity;
import com.service.XiaoyoudongtaiService;
import com.entity.vo.XiaoyoudongtaiVO;
import com.entity.view.XiaoyoudongtaiView;

@Service("xiaoyoudongtaiService")
public class XiaoyoudongtaiServiceImpl extends ServiceImpl<XiaoyoudongtaiDao, XiaoyoudongtaiEntity> implements XiaoyoudongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyoudongtaiEntity> page = this.selectPage(
                new Query<XiaoyoudongtaiEntity>(params).getPage(),
                new EntityWrapper<XiaoyoudongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyoudongtaiEntity> wrapper) {
		  Page<XiaoyoudongtaiView> page =new Query<XiaoyoudongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyoudongtaiVO> selectListVO(Wrapper<XiaoyoudongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyoudongtaiVO selectVO(Wrapper<XiaoyoudongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyoudongtaiView> selectListView(Wrapper<XiaoyoudongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyoudongtaiView selectView(Wrapper<XiaoyoudongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
