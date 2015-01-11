import java.sql.*;
import java.util.Scanner;

import javax.swing.JFrame;
public class ConnectToServerDemo {
	public static void main(String[]args)
	{
		JFrame frame = new JFrame ("My Frame Pertama");
		frame.setSize(400,300);
		frame.setVisible(true);
		try
		{
			Class.forName("com.mckoi.JDBCDriver").newInstance();
		}
		catch (Exception e)
		{
			System.out.println("Driver TIdak Ditemukan");
			System.exit(1);
		}
		String url="jdbc:mckoi://localhost/";
		String username="Pandu";
		String password="12345";
		Connection connection;
		Scanner sc=new Scanner(System.in);
		try
		{
			connection=DriverManager.getConnection(url,username,password);
			Statement stmt=connection.createStatement();
			System.out.print("Masukkan id Product yang dicari:");
			String nxt=sc.next();
			ResultSet rs=stmt.executeQuery("Select * from Products where id='"+nxt+'"');
			
			while (rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(4));
			}
		}
		catch(SQLException e)
		{
			System.out.println("Unable to make a connection to the database .\n"+"The Reason:"+e.getMessage());
			System.exit(1);
			return;
		}
		try{
			connection.close();
		}
		catch(SQLException e)
		{
			System.out.println("An Error Occured\n"+"The SqlException message is:"+e.getMessage());
			return;
		}
		
		}
		}
