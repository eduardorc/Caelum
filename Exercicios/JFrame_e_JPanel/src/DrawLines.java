import javax.swing.JPanel;
import java.awt.Graphics;

public class DrawLines extends JPanel {

	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		g.drawLine(0, 0, getWidth(), getHeight());
		g.drawLine (0, getHeight(), getWidth(), 0);
				
	}
}
