package gesdaara



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ClasseController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Classe.list(params), model:[classeInstanceCount: Classe.count()]
    }

    def show(Classe classeInstance) {
        respond classeInstance
    }

    def create() {
        respond new Classe(params)
    }

    @Transactional
    def save(Classe classeInstance) {
        if (classeInstance == null) {
            notFound()
            return
        }

        if (classeInstance.hasErrors()) {
            respond classeInstance.errors, view:'create'
            return
        }

        classeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'classe.label', default: 'Classe'), classeInstance.id])
                redirect classeInstance
            }
            '*' { respond classeInstance, [status: CREATED] }
        }
    }

    def edit(Classe classeInstance) {
        respond classeInstance
    }

    @Transactional
    def update(Classe classeInstance) {
        if (classeInstance == null) {
            notFound()
            return
        }

        if (classeInstance.hasErrors()) {
            respond classeInstance.errors, view:'edit'
            return
        }

        classeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Classe.label', default: 'Classe'), classeInstance.id])
                redirect classeInstance
            }
            '*'{ respond classeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Classe classeInstance) {

        if (classeInstance == null) {
            notFound()
            return
        }

        classeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Classe.label', default: 'Classe'), classeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'classe.label', default: 'Classe'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
