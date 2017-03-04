package mx.edu.ulsaoaxaca

class Alimento {

    String nombre
    String que
    String donde
    String url

    static belongsTo = [categoria : Categoria]

    static constraints = {
        url maxSize: 1000

    }
    static mapping = {
        version false
    }
}
