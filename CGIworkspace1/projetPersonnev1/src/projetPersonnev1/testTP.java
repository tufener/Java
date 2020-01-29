package projetPersonnev1;

public class testTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article();

	}
	static void Article(){
		
		Article no1 = new Article();
		no1.marque = "Java";
		no1.prix = 120 ;
		
		Article no2 = new Article();
		no2.marque = "Eclipse";
		no2.prix = 130 ;
		
		Article no3 = new Article();
		no3.marque = "JDK";
		no3.prix = 150 ;
		
		Article[]  tab1 = {no1, null, no2, no3};
		for(Article x : tab1)
			if(x != null)
				System.out.println(x.getInfo());
		
				
	}

}
