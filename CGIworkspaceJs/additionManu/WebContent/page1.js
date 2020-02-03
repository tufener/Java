function m(){
	var x = Number(document.getElementById("nb1").value);
	var y = Number(document.getElementById("nb2").value);
	document.getElementById("reponse").innerHTML =add(x,y);
}

function add(x,y){
	return x+y;
}