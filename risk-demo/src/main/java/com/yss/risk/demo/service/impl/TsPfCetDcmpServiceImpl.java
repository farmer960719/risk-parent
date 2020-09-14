package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.TsPfCetDcmpDao;
import com.yss.risk.demo.entity.TsPfCetDcmpEntity;
import com.yss.risk.demo.service.TsPfCetDcmpService;


@Service("tsPfCetDcmpService")
public class TsPfCetDcmpServiceImpl extends ServiceImpl<TsPfCetDcmpDao, TsPfCetDcmpEntity> implements TsPfCetDcmpService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TsPfCetDcmpEntity> page = this.page(
                new Query<TsPfCetDcmpEntity>().getPage(params),
                new QueryWrapper<TsPfCetDcmpEntity>()
        );

        return new PageUtils(page);
    }

}