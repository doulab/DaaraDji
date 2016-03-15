package gesdaara

class JournalEtudiant {

    String numeroJournal
    String Semaine
    Date dateDuJour
    String debutLecon
    String finLecon
    String volumeLecon
    String observationLecon

    String debutRevision
    String finRevision
    int nombreHijibRevise
    String observationrevision

    static hasMany = [matieres: Matiere]
    static belongsTo = [owner: Etudiant]


    static constraints = {


    }
}
