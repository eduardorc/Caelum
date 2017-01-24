import javax.swing.JFrame;

public class testeJanela {

	public static void main (String[] args){
		JFrame janela = new JFrame ("Janela de Teste Inicial");
		Painel meuPainel = new Painel();
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add (meuPainel);
		janela.setSize(400, 600);
		janela.setVisible(true);
		janela.setLocation(100, 100);
	}
	
	
}
