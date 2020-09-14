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
 * @date 2020-09-14 15:13:40
 */
@Data
@TableName("TMP_DATE1")
public class TmpDate1Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组合代码
	 */
	@TableId
	private String pfId;
	/**
	 * $column.comments
	 */
	private String bizDate;

}
