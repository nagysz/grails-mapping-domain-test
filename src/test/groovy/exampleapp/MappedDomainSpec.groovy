package exampleapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class MappedDomainSpec extends Specification implements DomainUnitTest<MappedDomain> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == true
    }
}
