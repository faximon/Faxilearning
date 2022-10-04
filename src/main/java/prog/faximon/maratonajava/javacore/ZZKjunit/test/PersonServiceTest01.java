package prog.faximon.maratonajava.javacore.ZZKjunit.test;

import prog.faximon.maratonajava.javacore.ZZKjunit.dominio.Person;
import prog.faximon.maratonajava.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTest01 {
    public static void main(String[] args) {
        Person person = new Person(15);
        PersonService personService = new PersonService();
        log.info("Is Adult? '{}'", personService.isAdult(person));

    }
}