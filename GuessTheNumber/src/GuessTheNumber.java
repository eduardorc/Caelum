import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;



public class GuessTheNumber {

	public static void main (String[] args) {
		Window mainwindow = new Window();
		
		
		mainwindow.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		mainwindow.setSize (350,150);
		mainwindow.setResizable(false); //Proibe que a tela tenha seu tamanho alterado
		mainwindow.setLocationRelativeTo(null); //Faz o frame aparecer no meio da tela
		mainwindow.setVisible(true);
	}
}
