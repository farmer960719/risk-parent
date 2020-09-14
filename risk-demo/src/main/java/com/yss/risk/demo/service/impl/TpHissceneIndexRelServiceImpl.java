package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpHissceneIndexRelDao;
import com.yss.risk.demo.entity.TpHissceneIndexRelEntity;
import com.yss.risk.demo.service.TpHissceneIndexRelService;


@Service("tpHissceneIndexRelService")
public class TpHissceneIndexRelServiceImpl extends ServiceImpl<TpHissceneIndexRelDao, TpHissceneIndexRelEntity> implements TpHissceneIndexRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpHissceneIndexRelEntity> page = this.page(
                new Query<TpHissceneIndexRelEntity>().getPage(params),
                new QueryWrapper<TpHissceneIndexRelEntity>()
        );

        return new PageUtils(page);
    }

}