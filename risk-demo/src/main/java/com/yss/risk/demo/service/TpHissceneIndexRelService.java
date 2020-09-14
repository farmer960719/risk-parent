package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpHissceneIndexRelEntity;

import java.util.Map;

/**
 * 历史情景表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:31
 */
public interface TpHissceneIndexRelService extends IService<TpHissceneIndexRelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

