package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfInfoDao;
import com.yss.risk.demo.entity.TsPfInfoEntity;
import com.yss.risk.demo.service.TsPfInfoService;


@Service("tsPfInfoService")
public class TsPfInfoServiceImpl extends ServiceImpl<TsPfInfoDao, TsPfInfoEntity> implements TsPfInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfInfoEntity> page = this.page(
                new Query<TsPfInfoEntity>().getPage(params),
                new QueryWrapper<TsPfInfoEntity>()
        );

        return new PageUtils(page);
    }

}