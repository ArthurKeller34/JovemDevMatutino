package EstruturaDeDecisao;

import javax.swing.JOptionPane;

public class AtividadeSenha {

	public static void main(String[] args) {
		String msgSenhaDeveConter = """
				Senha deve conter:
				No mínimo 8 catacteres;
				Letras e números;
				No mínimo um caractere maiúsculo;
				Um desses caracteres (!,@,#,$,%,&,*)
				""";
		String senhaRegistrada = JOptionPane.showInputDialog("Registrar senha:\n" + msgSenhaDeveConter);
		if (senhaRegistrada.length() >= 8) {
			if ((senhaRegistrada.matches(".*\\d.*")) && (senhaRegistrada.matches(".*[a-zA-Z].*"))) {
				if (senhaRegistrada.matches(".*[A-Z].*")) {
					if (senhaRegistrada.matches(".*[!@#$%&*].*")) {
						JOptionPane.showMessageDialog(null, "Senha registrada com sucesso");
						String loginSenha = JOptionPane.showInputDialog("Digite a senha:");
						if (senhaRegistrada.equals(loginSenha))
							JOptionPane.showMessageDialog(null, "Bem vindo!");
						else
							JOptionPane.showMessageDialog(null, "Senha incorreta");
					} else {
						JOptionPane.showMessageDialog(null, "Registro de senha invalido:\n" + "senha invalida");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Registro de senha invalido:\n" + "senha invalida");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Registro de senha invalido:\n" + "senha invalida");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Registro de senha invalido:\n" + "senha invalida");
		}
	}
}
