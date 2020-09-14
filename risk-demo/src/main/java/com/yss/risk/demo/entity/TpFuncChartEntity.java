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
 * @date 2020-09-14 15:13:33
 */
@Data
@TableName("TP_FUNC_CHART")
public class TpFuncChartEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 功能id
	 */
	private String funcId;
	/**
	 * 显示模式
	 */
	private String showType;
	/**
	 * 图形布局
	 */
	private String chartLayout;
	/**
	 * 图标类型 普通线型 line ,普通柱状 column,普通饼图 pie
	 */
	private String chartType;
	/**
	 * 图标名称
	 */
	private String chartName;
	/**
	 * x轴数据 时间 time 动态 dyn
	 */
	private String xAxis;
	/**
	 * 左y轴数据
	 */
	private String lYaxis;
	/**
	 * z轴数据
	 */
	private String zAxis;
	/**
	 * 是否显示到个券
	 */
	private Integer orShowsec;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private Date createTime;
	/**
	 * $column.comments
	 */
	private String createPrsn;
	/**
	 * $column.comments
	 */
	private String mdfyPrsn;
	/**
	 * $column.comments
	 */
	private Date mdfyTime;
	/**
	 * 右y轴数据
	 */
	private String rYaxis;
	/**
	 * 左y轴数据单位
	 */
	private String lYaxisunit;
	/**
	 * 右y轴数据单位
	 */
	private String rYaxisunit;

}
