/**
 * 
 */
var tab = [];

function add() {
	tab.push(document.getElementById("txt").value);
	document.getElementById("addp").innerHTML = tab;
}

function sort() {
	tab.sort();
	document.getElementById("sortp").innerHTML = tab;

}

function print() {
	var tab, text, fLen, i;
	var fLen = tab.length;

	text = "<table><thead><tr><th>Position</th><th>Ajout</th></tr></thead>";
	for (i = 0; i < fLen; i++) {
		text += "<tbody>" + "<tr>" + "<td>" + (i + 1) + "</td>" + "<td>"
				+ tab[i] + "</td>" + "</tr>" + "</tbody>";
	}
	text += "</table>";

	document.getElementById("printp").innerHTML = text;

}
