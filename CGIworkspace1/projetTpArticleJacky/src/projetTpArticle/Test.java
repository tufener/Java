package projetTpArticle;

public class Test {

	public static void main(String[] args) {
		
		Article art1=new Article();
		art1.marque="LU";
		art1.prix=2;
		
		Article art2=new Article();
		art2.marque="xx";
		art2.prix=3;
		
		Article art3=new Article();
		art3.marque="yy";
		art3.prix=4;
		
		Article[] tab={art1, art2, art3};
		
		for(Article art : tab)
			System.out.println(art.getInfo());
		

	}

}
