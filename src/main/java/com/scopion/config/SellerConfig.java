package com.scopion.config;

import com.scopion.interceptor.SellerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ycj
 * @version V1.0 <>
 * @date 2017-12-07 10:21
 */
@Configuration
public class SellerConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SellerInterceptor());
        super.addInterceptors(registry);
    }
}
