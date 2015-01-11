package testframe;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		/*JFrame jf = new JFrame();
		jf.setSize(1024, 600);
		jf.setVisible(true);*/
		JFrame jf2 = new TestFrameExtend("Test");
		jf2.setVisible(true);

	}

}
class TestFrameExtend extends JFrame
{
	final static int DEFAULT_HEIGHT = 480;
	final static int DEFAULT_WIDTH = 640;
	final static int DEFAULT_X = 200;
	final static int DEFAULT_Y = 200;

	public TestFrameExtend(String judul)
	{
		super(judul);
		getContentPane().setLayout(new FlowLayout());
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		setLocation(DEFAULT_X, DEFAULT_Y);
		Container container = getContentPane();
		container.setBackground(Color.PINK);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton tombolYa = new JButton("Ya");
		JButton tombolTidak = new JButton("Tidak");

		JButton btnMerah = new JButton("Merah");
		btnMerah.setBackground(Color.RED);
		btnMerah.setForeground(Color.YELLOW);

		JButton btnKuning = new JButton("Kuning");
		btnKuning.setBackground(Color.YELLOW);
		btnKuning.setForeground(Color.RED);

		JButton btnHijau = new JButton("Hijau");
		btnHijau.setBackground(Color.GREEN);
		btnHijau.setForeground(Color.BLACK);

		JButton btn = new JButton("Button");
		BtnListener bl = new BtnListener();
		btn.addActionListener(bl);
		btn.setSize(20, 90);

		Btn al = new Btn();
		btnMerah.addActionListener(al);
		btnKuning.addActionListener(al);
		btnHijau.addActionListener(al);

		add(btnMerah);
		add(btnKuning);
		add(btnHijau);
	}
}

class BtnListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		//tempat reaksi ketika ada event source
		JButton clickedButton = (JButton) event.getSource();
		JRootPane rootPane = clickedButton.getRootPane();
		JFrame frame = (JFrame) rootPane.getParent();
		String buttonText = clickedButton.getText();
		frame.setTitle("Anda Memilih Click" +buttonText);
	}
}

class Btn implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent event)
	{
		JButton clickedButton = (JButton) event.getSource();
		JRootPane rootPane = clickedButton.getRootPane();
		JFrame frame = (JFrame) rootPane.getParent();
		frame.getContentPane().setBackground(clickedButton.getBackground());
	}
}