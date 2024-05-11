package com.entity.model;

import com.entity.XiaoxizhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 消息中心
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
public class XiaoxizhongxinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 校友账号
	 */
	
	private String xiaoyouzhanghao;
		
	/**
	 * 校友姓名
	 */
	
	private String xiaoyouxingming;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：校友账号
	 */
	 
	public void setXiaoyouzhanghao(String xiaoyouzhanghao) {
		this.xiaoyouzhanghao = xiaoyouzhanghao;
	}
	
	/**
	 * 获取：校友账号
	 */
	public String getXiaoyouzhanghao() {
		return xiaoyouzhanghao;
	}
				
	
	/**
	 * 设置：校友姓名
	 */
	 
	public void setXiaoyouxingming(String xiaoyouxingming) {
		this.xiaoyouxingming = xiaoyouxingming;
	}
	
	/**
	 * 获取：校友姓名
	 */
	public String getXiaoyouxingming() {
		return xiaoyouxingming;
	}
				
	
	/**
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
