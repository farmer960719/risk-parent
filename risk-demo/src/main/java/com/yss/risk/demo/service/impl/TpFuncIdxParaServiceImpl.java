package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncIdxParaDao;
import com.yss.risk.demo.entity.TpFuncIdxParaEntity;
import com.yss.risk.demo.service.TpFuncIdxParaService;


@Service("tpFuncIdxParaService")
public class TpFuncIdxParaServiceImpl extends ServiceImpl<TpFuncIdxParaDao, TpFuncIdxParaEntity> implements TpFuncIdxParaService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncIdxParaEntity> page = this.page(
                new Query<TpFuncIdxParaEntity>().getPage(params),
                new QueryWrapper<TpFuncIdxParaEntity>()
        );

        return new PageUtils(page);
    }

}