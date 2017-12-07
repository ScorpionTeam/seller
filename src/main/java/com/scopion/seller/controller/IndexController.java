package com.scopion.seller.controller;

import com.scopion.seller.domain.Seller;
import com.scopion.seller.result.BaseResult;
import com.scopion.seller.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author ycj
 * @version V1.0 <>
 * @date 2017-12-07 10:11
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Value("${seller}")
    private String seller;

    @Autowired
    IndexService indexService;

    @GetMapping(value = "/profile")
    public BaseResult profile() {
        Seller seller = new Seller();
        seller.setId(0001L);
        seller.setCreateDate(new Date());
        return BaseResult.success(seller);
    }

    @GetMapping(value = "/test")
    public BaseResult tst() {
        return indexService.test();
    }


}
