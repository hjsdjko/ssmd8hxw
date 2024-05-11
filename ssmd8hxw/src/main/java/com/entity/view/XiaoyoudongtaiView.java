package com.entity.view;

import com.entity.XiaoyoudongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校友动态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("xiaoyoudongtai")
public class XiaoyoudongtaiView  extends XiaoyoudongtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyoudongtaiView(){
	}
 
 	public XiaoyoudongtaiView(XiaoyoudongtaiEntity xiaoyoudongtaiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyoudongtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
