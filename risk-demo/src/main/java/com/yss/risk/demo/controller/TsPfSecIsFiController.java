package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfSecIsFiEntity;
import com.yss.risk.demo.service.TsPfSecIsFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 组合个券投资风格
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:15
 */
@RestController
@RequestMapping("demo/tspfsecisfi")
public class TsPfSecIsFiController {
    @Autowired
    private TsPfSecIsFiService tsPfSecIsFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfSecIsFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfSecIsFiEntity tsPfSecIsFi = tsPfSecIsFiService.getById(id);

        return R.ok().put("tsPfSecIsFi", tsPfSecIsFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfSecIsFiEntity tsPfSecIsFi){
		tsPfSecIsFiService.save(tsPfSecIsFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfSecIsFiEntity tsPfSecIsFi){
		tsPfSecIsFiService.updateById(tsPfSecIsFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfSecIsFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
