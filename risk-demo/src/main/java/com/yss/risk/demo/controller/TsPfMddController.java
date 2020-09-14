package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfMddEntity;
import com.yss.risk.demo.service.TsPfMddService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 回撤落地表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:17
 */
@RestController
@RequestMapping("demo/tspfmdd")
public class TsPfMddController {
    @Autowired
    private TsPfMddService tsPfMddService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfMddService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfMddEntity tsPfMdd = tsPfMddService.getById(id);

        return R.ok().put("tsPfMdd", tsPfMdd);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfMddEntity tsPfMdd){
		tsPfMddService.save(tsPfMdd);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfMddEntity tsPfMdd){
		tsPfMddService.updateById(tsPfMdd);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfMddService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
