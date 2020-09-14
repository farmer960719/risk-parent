package com.yss.risk.demo.dao;

import com.yss.risk.demo.entity.TsPfAcInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按证券代码汇总

3.包含持仓、交易、损益

 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@Mapper
public interface TsPfAcInfoDao extends BaseMapper<TsPfAcInfoEntity> {
	
}
