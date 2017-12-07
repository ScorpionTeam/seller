package com.scopion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/test")
    public String test() {
        return seller;
    }
}
