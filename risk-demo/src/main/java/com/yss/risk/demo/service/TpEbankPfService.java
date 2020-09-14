package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpEbankPfEntity;

import java.util.Map;

/**
 * 资产代码（网银）
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:33
 */
public interface TpEbankPfService extends IService<TpEbankPfEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

