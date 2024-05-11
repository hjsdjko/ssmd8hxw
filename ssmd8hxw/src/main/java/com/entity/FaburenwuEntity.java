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
 * 发布任务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-05 11:28:49
 */
@TableName("faburenwu")
public class FaburenwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FaburenwuEntity() {
		
	}
	
	public FaburenwuEntity(T t) {
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
	 * 任务标题
	 */
					
	private String renwubiaoti;
	
	/**
	 * 任务类型
	 */
					
	private String renwuleixing;
	
	/**
	 * 送件地址
	 */
					
	private String songjiandizhi;
	
	/**
	 * 派单名字
	 */
					
	private String paidanmingzi;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 任务时间
	 */
					
	private String renwushijian;
	
	/**
	 * 任务描述
	 */
					
	private String renwumiaoshu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 报价
	 */
					
	private Float baojia;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 校友账号
	 */
					
	private String xiaoyouzhanghao;
	
	/**
	 * 校友姓名
	 */
					
	private String xiaoyouxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 地址
	 */
					
	private String dizhi;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
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
	 * 设置：任务标题
	 */
	public void setRenwubiaoti(String renwubiaoti) {
		this.renwubiaoti = renwubiaoti;
	}
	/**
	 * 获取：任务标题
	 */
	public String getRenwubiaoti() {
		return renwubiaoti;
	}
	/**
	 * 设置：任务类型
	 */
	public void setRenwuleixing(String renwuleixing) {
		this.renwuleixing = renwuleixing;
	}
	/**
	 * 获取：任务类型
	 */
	public String getRenwuleixing() {
		return renwuleixing;
	}
	/**
	 * 设置：送件地址
	 */
	public void setSongjiandizhi(String songjiandizhi) {
		this.songjiandizhi = songjiandizhi;
	}
	/**
	 * 获取：送件地址
	 */
	public String getSongjiandizhi() {
		return songjiandizhi;
	}
	/**
	 * 设置：派单名字
	 */
	public void setPaidanmingzi(String paidanmingzi) {
		this.paidanmingzi = paidanmingzi;
	}
	/**
	 * 获取：派单名字
	 */
	public String getPaidanmingzi() {
		return paidanmingzi;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：任务时间
	 */
	public void setRenwushijian(String renwushijian) {
		this.renwushijian = renwushijian;
	}
	/**
	 * 获取：任务时间
	 */
	public String getRenwushijian() {
		return renwushijian;
	}
	/**
	 * 设置：任务描述
	 */
	public void setRenwumiaoshu(String renwumiaoshu) {
		this.renwumiaoshu = renwumiaoshu;
	}
	/**
	 * 获取：任务描述
	 */
	public String getRenwumiaoshu() {
		return renwumiaoshu;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：报价
	 */
	public void setBaojia(Float baojia) {
		this.baojia = baojia;
	}
	/**
	 * 获取：报价
	 */
	public Float getBaojia() {
		return baojia;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：地址
	 */
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
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
