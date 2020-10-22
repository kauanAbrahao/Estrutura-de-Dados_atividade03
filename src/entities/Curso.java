package entities;

public class Curso {
//	Atributos do Objeto
	String nome;
	String area;
	String periodo;
	int id;
	int qtdSemestres;
	public Curso prox;
	public Curso anterior;
	
	public Curso getAnterior() {
		return anterior;
	}
	public void setAnterior(Curso anterior) {
		this.anterior = anterior;
	}
	public Curso getProx() {
		return prox;
	}
	public void setProx(Curso prox) {
		this.prox = prox;
	}
	//	Métodos get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtdSemestres() {
		return qtdSemestres;
	}
	public void setQtdSemestres(int qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}

	
	
}
