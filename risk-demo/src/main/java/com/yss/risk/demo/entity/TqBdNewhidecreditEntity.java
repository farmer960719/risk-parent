package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ${comments}
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:27
 */
@Data
@TableName("TQ_BD_NEWHIDECREDIT")
public class TqBdNewhidecreditEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 证券内码
	 */
	private String secode;
	/**
	 * 隐藏评级来源
	 */
	private String creditsource;
	/**
	 * 主体公司代码
	 */
	private String compcode;
	/**
	 * 隐藏评级评级日期
	 */
	private String hidcreatedate;
	/**
	 * 标准隐藏评级
	 */
	private String stdcredit;
	/**
	 * 主体评级机构代码
	 */
	private String compcreditcompcode;
	/**
	 * 主体评级机构名称
	 */
	private String compcreditcompname;
	/**
	 * 主体评级评级日期
	 */
	private String compcreditdate;
	/**
	 * 主体评级
	 */
	private String compcredit;
	/**
	 * 隐藏评级和主体评级差异
	 */
	private Integer compcreditdiff;
	/**
	 * 债项评级机构代码
	 */
	private String bdcreditcompcode;
	/**
	 * 债项评级机构名称
	 */
	private String bdcreditcompname;
	/**
	 * 债项评级日期
	 */
	private String bdcreditdate;
	/**
	 * 债项评级
	 */
	private String bdcredit;
	/**
	 * 隐藏评级与债项评级差异
	 */
	private Integer bdcreditdiff;
	/**
	 * 隐藏评级评级日期
	 */
	private String hidecreditdate;
	/**
	 * 影藏评级当前状态
	 */
	private String hidecreditstatus;
	/**
	 * 校验ID
	 */
	private String sourceid;
	/**
	 * 是否有效
	 */
	private Integer isvalid;
	/**
	 * 时间戳
	 */
	private Date tmstamp;
	/**
	 * 录入日期
	 */
	private Date entrydate;
	/**
	 * 录入时间
	 */
	private String entrytime;

}
