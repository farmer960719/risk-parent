package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TqBdHidecreditchgDao;
import com.yss.risk.demo.entity.TqBdHidecreditchgEntity;
import com.yss.risk.demo.service.TqBdHidecreditchgService;


@Service("tqBdHidecreditchgService")
public class TqBdHidecreditchgServiceImpl extends ServiceImpl<TqBdHidecreditchgDao, TqBdHidecreditchgEntity> implements TqBdHidecreditchgService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TqBdHidecreditchgEntity> page = this.page(
                new Query<TqBdHidecreditchgEntity>().getPage(params),
                new QueryWrapper<TqBdHidecreditchgEntity>()
        );

        return new PageUtils(page);
    }

}