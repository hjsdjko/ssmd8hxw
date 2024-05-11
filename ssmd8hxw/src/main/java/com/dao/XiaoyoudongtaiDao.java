package com.dao;

import com.entity.XiaoyoudongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyoudongtaiVO;
import com.entity.view.XiaoyoudongtaiView;


/**
 * 校友动态
 * 
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface XiaoyoudongtaiDao extends BaseMapper<XiaoyoudongtaiEntity> {
	
	List<XiaoyoudongtaiVO> selectListVO(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
	
	XiaoyoudongtaiVO selectVO(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
	
	List<XiaoyoudongtaiView> selectListView(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);

	List<XiaoyoudongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
	
	XiaoyoudongtaiView selectView(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
	
}
