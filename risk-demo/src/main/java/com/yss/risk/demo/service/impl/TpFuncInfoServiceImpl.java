package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncInfoDao;
import com.yss.risk.demo.entity.TpFuncInfoEntity;
import com.yss.risk.demo.service.TpFuncInfoService;


@Service("tpFuncInfoService")
public class TpFuncInfoServiceImpl extends ServiceImpl<TpFuncInfoDao, TpFuncInfoEntity> implements TpFuncInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncInfoEntity> page = this.page(
                new Query<TpFuncInfoEntity>().getPage(params),
                new QueryWrapper<TpFuncInfoEntity>()
        );

        return new PageUtils(page);
    }

}