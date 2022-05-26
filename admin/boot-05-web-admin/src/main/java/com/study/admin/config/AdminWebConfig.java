package com.study.admin.config;

import com.study.admin.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author RenAshbell
 * @create 2022-05-26-17:10
 */

/**
 * 1.编写一个拦截器实现HandlerInterceptor接口
 * 2.拦截器注册到容器中(实现WebMvcConfig的addInterceptors)
 * 3.指定拦截器规则
 */
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")// 所有请求都会拦截，静态资源也会拦截
                .excludePathPatterns("/","/login","/css/**","/js/**","/fonts/**","/images/**");
    }
}
