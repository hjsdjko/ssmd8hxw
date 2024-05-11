package com.entity.view;

import com.entity.XiaoxizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消息中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("xiaoxizhongxin")
public class XiaoxizhongxinView  extends XiaoxizhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoxizhongxinView(){
	}
 
 	public XiaoxizhongxinView(XiaoxizhongxinEntity xiaoxizhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoxizhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
