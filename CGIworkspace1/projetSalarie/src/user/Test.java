package user;
import model.*;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rib r = new Rib("CA", "jendhf");
		Salarie s = new Salarie(1 , "asc" , "hfg" , r , 2);
		
		System.out.println(s);
		
		s.getStatus().setExpe(3);
		System.out.println(s);
		

	}

}
