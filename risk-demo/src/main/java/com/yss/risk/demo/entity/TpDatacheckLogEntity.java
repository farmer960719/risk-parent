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
 * @date 2020-09-14 15:13:35
 */
@Data
@TableName("TP_DATACHECK_LOG")
public class TpDatacheckLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 组合id
	 */
	private String pfId;
	/**
	 * $column.comments
	 */
	private String treeId;
	/**
	 * $column.comments
	 */
	private String nodeId;
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
	private String ccyType;
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * 核对类型ID（11,12,13…）
	 */
	private String warningType;
	/**
	 * 核对类型名
	 */
	private String warningName;
	/**
	 * 报警值
	 */
	private String warningValue;
	/**
	 * 备注
	 */
	private String warningMemo;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private Integer isValid;

}
