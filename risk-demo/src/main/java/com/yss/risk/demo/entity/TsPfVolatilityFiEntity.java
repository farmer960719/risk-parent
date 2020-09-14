package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 组合风险指标
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:10
 */
@Data
@TableName("TS_PF_VOLATILITY_FI")
public class TsPfVolatilityFiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 日期类型

	 */
	private String dateType;
	/**
	 * 业务日期

	 */
	private String bizDate;
	/**
	 * 币种类型
  
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 夏普比率
	 */
	private Integer sharpe;
	/**
	 * 特雷纳比率
	 */
	private Integer treynor;
	/**
	 * 信息比率
	 */
	private Integer informationratio;
	/**
	 * 索丁诺比率
	 */
	private Integer sortino;
	/**
	 * M平方测度
	 */
	private Integer m2;
	/**
	 * 跟踪误差
	 */
	private Integer trackingerror;
	/**
	 * R平方
	 */
	private Integer r2;
	/**
	 * 标准差
	 */
	private Integer deviation;
	/**
	 * 方差
	 */
	private Integer variance;
	/**
	 * 下方标准差(与均值比较)
	 */
	private Integer compareAverageDeviation;
	/**
	 * 詹森系数

	 */
	private Integer jensen;
	/**
	 * 贝塔系数

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
	 * 前推标识
	 */
	private String pushState;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 标准差(与0比较)
	 */
	private Integer compareZeroDeviation;
	/**
	 * 标准差(与基准比较)
	 */
	private Integer compareBhmkDeviation;
	/**
	 * 标准差(与无风险比较)
	 */
	private Integer compareNoriskDeviation;
	/**
	 * 下行风险
	 */
	private Integer downrisk;
	/**
	 * 最大回撤
	 */
	private Integer maxdrawdown;
	/**
	 * 阿尔法
	 */
	private Integer alpha;
	/**
	 * 基准标准差
	 */
	private Integer bmDeviation;

}
