package exp2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JOptionPane;
public class DataClient {
	public static void main(String[]args)throws IOException{
		String serverAddress=JOptionPane.showInputDialog("Masukkan Alamat IP"+"Port server 85:");
		Socket s=new Socket(serverAddress,85);
		BufferedReader input=new BufferedReader(new InputStreamReader(s.getInputStream()));
		String answer=input.readLine();
		JOptionPane.showMessageDialog(null,answer);
		System.exit(0);
	}

}
