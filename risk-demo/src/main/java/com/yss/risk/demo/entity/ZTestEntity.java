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
 * @date 2020-09-14 15:13:07
 */
@Data
@TableName("Z_TEST")
public class ZTestEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer f1;
	/**
	 * $column.comments
	 */
	private Integer f2;
	/**
	 * $column.comments
	 */
	private Integer f3;
	/**
	 * $column.comments
	 */
	private Integer f4;
	/**
	 * $column.comments
	 */
	private Integer f5;

}
