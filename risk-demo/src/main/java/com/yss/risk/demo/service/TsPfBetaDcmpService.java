package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfBetaDcmpEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:19
 */
public interface TsPfBetaDcmpService extends IService<TsPfBetaDcmpEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

