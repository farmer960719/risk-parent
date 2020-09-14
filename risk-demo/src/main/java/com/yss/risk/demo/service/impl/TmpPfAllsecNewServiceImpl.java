package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpPfAllsecNewDao;
import com.yss.risk.demo.entity.TmpPfAllsecNewEntity;
import com.yss.risk.demo.service.TmpPfAllsecNewService;


@Service("tmpPfAllsecNewService")
public class TmpPfAllsecNewServiceImpl extends ServiceImpl<TmpPfAllsecNewDao, TmpPfAllsecNewEntity> implements TmpPfAllsecNewService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpPfAllsecNewEntity> page = this.page(
                new Query<TmpPfAllsecNewEntity>().getPage(params),
                new QueryWrapper<TmpPfAllsecNewEntity>()
        );

        return new PageUtils(page);
    }

}