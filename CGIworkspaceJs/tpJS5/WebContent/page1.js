/**
 * 
 */
function m(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	document.getElementById("test").innerHTML = add(x,y);
}

function add(x, y) {
	return "Le resultat est: " + (x + y); 
}



