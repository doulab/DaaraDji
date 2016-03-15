package gesdaara

class Etablissement {

    String code
    String libelle
    String adresse
    String email
    int telephone
    String numeroRecepice
    String logo

    static hasMany = [classes:Classe]

    static constraints = {
    }
}
