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
 * @date 2020-09-14 15:13:20
 */
@Data
@TableName("TS_PF_BHMK_INFO")
public class TsPfBhmkInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String bizDate;
	/**
	 * $column.comments
	 */
	private String pfId;
	/**
	 * $column.comments
	 */
	private String bhmkId;
	/**
	 * $column.comments
	 */
	private String bhmkRisklessId;
	/**
	 * $column.comments
	 */
	private Integer yldrate;
	/**
	 * $column.comments
	 */
	private Integer risklessYldrate;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private Integer isValid;

}
