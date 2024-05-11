package com.dao;

import com.entity.RenwudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwudingdanVO;
import com.entity.view.RenwudingdanView;


/**
 * 任务订单
 * 
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface RenwudingdanDao extends BaseMapper<RenwudingdanEntity> {
	
	List<RenwudingdanVO> selectListVO(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
	
	RenwudingdanVO selectVO(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
	
	List<RenwudingdanView> selectListView(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);

	List<RenwudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
	
	RenwudingdanView selectView(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
	
}
