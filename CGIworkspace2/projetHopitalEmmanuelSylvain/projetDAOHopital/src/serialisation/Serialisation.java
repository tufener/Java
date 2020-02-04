package serialisation;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.LinkedList;

import model.Patient;

public class Serialisation {

	public void serialisation() throws IOException {

		LinkedList<Patient> fileAttente = new LinkedList<Patient>();

		File f = new File("c:\\tmp\\fileAttente.xml");
		FileOutputStream fos = new FileOutputStream(f);
		XMLEncoder oos = new XMLEncoder(fos);
		
		oos.writeObject(fileAttente);
		oos.close();
		fos.close();
	}

	public void deserialisation() throws IOException {
		
		LinkedList<Patient> fileAttente = null;

		File f = new File("c:\\tmp\\fileAttente.xml");
		FileInputStream fis = new FileInputStream(f);
		XMLDecoder ois = new XMLDecoder(fis);

		fileAttente = (LinkedList<Patient>) ois.readObject();
		ois.close();
		fis.close();
	}
}
