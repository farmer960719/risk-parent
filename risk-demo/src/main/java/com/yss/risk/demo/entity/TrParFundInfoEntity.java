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
@TableName("TR_PAR_FUND_INFO")
public class TrParFundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 市场
	 */
	private String jjsc;
	/**
	 * 组合代码/基金代码
	 */
	private String jjdm;
	/**
	 * 组合名称/基金名称
	 */
	private String jjmc;
	/**
	 * $column.comments
	 */
	private String jjlx;
	/**
	 * 管理人
	 */
	private Integer glr;
	/**
	 * 托管人
	 */
	private Integer tgr;
	/**
	 * $column.comments
	 */
	private String dygx;
	/**
	 * 基金类型
	 */
	private String sbjjlx;
	/**
	 * 管理人名称
	 */
	private String glrmc;
	/**
	 * $column.comments
	 */
	private String jzfs;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
