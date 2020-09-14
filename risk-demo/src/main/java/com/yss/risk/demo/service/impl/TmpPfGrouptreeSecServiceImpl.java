package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TmpPfGrouptreeSecDao;
import com.yss.risk.demo.entity.TmpPfGrouptreeSecEntity;
import com.yss.risk.demo.service.TmpPfGrouptreeSecService;


@Service("tmpPfGrouptreeSecService")
public class TmpPfGrouptreeSecServiceImpl extends ServiceImpl<TmpPfGrouptreeSecDao, TmpPfGrouptreeSecEntity> implements TmpPfGrouptreeSecService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TmpPfGrouptreeSecEntity> page = this.page(
                new Query<TmpPfGrouptreeSecEntity>().getPage(params),
                new QueryWrapper<TmpPfGrouptreeSecEntity>()
        );

        return new PageUtils(page);
    }

}