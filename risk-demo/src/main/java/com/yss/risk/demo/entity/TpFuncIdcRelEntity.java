package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 定义自定义功能中每个列对应的指标类
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
@Data
@TableName("TP_FUNC_IDC_REL")
public class TpFuncIdcRelEntity implements Serializable {
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
	 * 显示名称
	 */
	private String columnName;
	/**
	 * 指标类id
	 */
	private String idcId;
	/**
	 * 列类型__指标，表达式
	 */
	private String columnKind;
	/**
	 * 表达式
	 */
	private String express;
	/**
	 * 排序号 ( 对于4类型的表格大于0的列是动态的 )
	 */
	private Integer ord;
	/**
	 * 显示单位 (元   %    万元   年、倍)
	 */
	private String unitD;
	/**
	 * 数据格式字典:1文本,2整数,3货币,4数值
	 */
	private String datatype;
	/**
	 * 数据精度
	 */
	private Integer dataprecision;
	/**
	 * 数据对齐方式字典:1左对齐,2右对齐,3居中
	 */
	private String dataalign;
	/**
	 * 是否显示: 1显示,其他不显示
	 */
	private String isshow;
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
	 * $column.comments
	 */
	private String expressname;
	/**
	 * 重仓排序
	 */
	private String isHeavyheld;
	/**
	 * 多组合对比
	 */
	private String isCompare;

}
