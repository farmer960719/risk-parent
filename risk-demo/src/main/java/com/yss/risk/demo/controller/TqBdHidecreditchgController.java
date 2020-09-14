package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TqBdHidecreditchgEntity;
import com.yss.risk.demo.service.TqBdHidecreditchgService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * ${comments}
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:27
 */
@RestController
@RequestMapping("demo/tqbdhidecreditchg")
public class TqBdHidecreditchgController {
    @Autowired
    private TqBdHidecreditchgService tqBdHidecreditchgService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tqBdHidecreditchgService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TqBdHidecreditchgEntity tqBdHidecreditchg = tqBdHidecreditchgService.getById(id);

        return R.ok().put("tqBdHidecreditchg", tqBdHidecreditchg);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TqBdHidecreditchgEntity tqBdHidecreditchg){
		tqBdHidecreditchgService.save(tqBdHidecreditchg);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TqBdHidecreditchgEntity tqBdHidecreditchg){
		tqBdHidecreditchgService.updateById(tqBdHidecreditchg);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tqBdHidecreditchgService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
