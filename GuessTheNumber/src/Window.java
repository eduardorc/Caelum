import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;



public class Window extends JFrame{
	private JLabel ltitulo, lintervalo, jogo, showw;
	private JTextField intinicio, intfinal, chute;
	private JButton ok, ttry, newint, exit, gerar;
	int inteinicio, intefinal;
	private int number;

    
	public Window(){
		super("Guess The Number");
		setLayout(new FlowLayout());
		//Adicionando Imagem Título
		Icon titulo = new ImageIcon ("images\\guessthenumber_title.png");
		ltitulo = new JLabel (titulo);
		add(ltitulo);
		intervaloWindow();
	}
	
	public void intervaloWindow() {
		//Adicionando Pergunta qual intervalo
	    lintervalo = new JLabel();
	    lintervalo.setText("Digite o intervalo[Inicio][Fim]: ");
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
	
	public void game(){
		//Descobrir como fazer isso sem ficar usando visible
		lintervalo.setVisible(false); ok.setVisible(false); intinicio.setVisible(false); intfinal.setVisible(false);
		
		//Interface do jogo
		showw = new JLabel();
		showw.setText("----------------- O intervalo será de "+inteinicio+" até "+intefinal+" ----------------");
    	add(showw);
    	
    	jogo = new JLabel();
		jogo.setText("Tentativa: "+number);
		add (jogo);
		//Adicionando as caixas de texto
	    chute = new JTextField(5);
	    add (chute);
	    //Adicionando botao try
	    IntervaloHandler handler = new IntervaloHandler();
	    ttry = new JButton ("Tentar");
	    ttry.addActionListener(handler);
	    add (ttry);
		gerar = new JButton ("Gerar novo Nº");
		gerar.addActionListener(handler);
		add(gerar);
	}
	
	public int generate(int inicio, int finall) {
        Random gen = new Random();
        return gen.nextInt(finall) + inicio;
    }
	
    public class IntervaloHandler implements ActionListener  {
        public void actionPerformed (ActionEvent event) {
            if(event.getSource() == ok)
            {
            	lintervalo.updateUI();
        	    inteinicio = Integer.parseInt (intinicio.getText().trim());
        	    intefinal = Integer.parseInt (intfinal.getText().trim());
            	number = generate(inteinicio,intefinal);
            	game();
            }
            
            if (event.getSource() == ttry){
            	if (Integer.parseInt(chute.getText()) == number){
            		JOptionPane.showMessageDialog (null, "Você ACERTOU!!");
            	}
           		if (Integer.parseInt(chute.getText()) > number){
               		JOptionPane.showMessageDialog (null, "O número é Menor!");
               	}
           		else
           			if (Integer.parseInt(chute.getText()) < number){
                   		JOptionPane.showMessageDialog (null, "O número é Maior!");
                   	}
            	}
            
            if (event.getSource() == gerar){
            	showw.setVisible(false); jogo.setVisible(false); ttry.setVisible(false); gerar.setVisible(false); chute.setVisible(false);
            	//jogo.updateUI();
            	number = generate(inteinicio,intefinal);
            	game();
            }
        }
            	
    }
} 
