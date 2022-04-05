package oopIntroMethods2;

public class Main {

	public static void main(String[] args) {
		
		String yeniMesaj = sehirVer();
		int sayi = topla(15, 7);

		System.out.println(sayi);
		System.out.println(yeniMesaj);
		
		int toplam= topla2(2,3,4,5,6,10);
		
		System.out.println(toplam);
	}

	public static int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
