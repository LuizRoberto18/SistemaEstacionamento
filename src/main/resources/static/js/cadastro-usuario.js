function validarUsuario() {
    var validar = 0;

    var nome = document.getElementById("nome");
    var spanNome = document.querySelector(".msg_nome");
    var spanNomeInvalido = document.querySelector(".msg_nome_invalido");


    if (nome.value == "") {
        spanNome.style.display = "inline-block";
        spanNomeInvalido.style.display = "none";
    } else {
        spanNome.style.display = "none";
        validar++;
        if (nome.value.length < 4) {
            spanNomeInvalido.style.display = "inline-block";
        } else {
            validar++;
            spanNomeInvalido.style.display = "none";
        }
    }

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
    var confSenha = document.getElementById("confirmacao");
    var spanConfSenha = document.querySelector(".msg_confSenha");
    var spanSenhaInvalida = document.querySelector(".msg_senhaInvalida");

    if (senha.value == "") {
        spanSenha.style.display = "inline-block";
    } else {
        spanSenha.style.display = "none";
        validar++;
        if (confSenha.value == "") {
            spanConfSenha.style.display = "inline-block";
        } else {
            spanConfSenha.style.display = "none";
            validar++;
            if (senha.value != confSenha.value) {
                console.log(senha.value);
                console.log(confSenha.value);
                spanSenhaInvalida.style.display = "inline-block";
            } else {
                spanSenhaInvalida.style.display = "none";
                validar++;
            }
        }
    }

    if (valided == 3) {
        alert("Cadastro concluido!");
    }

}