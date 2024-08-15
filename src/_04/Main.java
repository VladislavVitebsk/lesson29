package _04;

import _04.model.Person;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Igor", LocalDate.of(2004, Month.AUGUST, 25));
        System.out.println(person1);
        System.out.println(person1.fullYar());

    }
}
