package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcFixattrFiDao;
import com.yss.risk.demo.entity.TsPfAcFixattrFiEntity;
import com.yss.risk.demo.service.TsPfAcFixattrFiService;


@Service("tsPfAcFixattrFiService")
public class TsPfAcFixattrFiServiceImpl extends ServiceImpl<TsPfAcFixattrFiDao, TsPfAcFixattrFiEntity> implements TsPfAcFixattrFiService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcFixattrFiEntity> page = this.page(
                new Query<TsPfAcFixattrFiEntity>().getPage(params),
                new QueryWrapper<TsPfAcFixattrFiEntity>()
        );

        return new PageUtils(page);
    }

}