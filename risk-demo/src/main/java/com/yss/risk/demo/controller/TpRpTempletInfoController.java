package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpRpTempletInfoEntity;
import com.yss.risk.demo.service.TpRpTempletInfoService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 报表模板配置信息表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:28
 */
@RestController
@RequestMapping("demo/tprptempletinfo")
public class TpRpTempletInfoController {
    @Autowired
    private TpRpTempletInfoService tpRpTempletInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpRpTempletInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{fid}")
    public R info(@PathVariable("fid") Integer fid){
		TpRpTempletInfoEntity tpRpTempletInfo = tpRpTempletInfoService.getById(fid);

        return R.ok().put("tpRpTempletInfo", tpRpTempletInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpRpTempletInfoEntity tpRpTempletInfo){
		tpRpTempletInfoService.save(tpRpTempletInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpRpTempletInfoEntity tpRpTempletInfo){
		tpRpTempletInfoService.updateById(tpRpTempletInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] fids){
		tpRpTempletInfoService.removeByIds(Arrays.asList(fids));

        return R.ok();
    }

}
