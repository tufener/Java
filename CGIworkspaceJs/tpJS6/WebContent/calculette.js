/*function testcalcul(nb1,nb2,op){
	var x =Number(nb1);
	var y =Number(nb2);
	var reponse =calcul(x,y,op);
	return reponse;
}*/
function calcul(x,y,op){
	var reponse;
	var nb1 =Number(x);
	var nb2 =Number(y);
	switch(op) {
    case "+":
        reponse= add(nb1,nb2);
        break;
    case "-":
        reponse=  sous(nb1,nb2);
        break;
	case "*":
        reponse=  multi(nb1,nb2);
        break;
	case "/":
        reponse=  divis(nb1,nb2);
        break;
	}
	return reponse;
}
function add(nb1,nb2){
	return nb1+nb2;
}
function sous(nb1,nb2){
	return nb1-nb2;
}
function multi(nb1,nb2){
	return nb1*nb2;
}
function divis(nb1,nb2){
	return nb1/nb2;
}
	