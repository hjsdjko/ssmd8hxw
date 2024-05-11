package com.entity.view;

import com.entity.FaburenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 发布任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("faburenwu")
public class FaburenwuView  extends FaburenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FaburenwuView(){
	}
 
 	public FaburenwuView(FaburenwuEntity faburenwuEntity){
 	try {
			BeanUtils.copyProperties(this, faburenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
