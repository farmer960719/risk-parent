package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 外部组合树定义表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:25
 */
@Data
@TableName("TR_PAR_TREE_REL")
public class TrParTreeRelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 子组合节点内码
	 */
	private String pfChildId;
	/**
	 * 父组合节点内码
	 */
	private String pfParentId;
	/**
	 * 父组合节点名称
	 */
	private String pfChildName;
	/**
	 * 外部组合树ID
	 */
	private String treeId;
	/**
	 * 层级
	 */
	private Integer nodeLevel;
	/**
	 * 节点顺序
	 */
	private Integer nodeSeq;
	/**
	 * 是否叶子节点
	 */
	private Integer orLeafnode;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 修改人
	 */
	private String mdfyPrsn;
	/**
	 * 创建人
	 */
	private String createPrsn;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date mdfyTime;
	/**
	 * 组合节点内码
	 */
	private String pfId;
	/**
	 * 组合树类型
	 */
	private String treeType;
	/**
	 * 组合标签标识
	 */
	private String pfTag;

}
