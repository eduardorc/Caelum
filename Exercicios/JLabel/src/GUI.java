import javax.swing.JFrame;

public class GUI {
	public static void main (String[] args) {
		Botao label = new Botao();
		
		label.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		label.setSize (350,70);
		label.setVisible (true);
	}
}
