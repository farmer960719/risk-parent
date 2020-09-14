package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpTkPfAccsecDao;
import com.yss.risk.demo.entity.TmpTkPfAccsecEntity;
import com.yss.risk.demo.service.TmpTkPfAccsecService;


@Service("tmpTkPfAccsecService")
public class TmpTkPfAccsecServiceImpl extends ServiceImpl<TmpTkPfAccsecDao, TmpTkPfAccsecEntity> implements TmpTkPfAccsecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpTkPfAccsecEntity> page = this.page(
                new Query<TmpTkPfAccsecEntity>().getPage(params),
                new QueryWrapper<TmpTkPfAccsecEntity>()
        );

        return new PageUtils(page);
    }

}