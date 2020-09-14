package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpRpTempletInfoDao;
import com.yss.risk.demo.entity.TpRpTempletInfoEntity;
import com.yss.risk.demo.service.TpRpTempletInfoService;


@Service("tpRpTempletInfoService")
public class TpRpTempletInfoServiceImpl extends ServiceImpl<TpRpTempletInfoDao, TpRpTempletInfoEntity> implements TpRpTempletInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpRpTempletInfoEntity> page = this.page(
                new Query<TpRpTempletInfoEntity>().getPage(params),
                new QueryWrapper<TpRpTempletInfoEntity>()
        );

        return new PageUtils(page);
    }

}