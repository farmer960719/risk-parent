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
@TableName("Z_TAB_COLS")
public class ZTabColsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String tableName;
	/**
	 * $column.comments
	 */
	private String columnName;
	/**
	 * $column.comments
	 */
	private String dataType;
	/**
	 * $column.comments
	 */
	private Integer columnId;

}
