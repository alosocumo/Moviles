package mx.edu.ulsaoaxaca

class Categoria {

    String nombre
    String url

    static hasMany = [alimentos : Alimento]

    static constraints = {
    }
    static mapping = {
        version false
    }
}
