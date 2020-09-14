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
 * @date 2020-09-14 15:13:18
 */
@Data
@TableName("TS_PF_FIXATTR_FI")
public class TsPfFixattrFiEntity implements Serializable {
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
	 * 单期窗口
	 */
	private String timewindow;
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
	 * 组合收益率
	 */
	private Integer parate;
	/**
	 * 基准收益率
	 */
	private Integer bmrate;
	/**
	 * 无风险收益率
	 */
	private Integer riskfreebmrate;
	/**
	 * 组合久期
	 */
	private Integer pamdur;
	/**
	 * 基准久期
	 */
	private Integer bmmdur;
	/**
	 * 总体久期名义组合
	 */
	private Integer bd;
	/**
	 * 久期调整配置组合
	 */
	private Integer rs;
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
	 * 组合利息收入效应
	 */
	private Integer paincomeeffect;
	/**
	 * 基准利息收入效应
基准利息收入效应
	 */
	private Integer bmincomeeffect;
	/**
	 * 组合利率变动效应
	 */
	private Integer patreasuryeffect;
	/**
	 * 基准利率变动效应
	 */
	private Integer bmtreasuryeffect;
	/**
	 * 组合利差变动效应
	 */
	private Integer paspreadeffect;
	/**
	 * 基准利差变动效应
	 */
	private Integer bmspreadeffect;
	/**
	 * Campisi模型组合选择效应
	 */
	private Integer cpaselectioneffect;
	/**
	 * Campisi模型基准选择效应
	 */
	private Integer cbmselectioneffect;
	/**
	 * 平移
	 */
	private Integer duration;
	/**
	 * 利差久期
	 */
	private Integer spreadduration;
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
