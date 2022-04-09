package overriding;

public class OgretmenKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		
		System.out.println("Ogretmen Kredisi total odenecek:");  
		
		return tutar * 1.20;
		
		
	}
}
