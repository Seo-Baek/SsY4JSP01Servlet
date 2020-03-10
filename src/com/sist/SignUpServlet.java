package com.sist;
//20-03-09
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("id");
		String userPwd = request.getParameter("pwd");
		String checkPwd = request.getParameter("checkPwd");
		String userName = request.getParameter("name");
		String userMail = request.getParameter("e_mail");
		String phone = request.getParameter("tel_1st") +" - "
						+ request.getParameter("tel_2nd") + " - "
						+ request.getParameter("tel_3rd");
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("id ==> " + userId +"<br />");
		out.println("password ==> " + userPwd +"<br />");
		out.println("checkPwd ==> " + checkPwd +"<br />");
		if(userPwd.equals(checkPwd)) {
			out.println("비밀번호 확인 일치"+"<br />");			
		} else {
			out.println("비밀번호 확인 불일치"+"<br />");			
		}
		out.println("<br />");
		out.println("userName ==> " + userName +"<br />");
		out.println("e-mail ==> " + userMail +"<br />");
		out.println("phoneNum ==> " + phone);
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
