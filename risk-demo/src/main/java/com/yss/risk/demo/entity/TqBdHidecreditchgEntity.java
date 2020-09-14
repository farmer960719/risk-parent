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
 * @date 2020-09-14 15:13:27
 */
@Data
@TableName("TQ_BD_HIDECREDITCHG")
public class TqBdHidecreditchgEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 证券内码
	 */
	private String secode;
	/**
	 * 隐藏评级来源
	 */
	private String creditsource;
	/**
	 * 公告日期
	 */
	private String publishdate;
	/**
	 * 更新日期
	 */
	private String updatedate;
	/**
	 * 起始日期
	 */
	private String begindate;
	/**
	 * 截止日期
	 */
	private String enddate;
	/**
	 * 评级方式
	 */
	private String creditmod;
	/**
	 * 本次原始隐藏评级
	 */
	private String rawcredit;
	/**
	 * 较上次原始隐藏评级变动方向
	 */
	private String rawradjustdir;
	/**
	 * 上次原始隐藏评级
	 */
	private String lastrawcredit;
	/**
	 * 变动数量等级
	 */
	private Integer rawdiff;
	/**
	 * 本次标准隐藏评级
	 */
	private String stdcredit;
	/**
	 * 较上次标准隐藏评级变动方向
	 */
	private String stdradjustdir;
	/**
	 * 上次标准隐藏评级
	 */
	private String laststdcredit;
	/**
	 * 变动数量等级
	 */
	private Integer stddiff;
	/**
	 * 本次评级对应收益率曲线编码
	 */
	private String ycurvecode;
	/**
	 * 本次评级对应收益率曲线名称
	 */
	private String ycurvename;
	/**
	 * 校验ID
	 */
	private String sourceid;
	/**
	 * 是否当前状态
	 */
	private Integer status;
	/**
	 * 是否最新记录
	 */
	private Integer isnew;
	/**
	 * 是否有效
	 */
	private Integer isvalid;
	/**
	 * 时间戳
	 */
	private Date tmstamp;
	/**
	 * 录入日期
	 */
	private Date entrydate;
	/**
	 * 录入时间
	 */
	private String entrytime;

}
