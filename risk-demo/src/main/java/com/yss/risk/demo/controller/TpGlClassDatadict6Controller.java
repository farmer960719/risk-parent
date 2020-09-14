package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpGlClassDatadict6Entity;
import com.yss.risk.demo.service.TpGlClassDatadict6Service;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:31
 */
@RestController
@RequestMapping("demo/tpglclassdatadict6")
public class TpGlClassDatadict6Controller {
    @Autowired
    private TpGlClassDatadict6Service tpGlClassDatadict6Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpGlClassDatadict6Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpGlClassDatadict6Entity tpGlClassDatadict6 = tpGlClassDatadict6Service.getById(id);

        return R.ok().put("tpGlClassDatadict6", tpGlClassDatadict6);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpGlClassDatadict6Entity tpGlClassDatadict6){
		tpGlClassDatadict6Service.save(tpGlClassDatadict6);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpGlClassDatadict6Entity tpGlClassDatadict6){
		tpGlClassDatadict6Service.updateById(tpGlClassDatadict6);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpGlClassDatadict6Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
