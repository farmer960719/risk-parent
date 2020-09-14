package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncIdcRelDao;
import com.yss.risk.demo.entity.TpFuncIdcRelEntity;
import com.yss.risk.demo.service.TpFuncIdcRelService;


@Service("tpFuncIdcRelService")
public class TpFuncIdcRelServiceImpl extends ServiceImpl<TpFuncIdcRelDao, TpFuncIdcRelEntity> implements TpFuncIdcRelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncIdcRelEntity> page = this.page(
                new Query<TpFuncIdcRelEntity>().getPage(params),
                new QueryWrapper<TpFuncIdcRelEntity>()
        );

        return new PageUtils(page);
    }

}