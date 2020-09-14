package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpEbankCustomerEntity;

import java.util.Map;

/**
 * 核心客户号（网银）
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
public interface TpEbankCustomerService extends IService<TpEbankCustomerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

