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
			opc = Integer.parseInt(JOptionPane.showInputDialog("-- Fila Din�mica --" + "\n" + "Escolha:" + "\n" + "1 - Inserir" + 
		 "\n" + "2 - Remover" + "\n"  + "3 - Mostrar lista" + "\n" + "9 - Voltar"));
			
			switch(opc) {
			
			case 1:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("�rea do curso: ");
			periodo = JOptionPane.showInputDialog("Per�odo: ");
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
			
			default: System.out.println("Inserir op��o v�lida");
			break;
			}
		
		}

	}
}
