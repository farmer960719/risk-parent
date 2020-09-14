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
 * @date 2020-09-14 15:13:37
 */
@Data
@TableName("TMP_TK_PF")
public class TmpTkPfEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 组合ID
	 */
	@TableId
	private String pfId;
	/**
	 * 开始日期
	 */
	private String dataBegDate;
	/**
	 * 结束日期
	 */
	private String dataEndDate;
	/**
	 * 基准
	 */
	private String bhmkId;
	/**
	 * 是否境外，1境内2境外
	 */
	private String pfregionIdD;

}
