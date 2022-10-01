package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Evento;
import model.EventoDAO;

@WebServlet("/listarEventos")
public class ListarEventos extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Evento> eventos = new ArrayList<Evento>();
		EventoDAO cdao = new EventoDAO();		
		eventos = cdao.getEventos();		
		req.setAttribute("listaEventos", eventos);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("Eventos.jsp");
		dispatcher.forward(req, resp);
	}

}