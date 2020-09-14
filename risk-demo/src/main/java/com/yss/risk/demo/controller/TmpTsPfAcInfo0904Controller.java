package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TmpTsPfAcInfo0904Entity;
import com.yss.risk.demo.service.TmpTsPfAcInfo0904Service;
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
@RequestMapping("demo/tmptspfacinfo0904")
public class TmpTsPfAcInfo0904Controller {
    @Autowired
    private TmpTsPfAcInfo0904Service tmpTsPfAcInfo0904Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tmpTsPfAcInfo0904Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TmpTsPfAcInfo0904Entity tmpTsPfAcInfo0904 = tmpTsPfAcInfo0904Service.getById(id);

        return R.ok().put("tmpTsPfAcInfo0904", tmpTsPfAcInfo0904);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TmpTsPfAcInfo0904Entity tmpTsPfAcInfo0904){
		tmpTsPfAcInfo0904Service.save(tmpTsPfAcInfo0904);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TmpTsPfAcInfo0904Entity tmpTsPfAcInfo0904){
		tmpTsPfAcInfo0904Service.updateById(tmpTsPfAcInfo0904);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tmpTsPfAcInfo0904Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
