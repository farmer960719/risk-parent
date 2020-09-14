package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpRpTempletInfoEntity;

import java.util.Map;

/**
 * 报表模板配置信息表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:28
 */
public interface TpRpTempletInfoService extends IService<TpRpTempletInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

