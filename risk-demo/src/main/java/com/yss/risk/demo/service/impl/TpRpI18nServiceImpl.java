package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpI18nDao;
import com.yss.risk.demo.entity.TpRpI18nEntity;
import com.yss.risk.demo.service.TpRpI18nService;


@Service("tpRpI18nService")
public class TpRpI18nServiceImpl extends ServiceImpl<TpRpI18nDao, TpRpI18nEntity> implements TpRpI18nService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpI18nEntity> page = this.page(
                new Query<TpRpI18nEntity>().getPage(params),
                new QueryWrapper<TpRpI18nEntity>()
        );

        return new PageUtils(page);
    }

}