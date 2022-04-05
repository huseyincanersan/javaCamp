package intro;

public class  Main {

   
	
	public static void main(String[] args) {
		
		//camelCase isimlendir formu yandaki gibidir
		//Don't repeat yourself!!!!!!
		
		
	    String internetSubeButonu = "Ýnternet Þubesi" ; 
	    double  dolarDun = 8.15;
	    double dolarBugun = 8.20;
	    int vade = 36;
	    boolean dustuMu = false;
	    
	    
	    
	    System.out.println(internetSubeButonu);
	    if(dolarBugun<dolarDun) {
	    	 System.out.println("Dolar düþtü iconu");
	    }else if(dolarBugun>dolarDun) {
	    	System.out.println("Dolar yükseldi remsi");
	    }
	    
	    else {
	    	System.out.println("Dolar eþittir resmi");
	    }
	    
	    String kredi1 = "Hýzlý Kredi";
	    String kredi2 = "Mutlu Kredi";
	    String kredi3 = "Konut Kredi";
	    String kredi4 = "Çiftçi Kredi";
	    String kredi5 = "Msb Kredi";
	    
/*	    System.out.println(kredi1);
	    System.out.println(kredi2);
	    System.out.println(kredi3);
	    System.out.println(kredi4);
	    System.out.println(kredi5);*/
	    
	    String[] krediler = {"Hýzlý Kredi",
	    		"Mutlu Emekli Kredisi",
	    		"Konut Kredisi",
	    		"Çiftçi Kredisi",
	    		"Msb Kredisi",
	    		"Meb Kredisi",
	    		"Kültür Kredisi"
	    		};
	    
	    //for each döngüsü
	    for(String kredi : krediler) {
	    	System.out.println(kredi);
	    }
	    
	    for(int i = 0; i<krediler.length;i++) {
	    	System.out.println(krediler[i]); 
	    }
	    
	

	}

}






















