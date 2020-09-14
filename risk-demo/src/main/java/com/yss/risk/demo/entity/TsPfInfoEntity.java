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
 * @date 2020-09-14 15:13:18
 */
@Data
@TableName("TS_PF_INFO")
public class TsPfInfoEntity implements Serializable {
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
	 * 净值
	 */
	private Integer nvMv;
	/**
	 * 前一日净值
	 */
	private Integer preNvMv;
	/**
	 * 总资产（市值）
	 */
	private Integer atTotMv;
	/**
	 * 总负债
	 */
	private Integer liabilityTotMv;
	/**
	 * 净值（成本）
	 */
	private Integer nvCost;
	/**
	 * 组合份额
	 */
	private Integer pfShare;
	/**
	 * 单位净值
	 */
	private Integer unitNv;
	/**
	 * 拨入
	 */
	private Integer transinAmt;
	/**
	 * 拨出
	 */
	private Integer transoutAmt;
	/**
	 * 净拨入
	 */
	private Integer netTransinAmt;
	/**
	 * 未实现收益
	 */
	private Integer unreaInc;
	/**
	 * 利息收入
	 */
	private Integer iestInc;
	/**
	 * 溢折价摊销
	 */
	private Integer amorInc;
	/**
	 * 红利收入
	 */
	private Integer bonusInc;
	/**
	 * 差价收入
	 */
	private Integer difInc;
	/**
	 * 利息支出
	 */
	private Integer pyblInc;
	/**
	 * 减值损失
	 */
	private Integer dimiProvn;
	/**
	 * 股权收益
	 */
	private Integer peInc;
	/**
	 * 交易费用
	 */
	private Integer tdFee;
	/**
	 * 其他收入
	 */
	private Integer otrInc;
	/**
	 * 其他费用
	 */
	private Integer otrFee;
	/**
	 * 已实现收益
	 */
	private Integer reaInc;
	/**
	 * 总收益
	 */
	private Integer plAmt;
	/**
	 * 交易类未实现收益
	 */
	private Integer unreaIncC;
	/**
	 * 调整损益
	 */
	private Integer adjustPrePl;
	/**
	 * 报表折算差额损益
	 */
	private Integer transBalPl;
	/**
	 * 报表折算成本
	 */
	private Integer transBalCost;
	/**
	 * 报表折算市值
	 */
	private Integer transBalMv;
	/**
	 * 股权准备
	 */
	private Integer pePrepare;
	/**
	 * 管理费
	 */
	private Integer adminFee;
	/**
	 * 托管费
	 */
	private Integer trustFee;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 总资产（成本）
	 */
	private Integer atTotCost;
	/**
	 * 可供出售类未实现收益
	 */
	private Integer unreaIncS;

}
