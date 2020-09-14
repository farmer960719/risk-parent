package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按组合内码汇总

3.包含真实交易的发生金额及费用/组合其它费用

 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:18
 */
@Data
@TableName("TS_PF_EXTINFO")
public class TsPfExtinfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增序列
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 币种类型;区分币种存储（包含海外）
SC   本位币
AC   记账本位币

不区分币种存储（针对境内）
AC   记账本位币

	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 受托费
	 */
	private Integer depositaryFee;
	/**
	 * 业绩报酬
	 */
	private Integer performanceFee;
	/**
	 * 买佣金
	 */
	private Integer bComm;
	/**
	 * 卖佣金
	 */
	private Integer sComm;
	/**
	 * 佣金
	 */
	private Integer comm;
	/**
	 * 买交易费用
	 */
	private Integer bTdFee;
	/**
	 * 卖交易费用
	 */
	private Integer sTdFee;
	/**
	 * 交易费用
	 */
	private Integer tdFee2;
	/**
	 * 买实际发生金额
	 */
	private Integer bActlAmt;
	/**
	 * 卖实际发生金额
	 */
	private Integer sActlAmt;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 指标1
	 */
	private Integer pfExtinfo1;
	/**
	 * 指标2
	 */
	private Integer pfExtinfo2;
	/**
	 * 指标3
	 */
	private Integer pfExtinfo3;
	/**
	 * 指标4
	 */
	private Integer pfExtinfo4;

}
