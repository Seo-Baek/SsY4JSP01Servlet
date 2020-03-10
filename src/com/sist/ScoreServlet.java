package com.sist;
//20/03/09
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScoreServlet
 */
@WebServlet("/score")
public class ScoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ScoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		int tot = kor+eng+mat;
		
		float avg = tot/3.0f;
		String avg1 = String.format("%.2f", avg);
		String grade = null;
		if(avg >= 90) {
			grade = "A학점";
		} else if(avg >= 80) {
			grade = "B학점";
		} else if(avg >= 70) {
			grade = "C학점";
		} else if(avg >= 60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<table border='1' cellspacing='0'>");
		out.println("<tr>");
		out.println("<th>이  름</th>");
		out.println("<td>"+ name +"</td></tr>");
		out.println("<tr>");
		out.println("<th>국  어</th>");
		out.println("<td>"+ kor +"</td></tr>");
		out.println("<tr>");
		out.println("<th>영  어</th>");
		out.println("<td>"+ eng +"</td></tr>");
		out.println("<tr>");
		out.println("<th>수  학</th>");
		out.println("<td>"+ mat +"</td></tr>");
		out.println("<tr>");
		out.println("<th>총  점</th>");
		out.println("<td>"+ tot +"</td></tr>");
		out.println("<tr>");
		out.println("<th>평  균</th>");
		out.println("<td>"+ avg1+"</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th>학  점</th>");
		out.println("<td>"+grade+"</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
