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
 * @date 2020-09-14 15:13:09
 */
@Data
@TableName("TS_PF_YLDRATE")
public class TsPfYldrateEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 日收益率
	 */
	private Integer yldrate;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;

}
