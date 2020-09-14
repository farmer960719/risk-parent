package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpRpCatalogEntity;
import com.yss.risk.demo.service.TpRpCatalogService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 报表目录文件表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
@RestController
@RequestMapping("demo/tprpcatalog")
public class TpRpCatalogController {
    @Autowired
    private TpRpCatalogService tpRpCatalogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpRpCatalogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{fid}")
    public R info(@PathVariable("fid") Integer fid){
		TpRpCatalogEntity tpRpCatalog = tpRpCatalogService.getById(fid);

        return R.ok().put("tpRpCatalog", tpRpCatalog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpRpCatalogEntity tpRpCatalog){
		tpRpCatalogService.save(tpRpCatalog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpRpCatalogEntity tpRpCatalog){
		tpRpCatalogService.updateById(tpRpCatalog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] fids){
		tpRpCatalogService.removeByIds(Arrays.asList(fids));

        return R.ok();
    }

}
