/**
 * 
 */

function m(){
var fruits, text, fLen, i;
fruits = ["Banana", "Orange", "Apple", "Mango"];
fLen = fruits.length;

text = "<table><thead><tr><th>Position</th><th>Nom</th></tr></thead>";
for (i = 0 ; i < fLen ; i++) {
  text += "<tbody>"+ "<tr>" + "<td>" + i + "</td>" + "<td>" + fruits[i] + "</td>" + "</tr>" + "</tbody>";
}
text += "</table>";

document.getElementById("demo").innerHTML = text;

}

