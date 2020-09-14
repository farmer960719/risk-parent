package com.yss.risk.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 报表目录文件表
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
@Data
@TableName("TP_RP_CATALOG")
public class TpRpCatalogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer fid;
	/**
	 * 父目录ID
	 */
	private Integer pid;
	/**
	 * 报表目录名称
	 */
	private String fname;
	/**
	 * 目录层级
	 */
	private Integer flever;
	/**
	 * 备注
	 */
	private String fmemo;
	/**
	 * 创建时间
	 */
	private Date fcreateTime;
	/**
	 * 创建人ID
	 */
	private Integer fcreatorId;
	/**
	 * 修改时间
	 */
	private Date feditTime;
	/**
	 * 修改人ID
	 */
	private Integer feditorId;
	/**
	 * 排序号
	 */
	private Integer forder;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 是否有效
	 */
	private Integer orValidD;
	/**
	 * 删除人ID
	 */
	private Integer fdeletetorId;
	/**
	 * 删除时间
	 */
	private Date fdeleteTime;

}
