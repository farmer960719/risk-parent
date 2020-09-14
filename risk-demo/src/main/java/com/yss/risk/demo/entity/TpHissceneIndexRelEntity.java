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
 * @date 2020-09-14 15:13:31
 */
@Data
@TableName("TP_HISSCENE_INDEX_REL")
public class TpHissceneIndexRelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId
	private Integer id;
	/**
	 * 情景ID
	 */
	private String sceneId;
	/**
	 * 股票指数代码名称
	 */
	private String stockIndex;
	/**
	 * 权重
	 */
	private Integer weight;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 股票指数代码
	 */
	private String stockIndexNum;

}
