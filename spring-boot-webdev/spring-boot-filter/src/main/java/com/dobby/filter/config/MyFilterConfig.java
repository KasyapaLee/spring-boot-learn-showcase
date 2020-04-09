package com.dobby.filter.config;

import com.dobby.filter.f2.MyFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liguoqing
 */
@Configuration
public class MyFilterConfig {


    @Bean
    public FilterRegistrationBean<MyFilter2> getFilterBean() {
        MyFilter2 myFilter2 = new MyFilter2();
        FilterRegistrationBean<MyFilter2> registrationBean = new FilterRegistrationBean<>(myFilter2);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
