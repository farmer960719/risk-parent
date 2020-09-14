package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.ZTablesEntity;
import com.yss.risk.demo.service.ZTablesService;
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
@RequestMapping("demo/ztables")
public class ZTablesController {
    @Autowired
    private ZTablesService zTablesService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zTablesService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tableName}")
    public R info(@PathVariable("tableName") String tableName){
		ZTablesEntity zTables = zTablesService.getById(tableName);

        return R.ok().put("zTables", zTables);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZTablesEntity zTables){
		zTablesService.save(zTables);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZTablesEntity zTables){
		zTablesService.updateById(zTables);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] tableNames){
		zTablesService.removeByIds(Arrays.asList(tableNames));

        return R.ok();
    }

}
