package akjweb142;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * servlet接口  (把前端数据传递到后端)
 * @author 周民华
 *
 */
public class AkjLogin extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		doPost(req,resp);// 请求和响应变量
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String name =req.getParameter("akjname");//进行请求获取
		String password =req.getParameter("akjpassword");//进行响应
		if("123".equals(name) && "123".equals(password)){
			// 登录判断，用户和密码都为123时跳转到主页面，否则还保留到登录页面
			req.setAttribute("names", name);
			req.getRequestDispatcher("AkjMain.jsp").forward(req,resp);//  跳转到主页面
			//resp.sendRedirect("Main.jsp");
			return;
		}
		resp.sendRedirect("AkjLogin.jsp");// 跳转到登录页面
		return;
	}
   
}
