package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecIsFiDao;
import com.yss.risk.demo.entity.TsPfSecIsFiEntity;
import com.yss.risk.demo.service.TsPfSecIsFiService;


@Service("tsPfSecIsFiService")
public class TsPfSecIsFiServiceImpl extends ServiceImpl<TsPfSecIsFiDao, TsPfSecIsFiEntity> implements TsPfSecIsFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecIsFiEntity> page = this.page(
                new Query<TsPfSecIsFiEntity>().getPage(params),
                new QueryWrapper<TsPfSecIsFiEntity>()
        );

        return new PageUtils(page);
    }

}