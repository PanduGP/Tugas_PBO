public class User {
	private String uName;
	private String pass;
	private int uType;
	private String name;
	
	public User(String uName,String pass,int uType,String name)
	{
		super();
		this.uName=uName;
		this.pass=pass;
		this.uType=uType;
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getuName()
	{
		return uName;
	}
	public void setuName(String uName)
	{
		this.uName=uName;
	}
	public String getpass(){
		return pass;
	}
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public int getuType()
	{
		return uType;
	}
	public void setuType(int uType)
	{
		this.uType=uType;
	}

}
