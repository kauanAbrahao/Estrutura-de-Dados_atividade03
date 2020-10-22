package controller;

import entities.Curso;

public class ListaDuplaEncadeadaRec {
	Curso inicio;
	Curso fim;
	int tamanho;
		
	public ListaDuplaEncadeadaRec() {
		this.inicio = null;
		this.fim = null;
		this.tamanho = 0;
			
		}
//		--------------------------------------------------------------------------------------------------
		
		public void inserirInicio(String nome, String area, String periodo, int id, int qtdSemestres) {
			Curso novocurso = new Curso();
			novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
			novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
			
			novocurso.anterior = null;
			novocurso.setProx(inicio);
			
			if (inicio != null) {
				inicio.setAnterior(novocurso);
			}
			inicio = novocurso;
			if (isEmpty()) {
				fim = inicio;
			}
			tamanho++;
			
		}
//		-----------------------------------------------------------------------------------------------------------
		public void inserirFinal(String nome, String area, String periodo, int id, int qtdSemestres) {
			Curso novocurso = new Curso();
			novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
			novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
			
			novocurso.setProx(null);
			novocurso.setAnterior(fim);
			
			if (fim != null) {
				fim.setProx(novocurso);
			}
			fim = novocurso;
			if (isEmpty()) {
				inicio = fim;
			}
			tamanho++;
			
		}
//		--------------------------------------------------------------------------------
		public void inserirMeio(String nome, String area, String periodo, int id, int qtdSemestres, int pos) {
			
			if (pos <= 0) {
				inserirInicio(nome, area, periodo, id, qtdSemestres);
			} else if (pos >= tamanho) {
				inserirFinal(nome, area, periodo, id, qtdSemestres);
			} else {
				Curso aux = inicio;
//				for(int i = 0; i < pos-1; i++) {
//					aux = aux.getProx();
//				}
				int i = 0;
				aux = recursivaGetProx(aux, i, pos);
				
				Curso novocurso = new Curso();
				novocurso.setNome(nome); novocurso.setArea(area); novocurso.setPeriodo(periodo); 
				novocurso.setId(id); novocurso.setQtdSemestres(qtdSemestres);
				
				novocurso.setAnterior(aux);
				novocurso.setProx(aux.getProx());
				aux.prox = novocurso;
				novocurso.prox.anterior = novocurso;
				tamanho++;
			}
			
		}
//		-------------------------------------------------------------------------------------------
		public void removerInicio() {
			
			if (isEmpty()) {
				System.out.println("Lista vazia, não há elementos para serem retirados");
			}
			String out = inicio.getNome();
			inicio = inicio.getProx();
			if (inicio != null) {
				inicio.setAnterior(null);
			}
			else {
				fim = null;
			}
			tamanho--;
			System.out.println("removido: " + out);
		}
		
//		------------------------------------------------------------------------------------------
		public void removerFinal() {
			if (isEmpty()) {
				System.out.println("Lista vazia, não há elementos para serem retirados");
			}
			else {
				String out = fim.getNome();
				fim = fim.getAnterior();
				if (fim != null) {
					fim.setProx(null);
				}
				else {
					inicio = null;
				}
				tamanho--;
				System.out.println( "removido: " + out); 
			}
			
			
		}
//		--------------------------------------------------------------------------------------
		
		public void removerMeio(int pos) {
			if (pos <0 || pos >= tamanho || inicio == null) {
				System.out.println("Não há o que remover nesta posição.");
			} else if (pos ==0 ) {
				removerInicio();
			} else if (pos == tamanho-1) {
				removerFinal();
			}
			Curso aux = inicio;
//			for (int i = 0; i<pos; i++) {
//				aux = aux.getProx();
//			}
			int i = 0;
			aux = recursivaGetProx(aux, i, pos);
			if (aux.getAnterior() != null) {
				aux.anterior.prox = aux.getProx();
			}
			if (aux.getProx() != null) {
				aux.prox.anterior = aux.getAnterior();
			}
			tamanho--;
		}
		
//		------------------------------------------------------------------
		private Curso recursivaGetProx(Curso aux, int i, int pos) {
			if (i==pos) {
				return aux;
			}
			return recursivaGetProx(aux.getProx(), (i+1), pos);
		}
			
//		------------------------------------------------------------------
		public void mostraLista() {
			Curso aux = inicio;
			String r = " ";
//			while (aux != null) {
//				r = r + "\n" + "Curso: " + aux.getNome() + " id# " + aux.getId() + " | Área: " + aux.getArea() + " | Periodo: " +
//						aux.getPeriodo();
//				aux = aux.getProx();
//			}
			r = recursivaConcatena(r, aux);
			System.out.println(r);
			
		}
//		-------------------------------------------------------------------
		public String recursivaConcatena(String r, Curso aux) {
			if (aux == null) {
				return r;
			}
			return recursivaConcatena((r + "\n" + "Curso: " + aux.getNome() + " id# " + aux.getId() + " | Área: " + aux.getArea() + " | Periodo: " +
						aux.getPeriodo()), aux.getProx());
		}
//		-------------------------------------------------------------------
		public boolean isEmpty() {
				if (tamanho == 0) {
					return true;
				}
				else {
					return false;
				}
		}
	}


