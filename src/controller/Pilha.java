package controller;

import entities.Curso;

public class Pilha {
	private Curso inicio;
	
	public Pilha() {
		this.inicio = null;
	}
//	-------------------------------------------------------------
	
	public boolean isEmpty() {
		if (inicio == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
//	-----------------------------------------------------------------------
	
	public void push(String nome, String area, String periodo, int id, int qtdSemestres) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		novocurso.setProx(inicio);
		inicio = novocurso;
	}
	
//	-----------------------------------------------------------------
	
	public void pop() {
		
		if (inicio == null) {
			System.out.println("A Lista já está vazia!");
		}
		else {
			System.out.println("Curso " + inicio.getNome() + " id#" + inicio.getId() + " removido");
			inicio = inicio.getProx();
		}
	}
	
//	----------------------------------------------------------------
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
	

}
