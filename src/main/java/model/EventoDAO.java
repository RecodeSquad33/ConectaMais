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
			String sql = "INSERT INTO evento(tituloEvento, local, instituicaoEnsino, voluntario, dataEvento, sobreEvento)" + " VALUES(?,?,?,?,?,?)";
			
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, evento.getTituloEvento());
				pstm.setString(2, evento.getLocal());
				pstm.setInt(3, evento.getInstituicaoEnsino());
				pstm.setInt(4, evento.getVoluntario());
				pstm.setString(5, evento.getDataEvento());
				pstm.setString(6, evento.getSobreEvento());
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
			String sql = "UPDATE evento SET tituloEvento=?, local = ?, instituicaoEnsino = ?, voluntario = ?, dataEvento = ?, sobreEvento=?" + "WHERE id = ?";
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, evento.getTituloEvento());
				pstm.setString(2, evento.getLocal());
				pstm.setInt(3, evento.getInstituicaoEnsino());
				pstm.setInt(4, evento.getVoluntario());
				pstm.setString(5, evento.getDataEvento());
				pstm.setString(6, evento.getSobreEvento());
				pstm.execute();				} 
			
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
			
			String sql = "SELECT * FROM evento";
			
			List<Evento> eventos = new ArrayList<Evento>();
			
			ResultSet rset = null;
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
					while (rset.next()) {
						
						Evento evento = new Evento ();
						
						evento.setId(rset.getInt("id"));
						
						evento.setTituloEvento(rset.getString("tituloEvento"));
						
						evento.setLocal(rset.getString("local"));
						
						evento.setInstituicaoEnsino(rset.getInt("instituicaoEnsino"));
						
						evento.setVoluntario(rset.getInt("voluntario"));
						
						evento.setDataEvento(rset.getString("dataEvento"));
						
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
