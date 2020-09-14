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
@TableName("TP_FUNC_IDX_PARA")
public class TpFuncIdxParaEntity implements Serializable {
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
	 * 参数序号
	 */
	private Integer paraNum;
	/**
	 * 参数代码
	 */
	private String paraId;
	/**
	 * 参数值
	 */
	private String paraValue;
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
	private Date mdfyTime;
	/**
	 * 修改时间
	 */
	private String mdfyPrsn;
	/**
	 * 是否可配置
	 */
	private Integer isCfg;

}
