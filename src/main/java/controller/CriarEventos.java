package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Evento;
import model.EventoDAO;

@SuppressWarnings("serial")
@WebServlet("/criarEventos")
public class CriarEventos extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String tituloEvento = request.getParameter("nomeEvento");
		String local = request.getParameter("local");
		int instituicaoEnsino =	Integer.parseInt(request.getParameter("ie"));
		String voluntario = (request.getParameter("vol"));
		String dataEvento = request.getParameter("dataH");
		String sobreEvento = request.getParameter("resumo");

		Evento objEvento = new Evento();

		objEvento.setTituloEvento(tituloEvento);
		objEvento.setLocal(local);
		objEvento.setInstituicaoEnsino(instituicaoEnsino);
		objEvento.setVoluntario(voluntario);
		objEvento.setDataEvento(dataEvento);
		objEvento.setSobreEvento(sobreEvento);
		

		EventoDAO edao = new EventoDAO();
		edao.save(objEvento);

		
		response.sendRedirect("/ConectaMais/listarEventos");

	}

}
