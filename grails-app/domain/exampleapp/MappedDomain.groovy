package exampleapp

import static grails.gorm.hibernate.mapping.MappingBuilder.*

class MappedDomain {

    Long id
    String name

    static constraints = {
    }

    static mapping = orm ({
        table('mapped')
    })
}
