package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecAccYldrateEntity;
import com.yss.risk.demo.service.TsPfSecAccYldrateService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
@RestController
@RequestMapping("demo/tspfsecaccyldrate")
public class TsPfSecAccYldrateController {
    @Autowired
    private TsPfSecAccYldrateService tsPfSecAccYldrateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecAccYldrateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecAccYldrateEntity tsPfSecAccYldrate = tsPfSecAccYldrateService.getById(id);

        return R.ok().put("tsPfSecAccYldrate", tsPfSecAccYldrate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecAccYldrateEntity tsPfSecAccYldrate){
		tsPfSecAccYldrateService.save(tsPfSecAccYldrate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecAccYldrateEntity tsPfSecAccYldrate){
		tsPfSecAccYldrateService.updateById(tsPfSecAccYldrate);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecAccYldrateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
