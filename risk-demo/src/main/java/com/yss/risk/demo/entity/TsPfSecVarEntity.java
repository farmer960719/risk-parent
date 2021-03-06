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
 * @date 2020-09-14 15:13:15
 */
@Data
@TableName("TS_PF_SEC_VAR")
public class TsPfSecVarEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 对于交易的第一种类型
	 */
	private String symbolId;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 市值
	 */
	private Integer marketvalue;
	/**
	 * 绝对VaR
	 */
	private Integer var;
	/**
	 * 相对VaR
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
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * $column.comments
	 */
	private String ccyType;

}
