package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class atividade6 {
   public static void main(String[] args) {
	   
	   String msg = """
	   		prato 1 - miojo
	   		prato 2 - risoto
	   		prato 3 - sopa
	   		prato 4 - churrasco
	   		prato 5 - pizza
	   		""";
	   
	   int escolha = Integer.parseInt(JOptionPane.showInputDialog(msg));
	   
	   switch (escolha) {
	   case 1: {
		   JOptionPane.showMessageDialog(null, "nissim lamen");
		   break;
	   }
		   
	   case 2: {
		   JOptionPane.showMessageDialog(null, "risotinho");
		   break;
	   }
	   case 3: {
		   JOptionPane.showMessageDialog(null, "sopinha");
		   break;
	   }
	   case 4: {
		   JOptionPane.showMessageDialog(null, "churras dus guri");
		   break;
	   }
	   case 5: {
		   JOptionPane.showMessageDialog(null, "rodizinho");
		   break;
	   }
	   default:{
		   System.out.println("escolha invalida");
	   }
	  
	
	 
	   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
	
	
	
	
	
}
