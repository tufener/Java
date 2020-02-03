function m(){
	var n=document.getElementById("nom").value;
	var p=document.getElementById("prenom").value;
	var a=document.getElementById("age").value;
	var rep ;
	rep = "NOM : " + n.toUpperCase() + "<br> PRENOM :  " + p.toLowerCase() + "<br> AGE : " + a + "<br> Statuts : ";
	if(a<0){
		alert("erreur");
	}
	else if (a<18){
		document.getElementById("reponse").innerHTML = rep + "mineur";
	}
	else if (a<50 && a>=18){
		document.getElementById("reponse").innerHTML = rep + "majeur";
	}
	else if(a>=50 && a<=120){
		document.getElementById("reponse").innerHTML = rep + "senior";
	}
	else {
		alert("erreur");
	}
}