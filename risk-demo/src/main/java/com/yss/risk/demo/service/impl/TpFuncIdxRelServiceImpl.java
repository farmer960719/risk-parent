package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncIdxRelDao;
import com.yss.risk.demo.entity.TpFuncIdxRelEntity;
import com.yss.risk.demo.service.TpFuncIdxRelService;


@Service("tpFuncIdxRelService")
public class TpFuncIdxRelServiceImpl extends ServiceImpl<TpFuncIdxRelDao, TpFuncIdxRelEntity> implements TpFuncIdxRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncIdxRelEntity> page = this.page(
                new Query<TpFuncIdxRelEntity>().getPage(params),
                new QueryWrapper<TpFuncIdxRelEntity>()
        );

        return new PageUtils(page);
    }

}