package model;

public class InstituicaoEnsino {

	private int id_ie;
	private String nome;
	private String categoria;
	private String logradouro;
	private String cidade;
	private String estado;
	private String cep;
	private int qtd_alunos;
	private String telefone;
	private String sobre;
	
	private String email;
	private String senha;
	
	private String nome_contato;
	private String email_contato;
	private String telefone_contato;

	public InstituicaoEnsino() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InstituicaoEnsino(int id_ie, String nome, String categoria, String logradouro, String cidade, String estado,
			String cep, int qtd_alunos, String telefone, String sobre, String email, String senha, String nome_contato,
			String email_contato, String telefone_contato) {
		this.id_ie = id_ie;
		this.nome = nome;
		this.categoria = categoria;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.qtd_alunos = qtd_alunos;
		this.telefone = telefone;
		this.sobre = sobre;
		this.email = email;
		this.senha = senha;
		this.nome_contato = nome_contato;
		this.email_contato = email_contato;
		this.telefone_contato = telefone_contato;
	}

	public int getId_ie() {
		return id_ie;
	}

	public void setId_ie(int id_ie) {
		this.id_ie = id_ie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getQtd_alunos() {
		return qtd_alunos;
	}

	public void setQtd_alunos(int qtd_alunos) {
		this.qtd_alunos = qtd_alunos;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}

	public String getTelefone_contato() {
		return telefone_contato;
	}

	public void setTelefone_contato(String telefone_contato) {
		this.telefone_contato = telefone_contato;
	}

}
