package com.dao;

import com.entity.FaburenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FaburenwuVO;
import com.entity.view.FaburenwuView;


/**
 * 发布任务
 * 
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface FaburenwuDao extends BaseMapper<FaburenwuEntity> {
	
	List<FaburenwuVO> selectListVO(@Param("ew") Wrapper<FaburenwuEntity> wrapper);
	
	FaburenwuVO selectVO(@Param("ew") Wrapper<FaburenwuEntity> wrapper);
	
	List<FaburenwuView> selectListView(@Param("ew") Wrapper<FaburenwuEntity> wrapper);

	List<FaburenwuView> selectListView(Pagination page,@Param("ew") Wrapper<FaburenwuEntity> wrapper);
	
	FaburenwuView selectView(@Param("ew") Wrapper<FaburenwuEntity> wrapper);
	
}
