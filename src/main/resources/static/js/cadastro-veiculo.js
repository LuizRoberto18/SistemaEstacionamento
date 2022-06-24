function validarVeiculo() {
    var validar = 0;

    var modelo = document.getElementById("modelo");
    var spanModelo = document.querySelector(".msg_modelo");
    var spanModeloInvalido = document.querySelector(".msg_modelo_invalido");


    if (modelo.value == "") {
        spanModelo.style.display = "inline-block";
        spanModeloInvalido.style.display = "none";
    } else {
        spanModelo.style.display = "none";
        validar++;
        if (modelo.value.length < 4) {
            spanModeloInvalido.style.display = "inline-block";
        } else {
            validar++;
            spanModeloInvalido.style.display = "none";
        }
    }
    var placa = document.getElementById("placa");
    var spanPlaca = document.querySelector(".msg_placa");
    var spanPlacaInvalido = document.querySelector(".msg_placa_invalido");


    if (placa.value == "") {
        spanPlaca.style.display = "inline-block";
        spanPlacaInvalido.style.display = "none";
    } else {
        spanPlaca.style.display = "none";
        validar++;
        if (placa.value.length < 4) {
            spanPlacaInvalido.style.display = "inline-block";
        } else {
            validar++;
            spanPlacaInvalido.style.display = "none";
        }
    }

    if (valided == 2) {
        alert("Cadastro concluido!");
    }

}