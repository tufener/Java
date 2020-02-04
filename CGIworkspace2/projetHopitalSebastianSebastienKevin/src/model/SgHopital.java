package model;
import java.util.LinkedList;

public class SgHopital {

	private String nomSec;
	private static SgHopital h = new SgHopital();
	private LinkedList<Patient> file=new LinkedList<Patient>();
	private SgHopital(){
	}
	public String toString() {
		return "";
	}

	public static SgHopital getInstance(){
		return h;
	}
	public String getNomSec(){
		return nomSec;
	}
	public void setNomSec(String nomSec){
		this.nomSec=nomSec;
	}
	public void addPatient(Patient p){
		file.add(p);
	}
	public Patient getNextPatient(){
		return file.pollFirst();
	}
	public void setFile(LinkedList<Patient> file){
		this.file=file;
	}
	public LinkedList<Patient> getFile(){
		return file;
	}
}
