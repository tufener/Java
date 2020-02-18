package projetsoapdaoserver;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		// findById();
		 create();
	}

	static void selectAll() {
		DaoPersonneWS d = new ServiceDaoPersonneService().getDaoPersonneWSPort();
		List<Personne> al = d.selectAll();
		for (Personne p : al)
			System.out.println(p.getId() + " " + p.getNom() + " " + p.getPrenom());
	}
	
	static void findById() {
		DaoPersonneWS d = new ServiceDaoPersonneService().getDaoPersonneWSPort();
		System.out.println(d.findById(2).getNom()+" "+d.findById(2).getPrenom());
	}
	
	static void create() {
		DaoPersonneWS d = new ServiceDaoPersonneService().getDaoPersonneWSPort();
		Personne p=new Personne();
		p.setId(58);
		p.setNom("Hubert");
		p.setPrenom("Henri");
		d.create(p);
	}
}
