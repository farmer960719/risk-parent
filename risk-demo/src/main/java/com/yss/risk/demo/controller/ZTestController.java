package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.ZTestEntity;
import com.yss.risk.demo.service.ZTestService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:07
 */
@RestController
@RequestMapping("demo/ztest")
public class ZTestController {
    @Autowired
    private ZTestService zTestService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zTestService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{f1}")
    public R info(@PathVariable("f1") Integer f1){
		ZTestEntity zTest = zTestService.getById(f1);

        return R.ok().put("zTest", zTest);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZTestEntity zTest){
		zTestService.save(zTest);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZTestEntity zTest){
		zTestService.updateById(zTest);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] f1s){
		zTestService.removeByIds(Arrays.asList(f1s));

        return R.ok();
    }

}
