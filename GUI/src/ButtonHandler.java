import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
public class ButtonHandler implements ActionListener{
	public void actionPerformed(ActionEvent event)
	{
		JButton clickedButton=(JButton)event.getSource();
		JRootPane rootPane=clickedButton.getRootPane();
	}

}
