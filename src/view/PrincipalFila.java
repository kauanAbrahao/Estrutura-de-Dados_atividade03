package view;

import javax.swing.JOptionPane;

import controller.Fila;

public class PrincipalFila {
	String nome;
	String area;
	String periodo;
	int id;
	int qtdSemestres;
	
	public void interfaceFila() {
		Fila fila = new Fila();
	
		
		int opc = -1;
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("-- Fila Dinâmica --" + "\n" + "Escolha:" + "\n" + "1 - Inserir" + 
		 "\n" + "2 - Remover" + "\n"  + "3 - Mostrar lista" + "\n" + "9 - Voltar"));
			
			switch(opc) {
			
			case 1:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("Área do curso: ");
			periodo = JOptionPane.showInputDialog("Período: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			fila.enqueue(nome, area, periodo, id, qtdSemestres);
			break;
			
			case 2: 
			fila.dequeue();
			break;
			
			case 3:
			fila.mostraLista();
			break;
			
			case 9: JOptionPane.showMessageDialog(null, "Finalizado");
			break;
			
			default: System.out.println("Inserir opção válida");
			break;
			}
		
		}

	}
}
