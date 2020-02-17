package prjsoapserver;

import java.util.Scanner;

import javax.xml.ws.Endpoint;

public class Start {

	public static void main(String[] args) {
		HelloWS conn = new ServiceHelloService().getHelloWSPort(); 
		System.out.println(conn.hellov2("Marie Jeanne"));
	

	}

}
