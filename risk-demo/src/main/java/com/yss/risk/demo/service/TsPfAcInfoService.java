package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfAcInfoEntity;

import java.util.Map;

/**
 * 1.包含了真实组合、虚拟组合、汇总组合

2.按证券代码汇总

3.包含持仓、交易、损益

 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
public interface TsPfAcInfoService extends IService<TsPfAcInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

