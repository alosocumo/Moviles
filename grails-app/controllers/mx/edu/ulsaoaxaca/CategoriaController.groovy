package mx.edu.ulsaoaxaca

import grails.converters.JSON

class CategoriaController {

    static scaffold = true

/*
    def list() {
        def c = categoria.findAll()
        [categorias: c]
    }
*/
    def imagen(String id){
       // File imagen = new File("C:\\categorias\\" + id + ".jpg")
        File imagen = new File("C:\\Users\\Alondra\\Documents\\imagenes" + id + ".jpg")

        if (imagen.exists())
            response.outputStream.write(imagen.bytes)
        else
            render status: 404
    }

    def obtenerAlimentos(Long id){
        def categorias = Categoria.get(id)
        render categorias.alimentos as JSON

    }


}
