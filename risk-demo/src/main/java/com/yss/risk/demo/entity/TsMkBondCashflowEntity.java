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
 * @date 2020-09-14 15:13:25
 */
@Data
@TableName("TS_MK_BOND_CASHFLOW")
public class TsMkBondCashflowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 合并证券内码
	 */
	private String securityId;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 现金流日期
	 */
	private String cashflowDate;
	/**
	 * 现金流
	 */
	private Integer cashflow;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 现金流类型
	 */
	private Integer cashflowType;

}
