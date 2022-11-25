package addrbook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
 
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.println("<html>");
        pw.println("<title>");
        pw.println("제목입니다.");
        pw.println("</title>");
        pw.println("<body>");
        pw.println("Hello World kk <br> Welcome to hell");     
        pw.println("</body>");
        pw.println("</html>");
    }
}
