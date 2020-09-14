package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TsPfAcFixattrFiEntity;
import com.yss.risk.demo.service.TsPfAcFixattrFiService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * tabledesc
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:22
 */
@RestController
@RequestMapping("demo/tspfacfixattrfi")
public class TsPfAcFixattrFiController {
    @Autowired
    private TsPfAcFixattrFiService tsPfAcFixattrFiService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tsPfAcFixattrFiService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TsPfAcFixattrFiEntity tsPfAcFixattrFi = tsPfAcFixattrFiService.getById(id);

        return R.ok().put("tsPfAcFixattrFi", tsPfAcFixattrFi);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TsPfAcFixattrFiEntity tsPfAcFixattrFi){
		tsPfAcFixattrFiService.save(tsPfAcFixattrFi);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TsPfAcFixattrFiEntity tsPfAcFixattrFi){
		tsPfAcFixattrFiService.updateById(tsPfAcFixattrFi);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tsPfAcFixattrFiService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
