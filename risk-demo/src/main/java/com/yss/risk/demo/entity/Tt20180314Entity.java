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
 * @date 2020-09-14 15:13:09
 */
@Data
@TableName("TT20180314")
public class Tt20180314Entity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * $column.comments
	 */
	@TableId
	private Integer id;
	/**
	 * $column.comments
	 */
	private String bizDate;
	/**
	 * $column.comments
	 */
	private String pfId;
	/**
	 * $column.comments
	 */
	private String symbolId;
	/**
	 * $column.comments
	 */
	private String symbolCode;
	/**
	 * $column.comments
	 */
	private String secCode;
	/**
	 * $column.comments
	 */
	private String marketCode;
	/**
	 * $column.comments
	 */
	private String attypeIdD;
	/**
	 * $column.comments
	 */
	private String attypeExtIdD;
	/**
	 * $column.comments
	 */
	private String finAttrIdD;
	/**
	 * $column.comments
	 */
	private String hdAttrIdD;
	/**
	 * $column.comments
	 */
	private String secSrc;
	/**
	 * $column.comments
	 */
	private String orLmt;
	/**
	 * $column.comments
	 */
	private String curIdD;
	/**
	 * $column.comments
	 */
	private Integer hdQty;
	/**
	 * $column.comments
	 */
	private Integer costSc;
	/**
	 * $column.comments
	 */
	private Integer netcost;
	/**
	 * $column.comments
	 */
	private Integer hpEvIv;
	/**
	 * $column.comments
	 */
	private Integer netmv;
	/**
	 * $column.comments
	 */
	private Integer accrIest;
	/**
	 * $column.comments
	 */
	private Integer accrAmor;
	/**
	 * $column.comments
	 */
	private Integer hpDimiProvn;
	/**
	 * $column.comments
	 */
	private Integer preNetmv;
	/**
	 * $column.comments
	 */
	private Integer preNetcost;
	/**
	 * $column.comments
	 */
	private Integer preAccrIest;
	/**
	 * $column.comments
	 */
	private Integer bTdQty;
	/**
	 * $column.comments
	 */
	private Integer bAccrIest;
	/**
	 * $column.comments
	 */
	private Integer bAccrAmor;
	/**
	 * $column.comments
	 */
	private Integer bActlAmt;
	/**
	 * $column.comments
	 */
	private Integer bComm;
	/**
	 * $column.comments
	 */
	private Integer bTdFee;
	/**
	 * $column.comments
	 */
	private Integer bEvIv;
	/**
	 * $column.comments
	 */
	private Integer sTdQty;
	/**
	 * $column.comments
	 */
	private Integer sAccrIest;
	/**
	 * $column.comments
	 */
	private Integer sAccrAmor;
	/**
	 * $column.comments
	 */
	private Integer sActlAmt;
	/**
	 * $column.comments
	 */
	private Integer sComm;
	/**
	 * $column.comments
	 */
	private Integer sTdFee;
	/**
	 * $column.comments
	 */
	private Integer sEvIv;
	/**
	 * $column.comments
	 */
	private Integer unreaInc;
	/**
	 * $column.comments
	 */
	private Integer iestInc;
	/**
	 * $column.comments
	 */
	private Integer amorInc;
	/**
	 * $column.comments
	 */
	private Integer bonusInc;
	/**
	 * $column.comments
	 */
	private Integer difInc;
	/**
	 * $column.comments
	 */
	private Integer pyblInc;
	/**
	 * $column.comments
	 */
	private Integer dimiProvn;
	/**
	 * $column.comments
	 */
	private Integer peInc;
	/**
	 * $column.comments
	 */
	private Integer otrInc;
	/**
	 * $column.comments
	 */
	private Integer otrFee;
	/**
	 * $column.comments
	 */
	private Integer reaInc;
	/**
	 * $column.comments
	 */
	private Integer plAmt;
	/**
	 * $column.comments
	 */
	private Integer cashBonus;
	/**
	 * $column.comments
	 */
	private Date timeMark;
	/**
	 * $column.comments
	 */
	private Integer isValid;
	/**
	 * $column.comments
	 */
	private String ccyType;
	/**
	 * $column.comments
	 */
	private Integer fullcost;
	/**
	 * $column.comments
	 */
	private Integer fullmv;
	/**
	 * $column.comments
	 */
	private Integer evPrc;
	/**
	 * $column.comments
	 */
	private Integer unreaIncC;
	/**
	 * $column.comments
	 */
	private Integer unreaIncS;
	/**
	 * $column.comments
	 */
	private String pfmodeIdD;
	/**
	 * $column.comments
	 */
	private String treeId;
	/**
	 * $column.comments
	 */
	private String nodeId;

}
