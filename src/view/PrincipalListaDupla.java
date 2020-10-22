package view;

import javax.swing.JOptionPane;

import controller.ListaDuplaEncadeada;

public class PrincipalListaDupla {
	String nome;
	String area;
	String periodo;
	int id;
	int qtdSemestres;
	int pos;
	
	public void interfaceDupla() {
		ListaDuplaEncadeada listadupla = new ListaDuplaEncadeada();
		int opc = -1;
		
		while(opc!=9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("-- Lista Duplamente Encadeada --" + "\n" + "Escolha:" + "\n" + "1 - Inserir no início" + 
		"\n" + "2 - Inserir no final" + "\n" + "3 - Inserir no meio" + "\n" + "4 - Remover no incicio" + "\n" 
		+ "5 - Remover no final" + "\n" + "6 - Remover no meio" + "\n" + "7 - Mostrar lista" + "\n" + "9 - Voltar"));
			
			switch(opc) {
			
			case 1:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("Área do curso: ");
			periodo = JOptionPane.showInputDialog("Período: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			listadupla.inserirInicio(nome, area, periodo, id, qtdSemestres);
			break;
			
			case 2: 
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("Área do curso: ");
			periodo = JOptionPane.showInputDialog("Período: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			listadupla.inserirFinal(nome, area, periodo, id, qtdSemestres);
			break;
			
			case 3:
			nome = JOptionPane.showInputDialog("Nome do curso: ");
			area = JOptionPane.showInputDialog("Área do curso: ");
			periodo = JOptionPane.showInputDialog("Período: ");
			id = (int) (Math.random() * (300)+100);
			qtdSemestres = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de semestres: "));
			pos = Integer.parseInt(JOptionPane.showInputDialog("Qual posição você quer inserir?"));
			listadupla.inserirMeio(nome, area, periodo, id, qtdSemestres, pos);
			break;
			
			case 4: 
			listadupla.removerInicio();
			break;
			
			case 5: 
			listadupla.removerFinal();
			break;
			
			case 6:
			pos = Integer.parseInt(JOptionPane.showInputDialog("Qual posição você quer remover?"));
			listadupla.removerMeio(pos);
			break;
			
			case 7: listadupla.mostraLista();
			break;
			
			case 9: JOptionPane.showMessageDialog(null, "Finalizado");
			break;
			
			default: System.out.println("Inserir opção válida");
			break;
			}
		
		}
		
	}

}
