const formVol = window.document.getElementById("form_vol")
const formInst = window.document.getElementById("form_inst")
const ladoEsq = window.document.querySelector(".lado-esquerdo")
const ladoDir = window.document.querySelector(".lado-direito")

function forminst() {
    ladoDir.classList.remove("off")
    ladoEsq.classList.add("on")
    formVol.classList.add("off")
    formInst.classList.remove("off")
}

function formvol() {
    ladoDir.classList.remove("off")
    ladoEsq.classList.add("on")
    formVol.classList.remove("off")
    formInst.classList.add("off")
}