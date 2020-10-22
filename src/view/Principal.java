package view;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		//Estanciamentos
		PrincipalLista lista = new PrincipalLista();
		PrincipalPilha pilha = new PrincipalPilha();
		PrincipalFila fila = new PrincipalFila();
		PrincipalListaEncadeada encadeada = new PrincipalListaEncadeada();
		PrincipalListaDupla dupla = new PrincipalListaDupla();
		PrincipalListaDuplaRec rec = new PrincipalListaDuplaRec();
		
		
		int opc = -1;
		JOptionPane.showMessageDialog(null, "Diferentes Estruturas de Dados para uma lista de cursos");
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Estrutura de Dados:" + "\n" + "1 - Lista Estática" + 
		"\n" + "2 - Pilha Dinâmica"
		+ "\n" + "3 - Fila Dinâmica" + "\n" + "4 - Lista Simplesmente Encadeada" + "\n" + "5 - Lista Duplamente Encadeada" 
		+ "\n" + "6 - Lista Duplamente Encadeada Recursiva" + "\n" + "9 - Sair do Sistema"));
			
			switch(opc) {
			case 1: lista.interfaceLista();
			break;
			
			case 2: pilha.interfacePilha();
			break;
			
			case 3: fila.interfaceFila();
			break;
			
			case 4: encadeada.interfaceEncadeada();
			break;
			
			case 5: dupla.interfaceDupla();
			break;
			
			case 6: rec.interfaceDuplaRec();
			break;
			
			case 9: JOptionPane.showMessageDialog(null, "Sistema finalizado");
			break;
			
			default: System.out.println("Inserir opção válida");
			break;
			}
		}
		
	}

}
