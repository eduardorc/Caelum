package change_bg;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Botao extends JFrame {
	private JButton verde = new JButton ("Verde"),
					azul = new JButton ("Azul"),
					amarelo = new JButton ("Amarelo");
	private ButtonHandler handler = new ButtonHandler();
	
	public Botao() {
		super("Alterando a cor do Background");
		setLayout (new FlowLayout());
		
		verde.addActionListener(handler);
		add(verde);
		azul.addActionListener(handler);
		add(azul);
		amarelo.addActionListener(handler);
		add(amarelo);
	}


	public class ButtonHandler implements ActionListener{
		public void actionPerformed (ActionEvent evento){
			if (evento.getSource() == verde)
				getContentPane().setBackground(Color.GREEN);
			if (evento.getSource() == azul)
				getContentPane().setBackground(Color.BLUE);
			if (evento.getSource() == amarelo)
				getContentPane().setBackground(Color.YELLOW);
		}
	}
}
