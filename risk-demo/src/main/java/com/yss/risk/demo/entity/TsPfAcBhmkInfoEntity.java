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
 * @date 2020-09-14 15:13:23
 */
@Data
@TableName("TS_PF_AC_BHMK_INFO")
public class TsPfAcBhmkInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 分组树
	 */
	private String treeId;
	/**
	 * 分组项
	 */
	private String nodeId;
	/**
	 * 基准收益率
	 */
	private Integer yldrate;
	/**
	 * 无风险收益率
	 */
	private Integer risklessYldrate;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer isValid;

}
