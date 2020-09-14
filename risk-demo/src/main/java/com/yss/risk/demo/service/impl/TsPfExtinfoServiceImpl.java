package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfExtinfoDao;
import com.yss.risk.demo.entity.TsPfExtinfoEntity;
import com.yss.risk.demo.service.TsPfExtinfoService;


@Service("tsPfExtinfoService")
public class TsPfExtinfoServiceImpl extends ServiceImpl<TsPfExtinfoDao, TsPfExtinfoEntity> implements TsPfExtinfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfExtinfoEntity> page = this.page(
                new Query<TsPfExtinfoEntity>().getPage(params),
                new QueryWrapper<TsPfExtinfoEntity>()
        );

        return new PageUtils(page);
    }

}