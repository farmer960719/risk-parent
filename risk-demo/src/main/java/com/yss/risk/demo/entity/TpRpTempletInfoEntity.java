package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 报表模板配置信息表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:28
 */
@Data
@TableName("TP_RP_TEMPLET_INFO")
public class TpRpTempletInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer fid;
	/**
	 * 模板代码
	 */
	private String templetId;
	/**
	 * 组合内码
	 */
	private String pfId;
	/**
	 * 模板名称
	 */
	private String templetName;
	/**
	 * 报告生成频率
	 */
	private Integer reportFrequency;
	/**
	 * 报告发送时间提醒
	 */
	private String reportSenddate;
	/**
	 * 报告生成类型

	 */
	private String reportType;
	/**
	 * 客户id（可多选）
	 */
	private String customerId;
	/**
	 * 是否有效(1启用0禁用)
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
	 * 0未审核，1已审核
	 */
	private Integer cChecked;
	/**
	 * 审核人
	 */
	private Integer checkId;
	/**
	 * 审核时间
	 */
	private Date checkTime;

}
