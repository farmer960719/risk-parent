package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TCebConfigEntity;

import java.util.Map;

/**
 * 光大银行配置信息表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:06
 */
public interface TCebConfigService extends IService<TCebConfigEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

