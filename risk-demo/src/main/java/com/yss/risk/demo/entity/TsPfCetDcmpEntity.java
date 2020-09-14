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
@TableName("TS_PF_CET_DCMP")
public class TsPfCetDcmpEntity implements Serializable {
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
	 * CET
	 */
	private Integer cet;
	/**
	 * 边际CET
	 */
	private Integer mcet;
	/**
	 * 成分CET
	 */
	private Integer ccet;
	/**
	 * 增量CET
	 */
	private Integer icet;
	/**
	 * 权重
	 */
	private Integer wi;
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
	 * 成份贡献度
	 */
	private Integer pcet;

}
