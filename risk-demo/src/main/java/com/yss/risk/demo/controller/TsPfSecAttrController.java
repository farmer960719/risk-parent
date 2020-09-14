package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecAttrEntity;
import com.yss.risk.demo.service.TsPfSecAttrService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:16
 */
@RestController
@RequestMapping("demo/tspfsecattr")
public class TsPfSecAttrController {
    @Autowired
    private TsPfSecAttrService tsPfSecAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecAttrEntity tsPfSecAttr = tsPfSecAttrService.getById(id);

        return R.ok().put("tsPfSecAttr", tsPfSecAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecAttrEntity tsPfSecAttr){
		tsPfSecAttrService.save(tsPfSecAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecAttrEntity tsPfSecAttr){
		tsPfSecAttrService.updateById(tsPfSecAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecAttrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
