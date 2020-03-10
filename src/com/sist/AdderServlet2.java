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
 * Servlet implementation class AdderServlet
 */
@WebServlet("/adder2")
public class AdderServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdderServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// method="get" 데이터를 처리하는 메소드
		// request : 첫번째 매개변수 - 사용자(클라이언트)의 요청에 대한 정보를 처리.
		// request : 두번째 매개변수 - 요청 정보에 대한 처리 결과를 클라이언트에 응답 처리.
		
		// 단계 1. 클라이언트의 데이터 받기 - 사용자가 전송한 데이터 받기
		int su1 = Integer.parseInt(request.getParameter("num1"));
		int su2 = Integer.parseInt(request.getParameter("num2"));
		/** 우리가 화면에 작성하면 웹 브라우저에는 
		 * 첫번째 수 : 텍스트창 
		 * 두번째 수 : 텍스트창
		 * 		더하기 버튼   
		 * text창으로 받기 때문에 문자열로 들어온다.
		 * */
		
		// 웹 브라우저에 응답
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>두 수의 합 ==> " + (su1+su2) + "</h2>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
