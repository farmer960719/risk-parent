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
 * @date 2020-09-14 15:13:29
 */
@Data
@TableName("TP_RP_I18N")
public class TpRpI18nEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 简体中文(Simplified Chinese)
	 */
	private String rpSc;
	/**
	 * 繁体中文(Traditional Chinese)
	 */
	private String rpTc;
	/**
	 * English
	 */
	private String rpE;
	/**
	 * 是否有效
	 */
	private Integer isValid;
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
