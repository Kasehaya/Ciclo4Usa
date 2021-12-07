const edadinput = document.getElementById("edad")
const btncalc = document.getElementById("calcular")
const salida = document.getElementById("salida")

const validarEdad = () => {
    let edad = edadinput.value
    let mensaje = ""
    if (edad == "") {
        mensaje = "Campo vacio"
    } else {
        if (edad >= 18) {
            mensaje = "Mayor de edad"
        } else if (edad > 0 && edad < 18) {
            mensaje = "Menor de edad"
        } else {
            mensaje = "Edad invalida, digito negativo"
        }
    }
    salida.innerHTML = mensaje
}

btncalc.addEventListener("click", validarEdad)

/**
 === Compara contenido y tipo de dato
 == Compara contenido
 */
