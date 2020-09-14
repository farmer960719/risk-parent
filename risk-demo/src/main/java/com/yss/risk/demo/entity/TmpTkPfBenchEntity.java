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
 * @date 2020-09-14 15:13:34
 */
@Data
@TableName("TMP_TK_PF_BENCH")
public class TmpTkPfBenchEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String pfId;
	/**
	 * $column.comments
	 */
	private String bhmkId;
	/**
	 * $column.comments
	 */
	private String portType;
	/**
	 * $column.comments
	 */
	private String dataBegDate;
	/**
	 * $column.comments
	 */
	private String dataEndDate;

}
