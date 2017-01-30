import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ButtonHandler implements ActionListener {
	private JButton ok, cancelar;
	
	public ButtonHandler(JButton ok, JButton cancela){
		this.ok = ok;
		this.cancelar = cancela;
	}

	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == ok)
				JOptionPane.showMessageDialog(null, "O botão OK foi clicado");
			
		if(evento.getSource() == cancelar)
			JOptionPane.showMessageDialog(null, "O botão CANCELA foi clicado");
	}

}