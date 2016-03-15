package gesdaara

class Utilisateur {

    String matricule
    String prenom
    String nom
    String email
    int telephone
    String login
    String password
    static belongsTo = [typeUtilisateur:TypeUtilisateur]

    static constraints = {
        matricule(blank: false,unique: true)
        prenom(blank: false)
        nom(blank: false)

    }
}
