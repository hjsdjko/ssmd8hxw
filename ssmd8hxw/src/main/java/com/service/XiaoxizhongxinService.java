package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoxizhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoxizhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoxizhongxinView;


/**
 * 消息中心
 *
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public interface XiaoxizhongxinService extends IService<XiaoxizhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoxizhongxinVO> selectListVO(Wrapper<XiaoxizhongxinEntity> wrapper);
   	
   	XiaoxizhongxinVO selectVO(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
   	
   	List<XiaoxizhongxinView> selectListView(Wrapper<XiaoxizhongxinEntity> wrapper);
   	
   	XiaoxizhongxinView selectView(@Param("ew") Wrapper<XiaoxizhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoxizhongxinEntity> wrapper);
   	
}

