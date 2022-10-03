package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class InstituicaoEnsinoDAO {
	
public void save(InstituicaoEnsino instituicaoEnsino) {
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		String sql = "INSERT INTO instituicao_ensino (id_ie, nome, categoria, logradouro, cidade, estado, cep, qtd_alunos, telefone, sobre, nome_contato, email_contato, telefone_contato, senha, imagem)" + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, instituicaoEnsino.getId_ie());
			pstm.setString(2, instituicaoEnsino.getNome());
			pstm.setString(3, instituicaoEnsino.getCategoria());
			pstm.setString(4, instituicaoEnsino.getLogradouro());
			pstm.setString(5, instituicaoEnsino.getCidade());
			pstm.setString(6, instituicaoEnsino.getEstado());
			pstm.setString(7, instituicaoEnsino.getCep());
			pstm.setInt(8, instituicaoEnsino.getQtd_alunos());
			pstm.setString(9, instituicaoEnsino.getTelefone());
			pstm.setString(10, instituicaoEnsino.getSobre());
			pstm.setString(11, instituicaoEnsino.getNome_contato());
			pstm.setString(12, instituicaoEnsino.getEmail_contato());
			pstm.setString(13, instituicaoEnsino.getTelefone_contato());
			pstm.setString(14, instituicaoEnsino.getSenha());
			//pstm.setString(15, instituicaoEnsino.getImagem());
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
	
	
	public InstituicaoEnsino getInstituicaoByEmail(String email) {

		String sql = "SELECT * FROM instituicao_ensino where email_contato= ?";
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
			inst.setQtd_alunos(rset.getInt("qtd_alunos"));
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
	
	
	public List<InstituicaoEnsino> getInstituicaoEnsino() {

		String sql = "SELECT * FROM instituicao_ensino";

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
				inst.setQtd_alunos(rset.getInt("qtd_alunos"));
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

		return ie;
	}


}
