package intro;

public class  Main {

   
	
	public static void main(String[] args) {
		
		//camelCase isimlendir formu yandaki gibidir
		//Don't repeat yourself!!!!!!
		
		
	    String internetSubeButonu = "�nternet �ubesi" ; 
	    double  dolarDun = 8.15;
	    double dolarBugun = 8.20;
	    int vade = 36;
	    boolean dustuMu = false;
	    
	    
	    
	    System.out.println(internetSubeButonu);
	    if(dolarBugun<dolarDun) {
	    	 System.out.println("Dolar d��t� iconu");
	    }else if(dolarBugun>dolarDun) {
	    	System.out.println("Dolar y�kseldi remsi");
	    }
	    
	    else {
	    	System.out.println("Dolar e�ittir resmi");
	    }
	    
	    String kredi1 = "H�zl� Kredi";
	    String kredi2 = "Mutlu Kredi";
	    String kredi3 = "Konut Kredi";
	    String kredi4 = "�ift�i Kredi";
	    String kredi5 = "Msb Kredi";
	    
/*	    System.out.println(kredi1);
	    System.out.println(kredi2);
	    System.out.println(kredi3);
	    System.out.println(kredi4);
	    System.out.println(kredi5);*/
	    
	    String[] krediler = {"H�zl� Kredi",
	    		"Mutlu Emekli Kredisi",
	    		"Konut Kredisi",
	    		"�ift�i Kredisi",
	    		"Msb Kredisi",
	    		"Meb Kredisi",
	    		"K�lt�r Kredisi"
	    		};
	    
	    //for each d�ng�s�
	    for(String kredi : krediler) {
	    	System.out.println(kredi);
	    }
	    
	    for(int i = 0; i<krediler.length;i++) {
	    	System.out.println(krediler[i]); 
	    }
	    
	

	}

}






















