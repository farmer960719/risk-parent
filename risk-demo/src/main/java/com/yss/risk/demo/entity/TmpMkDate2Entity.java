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
@TableName("TMP_MK_DATE2")
public class TmpMkDate2Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????
	 */
	@TableId
	private String pfId;
	/**
	 * $column.comments
	 */
	private String bizDate;
	/**
	 * $column.comments
	 */
	private String checkId;
	/**
	 * $column.comments
	 */
	private Date checkTime;
	/**
	 * $column.comments
	 */
	private Integer cChecked;

}
