import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Botao extends JFrame {
	private JButton ok, cancela;
	private ButtonHandler handler;
	
	public Botao(){
		super("Criando Botões");
		setLayout (new FlowLayout());
		handler = new ButtonHandler(ok, cancela);
		Icon xicara = new ImageIcon ("xicara.png");
		
		ok = new JButton ("OK", xicara);
		cancela = new JButton ("EXIT");
		
		ok.addActionListener(handler);
		add(ok);
		cancela.addActionListener(handler);
		add (cancela);			
	}

}
