const frutas = ["Pera", "Manzana", "Uva", "Patilla", "Fresa"]
const decimales = [12.4, 33.55, 44.5, 22.4, 1.4, 33.4]
const datos = ["Frutas", 1, 4, 5, true, false, 'c']

// Agrega elementos al array
frutas.push("Kiwi", "Cereza")
// Elimina elementos al final del array
frutas.pop()

console.log(frutas[0])
console.log(frutas)


console.log("Recorrido con for")
for (let i = 0; i < frutas.length; i++) {
    console.log(frutas[i])
}


console.log("Recorrido con for each")
frutas.forEach(fruta => {
    console.log(`${fruta} Longitud:${fruta.length}`)
})