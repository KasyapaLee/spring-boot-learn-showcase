package com.dobby.filter.f1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter拦截器过滤>>>>>>>>>>>>>>>>>" );
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter拦截器初始化>>>>>>>>>>>>>>>>>" );
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter拦截器销毁>>>>>>>>>>>>>>>>>" );
    }
}
