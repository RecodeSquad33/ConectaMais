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
			String sql = "INSERT INTO evento(tituloEvento, instEnsino_FK, voluntario_FK, dataEvento, sobreEvento)" + " VALUES(?,?,?,?,?)";
			
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setString(1, evento.getTituloEvento());
				pstm.setInt(2, evento.getInstituicaoEnsino());
				pstm.setString(3, evento.getVoluntario());
				pstm.setString(4, evento.getDataEvento());
				pstm.setString(4, evento.getSobreEvento());
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

			
			String sql = "DELETE FROM evento WHERE idEvento = ?";
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
			String sql = "UPDATE evento SET instEnsino_FK = ?, voluntario_FK = ?, dataEvento = ?, sobreEvento = ?, tituloEvento = ?" + "WHERE idEvento = ?";
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, evento.getInstituicaoEnsino());
				pstm.setString(2, evento.getVoluntario());
				pstm.setString(3, evento.getDataEvento());
				pstm.setString(4, evento.getSobreEvento());
				pstm.setString(5, evento.getTituloEvento());
				pstm.setInt(6, evento.getId());
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
			
			String sql = "select evento.*, instituicaoensino.logradouroIE from evento join instituicaoensino on evento.instEnsino_FK = instituicaoensino.idInstEnsino;";
			
			List<Evento> eventos = new ArrayList<Evento>();
			
			ResultSet rset = null;
			
			try {
				conn = Conexao.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				
				rset = pstm.executeQuery();
				
					while (rset.next()) {
						
						Evento evento = new Evento ();
						
						evento.setId(rset.getInt("idEvento"));
						
						evento.setLocal(rset.getString("logradouroIE"));
						
						evento.setInstituicaoEnsino(rset.getInt("instEnsino_FK"));
						
						evento.setVoluntario(rset.getString("voluntario_FK"));
						
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
