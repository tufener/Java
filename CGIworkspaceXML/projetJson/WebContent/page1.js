var obj = JSON.parse({
	  "societe" :[
		  {
		      "employee": { 
		      "nom": "John", 
		      "prenom": "Dwayne" ,
		      "age": "45", 
		      "majeur": true
		      ,
		      "adresse" : {
		        "numéro" : "83",
		        "rue" : "Maurice Gunsbourg", 
		        "Code postal" : "94220"
		      }
		      ,
		      "compte" : {
		        "banque" : "Crédit mutuel", 
		        "rib" : "azezdf56545"
		      }
		      ,
		      "affectation" : {
		        "affecprojet" : "projet", 
		        "affectnull" : null
		      }
		    
		    }
		  }
		    ]
		  });



document.getElementById("demo").innerHTML = obj.nom + ", " + obj.age;
