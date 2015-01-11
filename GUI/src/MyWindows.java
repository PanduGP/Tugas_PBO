import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class MyWindows extends JFrame
{
	private static final int LEBAR=300;
	private static final int TINGGI=200;
	private static final int POS_X=150;
	private static final int POS_Y=250;
	public MyWindows(String judul)
	{
		super(judul);
		setSize(LEBAR,TINGGI);
		setLocation(POS_X,POS_Y);
		ubahWarnaLatar();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton tombolYa=new JButton("Ya");
		JButton tombolTidak=new JButton("Tidak");
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(tombolYa);
		getContentPane().add(tombolTidak);
		ButtonHandler reaksiTombol=new ButtonHandler();
		tombolYa.addActionListener(reaksiTombol);
		tombolTidak.addActionListener(reaksiTombol);
	}
		public static void main (String [] args)
		{
			MyWindows win=new MyWindows("Windows Pertamaku");
			win.setVisible(true);
		}
		private void ubahWarnaLatar()
		{
			Container kontainer=getContentPane();
			kontainer.setBackground(Color.BLUE);
		}

}
