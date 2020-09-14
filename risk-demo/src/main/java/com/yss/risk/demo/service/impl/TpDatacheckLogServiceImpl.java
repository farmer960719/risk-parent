package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpDatacheckLogDao;
import com.yss.risk.demo.entity.TpDatacheckLogEntity;
import com.yss.risk.demo.service.TpDatacheckLogService;


@Service("tpDatacheckLogService")
public class TpDatacheckLogServiceImpl extends ServiceImpl<TpDatacheckLogDao, TpDatacheckLogEntity> implements TpDatacheckLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpDatacheckLogEntity> page = this.page(
                new Query<TpDatacheckLogEntity>().getPage(params),
                new QueryWrapper<TpDatacheckLogEntity>()
        );

        return new PageUtils(page);
    }

}