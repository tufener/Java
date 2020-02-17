package prjSOAPServer;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class Start {

	public static void main(String[] args) {
		//serviceCalcul();
		//serviceMeteo();
		serviceHello();

	}
	
	static void serviceHello() {
		String url = "http://127.0.0.1:8586/";
		// Endpoint en1= Endpoint.publish(url, new MeteoService());
		Endpoint en = Endpoint.publish(url, new ServiceHello());
		System.out.println(url);
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		en.stop();
		System.out.println("Fin du server");
		// en1.stop();
	}

	

	

}
