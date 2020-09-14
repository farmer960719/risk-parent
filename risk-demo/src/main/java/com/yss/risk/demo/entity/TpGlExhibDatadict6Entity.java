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
@TableName("TP_GL_EXHIB_DATADICT6")
public class TpGlExhibDatadict6Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String classId;
	/**
	 * $column.comments
	 */
	private String className;
	/**
	 * $column.comments
	 */
	private String classEname;
	/**
	 * $column.comments
	 */
	private String keyId;
	/**
	 * $column.comments
	 */
	private String keyName;
	/**
	 * $column.comments
	 */
	private String keyEname;
	/**
	 * $column.comments
	 */
	private Integer orValidD;
	/**
	 * $column.comments
	 */
	private String memo;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private Integer sta;
	/**
	 * $column.comments
	 */
	private Integer keySeq;
	/**
	 * $column.comments
	 */
	private Integer cChecked;
	/**
	 * $column.comments
	 */
	private String checkId;
	/**
	 * $column.comments
	 */
	private String checkName;
	/**
	 * $column.comments
	 */
	private Date checkTime;
	/**
	 * $column.comments
	 */
	private String createPrsn;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private String mdfyPrsn;
	/**
	 * $column.comments
	 */
	private Date mdfyTime;

}
