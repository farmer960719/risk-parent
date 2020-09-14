package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TkTaskDetailLogDao;
import com.yss.risk.demo.entity.TkTaskDetailLogEntity;
import com.yss.risk.demo.service.TkTaskDetailLogService;


@Service("tkTaskDetailLogService")
public class TkTaskDetailLogServiceImpl extends ServiceImpl<TkTaskDetailLogDao, TkTaskDetailLogEntity> implements TkTaskDetailLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TkTaskDetailLogEntity> page = this.page(
                new Query<TkTaskDetailLogEntity>().getPage(params),
                new QueryWrapper<TkTaskDetailLogEntity>()
        );

        return new PageUtils(page);
    }

}