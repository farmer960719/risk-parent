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
@TableName("TR_PAR_OPENFUND_INFO")
public class TrParOpenfundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 组合代码
	 */
	private String zqdm;
	/**
	 * 单位净值
	 */
	private Integer netValue;
	/**
	 * $column.comments
	 */
	private Integer beginNet;
	/**
	 * 累计净值
	 */
	private Integer totalNet;
	/**
	 * $column.comments
	 */
	private Integer adjustNet;
	/**
	 * $column.comments
	 */
	private Integer adjustInt;
	/**
	 * $column.comments
	 */
	private String divDate;
	/**
	 * 日期
	 */
	private String dataDate;
	/**
	 * 市场
	 */
	private String market;
	/**
	 * $column.comments
	 */
	private String fundType;
	/**
	 * $column.comments
	 */
	private Integer fundStype;
	/**
	 * 基金规模
	 */
	private Integer totalAmt;
	/**
	 * $column.comments
	 */
	private Integer batavalue;

}
