package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.ZTabColsEntity;
import com.yss.risk.demo.service.ZTabColsService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:08
 */
@RestController
@RequestMapping("demo/ztabcols")
public class ZTabColsController {
    @Autowired
    private ZTabColsService zTabColsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zTabColsService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tableName}")
    public R info(@PathVariable("tableName") String tableName){
		ZTabColsEntity zTabCols = zTabColsService.getById(tableName);

        return R.ok().put("zTabCols", zTabCols);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZTabColsEntity zTabCols){
		zTabColsService.save(zTabCols);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZTabColsEntity zTabCols){
		zTabColsService.updateById(zTabCols);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] tableNames){
		zTabColsService.removeByIds(Arrays.asList(tableNames));

        return R.ok();
    }

}
