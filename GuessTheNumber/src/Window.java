import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Graphics;

public class Window extends JFrame{
	private JLabel ltitulo, lintervalo, teste;
	private JTextField intinicio, intfinal;
	private JButton ok, ttry, newint, exit;
	String inteinicio, intefinal;
	
	public void trywindow(){
    	
    	lintervalo.updateUI();
    	teste = new JLabel();
	    teste.setText("O intervalo será de");
	    teste.setText(inteinicio);
	    //teste.setText(intefinal);
	    add(teste);
	    
    	
    }
	
	public Window(){
		super("Guess The Number");
		setLayout (new FlowLayout());
		//Adicionando Imagem Título
		Icon titulo = new ImageIcon ("images\\guessthenumber_title.png");
		ltitulo = new JLabel (titulo);
		add(ltitulo);
		//Adicionando Pergunta qual intervalo
	    lintervalo = new JLabel();
	    lintervalo.setText("Digite o intervalo[Inicio][Fim]:");
	    add(lintervalo);
	    //Adicionando as caixas de texto
	    intinicio = new JTextField(5);
	    add (intinicio);
	    intfinal = new JTextField(5);
	    add (intfinal);
	    //Adicionando botao ok
	    IntervaloHandler okk = new IntervaloHandler();
	    ok = new JButton ("OK");
	    ok.addActionListener(okk);
	    add (ok);
			
	}
	
	
    public class IntervaloHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            if(event.getSource() == ok)
            {
            	inteinicio = intinicio.getText();
            	//intefinal = Integer.parseInt (intfinal.getText().trim() );
            	trywindow();
            }
        }
    }
	
    
	
}

