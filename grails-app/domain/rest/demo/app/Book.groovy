package rest.demo.app
import grails.rest.*

@Resource()
class Book {

    String title

    static constraints = {
        title blank:false
    }
}