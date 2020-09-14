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
 * @date 2020-09-14 15:13:19
 */
@Data
@TableName("TS_PF_DEVIATION_DCMP")
public class TsPfDeviationDcmpEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
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
	 * 证券内码
	 */
	private String symbolId;
	/**
	 * 市场代码
	 */
	private String exchTypeD;
	/**
	 * 标准差
	 */
	private Integer deviation;
	/**
	 * 边际标准差
	 */
	private Integer mdeviation;
	/**
	 * 成分标准差
	 */
	private Integer cdeviation;
	/**
	 * 增量标准差
	 */
	private Integer ideviation;
	/**
	 * 权重
	 */
	private Integer weight;
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
	/**
	 * 资产层级:P组合,G资产划分,S个券
	 */
	private String atLevel;
	/**
	 * 分组项（节点）
	 */
	private String nodeId;
	/**
	 * 证券代码
	 */
	private String symbolCode;
	/**
	 * 标准差贡献度
	 */
	private Integer pdeviation;

}
