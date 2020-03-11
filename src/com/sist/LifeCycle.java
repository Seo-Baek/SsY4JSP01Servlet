package com.sist;

// 20-03-11

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LiftCycle
 */
@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	System.out.println("init() 메소드를 호출했어요~~~");
    }
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() 메소드를 호출했어요~~~");
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost() 메소드를 호출했어요~~~");
//	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 메소드 호출 ~~~");
		// get, post 중 어떤 방식으로 들어올 지 모르기 때문에 service 메소드 사용
		// service 메소드가 있으면 doGet(), doPost() 메소드가 정의되어도 실행되지 않는다.
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 메소드를 호출했습니다.~~~");
		// 서버와 연결이 중단될 때 메소드가 실행되는 듯... 서버가 다 꺼지기 전, 중간에 나왔다.
	}
}
