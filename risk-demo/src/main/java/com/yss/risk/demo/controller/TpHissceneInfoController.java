package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpHissceneInfoEntity;
import com.yss.risk.demo.service.TpHissceneInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 历史情景表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:30
 */
@RestController
@RequestMapping("demo/tphissceneinfo")
public class TpHissceneInfoController {
    @Autowired
    private TpHissceneInfoService tpHissceneInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpHissceneInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpHissceneInfoEntity tpHissceneInfo = tpHissceneInfoService.getById(id);

        return R.ok().put("tpHissceneInfo", tpHissceneInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpHissceneInfoEntity tpHissceneInfo){
		tpHissceneInfoService.save(tpHissceneInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpHissceneInfoEntity tpHissceneInfo){
		tpHissceneInfoService.updateById(tpHissceneInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpHissceneInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
