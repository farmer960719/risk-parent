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
 * @date 2020-09-14 15:13:12
 */
@Data
@TableName("TS_PF_VAR_DCMP")
public class TsPfVarDcmpEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 0组合,1资产类,2个券
	 */
	private String datatype;
	/**
	 * 资产分类节点
	 */
	private String assetclassnode;
	/**
	 * 证券代码
	 */
	private String seccode;
	/**
	 * 交易所代码
	 */
	private String exchange;
	/**
	 * var值
	 */
	private Integer var;
	/**
	 * 边际var
	 */
	private Integer mvar;
	/**
	 * 成分var
	 */
	private Integer cvar;
	/**
	 * 增量var
	 */
	private Integer ivar;
	/**
	 * 权重
	 */
	private Integer wi;
	/**
	 * 市值
	 */
	private Integer marketvalue;
	/**
	 * 相对VaR
	 */
	private Integer varrate;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
