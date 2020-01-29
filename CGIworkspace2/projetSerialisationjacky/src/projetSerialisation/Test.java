package projetSerialisation;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		testDeSerialiserListPersonneXML();

	}
	
	static void testDeSerialiserListPersonneXML() throws IOException, ClassNotFoundException {

		File f = new File("c:\\tmp\\list.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		ArrayList<Personne> liste= (ArrayList<Personne>)ois.readObject();

		ois.close();
		fis.close();
		System.out.println(liste);

	}
	
	static void testSerialiserListPersonneXML() throws IOException {
		
		ArrayList<Personne> liste=new ArrayList<Personne>();
		liste.add( new Personne("aaa", "bbb", 10));
		liste.add( new Personne("eee", "rrr", 12));
		liste.add( new Personne("xxx", "yyy", 18));
		

		File f = new File("c:\\tmp\\list.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(liste);
		
		oos.close();
		fos.close();

	}

	static void testSerialiser2PersonneXML() throws IOException {
		Personne p1 = new Personne("aaa", "bbb", 10);
		Personne p2 = new Personne("ccc", "ddd", 18);

		File f = new File("c:\\tmp\\test2.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.close();
		fos.close();

	}

	static void testDeSerialiser2PersonneXML() throws IOException, ClassNotFoundException {
		Personne p1 = null;
		Personne p2 = null;
		Personne p3 = null;
		File f = new File("c:\\tmp\\test2.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		Object o1 = ois.readObject();

		p1 = (Personne) ois.readObject();
		p2 = (Personne) ois.readObject();
		p3 = (Personne) ois.readObject();

		ois.close();
		fis.close();
		System.out.println(p1.getAge());
		System.out.println(p2.getAge());
	}

	static void testDeSerialiserPersonneXML() throws IOException, ClassNotFoundException {
		Personne p1 = null;
		File f = new File("c:\\tmp\\test1.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(p1.getNom());
	}

	static void testSerialiserPersonneXML() throws IOException {
		Personne p = new Personne("aaa", "bbb", 10);
		p.setAge(12);
		System.out.println(p);
		File f = new File("c:\\tmp\\test1.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();

	}

	static void testDeSerialiserPersonneBinaire() throws IOException, ClassNotFoundException {
		Personne p1 = null;
		File f = new File("c:\\tmp\\test1.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		p1 = (Personne) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(p1.getNom());
	}

	static void testSerialiserPersonneBinaire() throws IOException {
		Personne p = new Personne("aaa", "bbb", 10);
		p.setAge(12);
		System.out.println(p);
		File f = new File("c:\\tmp\\test1.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();

	}

}
