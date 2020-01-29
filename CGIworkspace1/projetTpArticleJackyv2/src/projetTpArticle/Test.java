package projetTpArticle;

public class Test {

	public static void main(String[] args) {
		
		Article art1=new Article("aaa");
		Article art2=new Article("bbb",50);
		art1.setPrix(200);
		art2.setPrix(99);
		System.out.println(art1);
		System.out.println(art2);
		art2.setPrix(101);
		System.out.println(art2);
		
		
	

	}

}
