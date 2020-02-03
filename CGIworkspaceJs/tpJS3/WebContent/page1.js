/**
 * 
 */

function getInputValue() {
	var x = document.getElementById("number").value;
	var y = Math.floor(Math.random() * 10) + 1;

	var count = 0;
	count++;
	if (x == y) {
		status = "Perfect you find the random number";
		document.getElementById("demo").innerHTML = "Hello, " + status + " in"
				+ count + " time"
	} else if (x > y) {
//		count++;
		status = "No, try a smaller number";
		document.getElementById("demo").innerHTML = "Hello, " + status

	}

	else {
//		count++;
		status = "No, try a greater number";
		document.getElementById("demo").innerHTML = "Hello, " + status
	}
}
