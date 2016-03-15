package gesdaara

class Classe {

    String code
    String libelle

    static constraints = {
        code(blank: false,unique: false)
        libelle(blank: false)
    }
}
