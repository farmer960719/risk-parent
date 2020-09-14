package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 回撤落地表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
@Data
@TableName("TS_PF_MDD")
public class TsPfMddEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 开始日期
	 */
	private String beginDate;
	/**
	 * 结束日期
	 */
	private String endDate;
	/**
	 * 日期类型
	 */
	private String dateType;
	/**
	 * 币种类型
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 第几大回撤
	 */
	private Integer mddNum;
	/**
	 * 回撤开始日期
	 */
	private String mddBeginDate;
	/**
	 * 回撤结束日期
	 */
	private String mddEndDate;
	/**
	 * 回撤率
	 */
	private Integer mddYldrate;
	/**
	 * 修复开始日期
	 */
	private String reBeginDate;
	/**
	 * 修复结束日期
	 */
	private String reEndDate;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
