package model;

public class Evento {
	private int id;
	private String tituloEvento;
	private String local;
	private int instituicaoEnsino;
	private int voluntario;
	private String dataEvento;
	private String sobreEvento;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTituloEvento() {
		return tituloEvento;
	}
	public void setTituloEvento(String tituloEvento) {
		this.tituloEvento = tituloEvento;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getInstituicaoEnsino() {
		return instituicaoEnsino;
	}
	public void setInstituicaoEnsino(int instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}
	public int getVoluntario() {
		return voluntario;
	}
	public void setVoluntario(int voluntario) {
		this.voluntario = voluntario;
	}
	public String getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getSobreEvento() {
		return sobreEvento;
	}
	public void setSobreEvento(String sobreEvento) {
		this.sobreEvento = sobreEvento;
	}
	
	
}