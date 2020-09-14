package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TkTaskParamsEntity;

import java.util.Map;

/**
 * 任务参数日志表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:40
 */
public interface TkTaskParamsService extends IService<TkTaskParamsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

