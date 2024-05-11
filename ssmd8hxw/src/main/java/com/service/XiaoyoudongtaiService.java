package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyoudongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyoudongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyoudongtaiView;


/**
 * 校友动态
 *
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface XiaoyoudongtaiService extends IService<XiaoyoudongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyoudongtaiVO> selectListVO(Wrapper<XiaoyoudongtaiEntity> wrapper);
   	
   	XiaoyoudongtaiVO selectVO(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
   	
   	List<XiaoyoudongtaiView> selectListView(Wrapper<XiaoyoudongtaiEntity> wrapper);
   	
   	XiaoyoudongtaiView selectView(@Param("ew") Wrapper<XiaoyoudongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyoudongtaiEntity> wrapper);
   	
}

