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
@TableName("TS_MK_BOND_INFO")
public class TsMkBondInfoEntity implements Serializable {
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
	 * 到期收益率YTM
	 */
	private Integer ytm;
	/**
	 * 久期
	 */
	private Integer mdur;
	/**
	 * 修正久期
	 */
	private Integer madu;
	/**
	 * 凸性
	 */
	private Integer prom;
	/**
	 * 含权凸性
	 */
	private Integer promIr;
	/**
	 * 剩余期限
	 */
	private Integer leftPeriod;
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
	/**
	 * 到期收益率YTM_长
	 */
	private Integer ytmL;
	/**
	 * 久期_长
	 */
	private Integer mdurL;
	/**
	 * 凸性_长
	 */
	private Integer promL;
	/**
	 * 剩余期限_长
	 */
	private Integer leftPeriodL;
	/**
	 * 到期收益率YTM_短
	 */
	private Integer ytmS;
	/**
	 * 久期_短
	 */
	private Integer mdurS;
	/**
	 * 凸性_短
	 */
	private Integer promS;
	/**
	 * 剩余期限_短
	 */
	private Integer leftPeriodS;
	/**
	 * 利差久期
	 */
	private Integer spreadDura;
	/**
	 * 利差凸性
	 */
	private Integer spreadConv;
	/**
	 * 修正久期_长
	 */
	private Integer maduL;
	/**
	 * 修正久期_短
	 */
	private Integer maduS;

}
