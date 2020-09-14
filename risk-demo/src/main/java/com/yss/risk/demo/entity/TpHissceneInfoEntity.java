package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 历史情景表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
@Data
@TableName("TP_HISSCENE_INFO")
public class TpHissceneInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 情景ID
	 */
	@TableId
	private Integer id;
	/**
	 * 情景名称
	 */
	private String sceneName;
	/**
	 * 情景描述
	 */
	private String sceneDesc;
	/**
	 * 情景类型
	 */
	private String sceneType;
	/**
	 * 历史情景开始日期
	 */
	private String beginDate;
	/**
	 * 历史情景结束日期
	 */
	private String endDate;
	/**
	 * 情景
	 */
	private String sence;
	/**
	 * 存款利率代码
	 */
	private String ratecode;
	/**
	 * 时间窗口
	 */
	private String timeWin;
	/**
	 * 前推个数
	 */
	private Integer pushDate;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 创建人
	 */
	private String createUser;
	/**
	 * 更改时间
	 */
	private Date updateTime;
	/**
	 * 更改人
	 */
	private String updateUser;
	/**
	 * 更改备注
	 */
	private String updateMark;
	/**
	 * 市场个券
	 */
	private String mkSec;
	/**
	 * 是否有效
	 */
	private String isValiable;

}
