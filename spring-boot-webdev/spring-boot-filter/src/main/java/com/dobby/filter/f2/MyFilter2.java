package com.dobby.filter.f2;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter2拦截器过滤>>>>>>>>>>>>>>>>>" );
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter2拦截器初始化>>>>>>>>>>>>>>>>>" );
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter2拦截器销毁>>>>>>>>>>>>>>>>>" );
    }
}
