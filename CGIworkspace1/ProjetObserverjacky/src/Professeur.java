
public class Professeur {
	private String nom;
	private int note;
	Eleve[] tab = new Eleve[10];

	public Professeur(String nom) {
		this.nom = nom;
	}

	public void attach(Eleve e1) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = e1;
				break;
			}
		}
	}

	public void setNote(int note) {
		this.note = note;
		notifall();
	}

	private void notifall() {
		for (Eleve s : tab) {
			if (s != null)
				s.notif();
		}
	}

	public int getNote() {
		return note;
	}
}
