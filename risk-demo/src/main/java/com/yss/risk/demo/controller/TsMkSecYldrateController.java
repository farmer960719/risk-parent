package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsMkSecYldrateEntity;
import com.yss.risk.demo.service.TsMkSecYldrateService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:24
 */
@RestController
@RequestMapping("demo/tsmksecyldrate")
public class TsMkSecYldrateController {
    @Autowired
    private TsMkSecYldrateService tsMkSecYldrateService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsMkSecYldrateService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsMkSecYldrateEntity tsMkSecYldrate = tsMkSecYldrateService.getById(id);

        return R.ok().put("tsMkSecYldrate", tsMkSecYldrate);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsMkSecYldrateEntity tsMkSecYldrate){
		tsMkSecYldrateService.save(tsMkSecYldrate);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsMkSecYldrateEntity tsMkSecYldrate){
		tsMkSecYldrateService.updateById(tsMkSecYldrate);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsMkSecYldrateService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
