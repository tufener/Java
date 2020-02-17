package DaoPersonne;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class Start {

	public static void main(String[] args) {
//		TestDaoPersonne();
		TestDaoPersonne();

	}
	
	static void TestDaoPersonne() {
		String url = "http://192.168.1.34:8586/";
		// Endpoint en1= Endpoint.publish(url, new MeteoService());
		Endpoint en = Endpoint.publish(url, new ServiceDAOPersonne());
		System.out.println(url);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		en.stop();
		System.out.println("Fin du server");
		// en1.stop();
	}
	
	
	

}
