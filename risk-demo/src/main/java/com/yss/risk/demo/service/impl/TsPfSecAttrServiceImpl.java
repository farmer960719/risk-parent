package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfSecAttrDao;
import com.yss.risk.demo.entity.TsPfSecAttrEntity;
import com.yss.risk.demo.service.TsPfSecAttrService;


@Service("tsPfSecAttrService")
public class TsPfSecAttrServiceImpl extends ServiceImpl<TsPfSecAttrDao, TsPfSecAttrEntity> implements TsPfSecAttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfSecAttrEntity> page = this.page(
                new Query<TsPfSecAttrEntity>().getPage(params),
                new QueryWrapper<TsPfSecAttrEntity>()
        );

        return new PageUtils(page);
    }

}