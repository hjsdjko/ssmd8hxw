package com.entity.view;

import com.entity.RenwudingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("renwudingdan")
public class RenwudingdanView  extends RenwudingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwudingdanView(){
	}
 
 	public RenwudingdanView(RenwudingdanEntity renwudingdanEntity){
 	try {
			BeanUtils.copyProperties(this, renwudingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
