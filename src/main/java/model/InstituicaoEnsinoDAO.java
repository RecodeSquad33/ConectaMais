package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.InstituicaoEnsino;

@SuppressWarnings("unused")
public class InstituicaoEnsinoDAO {
	Connection conn = null;
	PreparedStatement pstm = null;

	public void inserir_IE(InstituicaoEnsino ie) {
		String create = "insert into instituicao_ensino (nome, categoria, logradouro,cidade,estado,cep,qtd_alunos,telefone,sobre,email,senha,nome_contato,email_contato,telefone_contato) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(create);
			pstm.setString(1, ie.getNome());
			pstm.setString(2, ie.getCategoria());
			pstm.setString(3, ie.getLogradouro());
			pstm.setString(4, ie.getCidade());
			pstm.setString(5, ie.getEstado());
			pstm.setString(6, ie.getCep());
			pstm.setInt(7, ie.getQtd_alunos());
			pstm.setString(8, ie.getTelefone());
			pstm.setString(9, ie.getSobre());
			pstm.setString(10, ie.getEmail());
			pstm.setString(11, ie.getSenha());
			pstm.setString(12, ie.getNome_contato());
			pstm.setString(13, ie.getEmail_contato());
			pstm.setString(14, ie.getTelefone_contato());
			pstm.executeUpdate();
			conn.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}


	/*
	 * public InstituicaoEnsino getInstituicaoByEmail(String email) {
	 * 
	 * String sql = "SELECT * FROM instituicaoEnsino where email_contato= ?";
	 * InstituicaoEnsino inst = new InstituicaoEnsino();
	 * 
	 * Connection conn = null; PreparedStatement pstm = null; ResultSet rset = null;
	 * 
	 * try { conn = Conexao.createConnectionToMySQL(); pstm =
	 * conn.prepareStatement(sql); pstm.setString(1, email); rset =
	 * pstm.executeQuery();
	 * 
	 * inst.setNome(rset.getString("nome"));
	 * inst.setCategoria(rset.getString("categoria"));
	 * inst.setLogradouro(rset.getString("logradouro"));
	 * inst.setCidade(rset.getString("cidade"));
	 * inst.setEstado(rset.getString("estado")); inst.setCep(rset.getString("cep"));
	 * inst.setQtd_alunos(Integer.parseInt(rset.getString("qtd_alunos")));
	 * inst.setTelefone(rset.getString("telefone"));
	 * inst.setSobre(rset.getString("sobre"));
	 * inst.setNome_contato(rset.getString("nome_contato"));
	 * inst.setEmail_contato(rset.getString("email_contato"));
	 * inst.setTelefone_contato(rset.getString("telefone_contato"));
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } finally { try { if (rset !=
	 * null) { rset.close(); } if (pstm != null) { pstm.close(); } if (conn != null)
	 * { conn.close(); } } catch (Exception e) { e.printStackTrace(); } } return
	 * inst; }
	 * 
	 * public List<InstituicaoEnsino> getVoluntarios() {
	 * 
	 * String sql = "SELECT * FROM instituicaoEnsino";
	 * 
	 * List<InstituicaoEnsino> ie = new ArrayList<InstituicaoEnsino>();
	 * 
	 * Connection conn = null; PreparedStatement pstm = null; ResultSet rset = null;
	 * 
	 * try { conn = Conexao.createConnectionToMySQL();
	 * 
	 * pstm = conn.prepareStatement(sql);
	 * 
	 * rset = pstm.executeQuery();
	 * 
	 * while (rset.next()) {
	 * 
	 * InstituicaoEnsino inst = new InstituicaoEnsino();
	 * 
	 * inst.setNome(rset.getString("nome"));
	 * inst.setCategoria(rset.getString("categoria"));
	 * inst.setLogradouro(rset.getString("logradouro"));
	 * inst.setCidade(rset.getString("cidade"));
	 * inst.setEstado(rset.getString("estado")); inst.setCep(rset.getString("cep"));
	 * inst.setQtd_alunos(Integer.parseInt(rset.getString("qtd_alunos")));
	 * inst.setTelefone(rset.getString("telefone"));
	 * inst.setSobre(rset.getString("sobre"));
	 * inst.setNome_contato(rset.getString("nome_contato"));
	 * inst.setEmail_contato(rset.getString("email_contato"));
	 * inst.setTelefone_contato(rset.getString("telefone_contato"));
	 * 
	 * ie.add(inst); }
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } finally { try { if (pstm != null) { pstm.close(); } if
	 * (conn != null) { conn.close(); }
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } }
	 * 
	 * return ie; }
	 */
}
