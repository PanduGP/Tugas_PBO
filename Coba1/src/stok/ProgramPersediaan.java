package stok;

import java.io.DataInputStream;
import java.util.Scanner;

public class ProgramPersediaan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean selesai=false;
		do{
			cetakMenu();
			int pilihan=bacaInt("");
			switch(pilihan){
		
			case 6:selesai=true;
			break;
			default:System.out.println(">>>>No 1-6 Saja<<<<");
			break;
			}
		}while(selesai);

	}
	public static void cetakMenu(){
		System.out.println("Program Persediaan Barang");
		System.out.println("-------------------------");
		System.out.println("1.Tambah Product Baru");
		System.out.println("2.Tambah Persediaan");
		System.out.println("3.Hapus Produk");
		System.out.println("4.Edit data produk");
		System.out.println("5.View All Produk");
		System.out.println("6.Selesai");
	}
	public static int bacaInt(String pesan){
		Scanner sc=new Scanner(System.in);
		return sc.nextInt();
	}
	public static String bacaStr(String Pesan){
		String Str="";
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println(pesan);
		
	}

}
