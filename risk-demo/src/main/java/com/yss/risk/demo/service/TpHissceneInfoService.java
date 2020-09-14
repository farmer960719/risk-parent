package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpHissceneInfoEntity;

import java.util.Map;

/**
 * 历史情景表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
public interface TpHissceneInfoService extends IService<TpHissceneInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

