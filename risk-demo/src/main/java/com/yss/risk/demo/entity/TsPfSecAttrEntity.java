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
 * @date 2020-09-14 15:13:16
 */
@Data
@TableName("TS_PF_SEC_ATTR")
public class TsPfSecAttrEntity implements Serializable {
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
	 * 归因方案
	 */
	private String attrId;
	/**
	 * 资产分类树ID
	 */
	private String treeId;
	/**
	 * 资产分类子节点
	 */
	private String nodeId;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 证券内码
	 */
	private String symbolId;
	/**
	 * 单期窗口
	 */
	private String timewindow;
	/**
	 * 收益率
	 */
	private Integer yldrate1;
	/**
	 * 收益率2
	 */
	private Integer yldrate2;
	/**
	 * 收益率3
	 */
	private Integer yldrate3;
	/**
	 * 权重
	 */
	private Integer weight1;
	/**
	 * 权重2
	 */
	private Integer weight2;
	/**
	 * 权重3
	 */
	private Integer weight3;
	/**
	 * 基准收益率
	 */
	private Integer bmYldrate;
	/**
	 * 基准权重
	 */
	private Integer bmWeight;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;

}
