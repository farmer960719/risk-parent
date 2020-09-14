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
 * @date 2020-09-14 15:13:23
 */
@Data
@TableName("TS_MK_STOCK_RISK")
public class TsMkStockRiskEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 证券内码
	 */
	private String symbolId;
	/**
	 * beta
	 */
	private Integer beta;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 证券代码
	 */
	private String symbolCode;
	/**
	 * 市场代码
	 */
	private String exchTypeD;
	/**
	 * 证券类型
	 */
	private String symbolTypeD;

}
