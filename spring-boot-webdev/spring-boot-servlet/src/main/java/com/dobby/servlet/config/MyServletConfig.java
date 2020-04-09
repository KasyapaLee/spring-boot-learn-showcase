package com.dobby.servlet.config;

import com.dobby.servlet.web.MyServlet2;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 如何使用的是 Servlet2.5 版本，没有 Servlet 注解，
 * 可以使用 配置类的形式
 */
@Configuration
public class MyServletConfig {


    @Bean
    public ServletRegistrationBean<MyServlet2> getServletBean() {
        MyServlet2 myServlet = new MyServlet2();
        return new ServletRegistrationBean<MyServlet2>(myServlet, "/myServlet2");

    }
}
