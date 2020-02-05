var commandes, gender, clientInfo, cLen, check;
commandes = [];
cLen = commandes.length;

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
	if (document.getElementById('gender1').checked)
		gender = document.getElementById("gender1").value;
	else
		gender = document.getElementById("gender2").value;
	clientInfo = document.getElementById("clientInfo").value;
	document.getElementById("ClientInfo").innerHTML = gender + " " + clientInfo;
	
	if (document.getElementById("Detail").checked)
		detail();
	else
		document.getElementById("resultDetail").innerHTML = "";
	
	if (document.getElementById("prixtot").checked)
		prixtotal();
	else
		document.getElementById("resultPrixTotal").innerHTML = "";

}

function detail() {
	var text1 = "<table><thead><tr><th>Quantite</th><th>Article</th><th>Prix Unitaire</th><th>Prix Total</th></tr></thead><tbody>";
	for ( var x in commandes) {
		text1 += "<tr>";
		text1 += "<td>" + commandes[x].quantity + "</td>";
		text1 += "<td>" + commandes[x].article + "</td>";
		text1 += "<td>" + commandes[x].prixArticle + "</td>";
		text1 += "<td>" + commandes[x].prixTotal + "</td>";
		text1 += "</tr>";

	}
	text1 += "</tbody></table>";
	document.getElementById("resultDetail").innerHTML = text1;

}

function prixtotal() {
	var somme = 0;
	for ( var x in commandes) {
		somme += commandes[x].prixTotal ;
	}
	var text2 = "<p> Le total est de: " + somme + "</p>";
	document.getElementById("resultPrixTotal").innerHTML = text2;

}


