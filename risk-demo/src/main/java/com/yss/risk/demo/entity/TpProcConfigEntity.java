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
@TableName("TP_PROC_CONFIG")
public class TpProcConfigEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 标识(如A:对应表名为TMP_A_表名，禁止配置S，因会话临时表将使用TMP_S）
	 */
	@TableId
	private String groupId;
	/**
	 * 是否启用(0:未启用，1：启用)
	 */
	private Integer sta;
	/**
	 * 是否正在使用(0:未使用，1：正用)
	 */
	private Integer used;
	/**
	 * 当前链接SID
	 */
	private Integer sid;
	/**
	 * 当前链接访问的IP
	 */
	private String ipAddress;
	/**
	 * 当前链接访问的机器名
	 */
	private String machine;
	/**
	 * 当前链接访问的操作系统用户名
	 */
	private String osUser;
	/**
	 * 最后使用的时间
	 */
	private Date lastTime;
	/**
	 * 备注
	 */
	private String remark;

}
