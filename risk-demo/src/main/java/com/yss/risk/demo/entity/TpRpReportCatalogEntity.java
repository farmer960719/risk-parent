package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 目录报表关系映射表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:29
 */
@Data
@TableName("TP_RP_REPORT_CATALOG")
public class TpRpReportCatalogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer fid;
	/**
	 * 目录ID
	 */
	private Integer fcatalogid;
	/**
	 * 编码
	 */
	private String fcode;
	/**
	 * 模板名称
	 */
	private String fname;
	/**
	 * 排序号
	 */
	private Integer forder;
	/**
	 * 创建人ID
	 */
	private String fcreatorId;
	/**
	 * 创建时间
	 */
	private Date fcreateTime;
	/**
	 * 修改时间
	 */
	private Date feditTime;
	/**
	 * 修改人ID
	 */
	private Integer feditorId;
	/**
	 * 删除人ID
	 */
	private Integer fdeletetorId;
	/**
	 * 删除时间
	 */
	private Date fdeleteTime;
	/**
	 * 是否有效
	 */
	private Integer orValidD;
	/**
	 * 备注
	 */
	private String fmemo;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 模板传递的组合参数的名称，不是别名
	 */
	private String temPfName;

}
