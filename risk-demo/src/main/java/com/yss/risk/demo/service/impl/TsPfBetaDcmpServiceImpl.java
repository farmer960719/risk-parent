package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfBetaDcmpDao;
import com.yss.risk.demo.entity.TsPfBetaDcmpEntity;
import com.yss.risk.demo.service.TsPfBetaDcmpService;


@Service("tsPfBetaDcmpService")
public class TsPfBetaDcmpServiceImpl extends ServiceImpl<TsPfBetaDcmpDao, TsPfBetaDcmpEntity> implements TsPfBetaDcmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfBetaDcmpEntity> page = this.page(
                new Query<TsPfBetaDcmpEntity>().getPage(params),
                new QueryWrapper<TsPfBetaDcmpEntity>()
        );

        return new PageUtils(page);
    }

}