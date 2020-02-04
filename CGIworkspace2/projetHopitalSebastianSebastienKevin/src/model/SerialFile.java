package model;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

public class SerialFile {
	public final static String path="c:\\tmp\\attente.xml";
	public final static String path2="C:\\Users\\utilisateur\\Desktop\\CGI\\workspace2\\projetHopitalSebastianSebastienKevin\\attente.xml";
	public static void serial(LinkedList<Patient> file)throws IOException{
		File f=new File(path);
		FileOutputStream fos=new FileOutputStream(f);
		XMLEncoder xe=new XMLEncoder(fos);
		xe.writeObject(file);
		xe.close();
		fos.close();
	}
	public static LinkedList<Patient> deserial()throws IOException{
		File f=new File(path2);
		FileInputStream fis=new FileInputStream(f);
		XMLDecoder xd=new XMLDecoder(fis);
		Object o;
		o=xd.readObject();
		@SuppressWarnings("unchecked")
		LinkedList<Patient> file=(LinkedList<Patient>)o;
		xd.close();
		fis.close();
		return file;
	}
}
