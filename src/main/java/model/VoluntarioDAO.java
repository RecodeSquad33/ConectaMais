package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VoluntarioDAO {
	
	
	public void save(Voluntario voluntario) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String sql = "INSERT INTO voluntario (nome_voluntario, dataAniv, telefone_voluntario, email_voluntario, logradouro_voluntario, cidade_voluntario, estado_voluntario, cep_voluntario, formacao, sobre_voluntario, senha)" + " VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			/* pstm.setString(1, voluntario.getCpf_voluntario()); */
			pstm.setString(1, voluntario.getNome_voluntario());
			pstm.setString(2, voluntario.getDataAniv());
			pstm.setString(3, voluntario.getTelefone_voluntario());
			pstm.setString(4, voluntario.getEmail_voluntario());
			pstm.setString(5, voluntario.getLogradouro_voluntario());
			pstm.setString(6, voluntario.getCidade_voluntario());
			pstm.setString(7, voluntario.getEstado_voluntario());
			pstm.setString(8, voluntario.getCidade_voluntario());
			pstm.setString(9, voluntario.getCep_voluntario());
			pstm.setString(10, voluntario.getFormacao());
			pstm.setString(11, voluntario.getSenha());
			/* pstm.setString(13, voluntario.getImagem()); */
			
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
	
	public Voluntario getVoluntarioByEmail(String email) {

		String sql = "SELECT * FROM voluntario where email_voluntario = ?";
		Voluntario vol = new Voluntario();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			rset = pstm.executeQuery();

			rset.next();
			
			vol.setNome_voluntario(rset.getString("nome_voluntario"));
			vol.setDataAniv(rset.getString("dataAniv"));
			vol.setTelefone_voluntario(rset.getString("telefone_voluntario"));
			vol.setEmail_voluntario(rset.getString("email_voluntario"));
			vol.setLogradouro_voluntario(rset.getString("logradouro_voluntario"));
			vol.setCidade_voluntario(rset.getString("cidade_voluntario"));
			vol.setEstado_voluntario(rset.getString("estado_voluntario"));
			vol.setCep_voluntario(rset.getString("cep_voluntario"));
			vol.setFormacao(rset.getString("formacao"));
			vol.setSobre_voluntario(rset.getString("sobre_voluntario"));
			vol.setSenha(rset.getString("senha"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vol;
	}
	
	
	public List<Voluntario> getVoluntarios() {

		String sql = "SELECT * FROM voluntario";

		List<Voluntario> voluntarios = new ArrayList<Voluntario>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				Voluntario vol = new Voluntario();

				
				vol.setNome_voluntario(rset.getString("nome_voluntario"));
				vol.setSobre_voluntario(rset.getString("dataAniv"));
				vol.setTelefone_voluntario(rset.getString("telefone_voluntario"));
				vol.setEmail_voluntario(rset.getString("email_voluntario"));
				vol.setLogradouro_voluntario(rset.getString("logradouro_voluntario"));
				vol.setCidade_voluntario(rset.getString("cidade_voluntario"));
				vol.setEstado_voluntario(rset.getString("estado_voluntario"));
				vol.setCep_voluntario(rset.getString("cep_voluntario"));
				vol.setFormacao(rset.getString("formacao"));
				vol.setSobre_voluntario(rset.getString("sobre_voluntario"));
				vol.setSobre_voluntario(rset.getString("senha"));

				voluntarios.add(vol);
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return voluntarios;
	}


}
