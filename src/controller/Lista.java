package controller;

import entities.Curso;

public class Lista {
	private Curso[] listacurso;
	private int tamanho;
	
	public Lista(int capacidade) {
		this.listacurso = new Curso[capacidade];
		this.tamanho = 0;
	}
	
//	--------------------------------------------------------------------------------------------------------
	public void inserirInicio(String nome, String area, String periodo, int id, int qtdSemestres) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		if (isFull()) {
			System.out.println("Não é possível adicionar mais elementos. Vetor lotado.");
		}
		else {
			for (int i = this.tamanho-1; i>= 0; i--) {
				this.listacurso[i+1] = this.listacurso[i];
			}
				this.listacurso[0] = novocurso;
				this.tamanho++;
		}
		
	}
//	-----------------------------------------------------------------------------------------------------------
	public void inserirFinal(String nome, String area, String periodo, int id, int qtdSemestres) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		if (!isFull()) {
			this.listacurso[this.tamanho] = novocurso;
			this.tamanho++;
		}
		else {
			System.out.println("Vetor cheio. Impossível adicionar mais elementos");
		}
		
		
	}
//	--------------------------------------------------------------------------------
	public void inserirMeio(String nome, String area, String periodo, int id, int qtdSemestres, int pos) {
		Curso novocurso = new Curso();
		novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
		novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
		
		if (!isFull()) {
			if (pos >= listacurso.length || pos<0) {
				System.out.println("Posição inválida");
			}
			else {
				for (int i = this.tamanho; i>= pos; i--) {
					this.listacurso[i+1] = this.listacurso[i];
				}
				this.listacurso[pos] = novocurso;
				this.tamanho++;
				}
			}
		else {
			System.out.println("Não é possível adicionar mais elementos. Vetor lotado.");
		}
		
	}
//	-------------------------------------------------------------------------------------------
	public void removerInicio() {
		
		if(isEmpty()) {
			System.out.println("Lista já vazia. Não há como remover");
		}
		else {
			for (int i = 0; i<this.tamanho-1; i++) {
				this.listacurso[i] = this.listacurso[i+1];
			}
			
			listacurso[tamanho-1] = null;
			this.tamanho--;
		}	
	}
	
//	------------------------------------------------------------------------------------------
	public void removerFinal() {
		
		if(isEmpty()) {
			System.out.println("Lista já vazia. Não há como remover");
		}
		else {
			listacurso[tamanho-1] = null;
		}
		
	}
//	--------------------------------------------------------------------------------------
	
	public void removerMeio(int pos) {
		
		if (isEmpty()) {
			System.out.println("Lista já vazia. Não há como remover");
		}
		else {
			if (pos >= listacurso.length || pos<0) {
				throw new IllegalArgumentException("Posição inválida");
			}
			else {
				for (int i = pos; i<this.tamanho-1; i++) {
					this.listacurso[i] = this.listacurso[i+1];
				}
				
				this.tamanho--;
			}
		}
	}
//	------------------------------------------------------------------
	public void mostraLista() {
		for (int i = 0; i<listacurso.length; i++) {
			if (listacurso[i] != null) {
				System.out.println(listacurso[i].getNome());
			}
		}
		System.out.println("");
		
	}
//	-------------------------------------------------------------------
	public boolean isEmpty() {
		if (tamanho == 0) {
			return true;
		}
		else {
			return false;
		}
	}
//	-------------------------------------------------------------------
	public boolean isFull() {
		if (tamanho == listacurso.length) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
