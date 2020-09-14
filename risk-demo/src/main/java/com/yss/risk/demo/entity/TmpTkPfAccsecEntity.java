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
 * @date 2020-09-14 15:13:37
 */
@Data
@TableName("TMP_TK_PF_ACCSEC")
public class TmpTkPfAccsecEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String pfId;
	/**
	 * $column.comments
	 */
	private String securityId;
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
	private String exchTypeD;
	/**
	 * $column.comments
	 */
	private String symbolTypeD;
	/**
	 * $column.comments
	 */
	private String secCode;
	/**
	 * $column.comments
	 */
	private String marketCode;
	/**
	 * $column.comments
	 */
	private String attypeIdD;
	/**
	 * $column.comments
	 */
	private String attypeExtIdD;
	/**
	 * $column.comments
	 */
	private String finAttrIdD;
	/**
	 * $column.comments
	 */
	private String hdAttrIdD;
	/**
	 * $column.comments
	 */
	private String secSrc;
	/**
	 * $column.comments
	 */
	private String orLmt;
	/**
	 * $column.comments
	 */
	private String curIdD;

}
