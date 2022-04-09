package overriding;

public class TarimKrediManager extends BaseKrediManager{
public double hesapla(double tutar) {
		
		System.out.println("Tarim Kredisi total odenecek:");
		
		return tutar * 1.38;
	}
}
