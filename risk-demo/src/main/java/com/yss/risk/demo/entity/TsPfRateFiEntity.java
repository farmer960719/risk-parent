package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 组合收益分析
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
@Data
@TableName("TS_PF_RATE_FI")
public class TsPfRateFiEntity implements Serializable {
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
	 * 资本加权收益率
	 */
	private Integer cwYldrate;
	/**
	 * 股票投资周转率
	 */
	private Integer turnoverRate;
	/**
	 * 组合交易效率
	 */
	private Integer tdRate;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 时间加权收益率
	 */
	private Integer twYldrate;
	/**
	 * 最大回撤
	 */
	private Integer maxDropdown;
	/**
	 * 可决系数
	 */
	private Integer raroc;

}
