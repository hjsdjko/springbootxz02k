package com.entity.vo;

import com.entity.CaijifenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 采集分析
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-14 15:56:35
 */
public class CaijifenxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 采集员姓名
	 */
	
	private String caijiyuanxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 详细行程
	 */
	
	private String xiangxixingcheng;
		
	/**
	 * 核酸码
	 */
	
	private String hesuanma;
		
	/**
	 * 行程码
	 */
	
	private String xingchengma;
		
	/**
	 * 分析员账号
	 */
	
	private String fenxiyuanzhanghao;
		
	/**
	 * 分析员姓名
	 */
	
	private String fenxiyuanxingming;
		
	/**
	 * 风险评估
	 */
	
	private String fengxianpinggu;
		
	/**
	 * 评估结果
	 */
	
	private String pinggujieguo;
		
	/**
	 * 评估时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pinggushijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：采集员姓名
	 */
	 
	public void setCaijiyuanxingming(String caijiyuanxingming) {
		this.caijiyuanxingming = caijiyuanxingming;
	}
	
	/**
	 * 获取：采集员姓名
	 */
	public String getCaijiyuanxingming() {
		return caijiyuanxingming;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：详细行程
	 */
	 
	public void setXiangxixingcheng(String xiangxixingcheng) {
		this.xiangxixingcheng = xiangxixingcheng;
	}
	
	/**
	 * 获取：详细行程
	 */
	public String getXiangxixingcheng() {
		return xiangxixingcheng;
	}
				
	
	/**
	 * 设置：核酸码
	 */
	 
	public void setHesuanma(String hesuanma) {
		this.hesuanma = hesuanma;
	}
	
	/**
	 * 获取：核酸码
	 */
	public String getHesuanma() {
		return hesuanma;
	}
				
	
	/**
	 * 设置：行程码
	 */
	 
	public void setXingchengma(String xingchengma) {
		this.xingchengma = xingchengma;
	}
	
	/**
	 * 获取：行程码
	 */
	public String getXingchengma() {
		return xingchengma;
	}
				
	
	/**
	 * 设置：分析员账号
	 */
	 
	public void setFenxiyuanzhanghao(String fenxiyuanzhanghao) {
		this.fenxiyuanzhanghao = fenxiyuanzhanghao;
	}
	
	/**
	 * 获取：分析员账号
	 */
	public String getFenxiyuanzhanghao() {
		return fenxiyuanzhanghao;
	}
				
	
	/**
	 * 设置：分析员姓名
	 */
	 
	public void setFenxiyuanxingming(String fenxiyuanxingming) {
		this.fenxiyuanxingming = fenxiyuanxingming;
	}
	
	/**
	 * 获取：分析员姓名
	 */
	public String getFenxiyuanxingming() {
		return fenxiyuanxingming;
	}
				
	
	/**
	 * 设置：风险评估
	 */
	 
	public void setFengxianpinggu(String fengxianpinggu) {
		this.fengxianpinggu = fengxianpinggu;
	}
	
	/**
	 * 获取：风险评估
	 */
	public String getFengxianpinggu() {
		return fengxianpinggu;
	}
				
	
	/**
	 * 设置：评估结果
	 */
	 
	public void setPinggujieguo(String pinggujieguo) {
		this.pinggujieguo = pinggujieguo;
	}
	
	/**
	 * 获取：评估结果
	 */
	public String getPinggujieguo() {
		return pinggujieguo;
	}
				
	
	/**
	 * 设置：评估时间
	 */
	 
	public void setPinggushijian(Date pinggushijian) {
		this.pinggushijian = pinggushijian;
	}
	
	/**
	 * 获取：评估时间
	 */
	public Date getPinggushijian() {
		return pinggushijian;
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
			
}
