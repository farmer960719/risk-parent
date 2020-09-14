package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecYldrateEntity;
import com.yss.risk.demo.service.TsPfSecYldrateService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:14
 */
@RestController
@RequestMapping("demo/tspfsecyldrate")
public class TsPfSecYldrateController {
    @Autowired
    private TsPfSecYldrateService tsPfSecYldrateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecYldrateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecYldrateEntity tsPfSecYldrate = tsPfSecYldrateService.getById(id);

        return R.ok().put("tsPfSecYldrate", tsPfSecYldrate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecYldrateEntity tsPfSecYldrate){
		tsPfSecYldrateService.save(tsPfSecYldrate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecYldrateEntity tsPfSecYldrate){
		tsPfSecYldrateService.updateById(tsPfSecYldrate);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecYldrateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
