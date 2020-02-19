package fr.atatorus.bookservice.services;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		add();
//		sous();
//		mult();
//		div();

	}

	static void add() {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez choisir le nombre 1:");
		int choice = s.nextInt();
		System.out.println("Veuillez choisir le nombre 2:");
		int choice2 = s.nextInt();

		Calcul c = new CalculService().getCalculPort();
		System.out.println(c.add(choice, choice2));
		s.close();
	}

	static void sous() {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez choisir le nombre 1:");
		int choice = s.nextInt();
		System.out.println("Veuillez choisir le nombre 2:");
		int choice2 = s.nextInt();
		
		Calcul c = new CalculService().getCalculPort();
		System.out.println(c.sous(choice, choice2));
		s.close();
	}

	static void mult() {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez choisir le nombre 1:");
		int choice = s.nextInt();
		System.out.println("Veuillez choisir le nombre 2:");
		int choice2 = s.nextInt();
		
		Calcul c = new CalculService().getCalculPort();
		System.out.println(c.mult(choice, choice2));
		s.close();
	}

	static void div() {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez choisir le nombre 1:");
		int choice = s.nextInt();
		System.out.println("Veuillez choisir le nombre 2:");
		int choice2 = s.nextInt();
		
		Calcul c = new CalculService().getCalculPort();
		System.out.println(c.div(choice, choice2));
		s.close();
	}

}
