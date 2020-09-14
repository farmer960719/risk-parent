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
 * @date 2020-09-14 15:13:21
 */
@Data
@TableName("TS_PF_AC_VAR_PC")
public class TsPfAcVarPcEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * 组合代码
	 */
	private String pfId;
	/**
	 * 日期
	 */
	private String bizDate;
	/**
	 * 资产分类id
	 */
	private String treeId;
	/**
	 * 资产节点代码
	 */
	private String nodeId;
	/**
	 * $column.comments
	 */
	private String ccyType;
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * 模型类型
	 */
	private String calmodel;
	/**
	 * 历史天数
	 */
	private String historicaldays;
	/**
	 * 置信度
	 */
	private Integer confidencelevel;
	/**
	 * 收益率类型
	 */
	private String yldType;
	/**
	 * 衰减因子
	 */
	private Integer attenuationrate;
	/**
	 * 模拟次数
	 */
	private Integer times;
	/**
	 * var
	 */
	private Integer var;
	/**
	 * 相对var
	 */
	private Integer varrate;
	/**
	 * $column.comments
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private Date timeMark;

}
