package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpUserPfDao;
import com.yss.risk.demo.entity.TpUserPfEntity;
import com.yss.risk.demo.service.TpUserPfService;


@Service("tpUserPfService")
public class TpUserPfServiceImpl extends ServiceImpl<TpUserPfDao, TpUserPfEntity> implements TpUserPfService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpUserPfEntity> page = this.page(
                new Query<TpUserPfEntity>().getPage(params),
                new QueryWrapper<TpUserPfEntity>()
        );

        return new PageUtils(page);
    }

}