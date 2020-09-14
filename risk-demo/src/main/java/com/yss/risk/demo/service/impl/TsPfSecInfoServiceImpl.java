package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecInfoDao;
import com.yss.risk.demo.entity.TsPfSecInfoEntity;
import com.yss.risk.demo.service.TsPfSecInfoService;


@Service("tsPfSecInfoService")
public class TsPfSecInfoServiceImpl extends ServiceImpl<TsPfSecInfoDao, TsPfSecInfoEntity> implements TsPfSecInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecInfoEntity> page = this.page(
                new Query<TsPfSecInfoEntity>().getPage(params),
                new QueryWrapper<TsPfSecInfoEntity>()
        );

        return new PageUtils(page);
    }

}