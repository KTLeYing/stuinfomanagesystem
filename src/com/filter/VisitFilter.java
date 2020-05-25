package com.filter;

import com.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 如果用户没有登录，返回登录界面
 * @author bojiangzhou
 *
 */
public class VisitFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取会话
        User user = (User) request.getSession().getAttribute("user");
        String contextPath = request.getContextPath();

        String uri = request.getRequestURI();
        uri = uri.substring(uri.lastIndexOf("/") + 1, uri.length());

        if (user != null){//已登录，有会话存在
            filterChain.doFilter(request, response);
        }else {//我登录，自动拦截5，跳回到登录页面
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
    }

    @Override
    public void destroy() {

    }
}
