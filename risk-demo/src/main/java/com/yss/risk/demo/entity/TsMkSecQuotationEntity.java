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
 * @date 2020-09-14 15:13:24
 */
@Data
@TableName("TS_MK_SEC_QUOTATION")
public class TsMkSecQuotationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 流水号
	 */
	@TableId
	private Integer id;
	/**
	 * 业务日期
	 */
	private String bizDate;
	/**
	 * 证券内码
	 */
	private String symbolId;
	/**
	 * 证券代码
	 */
	private String symbolCode;
	/**
	 * 市场代码
	 */
	private String exchTypeD;
	/**
	 * 证券类型
	 */
	private String symbolTypeD;
	/**
	 * 证券名称
	 */
	private String symbolName;
	/**
	 * 昨日收盘净价
	 */
	private Integer lcloseNetprice;
	/**
	 * 昨日收盘全价
	 */
	private Integer lcloseFullprice;
	/**
	 * 收盘净价
	 */
	private Integer closeNetprice;
	/**
	 * 收盘全价
	 */
	private Integer closeFullprice;
	/**
	 * 开盘价
	 */
	private Integer openPrice;
	/**
	 * 最高价
	 */
	private Integer highPrice;
	/**
	 * 最低价
	 */
	private Integer lowPrice;
	/**
	 * 成交量
	 */
	private Integer tranQut;
	/**
	 * 成交金额
	 */
	private Integer tranAmt;
	/**
	 * 成交数量
	 */
	private Integer tranNum;
	/**
	 * 跌涨幅
	 */
	private Integer changeMargin;
	/**
	 * 流通股本
	 */
	private Integer flowMktcap;
	/**
	 * 总市值
	 */
	private Integer totMktcap;
	/**
	 * 换手率
	 */
	private Integer turnRate;
	/**
	 * 数据源
	 */
	private String dataSrc;
	/**
	 * 数据状态
	 */
	private String dataSta;
	/**
	 * 是否有效
	 */
	private Integer isValid;
	/**
	 * 时间标识
	 */
	private Date timeMark;
	/**
	 * 币种代码
	 */
	private String curIdD;
	/**
	 * 平均价
	 */
	private Integer avgPrice;

}
