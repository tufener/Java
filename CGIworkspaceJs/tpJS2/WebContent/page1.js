function getInputValue() {
	var x = document.getElementById("nom").value;
	var y = document.getElementById("prenom").value;
	var z = document.getElementById("age").value;

	if (z >= 0 && z <= 18)
		status = "mineur";
	else if (z > 18 && z <= 50)
		status = "majeur";
	else if (z > 50 && z <= 120)
		status = "senior";
	else
		status = "erreur de saisie";

	document.getElementById("demo").innerHTML = "Bonjour " + "Nom: " + x
			+ "\n " + "Prenom: " + y + "\n" + "Age: " + z + "Status : "
			+ status;
}