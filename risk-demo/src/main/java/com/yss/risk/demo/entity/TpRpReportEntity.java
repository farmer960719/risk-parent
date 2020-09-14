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
@TableName("TP_RP_REPORT")
public class TpRpReportEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 报表名称
	 */
	private String reportname;
	/**
	 * 报表创建时间
	 */
	private Date fcreateTime;
	/**
	 * 报表创建人
	 */
	private Integer fcreateId;
	/**
	 * 报表状态（0已保存，1已提交，2已审核，4已发送）
	 */
	private Integer reportSta;
	/**
	 * 报表存放路径
	 */
	private String filePath;
	/**
	 * 报表审核人
	 */
	private Integer fcheckId;
	/**
	 * 报表审核时间
	 */
	private Date fcheckTime;
	/**
	 * 报表编码
	 */
	private String reportcode;
	/**
	 * 报表发送人
	 */
	private Integer fsendId;
	/**
	 * 报表发送时间
	 */
	private Date fsendTime;
	/**
	 * 备注
	 */
	private String fmemo;
	/**
	 * 报表提交人
	 */
	private String fsumbitId;
	/**
	 * 报表提交时间
	 */
	private Date fsumbitTime;
	/**
	 * 0已审核，1反审核
	 */
	private Integer cChecked;
	/**
	 * 报表对应模板名称
	 */
	private String templetId;
	/**
	 * 报表对应组合内码
	 */
	private String pfId;
	/**
	 * 修改人
	 */
	private String mdfyPrsn;
	/**
	 * 修改时间
	 */
	private Date mdfyTime;
	/**
	 * 报表对应客户id
	 */
	private String customerId;
	/**
	 * 报表查询参数id字符串，逗号隔开，用于报表重新计算
	 */
	private String reportIds;
	/**
	 * 报表查询参数实际值字符串，逗号隔开，用于报表重新计算
	 */
	private String reportValues;
	/**
	 * 报表查询参数显示值字符串，逗号隔开，用于报表重新计算
	 */
	private String reportDisplayvalues;
	/**
	 * 报表类型（SSReport、SimpleReport、WordReport、GraphicReport）
	 */
	private String reportType;
	/**
	 * 报表邮件发送内容
	 */
	private String reportContent;
	/**
	 * 接收人邮箱
	 */
	private String reportEmail;
	/**
	 * 抄送邮箱
	 */
	private String copyEmail;
	/**
	 * 邮件发送主题
	 */
	private String reportTheme;
	/**
	 * 附件展示名称
	 */
	private String attachName;
	/**
	 * 报表语言类型  1 简体  2繁体
	 */
	private Integer reportLanguage;

}
