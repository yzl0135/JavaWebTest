package 案例.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
    请求转发
 */
@WebServlet("/servletDemo0209")
public class ServletDemo09 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置共享数据
        req.setAttribute("encoding","gbk");

        //获取请求调度对象
        RequestDispatcher rd = req.getRequestDispatcher("/servletDemo10");
        //实现转发功能
        rd.forward(req,resp);
        PrintWriter writer = resp.getWriter();
        writer.println("servletDemo09");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
