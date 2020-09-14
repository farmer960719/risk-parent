package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpGlExhibDatadict6Entity;
import com.yss.risk.demo.service.TpGlExhibDatadict6Service;
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
@RequestMapping("demo/tpglexhibdatadict6")
public class TpGlExhibDatadict6Controller {
    @Autowired
    private TpGlExhibDatadict6Service tpGlExhibDatadict6Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpGlExhibDatadict6Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpGlExhibDatadict6Entity tpGlExhibDatadict6 = tpGlExhibDatadict6Service.getById(id);

        return R.ok().put("tpGlExhibDatadict6", tpGlExhibDatadict6);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpGlExhibDatadict6Entity tpGlExhibDatadict6){
		tpGlExhibDatadict6Service.save(tpGlExhibDatadict6);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpGlExhibDatadict6Entity tpGlExhibDatadict6){
		tpGlExhibDatadict6Service.updateById(tpGlExhibDatadict6);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpGlExhibDatadict6Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
