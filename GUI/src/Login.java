import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Login{
	private Connection koneksi=null;
	private Statement stmt=null;
	public User doLogin(String uName,String pass)
	{
	User usr=null;
	String sql="SELECT * From Users WHERE uName='"+uName+"'AND pass='"+pass;
	}
}
