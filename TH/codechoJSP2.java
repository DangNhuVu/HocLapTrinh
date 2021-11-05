package email;
import java.io.*;
import javax.servlet.*;
public calss DisplayEmailListServlet extends HttpServlet
{
	protected void doGet(
		HttpServleRequest request,
		HttpServleResponse response)
		throws ServletException, IOException
		{
			// get parameters from the request
			String firstname = request.getParameter("firstName");
			String lastname = request.getParameters("lastName");
			String emailAddress = request.getParameters("emailAddress");

			//return response to browser
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println(
				"<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.rog/TR/html4/loose.dtd">"
+ "<html>\n"
+ "<head>\n"
+ "	<title>Murach's Java Servlet and JSP</title> \n"
+ "</head>\n"
+ "<body>\n"
+ "	<% \n"
+ "		//get parameters from request\n"
+ "		String firstName = request.getParameter("firstName");\n"
+ "		String lastName = request.getParameter("lastName");\n"
+ "		String emailAddress = request.getParameter("emailAddress");\n"
+ "	%>\n"
+ "<h1>Cám ơn bạn đã tham gia danh sách email của chúng tôi</h1>     \n"
+ "<p>Đây là nơi bạn nhập thông tin</p>     \n"
+ "<table cellspacing="5" cellpadding="5" border="1"> \n"
+ "	<tr>\n"
+ "		<td align="right">Frist name:</td> \n"
+ "		<td><%=firstName%></td>\n"
+ "	</tr>\n"
+ "	<tr>\n"
+ "		<td align="right">Last name:</td>\n"
+ "		<td><%=lastName%></td>\n"
+ "	</tr>\n"
+ "	<tr>\n"
+ "		<td align="right">Email Address:</td>\n"
+ "		<td><%=emailAddress%></td>\n"
+ "	</tr>\n"
+ "</table>\n"
+ "<p>Để nhập một email khác, nhấn quay lại<br>\n"
+ "quay lại được hiển thị bên dưới</p>\n"
+ "<form action="join_email_lít.html"method="get"><!--  -->\n"
+ "	<input type="submit" value="Return">\n"
+ "</form>\n"
+ "</body>\n"
+ "</html>\n")
out.close();
	}
}