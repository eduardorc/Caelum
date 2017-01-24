import javax.swing.JOptionPane;

public class Prog_Grafica {
	public static void main (String[] args){
		String mensagem;
	
		mensagem = JOptionPane.showInputDialog("Digite seu nome:");
		JOptionPane.showMessageDialog(null, mensagem+", bem vindo ao java gráfico!");

	
	}
}
