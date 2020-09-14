package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Brison结果表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:19
 */
@Data
@TableName("TS_PF_BRISON_FI")
public class TsPfBrisonFiEntity implements Serializable {
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
	 * 组合收益率
	 */
	private Integer pfYldrate;
	/**
	 * 基准收益率
	 */
	private Integer bmYldrate;
	/**
	 * 配置效应
	 */
	private Integer allocative;
	/**
	 * 选择效益
	 */
	private Integer selection;
	/**
	 * 交叉效益
	 */
	private Integer crosstalk;
	/**
	 * $column.comments
	 */
	private String treeId;
	/**
	 * $column.comments
	 */
	private String nodeId;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 组合权重
	 */
	private Integer pfWeight;
	/**
	 * 基准权重
	 */
	private Integer bmWeight;

}
