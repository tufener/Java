package projetSoapDaoServer;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class Start {

	public static void main(String[] args) {
		serviceDao();
	}
	static void serviceDao() {

		String url = "http://192.168.1.104:8586/";

		Endpoint en = Endpoint.publish(url, new ServiceDaoPersonne());
		System.out.println(url);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		en.stop();
		System.out.println("fin du serveur");
	}
}
