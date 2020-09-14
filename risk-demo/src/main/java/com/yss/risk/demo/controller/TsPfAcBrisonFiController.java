package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcBrisonFiEntity;
import com.yss.risk.demo.service.TsPfAcBrisonFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * Brison结果表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@RestController
@RequestMapping("demo/tspfacbrisonfi")
public class TsPfAcBrisonFiController {
    @Autowired
    private TsPfAcBrisonFiService tsPfAcBrisonFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcBrisonFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcBrisonFiEntity tsPfAcBrisonFi = tsPfAcBrisonFiService.getById(id);

        return R.ok().put("tsPfAcBrisonFi", tsPfAcBrisonFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcBrisonFiEntity tsPfAcBrisonFi){
		tsPfAcBrisonFiService.save(tsPfAcBrisonFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcBrisonFiEntity tsPfAcBrisonFi){
		tsPfAcBrisonFiService.updateById(tsPfAcBrisonFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcBrisonFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
