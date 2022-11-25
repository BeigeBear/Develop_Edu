package addrbook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addrbook.model.AddrDto;
import addrbook.service.InsertService;
import addrbook.service.InsertServicempl;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("/do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		// actionDo 실행
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		// actionDo 실행
		actionDo(request, response);
	}
	
	// 요청받은 명령에 따라 동작하는 메소드
		protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String uri = request.getRequestURI();
				// 절대경로 멤버 변수 선언
			String conPath = request.getContextPath();
			String command = uri.substring(conPath.length());
			
			request.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=UTF-8");
			
			// insert 추가 명령
			if(command.equals("/insert.do")) {
				System.out.println("insert.do 입니다.");
				
				// 임시 연락처 객체 선언
				AddrDto insAddr = AddrDto.getInstance();
				insAddr.setAb_name(request.getParameter("name"));
				insAddr.setAb_email(request.getParameter("email"));
				insAddr.setAb_tel(request.getParameter("tel"));
				insAddr.setAb_birth(request.getParameter("birth"));
				insAddr.setAb_comdept(request.getParameter("comdept"));
				insAddr.setAb_memo(request.getParameter("memo"));
				
				request.setAttribute("insAddr", insAddr);
				
				InsertService insertServ = new InsertServicempl();
				
				insertServ.execute(request, response);
				response.sendRedirect("/addrbook/list.do");
			}
			// delete 삭제 명령
			else if(command.equals("/delete.do")) {
				
			}
		}
		
		
		
		
}
