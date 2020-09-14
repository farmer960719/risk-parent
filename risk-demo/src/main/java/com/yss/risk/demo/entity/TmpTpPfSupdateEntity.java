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
 * @date 2020-09-14 15:13:36
 */
@Data
@TableName("TMP_TP_PF_SUPDATE")
public class TmpTpPfSupdateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String pfId;
	/**
	 * $column.comments
	 */
	private String srcSys;
	/**
	 * $column.comments
	 */
	private String pfType;
	/**
	 * $column.comments
	 */
	private Integer pfNumebr;
	/**
	 * $column.comments
	 */
	private String bizDate;
	/**
	 * $column.comments
	 */
	private String upBizDate;
	/**
	 * $column.comments
	 */
	private Integer id;

}
