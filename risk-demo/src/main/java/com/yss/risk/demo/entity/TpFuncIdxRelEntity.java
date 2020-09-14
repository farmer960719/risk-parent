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
 * @date 2020-09-14 15:13:32
 */
@Data
@TableName("TP_FUNC_IDX_REL")
public class TpFuncIdxRelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 自增序列
	 */
	@TableId
	private Integer id;
	/**
	 * 功能id
	 */
	private String funcId;
	/**
	 * 列id
	 */
	private String columnId;
	/**
	 * 指标类id
	 */
	private String idcId;
	/**
	 * 指标代码
	 */
	private String idxCode;
	/**
	 * 指标来源类型 ( 1-存储指标，2-现算指标 ) 
	 */
	private String idxType;
	/**
	 * 资产层面: 11-组合;21-资产类;31-个券;12-基准;22-基准资产类;32市场个券13,23,33指数
	 */
	private String atLevel;
	/**
	 * 时间方式: 期间、时间点
	 */
	private String timeType;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 创建人
	 */
	private String createPrsn;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改人
	 */
	private String mdfyPrsn;
	/**
	 * 修改时间
	 */
	private Date mdfyTime;
	/**
	 * 指标类型
	 */
	private String idxKind;

}
