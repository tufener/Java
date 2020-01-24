package user;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.ConvException;
import model.NegException;
import model.OpException;
import model.Utils;

public class TestCalcExc {
	public static void main(String[]args){
		//testCalc();
		testInc();
	}
	private static void testCalc(){
		Scanner scD=new Scanner(System.in);
		Scanner scS=new Scanner(System.in);
		try{
			System.out.println("Ce programme ne traite pas les valeurs négatives.\nSaisir le premier opérande :");
			double a = scD.nextDouble();
			System.out.println("Saisir le second opérande (autre que 0 pour division) :");
			double b = scD.nextDouble();
			System.out.println("Saisir l'opérateur parmi\n+ add\t- sous\t* mult\t/ div");
			String op = scS.nextLine();
			System.out.println(Utils.choixCalc(a, b, op));
		}
		catch(NegException ne){System.out.println(ne);}
		catch(OpException oe){System.out.println(oe);}
		catch(ArithmeticException ae){System.out.println(ae);}
		catch(InputMismatchException ime){System.out.println(ime);}
		finally{
			scD.close();
			scS.close();
		}
	}
	private static void testInc(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Saisir la valeur à incrémenter");
		try{
			System.out.println(Utils.inc(sc.nextLine()));
		}
		catch(ConvException ce){System.out.println(ce);}
		finally{sc.close();}
	}
}
