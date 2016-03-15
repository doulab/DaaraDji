package gesdaara

class Niveau {

    String code
    String libelle

    static constraints = {
        code(blank: false,unique: true)
        libelle(blank: false)
    }
}
