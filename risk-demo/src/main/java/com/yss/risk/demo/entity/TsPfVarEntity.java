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
 * @date 2020-09-14 15:13:13
 */
@Data
@TableName("TS_PF_VAR")
public class TsPfVarEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 市值
	 */
	private Integer marketvalue;
	/**
	 * VaR
	 */
	private Integer var;
	/**
	 * VaR百分比
	 */
	private Integer varrate;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
