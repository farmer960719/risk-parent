package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcYcdFiEntity;
import com.yss.risk.demo.service.TsPfAcYcdFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:21
 */
@RestController
@RequestMapping("demo/tspfacycdfi")
public class TsPfAcYcdFiController {
    @Autowired
    private TsPfAcYcdFiService tsPfAcYcdFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcYcdFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcYcdFiEntity tsPfAcYcdFi = tsPfAcYcdFiService.getById(id);

        return R.ok().put("tsPfAcYcdFi", tsPfAcYcdFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcYcdFiEntity tsPfAcYcdFi){
		tsPfAcYcdFiService.save(tsPfAcYcdFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcYcdFiEntity tsPfAcYcdFi){
		tsPfAcYcdFiService.updateById(tsPfAcYcdFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcYcdFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
