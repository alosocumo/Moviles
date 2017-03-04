import grails.converters.JSON
import mx.edu.ulsaoaxaca.Alimento
import mx.edu.ulsaoaxaca.Categoria
import org.codehaus.groovy.grails.web.json.JSONObject

class BootStrap {

    def init = { servletContext ->

        JSON.registerObjectMarshaller(Alimento) {
            JSONObject json = new JSONObject()
            json.put("id",it.id)
            json.put("nombre", it.nombre)
            json.put("que", it.que)
            json.put("donde",it.donde)
            json.put("url", it.url)
            return json
        }

        JSON.registerObjectMarshaller(Categoria) {
            JSONObject json = new JSONObject()
            json.put("id", it.id)
            json.put("nombre", it.nombre)
            json.put("alimentos", it.alimentos)
            return json
        }
        Categoria categoria = new Categoria(nombre: "comida", url: "dbnxzm").save()

    }
    def destroy = {
    }
}
