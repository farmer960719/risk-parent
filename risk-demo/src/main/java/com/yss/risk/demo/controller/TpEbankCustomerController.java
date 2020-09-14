package com.yss.risk.demo.controller;

import java.util.Arrays;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yss.risk.demo.entity.TpEbankCustomerEntity;
import com.yss.risk.demo.service.TpEbankCustomerService;
import com.yss.common.utils.PageUtils;
import com.yss.common.utils.R;



/**
 * 核心客户号（网银）
 *
 * @author liuscoding
 * @email liuscoding@163.com
 * @date 2020-09-14 15:13:34
 */
@RestController
@RequestMapping("demo/tpebankcustomer")
public class TpEbankCustomerController {
    @Autowired
    private TpEbankCustomerService tpEbankCustomerService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = tpEbankCustomerService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		TpEbankCustomerEntity tpEbankCustomer = tpEbankCustomerService.getById(id);

        return R.ok().put("tpEbankCustomer", tpEbankCustomer);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TpEbankCustomerEntity tpEbankCustomer){
		tpEbankCustomerService.save(tpEbankCustomer);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TpEbankCustomerEntity tpEbankCustomer){
		tpEbankCustomerService.updateById(tpEbankCustomer);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		tpEbankCustomerService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
