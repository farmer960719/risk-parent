package com.yss.risk.demo.dao;

import com.yss.risk.demo.entity.TsPfExtinfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按组合内码汇总

3.包含真实交易的发生金额及费用/组合其它费用

 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:18
 */
@Mapper
public interface TsPfExtinfoDao extends BaseMapper<TsPfExtinfoEntity> {
	
}
