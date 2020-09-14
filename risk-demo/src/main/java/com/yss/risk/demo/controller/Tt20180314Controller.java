package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.Tt20180314Entity;
import com.yss.risk.demo.service.Tt20180314Service;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:09
 */
@RestController
@RequestMapping("demo/tt20180314")
public class Tt20180314Controller {
    @Autowired
    private Tt20180314Service tt20180314Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tt20180314Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Tt20180314Entity tt20180314 = tt20180314Service.getById(id);

        return R.ok().put("tt20180314", tt20180314);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Tt20180314Entity tt20180314){
		tt20180314Service.save(tt20180314);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Tt20180314Entity tt20180314){
		tt20180314Service.updateById(tt20180314);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tt20180314Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
