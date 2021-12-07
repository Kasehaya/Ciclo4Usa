var nombre = "Carlos"
const PI_CIRCULO = 3.1416
console.log(nombre)
console.log(PI_CIRCULO)


/**
 * JS Moderno
 */
const saludo1 = () => {
    let edad = 42
    console.log("Hola a todos " + nombre + " mi edad es " + edad)
    saludo2(edad)
}

/**
 * JS Antiguo
 */

function saludo2(edad) {
    console.log("Hola a todos " + nombre + " mi edad es " + edad)
}

saludo1()