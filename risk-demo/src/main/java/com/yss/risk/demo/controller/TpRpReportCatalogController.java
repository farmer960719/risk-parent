package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpRpReportCatalogEntity;
import com.yss.risk.demo.service.TpRpReportCatalogService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 目录报表关系映射表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:29
 */
@RestController
@RequestMapping("demo/tprpreportcatalog")
public class TpRpReportCatalogController {
    @Autowired
    private TpRpReportCatalogService tpRpReportCatalogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpRpReportCatalogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{fid}")
    public R info(@PathVariable("fid") Integer fid){
		TpRpReportCatalogEntity tpRpReportCatalog = tpRpReportCatalogService.getById(fid);

        return R.ok().put("tpRpReportCatalog", tpRpReportCatalog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpRpReportCatalogEntity tpRpReportCatalog){
		tpRpReportCatalogService.save(tpRpReportCatalog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpRpReportCatalogEntity tpRpReportCatalog){
		tpRpReportCatalogService.updateById(tpRpReportCatalog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] fids){
		tpRpReportCatalogService.removeByIds(Arrays.asList(fids));

        return R.ok();
    }

}
