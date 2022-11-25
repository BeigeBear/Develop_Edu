package jspbook.ch04;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CS2")
public class CalcServlet2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	// GET 요청을 처리하기 위한 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost()로 포워딩.
		doPost(request, response);
	}
	
	
	// POST 요청을 처리하기 위한 메서드
	// doGet()에서도 호출하고 있기 때문에 모든 요청은 doPost()에서 처리되는 구조이다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 변수 선언
		int num1, num2;
		int result;
		String op;
		
		// 클라이언트 응답시 전달될 콘텐트에 대한 타입 설정과 캐릭터셋 지정
		response.setContentType("text/html; charset=UTF-8");
		
		// 클라이언트 응답을 위한 출력 스트립 확보
		PrintWriter out = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		
		// Calc 클래스 인스턴스 생성 후 getResult 메소드 호출로 결과 받음
		Calc calc = new Calc(num1, num2, op);
		result = calc.getResult();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>계산결과</H2>");
		out.println("<HR>");
		out.println(num1+""+op+""+num2+"="+result);
		out.println("</BODY></HTML>");
		
	}


}
