package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class VoluntarioDAO {
	
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
			vol.setCpf_voluntario(rset.getString("cpf_voluntario"));
			vol.setNome_voluntario(rset.getString("nome_voluntario"));
			vol.setTelefone_voluntario(rset.getString("telefone_voluntario"));
			vol.setEmail_voluntario(rset.getString("email_voluntario"));
			vol.setLogradouro_voluntario(rset.getString("logradouro_voluntario"));
			vol.setCidade_voluntario(rset.getString("cidade_voluntario"));
			vol.setEstado_voluntario(rset.getString("estado_voluntario"));
			vol.setCep_voluntario(rset.getString("cep_voluntario"));
			vol.setFormacao(rset.getString("formacao"));
			vol.setSobre_voluntario(rset.getString("sobre_voluntario"));
			
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

				vol.setCpf_voluntario(rset.getString("cpf_voluntario"));
				vol.setNome_voluntario(rset.getString("nome_voluntario"));
				vol.setTelefone_voluntario(rset.getString("telefone_voluntario"));
				vol.setEmail_voluntario(rset.getString("email_voluntario"));
				vol.setLogradouro_voluntario(rset.getString("logradouro_voluntario"));
				vol.setCidade_voluntario(rset.getString("cidade_voluntario"));
				vol.setEstado_voluntario(rset.getString("estado_voluntario"));
				vol.setCep_voluntario(rset.getString("cep_voluntario"));
				vol.setFormacao(rset.getString("formacao"));
				vol.setSobre_voluntario(rset.getString("sobre_voluntario"));

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
