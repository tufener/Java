var commandes = [];

function commande(quantity, article, prixArticle, prixTotal) {
	this.quantity = quantity;
	this.article = article;
	this.prixArticle = prixArticle;
	this.prixTotal = prixTotal;

}

function add() {
	var quantity = document.getElementById("quantity").value;
	var e = document.getElementById("ArticleChoice");
	var prixArticle = e.options[e.selectedIndex].value;
	var article = e.options[e.selectedIndex].text;
	if (quantity) {
		newCommande = new commande(Number(quantity), article,
				Number(prixArticle), Number(prixArticle * quantity));
		commandes.push(newCommande);
	}

}

function print() {
	var text, cLen, i;
	var cLen = commandes.length;
	text = "<table><thead><tr><th>Quantite</th><th>Article</th><th>Prix Unitaire</th><th>Prix Total</th></tr></thead>";
	for (var i = 0; i < cLen; i++) {
		text += "<tbody>" + "<tr>" + "<td>" + commandes[i].quantity + "</td>"
				"<td>" + commandes[i].article + "</td>" + "<td>"
				+ commandes[i].prixArticle + "</td>"  + "<td>"
				+ commandes[i].prixTotal + "</td>" + "</tr>" + "</tbody>";
	}
	text += "</table>";

	document.getElementById("resultDetail").innerHTML = text;
}

function Detail() {
	var text, cLen, i;
	var cLen = commandes.length;
	text = "<table><thead><tr><th>Quantite</th><th>Article</th><th>Prix Unitaire</th><th>Prix Total</th></tr></thead>";
	for (var i = 0; i < cLen; i++) {
		text += "<tbody>" + "<tr>" + "<td>" + commandes[i].quantity + "</td>"
				+ "<td>" + commandes[i].article + "</td>" + "<td>"
				+ commandes[i].prixArticle + "</td>" + "<td>"
				+ commandes[i].prixTotal + "</td>" + "</tr>" + "</tbody>";
	}
	text += "</table>";

	document.getElementById("resultDetail").innerHTML = text;
}

function Detail() {
	var text, cLen, i;
	cLen = commandes.length;
	var check = document.getElementById("Detail").checked
	if (check) {
		text = "<table><thead><tr><th>Quantite</th><th>Article</th><th>Prix Unitaire</th><th>Prix Total</th></tr></thead>";
		for (var i = 0; i < cLen; i++) {
			text += "<tbody>" + "<tr>" + "<td>" + commandes[i].quantity
					+ "</td>" + "<td>" + commandes[i].article + "</td>"
					+ "<td>" + commandes[i].prixArticle + "</td>" + "<td>"
					+ commandes[i].prixTotal + "</td>" + "</tr>" + "</tbody>";
		}
		text += "</table>";

		document.getElementById("resultDetail").innerHTML = text;
	} else
		alert("Erreur dans les champs de saisie");
}

function prix() {
	document.getElementById('"prixtot"').onclick = function() {
		document.getElementById("resultDetail").innerHTML = text;
		if (this.checked) {
			var sum = 0;
			for (var i = 0; i < commandes.length; i++) {
				sum += commandes[i].prixTotal;
			}
			return sum;
			alert(this.value);
		}

		else {
			alert("it's not true")
		}

	}
}
