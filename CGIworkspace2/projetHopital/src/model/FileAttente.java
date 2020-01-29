package model;

import java.util.LinkedList;

public class FileAttente {
	public LinkedList<Patient> getFile() {
		return file;
	}

	private LinkedList<Patient> file;

	public FileAttente() {
	}

	public FileAttente(LinkedList<Patient> file) {
		this.file = file;
	}

	public void add(Patient p) {
		if (!this.file.contains(p))
			this.file.add(p);
		else
			System.out.println("Le patient est déjà dans la file d'attente.");
	}

	public void clear() {
		this.file.clear();
	}

	public void print() {
		this.file.forEach((n) -> System.out.println(n));
	}

	public boolean isEmpty() {
		return this.file.isEmpty();
	}

	public Patient poll() {
		return this.file.poll();
	}
	
	public Patient peek() {
		return this.file.peek();
	}

}
