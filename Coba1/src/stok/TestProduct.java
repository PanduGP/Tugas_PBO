package stok;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produk p1=new Produk("P001","Pensil 2B",2500,12);
		Produk p2=new Produk("P002","Buku",3000,10);
		Produk p3=new Produk("P003","Pulpen",3500,15);
		Produk p4=new Produk("P004","Laptop",2500000,10);
		p1.tambahPersediaan();
		p2.tambahPersediaan();
		p3.tambahPersediaan();
		p4.tambahPersediaan();
		System.out.println("Persediaan Setelah ditambah");
		System.out.println();
		TableProduk tbl=new TableProduk();
		tbl.tambahProduk(p1);
		tbl.tambahProduk(p2);
		tbl.tambahProduk(p3);
		tbl.tambahProduk(p4);
		tbl.cetakTabel();

	}

}
