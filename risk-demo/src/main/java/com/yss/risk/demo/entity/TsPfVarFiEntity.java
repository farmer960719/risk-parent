package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 组合风险指标
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:12
 */
@Data
@TableName("TS_PF_VAR_FI")
public class TsPfVarFiEntity implements Serializable {
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
	 * 日期类型

	 */
	private String dateType;
	/**
	 * 业务日期

	 */
	private String bizDate;
	/**
	 * 币种类型
  
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * VaR（Riskmetrics法）
	 */
	private Integer varRmmv;
	/**
	 * VaR（历史模拟法）
	 */
	private Integer varHsmv;
	/**
	 * VaR（Delta正态法）
	 */
	private Integer varDltmv;
	/**
	 * VaR（蒙特卡罗模拟法）
	 */
	private Integer varMcmv;

}
