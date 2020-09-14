package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.ZfyUserEntity;
import com.yss.risk.demo.service.ZfyUserService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:08
 */
@RestController
@RequestMapping("demo/zfyuser")
public class ZfyUserController {
    @Autowired
    private ZfyUserService zfyUserService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = zfyUserService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		ZfyUserEntity zfyUser = zfyUserService.getById(id);

        return R.ok().put("zfyUser", zfyUser);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZfyUserEntity zfyUser){
		zfyUserService.save(zfyUser);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZfyUserEntity zfyUser){
		zfyUserService.updateById(zfyUser);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		zfyUserService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
