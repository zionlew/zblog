/**----------------------------------------------------------+
 +   PGM-ID  :   CharacterFilter.java
 +   Author  :   H.Liu
 +   Date    :   2017年8月22日 下午7:37:51
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterFilter implements Filter{

    /* 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        //设置字符编码,解决中文乱码
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);//让后面代码继续执行       
    }

    /* 
     * @see javax.servlet.Filter#destroy()
     */
    @Override
    public void destroy() {
    }

    /* 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
     */
    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

    
}
