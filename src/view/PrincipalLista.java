package view;

import javax.swing.JOptionPane;

import controller.Lista;

public class PrincipalLista {
	String nome;
	String area;
	String periodo;
	int id;
	int qtdSemestres;
	int pos;
	
	public void interfaceLista() {
		int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Quantas posi��es a lista dever� ter? "));
		Lista lista = new Lista (capacidade);
		
		int opc = -1;
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("-- Lista Est�tica --" + "\n" + "Escolha:" + "\n" + "1 - Inserir no in�cio" + 
		"\n" + "2 - Inserir no final" + "\n" + "3 - Inserir no meio" + "\n" + "4 - Remover no incicio" + "\n" 
		+ "5 - Remover no final" + "\n" + "6 - Remover no meio" + "\n" + "7 - Mostrar lista" + "\n" + "9 - Voltar"));
			
			switch(opc) {
			
			case 1:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("�rea do curso: ");
			periodo = JOptionPane.showInputDialog("Per�odo: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			lista.inserirInicio(nome, area, periodo, id, qtdSemestres);
			break;
			
			case 2: 
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("�rea do curso: ");
			periodo = JOptionPane.showInputDialog("Per�odo: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			lista.inserirFinal(nome, area, periodo, id, qtdSemestres);
			break;
			
			case 3:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("�rea do curso: ");
			periodo = JOptionPane.showInputDialog("Per�odo: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			pos = Integer.parseInt(JOptionPane.showInputDialog("Qual posi��o voc� quer inserir?"));
			lista.inserirMeio(nome, area, periodo, id, qtdSemestres, pos);
			break;
			
			case 4: 
			lista.removerInicio();
			break;
			
			case 5: 
			lista.removerFinal();
			break;
			
			case 6:
			pos = Integer.parseInt(JOptionPane.showInputDialog("Qual posi��o voc� quer remover?"));
			lista.removerMeio(pos);
			break;
			
			case 7: lista.mostraLista();
			break;
			
			case 9: JOptionPane.showMessageDialog(null, "Finalizado");
			break;
			
			default: System.out.println("Inserir op��o v�lida");
			break;
			}
		
		}
	}

}
