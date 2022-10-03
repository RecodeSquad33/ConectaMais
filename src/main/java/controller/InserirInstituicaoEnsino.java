package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstituicaoEnsino;
import model.InstituicaoEnsinoDAO;

@WebServlet("/InserirInstituicaoEnsino")
public class InserirInstituicaoEnsino extends HttpServlet {
	private static final long serialVersionUID = 1L;
	InstituicaoEnsinoDAO iedao = new InstituicaoEnsinoDAO();
	InstituicaoEnsino ie = new InstituicaoEnsino();

	/*
	 * public InserirInstituicaoEnsino() { super();
	 * 
	 * }
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/InserirInstituicaoEnsino")) {
			inserirIE(request, response);
		} else {
			response.sendRedirect("index.jsp");
		}
	}

	protected void inserirIE(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ie.setNome(request.getParameter("nome"));
		ie.setCategoria(request.getParameter("categoria"));
		ie.setLogradouro(request.getParameter("logradouro"));
		ie.setCidade(request.getParameter("cidade"));
		ie.setEstado(request.getParameter("estado"));
		ie.setCep(request.getParameter("cep"));
		ie.setQtd_alunos(Integer.parseInt(request.getParameter("qtd_alunos")));
		ie.setTelefone(request.getParameter("telefone"));
		ie.setSobre(request.getParameter("sobre"));
		// login
		ie.setEmail(request.getParameter("email"));
		ie.setSenha(request.getParameter("senha"));

		// representante
		ie.setNome_contato(request.getParameter("nome_contato"));
		ie.setEmail_contato(request.getParameter("email_contato"));
		ie.setTelefone_contato(request.getParameter("telefone_contato"));
		iedao.inserir_IE(ie);

		response.sendRedirect("/ConectaMais/formularios.html");

	}

}

