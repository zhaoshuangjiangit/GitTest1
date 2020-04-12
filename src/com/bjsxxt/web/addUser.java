package com.bjsxxt.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Callable;

/**
 * @Auther: zhaoshuangjian
 * @Date: 2020/4/12
 * @Description: ${PACKAGE_NAME}
 * @version: 1.0
 */
@WebServlet(name = "addUser",urlPatterns = "/addUser")
public class addUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("赵双剑的第一次使用idea的web工程");
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String userage  = request.getParameter("userage");
        System.out.println(username+"==="+userage);
        System.out.println();



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
