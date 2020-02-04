

function concat(){

var pers={
	nom:document.getElementById("nom").value,
	prenom:document.getElementById("prenom").value,
	age:document.getElementById("age").value,
	fullName:function(){
	 var reponse=this.nom.toUpperCase()+" <br> "+this.prenom.toLowerCase()+" <br> ";
	 reponse+=this.age+" <br> ";
	 reponse+=(this.age<18)?"mineur":"majeur";
	 return reponse;
	}
}
document.getElementById("demo").innerHTML ="Bienvenue <br>" +pers.fullName()  ;
} 