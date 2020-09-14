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
 * @date 2020-09-14 15:13:30
 */
@Data
@TableName("TP_FUNC_TREE")
public class TpFuncTreeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 功能ID
	 */
	private String schemeId;
	/**
	 * 功能名称
	 */
	private String schemeName;
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
	 * 父节点功能ID
	 */
	private String schemeParentId;
	/**
	 * 树类型（支持多棵树）
	 */
	private String treeType;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 是否公共功能
	 */
	private Integer isPublic;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 创建人
	 */
	private String createPrsn;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改人
	 */
	private String mdfyPrsn;
	/**
	 * 修改时间
	 */
	private Date mdfyTime;

}
