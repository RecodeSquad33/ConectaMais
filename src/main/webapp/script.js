function mensagem() {

	nome = document.getElementById("formGroupExampleInput").value

	document.getElementById("nomecontato").value = ""
	document.getElementById("emailcontato").value = ""
	document.getElementById("mensagemcontato").value = ""
	
	alert(`${nomecontato}, sua mensagem foi enviada!`)
}

function criarEvento() {


	if (confirm(`Confirma o evento?`)) {
		alert("Evento criado!")
	} else {

		document.getElementById("nomeEvento").value = ""
		document.getElementById("local").value = ""
		document.getElementById("ie").value = ""
		document.getElementById("vol").value = ""
		document.getElementById("dataH").value = ""
		document.getElementById("sobre").value = ""

		alert("Evento cancelado!")


	}
}

function cancelarEvento() {
	
	alert("Evento cancelado!")
	
	document.getElementById("nomeEvento").value = ""
	document.getElementById("local").value = ""
	document.getElementById("ie").value = ""
	document.getElementById("vol").value = ""
	document.getElementById("dataH").value = ""
	document.getElementById("sobre").value = ""

	


}