package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Voluntario;
import model.VoluntarioDAO;

@SuppressWarnings("serial")
@WebServlet("/criarVoluntarios")
public class CriarVoluntarios extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String act = request.getParameter("act");
		
		if (act.equals("btn_vol")) {
		    
			/* String id_voluntario= request.getParameter("id_voluntario"); */
		String nome_voluntario = request.getParameter("nome_voluntario");
		String dataAniv= request.getParameter("dataAniv");
		String telefone_voluntario = request.getParameter("telefone_voluntario");
		String email_voluntario = request.getParameter("email_voluntario");
		String logradouro_voluntario = request.getParameter("logradouro_voluntario");
		String cidade_voluntario = request.getParameter("cidade_voluntario");
		String estado_voluntario = request.getParameter("estado_voluntario");
		String cep_voluntario = request.getParameter("cep_voluntario");
		String formacao = request.getParameter("formacao");
		String sobre_voluntario = request.getParameter("sobre_voluntario");
		String senha = request.getParameter("senha");
		/* String imagem = request.getParameter("imagem"); */
		
		Voluntario objVoluntario = new Voluntario();
		
		/* objVoluntario.setId_voluntario(id_voluntario); */
		objVoluntario.setNome_voluntario(nome_voluntario);
		objVoluntario.setDataAniv(dataAniv);
		objVoluntario.setTelefone_voluntario(telefone_voluntario);
		objVoluntario.setEmail_voluntario(email_voluntario);
		objVoluntario.setLogradouro_voluntario(logradouro_voluntario);
		objVoluntario.setCidade_voluntario(cidade_voluntario);
		objVoluntario.setEstado_voluntario(estado_voluntario);
		objVoluntario.setCep_voluntario(cep_voluntario);
		objVoluntario.setFormacao(formacao);
		objVoluntario.setSobre_voluntario(sobre_voluntario);
		objVoluntario.setSenha(senha);
		/* objVoluntario.setImagem(imagem); */
		

		VoluntarioDAO vdao = new VoluntarioDAO();
		vdao.save(objVoluntario);
		
		response.sendRedirect("login.html");
		}
		
		

	}

}
