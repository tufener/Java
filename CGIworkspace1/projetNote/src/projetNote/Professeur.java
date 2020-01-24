package projetNote;

public class Professeur {
	private String nom;
	private int note;
	Eleves[] tab = new Eleves[10];

	public Professeur(String nom) {
		this.nom = nom;
	}

	public void attach(Eleves x) {
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == null) {
				tab[i] = x;
				break;

			}
		}
	}

	public void setNote(int notedonne) {
		this.note = notedonne;
		notifAll();

	}

	private void notifAll() {
		for (Eleves z : tab) {
			if (z != null)
				z.notif();

		}

	}

	public int getNote() {
		return note;
	}

}
