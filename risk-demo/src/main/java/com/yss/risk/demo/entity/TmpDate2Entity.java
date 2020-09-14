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
 * @date 2020-09-14 15:13:38
 */
@Data
@TableName("TMP_DATE2")
public class TmpDate2Entity implements Serializable {
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
	/**
	 * 0已审核，1反审核
	 */
	private Integer cChecked;
	/**
	 * 审核人
	 */
	private String checkId;
	/**
	 * 审核时间
	 */
	private Date checkTime;

}
