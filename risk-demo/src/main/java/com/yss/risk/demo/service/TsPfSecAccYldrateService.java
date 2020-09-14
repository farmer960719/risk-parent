package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TsPfSecAccYldrateEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
public interface TsPfSecAccYldrateService extends IService<TsPfSecAccYldrateEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

