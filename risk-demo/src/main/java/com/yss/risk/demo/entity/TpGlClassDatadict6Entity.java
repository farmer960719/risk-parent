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
 * @date 2020-09-14 15:13:31
 */
@Data
@TableName("TP_GL_CLASS_DATADICT6")
public class TpGlClassDatadict6Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String tableName;
	/**
	 * $column.comments
	 */
	private String keyName;
	/**
	 * $column.comments
	 */
	private String classId;
	/**
	 * $column.comments
	 */
	private String beginDate;
	/**
	 * $column.comments
	 */
	private Integer orValidD;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private String endDate;

}
