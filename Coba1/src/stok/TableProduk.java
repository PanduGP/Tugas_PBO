package stok;
import java.util.Vector;

public class TableProduk {
	private Vector<Produk>dtProduk;
	public TableProduk(){
		dtProduk=new Vector<Produk>();
	}
	public void tambahProduk(Produk prd){
	dtProduk.add(prd);
	}
	public void cetakTabel(){
		System.out.println("-------Tabel Produk-----");
		System.out.println("------------------------");
		System.out.println("ID\tNama\tHarga\tPersediaan");
		System.out.println("------------------------");
		for(Produk p:dtProduk)
			System.out.println(p);
		System.out.println("-------------------------");
	}
}
