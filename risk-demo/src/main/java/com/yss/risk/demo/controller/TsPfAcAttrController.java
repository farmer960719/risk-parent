package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcAttrEntity;
import com.yss.risk.demo.service.TsPfAcAttrService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:23
 */
@RestController
@RequestMapping("demo/tspfacattr")
public class TsPfAcAttrController {
    @Autowired
    private TsPfAcAttrService tsPfAcAttrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcAttrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcAttrEntity tsPfAcAttr = tsPfAcAttrService.getById(id);

        return R.ok().put("tsPfAcAttr", tsPfAcAttr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcAttrEntity tsPfAcAttr){
		tsPfAcAttrService.save(tsPfAcAttr);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcAttrEntity tsPfAcAttr){
		tsPfAcAttrService.updateById(tsPfAcAttr);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcAttrService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
