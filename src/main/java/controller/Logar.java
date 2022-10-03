package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstituicaoEnsino;
import model.Voluntario;

@SuppressWarnings("serial")
@WebServlet("/logar")
public class Logar extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("email");
		String password = request.getParameter("password");

		

		if ((login.equals("renatobcsilva@gmail.com")) && (password.equals("vol123"))) {
			
			response.sendRedirect("perfilVol.jsp");

		} else if ((login.equals("cristianosantana@hotmail.com")) && (password.equals("inst123"))) {
			
			response.sendRedirect("perfilInst.jsp");
	} else {
		
		    response.sendRedirect("login.html");
		
	}
}
}
