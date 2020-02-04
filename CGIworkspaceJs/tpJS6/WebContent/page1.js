/**
 * 
 */

function testCalcul(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	document.getElementById("test").innerHTML = calculatrice(x,y);
}

function Calcul(x,y){
	
}

function addi(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	var oper = document.getElementById("+").value;
	document.getElementById("test").innerHTML = calculatrice(x,y, oper);
}

function sous(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	document.getElementById("test").innerHTML = calculatrice(x,y);
}

function div(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	document.getElementById("test").innerHTML = calculatrice(x,y);
}

function mult(){
	var x = parseInt(document.getElementById("num1").value);
	var y = parseInt(document.getElementById("num2").value);
	document.getElementById("test").innerHTML = calculatrice(x,y);
}


function calculatrice(x, y, oper) {
	
	var oper;

	switch (oper) {
	  case '+':
	    return "Le resultat de l'addition est: " + (x+y);
	    break;
	  case '-':
		  return "Le resultat de la soustraction est: " + (x-y);
	    break;
	  case '/':
		  return "Le resultat de la division est: " + (x/y);
	    break;
	  case '*':
		  return "Le resultat de la multplication est: " + (x*y);
	    break;
	  default:
	    return "Erreur de saisie";
}
}



