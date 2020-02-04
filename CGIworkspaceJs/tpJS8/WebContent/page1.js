var Personnes = [];

function person(name, first, age) {
	this.name = name;
	this.firstname = first;
	this.age = age;
}

function setAge() {
	if (this.age < 18)
		status = "Mineur";
	else
		status = "Majeur";
}

function ajouter(nom, prenom, age) {
	var nom = document.getElementById("nom").value;
	var prenom = document.getElementById("prenom").value;
	var age = document.getElementById("age").value;
	if (nom && prenom && age) {
		Ajout = new Person(nom, prenom, age);
		Personnes.push(Ajout);
	}

}

function print() {
	var text;

	text = "<table><thead><tr><th>Nom</th><th>Prenom</th><th>Age</th><th>Status</th></tr></thead>";
	for (var i = 0 ; i<Personnes.length ; i++) {
		text += "<tbody>" + "<tr>" + "<td>" + nom + "</td>" + "<td>"
				+ prenom + "</td>" + "<td>" + age + "</td>"
				+ "<td>" + "x.status" + "</td>" + "</tr>" + "</tbody>";
	}
	text += "</table>";

	document.getElementById("resultat").innerHTML = text;

}
