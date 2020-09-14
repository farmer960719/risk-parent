package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务计算日志详情
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:41
 */
@Data
@TableName("TK_TASK_DETAIL_LOG")
public class TkTaskDetailLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private String id;
	/**
	 * 日志号
	 */
	private String logId;
	/**
	 * 日志详细信息
	 */
	private String detailMessage;
	/**
	 * 日志参数
	 */
	private String detailParam;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 计算类名
	 */
	private String className;

}
