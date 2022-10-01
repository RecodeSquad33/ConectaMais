package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class InstituicaoEnsinoDAO {
	
	public InstituicaoEnsino getInstituicaoByEmail(String email) {

		String sql = "SELECT * FROM instituicaoEnsino where email_contato= ?";
		InstituicaoEnsino inst = new InstituicaoEnsino();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, email);
			rset = pstm.executeQuery();

			inst.setNome(rset.getString("nome"));
			inst.setCategoria(rset.getString("categoria"));
			inst.setLogradouro(rset.getString("logradouro"));
			inst.setCidade(rset.getString("cidade"));
			inst.setEstado(rset.getString("estado"));
			inst.setCep(rset.getString("cep"));
			inst.setQtd_alunos(Integer.parseInt(rset.getString("qtd_alunos")));
			inst.setTelefone(rset.getString("telefone"));
			inst.setSobre(rset.getString("sobre"));
			inst.setNome_contato(rset.getString("nome_contato"));
			inst.setEmail_contato(rset.getString("email_contato"));
			inst.setTelefone_contato(rset.getString("telefone_contato"));
			
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
		return inst;
	}
	
	
	public List<InstituicaoEnsino> getVoluntarios() {

		String sql = "SELECT * FROM instituicaoEnsino";

		List<InstituicaoEnsino> ie = new ArrayList<InstituicaoEnsino>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				InstituicaoEnsino inst = new InstituicaoEnsino();

				inst.setNome(rset.getString("nome"));
				inst.setCategoria(rset.getString("categoria"));
				inst.setLogradouro(rset.getString("logradouro"));
				inst.setCidade(rset.getString("cidade"));
				inst.setEstado(rset.getString("estado"));
				inst.setCep(rset.getString("cep"));
				inst.setQtd_alunos(Integer.parseInt(request.getParameter("qtd_alunos")));
				inst.setTelefone(rset.getString("telefone"));
				inst.setSobre(rset.getString("sobre"));
				inst.setNome_contato(rset.getString("nome_contato"));
				inst.setEmail_contato(rset.getString("email_contato"));
				inst.setTelefone_contato(rset.getString("telefone_contato"));

				ie.add(inst);
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

		return inst;
	}


}



