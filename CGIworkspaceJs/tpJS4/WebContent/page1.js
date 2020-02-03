/**
 * 
 */
var tab = [];

function add() {
	tab.push(document.getElementById("add").value);
}

function sort() {
	tab.sort();

}

function print() {
	var tab, text, fLen, i;
	fLen = tab.length;

	text = "<table><thead><tr><th>Position</th><th>Nom</th></tr></thead>";
	for (i = 0; i < fLen; i++) {
		text += "<tbody>" + "<tr>" + "<td>" + (i+1) + "</td>" + "<td>" + tab[i]
				+ "</td>" + "</tr>" + "</tbody>";
	}
	text += "</table>";

	document.getElementById("print").innerHTML = text;

}