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
 * @date 2020-09-14 15:13:21
 */
@Data
@TableName("TS_PF_AC_YCD_FI")
public class TsPfAcYcdFiEntity implements Serializable {
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
	 * 分组树
	 */
	private String treeId;
	/**
	 * 分组项
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
	 * 日期类型（月、季、年）
	 */
	private String dateType;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 期初权重
	 */
	private Integer weightBd;
	/**
	 * 期末权重
	 */
	private Integer weightEd;
	/**
	 * 平均权重
	 */
	private Integer weightAvg;
	/**
	 * 收益率
	 */
	private Integer yldrate;
	/**
	 * 收益率贡献度
	 */
	private Integer ycd;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
