import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColorsFrame extends JFrame {
	private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;
   
    public ColorsFrame ()
    {
        super( "Usando o JColorChooser" );
       
        colorJPanel = new JPanel();
        colorJPanel.setBackground( color );
       
        changeColorJButton = new JButton( "Escolher a cor" );
        changeColorJButton.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event )
                    {
                        color = JColorChooser.showDialog(
                        		ColorsFrame.this, "Escolher a color", color );
                       
                        if( color == null )
                            color = Color.LIGHT_GRAY;
                        colorJPanel.setBackground( color );
                    }
                }
                );
       
        add( colorJPanel, BorderLayout.CENTER );
        add( changeColorJButton, BorderLayout.SOUTH );
       
        setSize( 400, 130 );
        setVisible( true );
    }
}
