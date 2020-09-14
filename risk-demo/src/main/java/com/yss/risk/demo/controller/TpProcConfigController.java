package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpProcConfigEntity;
import com.yss.risk.demo.service.TpProcConfigService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:29
 */
@RestController
@RequestMapping("demo/tpprocconfig")
public class TpProcConfigController {
    @Autowired
    private TpProcConfigService tpProcConfigService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpProcConfigService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{groupId}")
    public R info(@PathVariable("groupId") String groupId){
		TpProcConfigEntity tpProcConfig = tpProcConfigService.getById(groupId);

        return R.ok().put("tpProcConfig", tpProcConfig);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpProcConfigEntity tpProcConfig){
		tpProcConfigService.save(tpProcConfig);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpProcConfigEntity tpProcConfig){
		tpProcConfigService.updateById(tpProcConfig);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] groupIds){
		tpProcConfigService.removeByIds(Arrays.asList(groupIds));

        return R.ok();
    }

}
