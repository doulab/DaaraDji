package gesdaara

class Etudiant {

    String prenom
    String nom
    String matricule
    Date dateNaissance
    String lieuNaissance
    String nationalite
    String sexe
    Date dateInscription
    String regime
    String photo

    static belongsTo = [classe: Classe]

    static constraints = {
        prenom(blank: false)
        nom(blank: false)
        matricule(blank: false,unique: true)
        dateNaissance(blank: false)
        lieuNaissance(blank: false)
        nationalite(blank: false)
        sexe(blank: false)

    }
}
