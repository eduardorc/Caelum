import javax.swing.JFrame;

public class testeJanela {

	public static void main (String[] args){
		JFrame janela = new JFrame ("Desenho de linha");
		DrawLines painel = new DrawLines();
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.add (painel);
		janela.setSize(300, 600);
		janela.setVisible(true);
		janela.setLocation(100, 100);
	}
	
	
}
