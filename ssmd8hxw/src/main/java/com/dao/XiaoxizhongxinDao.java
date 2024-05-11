package com.dao;

import com.entity.XiaoxizhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoxizhongxinVO;
import com.entity.view.XiaoxizhongxinView;


/**
 * 消息中心
 * 
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface XiaoxizhongxinDao extends BaseMapper<XiaoxizhongxinEntity> {
	
	List<XiaoxizhongxinVO> selectListVO(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
	
	XiaoxizhongxinVO selectVO(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
	
	List<XiaoxizhongxinView> selectListView(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);

	List<XiaoxizhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
	
	XiaoxizhongxinView selectView(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
	
}
