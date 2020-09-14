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
 * @date 2020-09-14 15:13:11
 */
@Data
@TableName("TS_PF_VOLATILITY")
public class TsPfVolatilityEntity implements Serializable {
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
	 * 下行风险
	 */
	private Integer downrisk;
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

}
