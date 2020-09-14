package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpProcConfigDao;
import com.yss.risk.demo.entity.TpProcConfigEntity;
import com.yss.risk.demo.service.TpProcConfigService;


@Service("tpProcConfigService")
public class TpProcConfigServiceImpl extends ServiceImpl<TpProcConfigDao, TpProcConfigEntity> implements TpProcConfigService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpProcConfigEntity> page = this.page(
                new Query<TpProcConfigEntity>().getPage(params),
                new QueryWrapper<TpProcConfigEntity>()
        );

        return new PageUtils(page);
    }

}