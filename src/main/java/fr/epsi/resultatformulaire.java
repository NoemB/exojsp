package fr.epsi;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultat")
public class resultatformulaire extends HttpServlet {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");//important np oublier
		String name = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String salut;
			if (req.getLocale()==Locale.FRANCE)
				salut="Bonjour ";
			else
				salut="Hello ";
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat heure = new SimpleDateFormat("HH:mm");
		Calendar calendrier = Calendar.getInstance();
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("utf-8");//important np oublier
		resp.getWriter().write("<html>");
		resp.getWriter().write("<body>");
		resp.getWriter().write(salut + prenom + " " + name + "!" + "<img src='resultat/codebar?type=datamatrix&msg= "+ name +" '>");
		resp.getWriter().write("\nformulaire envoyé le : "+ date.format(calendrier.getTime()) + " à " + heure.format(calendrier.getTime()));
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
	}

}
