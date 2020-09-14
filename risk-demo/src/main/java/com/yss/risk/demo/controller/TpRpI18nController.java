package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpRpI18nEntity;
import com.yss.risk.demo.service.TpRpI18nService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:29
 */
@RestController
@RequestMapping("demo/tprpi18n")
public class TpRpI18nController {
    @Autowired
    private TpRpI18nService tpRpI18nService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpRpI18nService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpRpI18nEntity tpRpI18n = tpRpI18nService.getById(id);

        return R.ok().put("tpRpI18n", tpRpI18n);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpRpI18nEntity tpRpI18n){
		tpRpI18nService.save(tpRpI18n);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpRpI18nEntity tpRpI18n){
		tpRpI18nService.updateById(tpRpI18n);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpRpI18nService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
