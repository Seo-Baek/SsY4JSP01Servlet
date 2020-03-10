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
 * Servlet implementation class CarServlet
 */
@WebServlet("/choiceCar")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// value가 이미지여서 그냥 넘어오기!
		response.setContentType("text/html; charset=UTF-8");
		
		// 변수를 받을 때 getParameter() 메소드 사용함.==> 한 개 값 받을 때
		//String name = request.getParameter("name");
		
		// 여러 개의 값을 받을 때
		String[] cars = request.getParameterValues("car");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body bgcolor='black'>");	//배경색
		out.println("<table><tr>");
		for(int i = 0; i < cars.length; i++) {
			out.println("<td>");	//1열
			// 쌍따옴표 홑따옴표 때문에 오류가 많이 일어남 -- 주의!!
			out.println("<img src='"+cars[i]+"' width='200' height='100' />");
			out.println("</td>");
		}
		out.println("</tr></table>");
		out.println("</body>");
		out.println("</html>");
	}

}
