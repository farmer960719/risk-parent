package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 光大银行配置信息表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:06
 */
@Data
@TableName("T_CEB_CONFIG")
public class TCebConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 配置类型
	 */
	@TableId
	private String ftype;
	/**
	 * 配置值
	 */
	private String fvalue;
	/**
	 * 配置值2
	 */
	private String fvalue2;

}
