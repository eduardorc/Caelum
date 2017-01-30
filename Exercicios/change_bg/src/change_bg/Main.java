package change_bg;

import javax.swing.JFrame;

public class Main {
	public static void main (String[] args){
		Botao botoes = new Botao();
		
		botoes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		botoes.setSize(400, 400);
		botoes.setVisible (true);
	}

}
