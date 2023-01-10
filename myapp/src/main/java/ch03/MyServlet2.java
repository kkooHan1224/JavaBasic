package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyServlet2() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MyServlet1</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>파이팅 코리아!!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}