package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TCebConfigEntity;
import com.yss.risk.demo.service.TCebConfigService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 光大银行配置信息表
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:06
 */
@RestController
@RequestMapping("demo/tcebconfig")
@Api(tags = "光大银行配置信息表")
public class TCebConfigController {
    @Autowired
    private TCebConfigService tCebConfigService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tCebConfigService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{ftype}")
    public R info(@PathVariable("ftype") String ftype){
		TCebConfigEntity tCebConfig = tCebConfigService.getById(ftype);

        return R.ok().put("tCebConfig", tCebConfig);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TCebConfigEntity tCebConfig){
		tCebConfigService.save(tCebConfig);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TCebConfigEntity tCebConfig){
		tCebConfigService.updateById(tCebConfig);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] ftypes){
		tCebConfigService.removeByIds(Arrays.asList(ftypes));

        return R.ok();
    }

}
