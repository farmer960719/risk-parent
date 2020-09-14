package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecInfoEntity;
import com.yss.risk.demo.service.TsPfSecInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 证券每日基础指标
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:16
 */
@RestController
@RequestMapping("demo/tspfsecinfo")
public class TsPfSecInfoController {
    @Autowired
    private TsPfSecInfoService tsPfSecInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecInfoEntity tsPfSecInfo = tsPfSecInfoService.getById(id);

        return R.ok().put("tsPfSecInfo", tsPfSecInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecInfoEntity tsPfSecInfo){
		tsPfSecInfoService.save(tsPfSecInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecInfoEntity tsPfSecInfo){
		tsPfSecInfoService.updateById(tsPfSecInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
