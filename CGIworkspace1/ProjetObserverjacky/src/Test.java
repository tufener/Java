
public class Test {

	public static void main(String[] args) {
//		Eleve[] tab={new Eleve ("toto"),new Eleve ("titi")};
//		Professeur p1 = new Professeur("XY");
//	
//		for(Eleve e : tab)
//			{e.setProf(p1);
//			p1.attach(e);
//			}
			
		Eleve a1=new Eleve ("titi");
		Eleve a2=new Eleve ("toto");
		Professeur p = new Professeur("XY");
		a1.setProf(p);
		a2.setProf(p);
		p.attach(a1);
		p.attach(a2);
		p.setNote(18);
		System.out.println(a1);
		System.out.println(a2);

//		p1.setNote(18);
//		for(Eleve e : tab)
//		System.out.println(e.toString());
//		
	}

}
