package com.sist;
// 2020-03-09
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/profile")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청과 응답에 관한 한글 처리
		// 톰캣 서버의 default 문자 처리 방식은  ISO-8859-1 방식임.
		// 따라서 개발자가 한글 인코딩을 처리하지 않으면, 한글이 깨짐
		// get 방식과 post 방식의 한글 처리가 다릅니다.
		// get 방식의 한글 처리는 server.xml 파일에서 <connector>에  
		// "URIEncoding="UTF-8"로 설정해야 한다. ==> 톰캣 7.0 버전에서 사용.
		// 버전이 올라가면서 8.0 이상 부터는 한글이 깨지지 않는다.
		// post 방식의 한글 처리는 doPost() 메소드 안에 
		// rquest.setCharacterEncoding="UTF-8"로 설정
		
		String userName = request.getParameter("name");
		String userAge = request.getParameter("age");
		
		// 웹 브라우저에 출력해보자.
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>");
		out.println("이  름 : " + userName + "<br />" );
		out.println("나  이 : " + userAge + "<br />" );
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

}
