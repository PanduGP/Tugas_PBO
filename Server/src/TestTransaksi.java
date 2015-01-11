
public class TestTransaksi {
	public static void main(String []args)
	{
		Transaksi tr=new Transaksi("T001");
	DetilTransaksi dt=new DetilTransaksi(12,new Product("ABE009","Lamandel","HB0",350000))	
	tr.addDetil(dt);
	
	}

}
