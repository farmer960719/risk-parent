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
 * @date 2020-09-14 15:13:09
 */
@Data
@TableName("TS_PF_ZTINFO")
public class TsPfZtinfoEntity implements Serializable {
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
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 资金总体净值
	 */
	private Integer nvMvZt;
	/**
	 * 资金总体收益
	 */
	private Integer plAmtZt;
	/**
	 * 资金总体净值（不含实业）
	 */
	private Integer nvMvExpe;
	/**
	 * 资金总体收益（不含实业）
	 */
	private Integer plAmtExpe;
	/**
	 * 资金总体日收益率
	 */
	private Integer yldrateZt;
	/**
	 * 资金总体日收益率（不含实业）
	 */
	private Integer yldrateExpe;
	/**
	 * 现金及其等价物净值
	 */
	private Integer nvMvCash;
	/**
	 * 现金及其等价物收益
	 */
	private Integer plAmtCash;
	/**
	 * 现金及其等价物日收益率
	 */
	private Integer yldrateCash;
	/**
	 * 股票类资产净值
	 */
	private Integer nvMvStk;
	/**
	 * 股票类资产收益
	 */
	private Integer plAmtStk;
	/**
	 * 股票类资产日收益率
	 */
	private Integer yldrateStk;
	/**
	 * 境内股票净值
	 */
	private Integer nvMvStkin;
	/**
	 * 境内股票收益
	 */
	private Integer plAmtStkin;
	/**
	 * 境内股票日收益率
	 */
	private Integer yldrateStkin;
	/**
	 * 境外股票净值
	 */
	private Integer nvMvStkout;
	/**
	 * 境外股票收益
	 */
	private Integer plAmtStkout;
	/**
	 * 境外股票日收益率
	 */
	private Integer yldrateStkout;
	/**
	 * 固定收益净值
	 */
	private Integer nvMvFi;
	/**
	 * 固定收益收益
	 */
	private Integer plAmtFi;
	/**
	 * 固定收益日收益率
	 */
	private Integer yldrateFi;
	/**
	 * 实业投资净值
	 */
	private Integer nvMvPe;
	/**
	 * 实业投资收益
	 */
	private Integer plAmtPe;
	/**
	 * 实业投资日收益率
	 */
	private Integer yldratePe;
	/**
	 * 境内股票基准收益率
	 */
	private Integer bhmkYldrateStkin;
	/**
	 * 境外股票基准收益率
	 */
	private Integer bhmkYldrateStkout;
	/**
	 * 固定收益基准收益率
	 */
	private Integer bhmkYldrateFi;
	/**
	 * 实业投资基准收益率
	 */
	private Integer bhmkYldratePe;
	/**
	 * 现金资产基准收益率
	 */
	private Integer bhmkYldrateCash;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;

}
