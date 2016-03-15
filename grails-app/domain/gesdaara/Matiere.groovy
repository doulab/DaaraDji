package gesdaara

class Matiere {

    String code
    String libelle

    static constraints = {
        code(blank: false,unique: true)
        libelle(blank: false)
    }
}
