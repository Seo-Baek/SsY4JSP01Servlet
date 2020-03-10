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
 * 서블릿 생명 주기(Life Cycle)
 * Servlet 객체 생성 → init() 메서드 호출 → service(), doGet(), doPost() 메서드 호출 → destroy() 메서드 호출
 *   (최초 한 번)        (최초 한 번)                   (요청 시 매번)                    (마지막 한 번)
 * 
 * - 서버(서블릿)에서 웹 브라우저로 데이터를 전송할 때에는 어떤 종류의 데이터를 전송하는지 웹 브라우저에게 알려 주어야 함.
 *   => 이유 : 웹 브라우저가 전송 받을 데이터의 종류를 미리 알고 있으면 더 빠르게 처리할 수 있기 때문임.
 * - 데이터 종류(MIME-TYPE) : 톰캣 컨테이너에서 미리 제공하는 여러 가지 전송 데이터 종류를 하나 지정하여 웹 브라우저로 전송.
 *                         이처럼 톰캣 컨테이네에서 미리 설정해 놓은 데이터의 종류들을 말함.
 *                         웹 브라우저는 기본적으로 HTML만 인식하므로 서블릿에서 전송하는 대부분의 데이터는
 *                         MIME-TYPE을 "text/html"로 설정을 함.
 * - 서블릿이 클라이언트(웹 브라우저)에 응답하는 과정.
 *   * setContentType()을 이용해서 MIME-TYPE을 지정함.
 *   * 데이터를 출력할 PrintWriter 객체를 생성함.
 *   * 출력 데이터를 HTML 형식으로 만듬.
 *   * PrintWriter 객체의 print()나 println() 메서드를 이용해 데이터를 출력함.

 */
@WebServlet("/AdderServlet")
public class AdderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdderServlet() {
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
