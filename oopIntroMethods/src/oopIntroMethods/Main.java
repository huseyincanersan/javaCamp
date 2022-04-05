package oopIntroMethods;

public class Main {

	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak =19;
		boolean varMi=false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayi Mevcuttur: "+aranacak);
		}else {
			mesajVer("Sayý mevcut deðildir: "+aranacak);
		}
		
		
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	
	public static void main(String[] args) {
		sayiBulmaca();

	}

}
