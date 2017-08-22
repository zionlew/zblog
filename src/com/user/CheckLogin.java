/**----------------------------------------------------------+
 +   PGM-ID  :   CheckLogin.java
 +   Author  :   H.Liu
 +   Date    :   2017年8月22日 下午7:34:03
 +   Function:   
 +               
 +-----------------------------------------------------------*/
package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckLogin extends HttpServlet {

    /* 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {        
        resp.sendRedirect("main1.jsp");
    }

    /* 
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String username = req.getParameter("username");
        String userpass = req.getParameter("userpass");
        
        System.out.println(username);
        System.out.println(userpass);
        
        CheckLoginImpl dao = new CheckLoginImpl();
        Boolean flg = dao.check(username, userpass);
        
        if (flg){
            System.out.println("ok1");
            req.setAttribute("msg", "Check OK");
        } else {
            System.out.println("ng");
            req.setAttribute("msg", "Check NG");
        }
        
       //resp.sendRedirect("riyu/word.jsp");
        req.getRequestDispatcher("riyu/word.jsp").forward(req, resp);
   }

        
}
