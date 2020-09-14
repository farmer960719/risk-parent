package com.yss.risk.demo.dao;

import com.yss.risk.demo.entity.TpFuncIdcRelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定义自定义功能中每个列对应的指标类
 * 
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
@Mapper
public interface TpFuncIdcRelDao extends BaseMapper<TpFuncIdcRelEntity> {
	
}
