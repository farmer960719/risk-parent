package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpEbankPfDao;
import com.yss.risk.demo.entity.TpEbankPfEntity;
import com.yss.risk.demo.service.TpEbankPfService;


@Service("tpEbankPfService")
public class TpEbankPfServiceImpl extends ServiceImpl<TpEbankPfDao, TpEbankPfEntity> implements TpEbankPfService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpEbankPfEntity> page = this.page(
                new Query<TpEbankPfEntity>().getPage(params),
                new QueryWrapper<TpEbankPfEntity>()
        );

        return new PageUtils(page);
    }

}