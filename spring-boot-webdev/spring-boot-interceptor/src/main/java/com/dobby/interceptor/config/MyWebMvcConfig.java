package com.dobby.interceptor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author liguoqing
 */
@Configuration
public class MyWebMvcConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        MyInterceptor myInterceptor = new MyInterceptor();
        registry.addInterceptor(myInterceptor)
                // 拦截包含first 的请求
                .addPathPatterns("/first/**")
                // 不拦截包含 second 的请求
                .excludePathPatterns("/second/**");
    }
}
