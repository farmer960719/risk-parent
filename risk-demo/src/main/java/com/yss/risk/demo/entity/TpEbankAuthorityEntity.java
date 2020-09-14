package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 网银权限控制表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
@Data
@TableName("TP_EBANK_AUTHORITY")
public class TpEbankAuthorityEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 客户号
	 */
	private String ebankCstmrid;
	/**
	 * 资产代码
	 */
	private String ebankPfid;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 托管外包
	 */
	private Integer orCust;
	/**
	 * 是否提供网银
	 */
	private Integer orEbank;
	/**
	 * 备注
	 */
	private String memo;
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

}
