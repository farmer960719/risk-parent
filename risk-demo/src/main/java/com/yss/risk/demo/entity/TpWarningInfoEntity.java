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
 * @date 2020-09-14 15:13:28
 */
@Data
@TableName("TP_WARNING_INFO")
public class TpWarningInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@TableId
	private Integer id;
	/**
	 * 组合id
	 */
	private String pfId;
	/**
	 * 指标编码
	 */
	private String idxCode;
	/**
	 * 预警关系
	 */
	private String warningRelation;
	/**
	 * 预警值
	 */
	private String warningValue;
	/**
	 * 创建日期
	 */
	private Date createTime;
	/**
	 * 预警名称
	 */
	private String warningName;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 创建人
	 */
	private String createPrsn;
	/**
	 * 修改人
	 */
	private String mdfyPrsn;
	/**
	 * 修改时间
	 */
	private Date mdfyTime;
	/**
	 * 备注
	 */
	private String remarks;
	/**
	 * 报警关系
	 */
	private String alarmRelation;
	/**
	 * 报警值
	 */
	private String alarmValue;
	/**
	 * 注释
	 */
	private String annotation;

}
