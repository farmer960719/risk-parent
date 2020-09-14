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
 * @date 2020-09-14 15:13:26
 */
@Data
@TableName("TR_PAR_FUND_INFO_BAK")
public class TrParFundInfoBakEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String jjsc;
	/**
	 * $column.comments
	 */
	private String jjdm;
	/**
	 * $column.comments
	 */
	private String jjmc;
	/**
	 * $column.comments
	 */
	private String jjlx;
	/**
	 * $column.comments
	 */
	private Integer glr;
	/**
	 * $column.comments
	 */
	private Integer tgr;
	/**
	 * $column.comments
	 */
	private String dygx;
	/**
	 * $column.comments
	 */
	private String sbjjlx;
	/**
	 * $column.comments
	 */
	private String glrmc;
	/**
	 * $column.comments
	 */
	private String jzfs;
	/**
	 * $column.comments
	 */
	private Date timeMark;

}
