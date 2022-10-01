package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

	public class EventoDAO {
		Connection conn = null;
		PreparedStatement pstm = null;
	
		public void save(Evento evento) {
			String sql = "INSERT INTO evento(endereco, instituicao_ensino, voluntario, dataEvento)" + " VALUES(?,?,?,?)";
			
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, evento.getLocal());
				pstm.setInt(2, evento.getInstituicaoEnsino());
				pstm.setInt(3, evento.getVoluntario());
				pstm.setString(4, evento.getDataEvento());
				pstm.execute();	
			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				
				try {
					
					if (pstm != null) {
						pstm.close();
					}
					
					if (conn != null) {
						conn.close();
					}
				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		public void removeById(int id) {

			
			String sql = "DELETE FROM evento WHERE id = ?";
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.execute();
			} 
			catch (Exception e) {
			e.printStackTrace();
			} 
			finally {
				try {
					if (pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
				}
				
				catch (Exception e) {
				e.printStackTrace();
				}
			}
		}
		
		public void update (Evento evento) {
			String sql = "UPDATE evento SET endereco = ?, instituicao_ensino = ?, voluntario = ?, dataEvento = ??" + "WHERE id = ?";
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, evento.getLocal());
				pstm.setInt(2, evento.getInstituicaoEnsino());
				pstm.setInt(3, evento.getVoluntario());
				pstm.setString(4, evento.getDataEvento());
				pstm.setInt(5, evento.getId());
				pstm.execute();	
			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				
				try {
					
					if (pstm != null) {
						pstm.close();
					}
					
					if (conn != null) {
						conn.close();
					}
				} 
				
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
	
		public List<Evento> getEventos() {
			
			String sql = "SELECT evento2.*, endereco_es.logradouro FROM evento2, endereco_es";
			
			List<Evento> eventos = new ArrayList<Evento>();
			
			ResultSet rset = null;
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
					while (rset.next()) {
						
						Evento evento = new Evento ();
						
						evento.setId(rset.getInt("id"));
						
						evento.setLocal(rset.getString("logradouro"));
						
						evento.setInstituicaoEnsino(rset.getInt("instituicao_ensino"));
						
						evento.setVoluntario(rset.getInt("voluntario"));
						
						evento.setDataEvento(rset.getString("dataEvento"));
						
						evento.setTituloEvento(rset.getString("tituloEvento"));
						
						evento.setSobreEvento(rset.getString("sobreEvento"));
						
						eventos.add(evento);
						
					}
			}
			
			catch (Exception e) {
				e.printStackTrace();
			}
					
			finally {
						
				try {
							
					if (pstm != null) {
						pstm.close();
					}
							
					if (conn != null) {
						conn.close();
					}
				} 
						
				catch (Exception e) {
				e.printStackTrace();
				}
			}
			
			return eventos;
			
		}
			
	}
