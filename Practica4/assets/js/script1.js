const mostrarobjeto = () => {
    const libro = {
        nombre: "Fundamentos de Javascript",
        paginas: 250,
        autor: "Juan Perez, Manuel Beltran",
        precio: 35000,
        mostrar: function () {
            console.log(`Libro ${this.nombre}`)
            console.log(`Paginas ${this.paginas}`)
            console.log(`Autor ${this.autor}`)
            console.log(`Precio ${this.precio}`)
        }
    }
    libro.paginas = 400
    libro.mostrar()
}

const mostrarRectangulo = () => {
    const rectangulo = {
        base: 3000,
        altura: 4000,
        area: function () {
            return this.base * this.altura
        },
        mostrarRectangulo: function () {
            console.log(`Base ${this.base}`)
            console.log(`Altura ${this.altura}`)
            console.log(`Area ${this.area()}`)
        }
    }
    rectangulo.mostrarRectangulo()
}

const mostrarFechaHora = () => {
    const date = new Date()
    const fecha = date.toString()
    const year = date.getFullYear()
    const mes = date.getMonth() + 1
    const dia = date.getDate()
    const hora = (date.getHours() < 10) ? `0${date.getHours()}` : date.getHours()
    const min = (date.getMinutes() < 10) ? `0${date.getMinutes()}` : date.getMinutes()
    const seg = (date.getSeconds() < 10) ? `0${date.getSeconds()}` : date.getSeconds()
    const fechaHoy = `${year} - ${mes} - ${dia}`
    const horaHoy = `${hora}:${min}:${seg}`
    console.log(date)
    console.log(fecha)
    console.log(year)
    console.log(mes)
    console.log(dia)
    console.log(fechaHoy)
    console.log(hora)
    console.log(min)
    console.log(seg)
    console.log(horaHoy)
}

// mostrarobjeto()
// mostrarFechaHora()
mostrarRectangulo()