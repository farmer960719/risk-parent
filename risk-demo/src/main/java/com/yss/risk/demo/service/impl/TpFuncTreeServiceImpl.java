package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TpFuncTreeDao;
import com.yss.risk.demo.entity.TpFuncTreeEntity;
import com.yss.risk.demo.service.TpFuncTreeService;


@Service("tpFuncTreeService")
public class TpFuncTreeServiceImpl extends ServiceImpl<TpFuncTreeDao, TpFuncTreeEntity> implements TpFuncTreeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TpFuncTreeEntity> page = this.page(
                new Query<TpFuncTreeEntity>().getPage(params),
                new QueryWrapper<TpFuncTreeEntity>()
        );

        return new PageUtils(page);
    }

}