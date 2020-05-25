package com.listener;

import com.dao.impl.BaseDaoImpl;
import com.entity.SystemInfo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SystemInitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext application = servletContextEvent.getServletContext();
        //获取系统的初始化对象
        SystemInfo sys = (SystemInfo) new BaseDaoImpl().getObject(SystemInfo.class, "select * from system", null);
        //放到域中
        application.setAttribute("systemInfo", sys);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
