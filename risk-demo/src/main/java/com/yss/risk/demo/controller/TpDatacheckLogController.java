package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpDatacheckLogEntity;
import com.yss.risk.demo.service.TpDatacheckLogService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:35
 */
@RestController
@RequestMapping("demo/tpdatachecklog")
public class TpDatacheckLogController {
    @Autowired
    private TpDatacheckLogService tpDatacheckLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpDatacheckLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpDatacheckLogEntity tpDatacheckLog = tpDatacheckLogService.getById(id);

        return R.ok().put("tpDatacheckLog", tpDatacheckLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpDatacheckLogEntity tpDatacheckLog){
		tpDatacheckLogService.save(tpDatacheckLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpDatacheckLogEntity tpDatacheckLog){
		tpDatacheckLogService.updateById(tpDatacheckLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpDatacheckLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
