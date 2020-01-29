package projetPersonnev1;

public class Personne3 {

	// attribut (synonyme : data number / variable globale / varaible de class
	// ou d'instance)

	// initialiser = phase d'affectation

	// section attribut
	public String nom;
	private String prenom; // public ou sans rien sont à peu près équivalent ==>
							// sans rien c'est un package public
	private int age;

	// section variable globale

	private final int ageMin = 0;
	private final int ageMax = 120;
	// private String statut;
	// private int ageMineur = 18;
	
	
	public void setNom(String nom) { // setteur du nom
		
		if(!nom.isEmpty())
			this.nom = nom;

	}

	public String getNom() { // getteur de l'age
		return nom.toUpperCase();

	}
	
	public String getPrenom() { // getteur de l'age
		return nom.toLowerCase();

	}

	public void setAge(int age) { // setteur de l'age

		if ((age > ageMin) && (age < ageMax) && age > this.age) // Exercice : age compris entre 0 et 120 et l'age ne peut pas diminuer
			this.age = age;

	}

	public int getAge() { // getteur de l'age
		return age;

	}

	public Personne3() // c'est aussi un constrcuteur mais pas une méthode car
						// il n'y a
	// pas de void. ceci est un COnstructeur par défaut !!
	{
		
	}

	public Personne3(String nom, String prenom) // ceci est un Constructeur .
												// cet exemple est la même que
												// celle du dessous mais sans
												// l'age.
	// d'initialisation !! car il a un
	// paramètre (ce qu'il y a entre
	// parathèse).
	{
		this.nom = nom;
		this.prenom = prenom;

	}

	public Personne3(String nom, String prenom, int age){ // ceci est un Constructeur d'initialisation !! car il a un paramètre (ce
															// qu'il y a entre
															// parathèse).
	
		setNom(nom);
		this.nom = nom; // on, met this. car nous les avons défini sur les paramètres.
		this.prenom = prenom;
		setAge(age);
		// this.age = age;

	}

	public String toString() { // c'est cette méthode qui retourne la
								// conquaténation A NE PAS OUBLIER !!

		String reponse = "NOM: " + this.getNom(); // on peut mettre ici nom mais pas obligé sauf dans le cas ci-dessus.
		reponse += " PRENOM: " + prenom;
		reponse += " AGE: " + age;
		// reponse += " \nSTATUT: ";
		// reponse += (age < ageMineur) ? " Mineur" : " Majeur"; // condition
		// Ternaire
		return reponse;
	}

}
