import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Rotulo extends JFrame {
	private JLabel label;

	public Rotulo(){
		//super ("Usando R�tulos em JFrame");
		Icon xicara = new ImageIcon ("xicara.png");
		label = new JLabel ("Simbolo X�cara", xicara, SwingConstants.CENTER); 
		label.setHorizontalTextPosition (SwingConstants.CENTER);
		label.setVerticalTextPosition (SwingConstants.BOTTOM);
		add (label);
	}
}
