package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TkTaskDetailLogEntity;

import java.util.Map;

/**
 * 任务计算日志详情
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:41
 */
public interface TkTaskDetailLogService extends IService<TkTaskDetailLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

