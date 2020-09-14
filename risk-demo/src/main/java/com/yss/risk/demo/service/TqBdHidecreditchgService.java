package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TqBdHidecreditchgEntity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:27
 */
public interface TqBdHidecreditchgService extends IService<TqBdHidecreditchgEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

