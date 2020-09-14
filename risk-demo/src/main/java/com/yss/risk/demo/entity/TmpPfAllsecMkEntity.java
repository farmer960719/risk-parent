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
 * @date 2020-09-14 15:13:39
 */
@Data
@TableName("TMP_PF_ALLSEC_MK")
public class TmpPfAllsecMkEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
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
	private String listDate;
	/**
	 * $column.comments
	 */
	private String delistDate;

}
