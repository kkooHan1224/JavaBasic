package ch08;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch08/CalcServlet")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 0;
		String operator = "";
		int num2 = 0;
		int result = 0;
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		try {
			num1 = Integer.parseInt(request.getParameter("num1"));
			operator = request.getParameter("operator");
			num2 = Integer.parseInt(request.getParameter("num2"));
		}
		
		catch (Exception e) {
			e.toString();
			out.println(e.toString());
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>숫자 입력 에러!!!</h1>");
			out.println("<h1>숫자는 정수만 입력하세요!!!</h1>");
			out.println("</body>");
			out.println("</html>");
			return;
		}
		
		
		try {
			if (operator.equals("+")) {
				result = num1 + num2;
			} else if (operator.equals("-")) {
				result = num1 - num2;
			} else if (operator.equals("*")) {
				result = num1 * num2;
			} else if (operator.equals("/")) {
				result = num1 / num2;
			}
		}
		
		catch (ArithmeticException e) {
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>나눗셈 에러!!!</h1>");
			out.println("<h1>0으로 나눌 수 없습니다!!!</h1>");
			out.println("</body>");
			out.println("</html>");
			return;
		}

		out.println("<html>");
		out.println("<body>");
		out.println("<h1>서블릿 계산기</h1>");
		out.println("<hr/>");
		out.println("<h1>계산결과: " + num1 + operator + num2 + " = " + result + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}
}