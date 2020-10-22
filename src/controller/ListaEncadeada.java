package controller;

import entities.Curso;

public class ListaEncadeada {
	Curso inicio;
	
	public ListaEncadeada() {
		this.inicio = null;
	}
	
	public void inserirInicio(String nome, String area, String periodo, int id, int qtdSemestres) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		novocurso.setProx(inicio);
		inicio = novocurso;
		
	}
//	-----------------------------------------------------------------------------------------------------------
	public void inserirFinal(String nome, String area, String periodo, int id, int qtdSemestres) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		if (isEmpty()) {
			inicio = novocurso;
		}
		else {
			Curso aux = inicio;
			while(aux.getProx() != null) {
				aux = aux.getProx();
			}
			aux.setProx(novocurso);
		}
		
		
	}
//	--------------------------------------------------------------------------------
	public void inserirMeio(String nome, String area, String periodo, int id, int qtdSemestres, int pos) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		if (pos == 1) { //Chamamos o método adicionaInicio pois (pos = 1) == inicio da lista.
			inserirInicio(nome, area, periodo, id, qtdSemestres);
		}
		else {
			Curso aux = inicio;
			int i = 1;
			
			while(aux.getProx() != null && i<pos-1) {
				aux = aux.getProx();
				i++;
			}
			if (i == pos-1) {
				novocurso.setProx(aux.getProx());
				aux.setProx(novocurso);
			}
			else {
				System.out.println("Posição inválida");
			}
			
		}
		
	}
//	-------------------------------------------------------------------------------------------
	public void removerInicio() {
		
		if (isEmpty()) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			inicio = inicio.getProx();
		}
	}
	
//	------------------------------------------------------------------------------------------
	public void removerFinal() {
		Curso aux = inicio;
		Curso aux2 = aux;
		
		if(isEmpty()) {
			System.out.println("Lista já vazia. Não há como remover");
		}
		else {
			if (inicio.getProx() == null) { //Condição caso haja apenas 1 elemento na lista.
				inicio = null;
			}
			else {
				while(aux.getProx() != null) {
					aux2 = aux;
					aux = aux.getProx();
				}
				aux2.setProx(null);
			}
		}
		
		
	}
//	--------------------------------------------------------------------------------------
	
	public void removerMeio(int pos) {
		
		int i = 1;
		Curso aux = inicio;
		
		if (inicio == null) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			if (pos == 1) {
				removerInicio();
			}
			else {
				while(aux.getProx() != null) {
					aux = aux.getProx();
					i++;
				}
				if(pos>i || pos == 0) { //Se a posição for maior que a quantidade de elementos e/ou a posição escolhida for 0 (não existe).
					System.out.println("Posição inválida!");
				}
				else {
					if (pos == i) { 
						removerFinal();
					}
					else {
						aux = inicio;
						Curso aux2 = aux;
						while(pos>1) {
							aux2 = aux;
							aux = aux.getProx();
							pos--;
						}
						aux2.setProx(aux.getProx());
						aux.setProx(null);
					}
				}
			}
		
		}	
	}
//	------------------------------------------------------------------
	public void mostraLista() {
		Curso aux = inicio;
		String r = " ";
		while (aux != null) {
			r = r + "\n" + "Curso: " + aux.getNome() + " id# " + aux.getId() + " | Área: " + aux.getArea() + " | Periodo: " +
					aux.getPeriodo();
			aux = aux.getProx();
		}
		System.out.println(r);
		
	}
//	-------------------------------------------------------------------
	public boolean isEmpty() {
		if (inicio == null) {
			return true;
		}
		else {
			return false;
		}
	}

}
