package mx.edu.ulsaoaxaca
import grails.converters.JSON
import org.codehaus.groovy.grails.web.json.JSONArray
import org.codehaus.groovy.grails.web.json.JSONObject

class AlimentoController {

    static scaffold =  true


/*
    def list() {
        def a = Alimento.findAll()
        [alimentos: a]
    }
*/
    def imagen(String id){
        File imagen = new File("C:\\Users\\Alondra\\Documents\\imagenes\\" + id + ".jpg")
        if (imagen.exists())
            response.outputStream.write(imagen.bytes)
        else
            render status: 404
    }



    def obtenerAlimentos(){
        def alimentos = Alimento.findAll()
        println alimentos
        render alimentos as JSON
    }
}
