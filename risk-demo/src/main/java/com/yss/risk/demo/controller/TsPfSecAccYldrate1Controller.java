package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecAccYldrate1Entity;
import com.yss.risk.demo.service.TsPfSecAccYldrate1Service;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:16
 */
@RestController
@RequestMapping("demo/tspfsecaccyldrate1")
public class TsPfSecAccYldrate1Controller {
    @Autowired
    private TsPfSecAccYldrate1Service tsPfSecAccYldrate1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecAccYldrate1Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecAccYldrate1Entity tsPfSecAccYldrate1 = tsPfSecAccYldrate1Service.getById(id);

        return R.ok().put("tsPfSecAccYldrate1", tsPfSecAccYldrate1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecAccYldrate1Entity tsPfSecAccYldrate1){
		tsPfSecAccYldrate1Service.save(tsPfSecAccYldrate1);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecAccYldrate1Entity tsPfSecAccYldrate1){
		tsPfSecAccYldrate1Service.updateById(tsPfSecAccYldrate1);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecAccYldrate1Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
