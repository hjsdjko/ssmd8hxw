package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 消息中心
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("xiaoxizhongxin")
public class XiaoxizhongxinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoxizhongxinEntity() {
		
	}
	
	public XiaoxizhongxinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 内容
	 */
					
	private String neirong;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：内容
	 */
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	/**
	 * 获取：内容
	 */
	public String getNeirong() {
		return neirong;
	}
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
