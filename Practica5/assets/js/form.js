/**
 * Capturar etiquetas para manipularlas
 */

const errores = document.getElementsByClassName("err")
const email = document.getElementById("email")
const password = document.getElementById("password")
const btn = document.getElementById("entrar")

/**
 * Ocultar los mensajes de alerta
 */
for (let i = 0; i < errores.length; i++) {
    errores[i].style.display = "none"
}

email.addEventListener("click", (e) => {
    e.preventDefault()
    errores[0].style.display = "none"
})

password.addEventListener("click", (e) => {
    e.preventDefault()
    errores[1].style.display = "none"
})

btn.addEventListener("click", (e) => {
    e.preventDefault()
    validar()
    if (validarEmail(email.value) && validarPassword(password.value)) {
        alert("validado el formulario")
    }
})

const validar = () => {
    let valEmail = validarEmail(email.value) ? "none" : "block"
    let valPassword = validarPassword(password) ? "none" : "block"
    errores[0].style.display = valEmail
    errores[1].style.display = valPassword
}

const validarEmail = (email) => {
    /**
     * valida email
     */
    var regex = /^([a-z_0-9\.\-])+\@(([a-z0-9\-])+\.)+([a-z0-9]{2,4})+$/;
    return regex.test(email) ? true : false;
}

const validarPassword = (password) => {
    /**
     * valida El Password Mínimo ocho caracteres, al menos una letra mayúscula,
     una letra minúscula, un número y un carácter especial:
     */

    var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/
    return regex.test(password) ? true : false;
}
