package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcInfoDao;
import com.yss.risk.demo.entity.TsPfAcInfoEntity;
import com.yss.risk.demo.service.TsPfAcInfoService;


@Service("tsPfAcInfoService")
public class TsPfAcInfoServiceImpl extends ServiceImpl<TsPfAcInfoDao, TsPfAcInfoEntity> implements TsPfAcInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcInfoEntity> page = this.page(
                new Query<TsPfAcInfoEntity>().getPage(params),
                new QueryWrapper<TsPfAcInfoEntity>()
        );

        return new PageUtils(page);
    }

}