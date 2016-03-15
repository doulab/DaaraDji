package gesdaara

class TypeUtilisateur {

    String code
    String libelle
    static constraints = {
        code(blank: false,unique: true)
        libelle(blank: false)
    }
}
