package com.entity.view;

import com.entity.PaotuiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 跑腿员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("paotuiyuan")
public class PaotuiyuanView  extends PaotuiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaotuiyuanView(){
	}
 
 	public PaotuiyuanView(PaotuiyuanEntity paotuiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, paotuiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
