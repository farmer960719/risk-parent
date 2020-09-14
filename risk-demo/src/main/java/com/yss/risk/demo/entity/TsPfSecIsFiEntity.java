package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 组合个券投资风格
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:15
 */
@Data
@TableName("TS_PF_SEC_IS_FI")
public class TsPfSecIsFiEntity implements Serializable {
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
	 * $column.comments
	 */
	private String symbolId;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 币种类型  
	 */
	private String ccyType;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 大中小盘 --LC大盘，MC中盘，SC小盘
	 */
	private String marketCap;
	/**
	 * 成长价值 --GRW成长型，VAL价值型，CORE混合型
	 */
	private String growthValue;

}
