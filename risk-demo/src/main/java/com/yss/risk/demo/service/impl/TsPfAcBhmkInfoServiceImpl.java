package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfAcBhmkInfoDao;
import com.yss.risk.demo.entity.TsPfAcBhmkInfoEntity;
import com.yss.risk.demo.service.TsPfAcBhmkInfoService;


@Service("tsPfAcBhmkInfoService")
public class TsPfAcBhmkInfoServiceImpl extends ServiceImpl<TsPfAcBhmkInfoDao, TsPfAcBhmkInfoEntity> implements TsPfAcBhmkInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfAcBhmkInfoEntity> page = this.page(
                new Query<TsPfAcBhmkInfoEntity>().getPage(params),
                new QueryWrapper<TsPfAcBhmkInfoEntity>()
        );

        return new PageUtils(page);
    }

}