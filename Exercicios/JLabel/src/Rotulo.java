import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Rotulo extends JFrame {
	private JLabel label;

	public Rotulo(){
		//super ("Usando Rótulos em JFrame");
		Icon xicara = new ImageIcon ("xicara.png");
		label = new JLabel ("Simbolo Xícara", xicara, SwingConstants.CENTER); 
		label.setHorizontalTextPosition (SwingConstants.CENTER);
		label.setVerticalTextPosition (SwingConstants.BOTTOM);
		add (label);
	}
}
