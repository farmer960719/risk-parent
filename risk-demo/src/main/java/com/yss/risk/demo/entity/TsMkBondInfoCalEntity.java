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
 * @date 2020-09-14 15:13:24
 */
@Data
@TableName("TS_MK_BOND_INFO_CAL")
public class TsMkBondInfoCalEntity implements Serializable {
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
	 * 到期收益率
	 */
	private Integer ytm;
	/**
	 * 玖期
	 */
	private Integer mdur;
	/**
	 * 修正玖期
	 */
	private Integer madu;
	/**
	 * 凸性
	 */
	private Integer prom;
	/**
	 * 剩余期限
	 */
	private Integer leftPeriod;
	/**
	 * $column.comments
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
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
