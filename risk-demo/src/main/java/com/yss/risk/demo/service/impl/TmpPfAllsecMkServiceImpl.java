package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpPfAllsecMkDao;
import com.yss.risk.demo.entity.TmpPfAllsecMkEntity;
import com.yss.risk.demo.service.TmpPfAllsecMkService;


@Service("tmpPfAllsecMkService")
public class TmpPfAllsecMkServiceImpl extends ServiceImpl<TmpPfAllsecMkDao, TmpPfAllsecMkEntity> implements TmpPfAllsecMkService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpPfAllsecMkEntity> page = this.page(
                new Query<TmpPfAllsecMkEntity>().getPage(params),
                new QueryWrapper<TmpPfAllsecMkEntity>()
        );

        return new PageUtils(page);
    }

}