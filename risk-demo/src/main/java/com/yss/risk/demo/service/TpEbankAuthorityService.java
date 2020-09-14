package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TpEbankAuthorityEntity;

import java.util.Map;

/**
 * 网银权限控制表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
public interface TpEbankAuthorityService extends IService<TpEbankAuthorityEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

