package EstruturaDeDecisao;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class atividade3 {
	public static void main(String[] args) {
		LocalDate data1 = LocalDate.parse(JOptionPane.showInputDialog("Digite a primeira data:"));
		LocalDate data2 = LocalDate.parse(JOptionPane.showInputDialog("Digite a segunda data:"));
		String data1Format = data1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String data2Format = data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		if (data1.isBefore(data2)) {
			JOptionPane.showMessageDialog(null, data1Format +" ocorreu primeiro que "+ data2Format);
		} else if (data2.isBefore(data1)) {
			JOptionPane.showMessageDialog(null, data2Format +" ocorreu primeiro que "+ data1Format);
		} else {
			JOptionPane.showMessageDialog(null, "As duas datas são iguais");
		}
	}

		
		
		
		
		
		
	}
	
	

