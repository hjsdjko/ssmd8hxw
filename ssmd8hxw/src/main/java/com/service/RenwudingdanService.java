package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwudingdanView;


/**
 * 任务订单
 *
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface RenwudingdanService extends IService<RenwudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwudingdanVO> selectListVO(Wrapper<RenwudingdanEntity> wrapper);
   	
   	RenwudingdanVO selectVO(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
   	
   	List<RenwudingdanView> selectListView(Wrapper<RenwudingdanEntity> wrapper);
   	
   	RenwudingdanView selectView(@Param("ew") Wrapper<RenwudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwudingdanEntity> wrapper);
   	
}

