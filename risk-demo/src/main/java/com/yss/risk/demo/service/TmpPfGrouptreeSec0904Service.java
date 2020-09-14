package com.yss.risk.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yss.common.utils.PageUtils;
import com.yss.risk.demo.entity.TmpPfGrouptreeSec0904Entity;

import java.util.Map;

/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:38
 */
public interface TmpPfGrouptreeSec0904Service extends IService<TmpPfGrouptreeSec0904Entity> {

    PageUtils queryPage(Map<String, Object> params);
}

