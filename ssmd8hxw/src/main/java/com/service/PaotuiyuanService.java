package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaotuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaotuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaotuiyuanView;


/**
 * 跑腿员
 *
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface PaotuiyuanService extends IService<PaotuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaotuiyuanVO> selectListVO(Wrapper<PaotuiyuanEntity> wrapper);
   	
   	PaotuiyuanVO selectVO(@Param("ew") Wrapper<PaotuiyuanEntity> wrapper);
   	
   	List<PaotuiyuanView> selectListView(Wrapper<PaotuiyuanEntity> wrapper);
   	
   	PaotuiyuanView selectView(@Param("ew") Wrapper<PaotuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaotuiyuanEntity> wrapper);
   	
}

