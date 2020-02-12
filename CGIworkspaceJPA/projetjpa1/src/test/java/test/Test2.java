package test;

import dao.DAOPersonneJDBC;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("coucou");
		findAll(); 

	}
	
	static void findAll() {
		DAOPersonneJDBC daoJDBC = null; 
		daoJDBC.testFindAll();
		daoJDBC.testFindById();	
		
	}

}
