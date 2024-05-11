package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FaburenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FaburenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FaburenwuView;


/**
 * 发布任务
 *
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface FaburenwuService extends IService<FaburenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FaburenwuVO> selectListVO(Wrapper<FaburenwuEntity> wrapper);
   	
   	FaburenwuVO selectVO(@Param("ew") Wrapper<FaburenwuEntity> wrapper);
   	
   	List<FaburenwuView> selectListView(Wrapper<FaburenwuEntity> wrapper);
   	
   	FaburenwuView selectView(@Param("ew") Wrapper<FaburenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FaburenwuEntity> wrapper);
   	
}

