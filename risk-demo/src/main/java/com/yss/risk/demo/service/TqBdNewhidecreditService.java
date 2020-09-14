package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TqBdNewhidecreditEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:27
 */
public interface TqBdNewhidecreditService extends IService<TqBdNewhidecreditEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

