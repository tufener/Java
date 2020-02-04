/**
 * 
 */


function person(nom, prenom, age) {
	this.nom = nom.document.getElementById("nom").value;
	this.prenom = prenom.document.getElementById("prenom").value;
	this.age = age.document.getElementById("age").value, function() {
		if (age < 18)
			status = "Mineur";
		else
			status = "Majeur";
		create();

	}

}

function create() {
	var p = new Person(document.getElementById("nom").value, document
			.getElementById("prenom").value,
			age.document.getElementById("age").value);
	document.getElementById("resultat").innerHTML = person(p) 
}
