package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpTempletRelInfoDao;
import com.yss.risk.demo.entity.TpRpTempletRelInfoEntity;
import com.yss.risk.demo.service.TpRpTempletRelInfoService;


@Service("tpRpTempletRelInfoService")
public class TpRpTempletRelInfoServiceImpl extends ServiceImpl<TpRpTempletRelInfoDao, TpRpTempletRelInfoEntity> implements TpRpTempletRelInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpTempletRelInfoEntity> page = this.page(
                new Query<TpRpTempletRelInfoEntity>().getPage(params),
                new QueryWrapper<TpRpTempletRelInfoEntity>()
        );

        return new PageUtils(page);
    }

}