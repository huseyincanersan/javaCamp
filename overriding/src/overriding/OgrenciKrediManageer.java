package overriding;

public class OgrenciKrediManageer extends BaseKrediManager {
	public double hesapla(double tutar) {
		
		System.out.println("Ogrenci kredisi total odenecek");
		
		return tutar * 1.10;
	}
}
