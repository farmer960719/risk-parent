package com.yss.risk.demo.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.Query;

import com.yss.risk.demo.dao.ZfyUserDao;
import com.yss.risk.demo.entity.ZfyUserEntity;
import com.yss.risk.demo.service.ZfyUserService;


@Service("zfyUserService")
public class ZfyUserServiceImpl extends ServiceImpl<ZfyUserDao, ZfyUserEntity> implements ZfyUserService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<ZfyUserEntity> page = this.page(
                new Query<ZfyUserEntity>().getPage(params),
                new QueryWrapper<ZfyUserEntity>()
        );

        return new PageUtils(page);
    }

}