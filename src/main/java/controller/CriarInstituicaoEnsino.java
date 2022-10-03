package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InstituicaoEnsino;
import model.InstituicaoEnsinoDAO;

@SuppressWarnings("serial")
@WebServlet("/criarInstituicaoEnsino")
public class CriarInstituicaoEnsino extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       
		String act = request.getParameter("act");
		
		if (act.equals("btn_inst")) {
	
		String  nome= request.getParameter("nome");
		String categoria = request.getParameter("categoria");
		String logradouro =	request.getParameter("logradouro");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		String cep = request.getParameter("cep");
		int qtd_alunos = Integer.parseInt(request.getParameter("qtd_alunos"));
		String telefone = request.getParameter("telefone");
		String sobre = request.getParameter("sobre");
		String nome_contato = request.getParameter("nome_contato");
		String email_contato = request.getParameter("email_contato");
		String telefone_contato = request.getParameter("telfone_contato");
		String senha = request.getParameter("senha_ie");
		/*
		 * String imagem = request.getParameter("imagem_ie");
		 */
		InstituicaoEnsino objInstituicaoEnsino = new InstituicaoEnsino();

		objInstituicaoEnsino.setNome(nome);
		objInstituicaoEnsino.setCategoria(categoria);
		objInstituicaoEnsino.setLogradouro(logradouro);
		objInstituicaoEnsino.setCidade(cidade);
		objInstituicaoEnsino.setEstado(estado);
		objInstituicaoEnsino.setCep(cep);
		objInstituicaoEnsino.setQtd_alunos(qtd_alunos);
		objInstituicaoEnsino.setTelefone(telefone);
		objInstituicaoEnsino.setSobre(sobre);
		objInstituicaoEnsino.setNome_contato(nome_contato);
		objInstituicaoEnsino.setEmail_contato(email_contato);
		objInstituicaoEnsino.setTelefone_contato(telefone_contato);
		objInstituicaoEnsino.setSenha(senha);
		/* objInstituicaoEnsino.setImagem(imagem); */
		

		InstituicaoEnsinoDAO edao = new InstituicaoEnsinoDAO();
		edao.save(objInstituicaoEnsino);

		}
		response.sendRedirect("index.html");

	}

}
