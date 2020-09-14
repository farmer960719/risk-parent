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
 * @date 2020-09-14 15:13:16
 */
@Data
@TableName("TS_PF_SEC_ACC_YLDRATE_1")
public class TsPfSecAccYldrate1Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String bizDate;
	/**
	 * $column.comments
	 */
	private String pfId;
	/**
	 * $column.comments
	 */
	private String symbolId;
	/**
	 * $column.comments
	 */
	private String symbolCode;
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * $column.comments
	 */
	private Integer yldrate;
	/**
	 * $column.comments
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private String ccyType;
	/**
	 * $column.comments
	 */
	private String exchTypeD;
	/**
	 * $column.comments
	 */
	private String symbolTypeD;
	/**
	 * $column.comments
	 */
	private String treeId;
	/**
	 * $column.comments
	 */
	private String nodeId;

}
