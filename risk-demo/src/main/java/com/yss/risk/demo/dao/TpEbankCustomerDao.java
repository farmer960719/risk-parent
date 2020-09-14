package com.yss.risk.demo.dao;

import com.yss.risk.demo.entity.TpEbankCustomerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 核心客户号（网银）
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
@Mapper
public interface TpEbankCustomerDao extends BaseMapper<TpEbankCustomerEntity> {
	
}
