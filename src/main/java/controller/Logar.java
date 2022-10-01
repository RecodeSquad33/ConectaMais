package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstituicaoEnsino;
import model.InstituicaoEnsinoDAO;
import model.Voluntario;
import model.VoluntarioDAO;

@SuppressWarnings("serial")
@WebServlet("/logar")
public class Logar extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String v = request.getParameter("email");
		String sv = request.getParameter("senha");
		
	     String i = request.getParameter("email"); 
	     String si =request.getParameter("senha");

		VoluntarioDAO voluntarioDAO = new VoluntarioDAO();
		

		for (Voluntario vol : voluntarioDAO.getVoluntarios()) {
			if (v.equals(vol.getEmail_voluntario()) && (sv.equals("123"))) {
				
                voluntarioDAO.getVoluntarioByEmail(v);
				request.setAttribute("contato", vol);

				RequestDispatcher rd = request.getRequestDispatcher("perfilVol.jsp");

				rd.forward(request, response);
			
			} /*else if (i.equals(request.getParameter("login")) && (si.equals(request.getParameter("senha")))){ 
				 InstituicaoEnsino inst= new InstituicaoEnsino(); 
				 inst.setNome(request.getParameter("nome"));
			  inst.setCategoria(request.getParameter("categoria")); 
			 inst.setLogradouro(request.getParameter("logradouro")); 
			 inst.setCidade(request.getParameter("cidade")); 
			 inst.setEstado(request.getParameter("estado")); 
			 inst.setCep(request.getParameter("cep")); 
			 inst.setQtd_alunos(Integer.parseInt(request.getParameter("qtd_alunos"))); 
			 inst.setTelefone(request.getParameter("telefone")); 
			 inst.setSobre(request.getParameter("sobre")); 
			 inst.setNome_contato(request.getParameter("nome_contato")); 
			 inst.setEmail_contato(request.getParameter("email_contato")); 
			 inst.setTelefone_contato(request.getParameter("telefone_contato")); 
			 response.sendRedirect("perfilInst.jsp");} else {
			 response.sendRedirect("login.html"); } 
			
		}*/
		
	}
	}
}
