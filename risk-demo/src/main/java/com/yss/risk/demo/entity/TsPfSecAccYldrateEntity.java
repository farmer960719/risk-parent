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
 * @date 2020-09-14 15:13:17
 */
@Data
@TableName("TS_PF_SEC_ACC_YLDRATE")
public class TsPfSecAccYldrateEntity implements Serializable {
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
	 * 证券内码
	 */
	private String symbolId;
	/**
	 * 证券代码
	 */
	private String symbolCode;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 收益率
	 */
	private Integer yldrate;
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
	 * 市场代码
	 */
	private String exchTypeD;
	/**
	 * 证券类型
	 */
	private String symbolTypeD;
	/**
	 * 资产树
	 */
	private String treeId;
	/**
	 * 资产节点
	 */
	private String nodeId;

}
