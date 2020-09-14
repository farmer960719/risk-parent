package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfFixattrFiEntity;
import com.yss.risk.demo.service.TsPfFixattrFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:18
 */
@RestController
@RequestMapping("demo/tspffixattrfi")
public class TsPfFixattrFiController {
    @Autowired
    private TsPfFixattrFiService tsPfFixattrFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfFixattrFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfFixattrFiEntity tsPfFixattrFi = tsPfFixattrFiService.getById(id);

        return R.ok().put("tsPfFixattrFi", tsPfFixattrFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfFixattrFiEntity tsPfFixattrFi){
		tsPfFixattrFiService.save(tsPfFixattrFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfFixattrFiEntity tsPfFixattrFi){
		tsPfFixattrFiService.updateById(tsPfFixattrFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfFixattrFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
