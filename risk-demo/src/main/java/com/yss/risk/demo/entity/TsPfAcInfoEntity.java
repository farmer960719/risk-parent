package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按证券代码汇总

3.包含持仓、交易、损益

 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@Data
@TableName("TS_PF_AC_INFO")
public class TsPfAcInfoEntity implements Serializable {
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
	 * 分组树
	 */
	private String treeId;
	/**
	 * 分组项
	 */
	private String nodeId;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种
	 */
	private String curIdD;
	/**
	 * 持仓数量
	 */
	private Integer hdQty;
	/**
	 * 股票：核算成本
债券：面值（有摊销的话）或者是成本
基金：核算成本
回购：核算成本
权证：核算成本

资产支持证券：面值（有摊销的话）或者是成本
信托：投资金额
股权：投资金额
存款投资：投资金额

	 */
	private Integer costSc;
	/**
	 * 核算成本_净价(原币)；股票：核算成本＋减值准备
债券：面值＋应摊销金额＋减值准备
基金：核算成本＋减值准备
回购：核算成本
权证：核算成本＋减值准备

资产支持证券：核算成本＋应摊销金额＋减值准备
信托：投资金额-返款＋减值准备
股权：投资金额+利息补偿+跟投金额-管理费返还+股权投资差额＋减值准备


	 */
	private Integer netcost;
	/**
	 * 市值_净价(原币)
	 */
	private Integer netmv;
	/**
	 * 成本_全价
	 */
	private Integer fullcost;
	/**
	 * 市值_全价
	 */
	private Integer fullmv;
	/**
	 * 估值增值
	 */
	private Integer evIv;
	/**
	 * 应收利息(原币)；股权：损益调整＋股权资产准备
	 */
	private Integer accrIest;
	/**
	 * 应摊销金额(原币)；债券：应摊销金额
股权：股权投资差额
	 */
	private Integer accrAmor;
	/**
	 * 减值准备(原币)
	 */
	private Integer hpDimiProvn;
	/**
	 * 昨日市值_净价(原币)
	 */
	private Integer preNetmv;
	/**
	 * 昨日核算成本(原币)
	 */
	private Integer preNetcost;
	/**
	 * 应收利息(原币)；股权：损益调整＋股权资产准备
	 */
	private Integer preAccrIest;
	/**
	 * 买成交数量
	 */
	private Integer bTdQty;
	/**
	 * 买应计利息金额(原币)
	 */
	private Integer bAccrIest;
	/**
	 * 买交易应摊销金额(原币)；债券：应摊销金额
股权：股权投资差额
	 */
	private Integer bAccrAmor;
	/**
	 * 买实际发生金额(原币)；成交净价＋交易费用（现金资产＋应付佣金）
	 */
	private Integer bActlAmt;
	/**
	 * 买佣金(原币)；凭证分录：一级费用＋佣金
	 */
	private Integer bComm;
	/**
	 * 买交易费用
	 */
	private Integer bTdFee;
	/**
	 * 买拨入拨出虚拟金额(原币)；拨入拨出证券时发生的估值增值
	 */
	private Integer bEvIv;
	/**
	 * 卖成交数量
	 */
	private Integer sTdQty;
	/**
	 * 卖应计利息金额(原币)
	 */
	private Integer sAccrIest;
	/**
	 * 卖交易应摊销金额(原币)；债券：应摊销金额
股权：股权投资差额
	 */
	private Integer sAccrAmor;
	/**
	 * 卖实际发生金额(原币)；成交净价＋交易费用（现金资产＋应付佣金）
	 */
	private Integer sActlAmt;
	/**
	 * 卖佣金(原币)；凭证分录：一级费用＋佣金
	 */
	private Integer sComm;
	/**
	 * 卖交易费用
	 */
	private Integer sTdFee;
	/**
	 * 卖拨入拨出虚拟金额(原币)；拨入拨出证券时发生的估值增值
	 */
	private Integer sEvIv;
	/**
	 * 每日未实现收益(原币)；价格变化未实现收益
	 */
	private Integer unreaInc;
	/**
	 * 每日利息收入(原币)；
	 */
	private Integer iestInc;
	/**
	 * 每日溢折价(原币)；债券：为每日摊销溢折价
	 */
	private Integer amorInc;
	/**
	 * 每日红利收入(原币)；股票：为当日股利分红
基金：为当日基金分红

	 */
	private Integer bonusInc;
	/**
	 * 每日差价收入(原币)
	 */
	private Integer difInc;
	/**
	 * 每日利息支出(原币)；回购：为每日利息支出

	 */
	private Integer pyblInc;
	/**
	 * 每日减值准备(原币)；
	 */
	private Integer dimiProvn;
	/**
	 * 每日股权投资收益(原币)；股权投资：为当日损益调整
	 */
	private Integer peInc;
	/**
	 * 每日其它收入(原币)；针对非证券类收入
	 */
	private Integer otrInc;
	/**
	 * 每日其它费用(原币)；针对非证券类费用
	 */
	private Integer otrFee;
	/**
	 * 每日已实现(原币)；
	 */
	private Integer reaInc;
	/**
	 * 每日总收益(原币)
	 */
	private Integer plAmt;
	/**
	 * 每日证券分红现金流
	 */
	private Integer cashBonus;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private Integer unreaIncC;
	/**
	 * $column.comments
	 */
	private Integer unreaIncS;

}
