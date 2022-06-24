function validarLogin() {
    var validar = 0;

    var usuario = document.getElementById("usuario");
    var spanUsuario = document.querySelector(".msg_usuario");
    var spanUsuarioInvalido = document.querySelector(".msg_usuario_invalido");

    if (usuario.value == "") {
        spanUsuario.style.display = "inline-block";
        spanUsuarioInvalido.style.display = "none";
    } else {
        spanUsuario.style.display = "none";
        validar++;
        if (usuario.value.length < 4) {
            spanUsuarioInvalido.style.display = "inline-block";
        } else {
            validar++;
            spanUsuarioInvalido.style.display = "none";
        }
    }

    var senha = document.getElementById("senha");
    var spanSenha = document.querySelector(".msg_senha");


    if (senha.value == "") {
        spanSenha.style.display = "inline-block";
    } else {
        spanSenha.style.display = "none";
        validar++;
        if (senha.value.length < 4) {
            spanSenha.style.display = "inline-block";
        } else {
            validar++;
            spanSenha.style.display = "none";
        }
    }

    if (valided == 2) {
        alert("Logado com sucesso!");
    }

}