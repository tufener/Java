var text, newPers, Personnes;
Personnes = [];

function Person(first, last, age, status) {
	this.firstName = first;
	this.lastName = last;
	this.age = age;
	this.status = status;
}

function add() {
	var name = document.getElementById("inputName").value;
	var surname = document.getElementById("inputSurname").value;
	var age = document.getElementById("inputAge").value;
	var status = getStatus(age);
	if (name && surname && age) {
		newPers = new Person(name, surname, age, status);
		Personnes.push(newPers);
		document.getElementById("inputName").value = "";
		document.getElementById("inputSurname").value = "";
		document.getElementById("inputAge").value = "";
	} else {
		alert("Erreur dans les champs de saisie");
	}
}

function getStatus(age) {
	if (age < 18)
		return "Mineur";
	else
		return "Majeur";
}

function printTab() {
	if (Personnes.length > 0) {
		text = "<table class=\"table\"><thead><tr><th scope=\"col\">Nom</th><th scope=\"col\">Prenom</th><th scope=\"col\">age</th><th scope=\"col\">Status</th></tr></thead><tbody>"
		for ( var x in Personnes) {
			text += "<tr>";
			text += "<td>" + Personnes[x].firstName + "</td>";
			text += "<td>" + Personnes[x].lastName + "</td>";
			text += "<td>" + Personnes[x].age + "</td>";
			text += "<td>" + Personnes[x].status + "</td>";
			text += "</tr>";
		}
		text += "</tbody></table>";
		document.getElementById("demo").innerHTML = text;
	} else {
		document.getElementById("demo").innerHTML = "";
	}
}

function removeLastPerson() {
	Personnes.pop();
}