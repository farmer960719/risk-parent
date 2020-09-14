package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * tabledesc
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@Data
@TableName("TS_PF_AC_FIXATTR_FI")
public class TsPfAcFixattrFiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Integer id;
	/**
	 * 组合账户内码
	 */
	private String painnercode;
	/**
	 * 业务日期
	 */
	private String bizdate;
	/**
	 * 资产节点代码
	 */
	private String assetcode;
	/**
	 * 单期窗口
	 */
	private String timewindow;
	/**
	 * 是否含总体久期配置决策过程
	 */
	private String hisconfig;
	/**
	 * 归因模型
	 */
	private String modeltype;
	/**
	 * 收益率贡献
	 */
	private String yrattr;
	/**
	 * 曲线代码
	 */
	private String irtscode;
	/**
	 * 资产类收益率
	 */
	private Integer assetrate;
	/**
	 * 基准收益率
	 */
	private Integer bmrate;
	/**
	 * 无风险收益率
	 */
	private Integer riskfreebmrate;
	/**
	 * 资产类权重
	 */
	private Integer assetweight;
	/**
	 * 基准权重
	 */
	private Integer bmweight;
	/**
	 * 资产类久期
	 */
	private Integer assetmdur;
	/**
	 * 基准久期
	 */
	private Integer bmmdur;
	/**
	 * 总体久期配置效应
	 */
	private Integer configeffect;
	/**
	 * 加权久期模型久期调整后配置效应
	 */
	private Integer wconfigeffect;
	/**
	 * 加权久期模型证券/发行选择效应
	 */
	private Integer wselecteffect;
	/**
	 * 久期效应
	 */
	private Integer dureffbrinson;
	/**
	 * Brinson模型久期调整后配置效应
	 */
	private Integer bconfigeffect;
	/**
	 * Brinson模型证券/发行选择效应
	 */
	private Integer bselecteffect;
	/**
	 * 资产类利息收入效应
	 */
	private Integer assetincomeeffect;
	/**
	 * 基准利息收入效应
基准利息收入效应
	 */
	private Integer bmincomeeffect;
	/**
	 * 资产类利率变动效应
	 */
	private Integer assettreasuryeffect;
	/**
	 * 基准利率变动效应
	 */
	private Integer bmtreasuryeffect;
	/**
	 * 资产类利差变动效应
	 */
	private Integer assetspreadeffect;
	/**
	 * 基准利差变动效应
	 */
	private Integer bmspreadeffect;
	/**
	 * Campisi模型资产类选择效应
	 */
	private Integer cassetselectioneffect;
	/**
	 * Campisi模型基准选择效应
	 */
	private Integer cbmselectioneffect;
	/**
	 * 利息配置效应
	 */
	private Integer incomeallocation;
	/**
	 * 利息选择效应
	 */
	private Integer incomeselection;
	/**
	 * 曲线其他变化
	 */
	private Integer otheryieldcurveeffects;
	/**
	 * 利差配置效应
	 */
	private Integer spreadallocation;
	/**
	 * 选择效应
	 */
	private Integer issueselection;
	/**
	 * 收益率类型
	 */
	private String ratetype;
	/**
	 * 方案id
	 */
	private String planid;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;

}
