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
 * @date 2020-09-14 15:13:27
 */
@Data
@TableName("TP_RP_TEMPLET_REL_INFO")
public class TpRpTempletRelInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 父模板Id
	 */
	private String parentId;
	/**
	 * 组合模板Id
	 */
	private String templetId;
	/**
	 * 组合模板名称
	 */
	private String templetName;
	/**
	 * 模板对应的组合个数
	 */
	private String pfNum;
	/**
	 * 备注
	 */
	private String fmemo;
	/**
	 * 是否有效：1有效,0无效
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
	 * 模板传递的组合参数的名称，不是别名
	 */
	private String temPfName;

}
