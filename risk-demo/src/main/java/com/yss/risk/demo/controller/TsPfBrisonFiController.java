package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfBrisonFiEntity;
import com.yss.risk.demo.service.TsPfBrisonFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * Brison结果表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:19
 */
@RestController
@RequestMapping("demo/tspfbrisonfi")
public class TsPfBrisonFiController {
    @Autowired
    private TsPfBrisonFiService tsPfBrisonFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfBrisonFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfBrisonFiEntity tsPfBrisonFi = tsPfBrisonFiService.getById(id);

        return R.ok().put("tsPfBrisonFi", tsPfBrisonFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfBrisonFiEntity tsPfBrisonFi){
		tsPfBrisonFiService.save(tsPfBrisonFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfBrisonFiEntity tsPfBrisonFi){
		tsPfBrisonFiService.updateById(tsPfBrisonFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfBrisonFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
