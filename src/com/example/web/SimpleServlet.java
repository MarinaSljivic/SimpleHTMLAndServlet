package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Your form</title>" + "<link rel=\"stylesheet\" "
				+ "href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\">"
				+ "<link rel=\"stylesheet\" href=\"nicestyle.css\">" + "</head><body>");
		out.println("<div class=\"row\"><div class=\"col-sm-6\"><img src=\"smajlici.jpg\"/></div>"
				+ "<div class=\"col-sm-6\"><div class=\"naslovi\"><h1>SMIJEH</h1>"
				+ "<h2>Najmocnija vjestina na svijetu</h2></div></div></div>");
		
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String dateOfBirth = request.getParameter("date");
		String phoneNumber = request.getParameter("phonenumber");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		if(name.trim()=="" || surname.trim()=="" || dateOfBirth.trim()=="" || phoneNumber.trim()==""
				|| email.trim()=="" || address.trim()==""){
			
			out.println("<div class=\"paragrafi\"><p class=\"uvod\">Niste dobro ispunili prijavu, vratite se nazad.</p><br/></div>");
			
		}else{
			out.println("<div class=\"paragrafi\"><p class=\"uvod\">Uspjesno ste poslali Vase podatke.</p><br/></div>");
			out.println("<div class=\"container\">" + "<table class=\"table\">" + "<thead>" + "<tr>"
					+ "<th>Ime</th> <th>Prezime</th> <th>Datum rodjenja</th> <th>Broj telefona</th> <th>Email</th> <th>Adresa</th>"
					+ "</tr>" + "</thead>" + "<tbody>" + "<tr>" + "<td>" + name + "</td>" + "<td>" + surname + "</td>"
					+ "<td>" + dateOfBirth + "</td>" + "<td>" + phoneNumber + "</td>" + "<td>" + email + "</td>" + "<td>"
					+ address + "</td>" + "</tr>" + "</tbody></table></div>");
			out.println("<div class=\"paragrafi\"><p class=\"glavni dio\"p><img src=\"takesmile.png\" class=\"img-rounded\" alt=\"take a smile\""
					+ "align=\"left\" width=\"300\" height=\"100\" />"
					+ "</p></div><br/><br/>");
			out.println("</body></html>");
		}
		
	}

}
