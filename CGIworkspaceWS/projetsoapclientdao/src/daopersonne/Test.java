package daopersonne;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinAll();
//		TestFindById();
//		insert();
	}
	
	static void TestFinAll() {
		DAOPersonneWS dao = new ServiceDAOPersonneService().getDAOPersonneWSPort();
		List<Personne> p = dao.selectAll(); 
		for(Personne x : p)
			System.out.println(x.getId() + " " + x.getNom() + " " + x.getPrenom());
	}
	
	static void TestFindById() {
		DAOPersonneWS dao = new ServiceDAOPersonneService().getDAOPersonneWSPort();
		System.out.println(dao.findById(1).getNom() + " " + dao.findById(1).getPrenom());
	}
	
	static void insert() {
		DAOPersonneWS dao = new ServiceDAOPersonneService().getDAOPersonneWSPort();
		Personne p = new Personne(); 
		p.setId(20);
		p.setNom("Candreva");
		p.setPrenom("Julia");
		dao.create(p);
	}

}
