package rest.demo.app

class ApplicationFilterFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                log.info "Method : " + request.getMethod()
                log.info "Accept Headers : " + request.getHeader('Accept')
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
