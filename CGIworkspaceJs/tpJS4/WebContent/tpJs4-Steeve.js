var tab = [];

function alimente() {
	tab.push(document.getElementById("saisie").value);
	document.getElementById("test").innerHTML=tab;
}

function sort(){
	tab.sort();
	document.getElementById("test").innerHTML=tab;
}

function print(){
	var text='<table id="table" class="table table-striped"> <thead><tr><th>n&ordm;</th><th>article</th></tr></thead><tbody>';
	for (i=0;i<tab.length;i++)
		text+="<tr><td>"+(i+1)+"</th><th>"+tab[i]+"</th></tr>"
	text +="</tbody></table>";
	document.getElementById("table").innerHTML=text;
	document.getElementById("test").innerHTML="";
}