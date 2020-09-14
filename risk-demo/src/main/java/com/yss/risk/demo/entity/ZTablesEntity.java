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
 * @date 2020-09-14 15:13:08
 */
@Data
@TableName("Z_TABLES")
public class ZTablesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String tableName;
	/**
	 * $column.comments
	 */
	private String tablespaceName;
	/**
	 * $column.comments
	 */
	private Integer numRows;
	/**
	 * $column.comments
	 */
	private Integer blocks;

}
