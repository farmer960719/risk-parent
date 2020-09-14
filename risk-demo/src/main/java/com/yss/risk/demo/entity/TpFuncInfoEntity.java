package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 自定义查询页面
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:32
 */
@Data
@TableName("TP_FUNC_INFO")
public class TpFuncInfoEntity implements Serializable {
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
	 * 功能名称
	 */
	private String funcName;
	/**
	 * 功能备注
	 */
	private String funcMemo;
	/**
	 * 功能标识__系统 用户自定义
	 */
	private String funcFlag;
	/**
	 * 功能查询显示__组合、基准 资产类 频率 日期
	 */
	private String funcQuery;
	/**
	 * 展示资产层级__组合 组合、资产类 组合、资产类、个券 组合、个券
	 */
	private String funcAtlevel;
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
	 * 资产类
	 */
	private String secTypeCod;
	/**
	 * 显示模式
	 */
	private String showType;
	/**
	 * 币种
	 */
	private String cnyType;
	/**
	 * 资产分类
	 */
	private String treeId;
	/**
	 * 持仓展现方式
	 */
	private String hpShowtype;
	/**
	 * 是否显示负债资产
	 */
	private String orShowliability;
	/**
	 * 工作模式
	 */
	private String workMode;

}
