package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务参数日志表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:40
 */
@Data
@TableName("TK_TASK_PARAMS")
public class TkTaskParamsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 任务号
	 */
	private String taskId;
	/**
	 * 功能号
	 */
	private String funcId;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 业务开始日期
	 */
	private String beginDate;
	/**
	 * 业务介绍日期
	 */
	private String endDate;
	/**
	 * 资产树编码
	 */
	private String assetTreeId;
	/**
	 * 展现方式
	 */
	private String showMode;
	/**
	 * 资产层级
	 */
	private String showLever;
	/**
	 * 时间窗口
	 */
	private String timeWindow;
	/**
	 * 币种代码
	 */
	private String ccyType;
	/**
	 * 详细计算参数
	 */
	private String detailParams;
	/**
	 * 时间标识
	 */
	private Date timeMark;

}
