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
 * @date 2020-09-14 15:13:33
 */
@Data
@TableName("TP_DATACHECK_LOG_HIDE")
public class TpDatacheckLogHideEntity implements Serializable {
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
	private String treeId;
	/**
	 * $column.comments
	 */
	private String nodeId;
	/**
	 * $column.comments
	 */
	private String symbolId;
	/**
	 * $column.comments
	 */
	private String ccyType;
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * $column.comments
	 */
	private String warningType;

}
