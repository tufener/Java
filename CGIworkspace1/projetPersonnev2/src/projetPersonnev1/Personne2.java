package projetPersonnev1;

public class Personne2 {

	// attribut (synonyme : data number / variable globale / varaible de class
	// ou d'instance)

	// initialiser = phase d'affectation
	String nom; // = "NA";
	String prenom; // = "NC";
	int age;
	String statut;
	int ageMineur; // = 18; // on le place ici car c'est une variable globale et
					// on
					// peut l'utiliser partout dans notre développement.

	Personne2() // c'est aussi un constrcuteur mais pas une méthode car il n'y a
				// pas de void. ceci est un COnstructeur par défaut !!
	{
		// compile();
		// nom = "XX"; //si il n'y a pas de prénom rentrer par le développeur sa
		// sera cette valeur qu'il va prendre dans le nom.
		// System.out.println("Hello");

	}

	Personne2(String nom, String prenom) // ceci est un Constructeur
											// d'initialisation !! car il a un
											// paramètre (ce qu'il y a entre
											// parathèse).
	{
		this.nom = nom; // on, met this. car nous les avons défini sur les
						// paramètres.
		this.prenom = prenom;

	}

	// void compile() //c'est aussi un constrcuteur mais pas une méthode car il
	// n'y a pas de void.
	// {
	// System.out.println("COucouc");
	// }

	Personne2(String nom, String prenom, int age) // ceci est un Constructeur
													// d'initialisation !! car
													// il a un paramètre (ce
													// qu'il y a entre
													// parathèse).
	{
		this.nom = nom; // on, met this. car nous les avons défini sur les
						// paramètres.
		this.prenom = prenom;
		this.age = age;

	}

	String getInfo() {

		String reponse = "NOM: " + nom; // on peut mettre ici this.nom mais pas
										// obligé sauf dans le cas ci-dessus.
		reponse += " PRENOM: " + prenom;
		reponse += " \nAGE: " + age;
		reponse += " STATUT: ";
		reponse += (age < ageMineur) ? " Mineur" : " Majeur"; // condition
																// Ternaire
		return reponse;
	}

}
