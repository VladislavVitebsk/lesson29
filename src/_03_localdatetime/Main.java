package _03_localdatetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class Main {
    public static void main(String[] args) {
        //LocalDate - класс для работы с датой
        //LocalTime - класс для работы со временем
        //LocalDateTime - класс для работы с датой и со временем
        //Period - класс определения разницы между двумя датами
        //Duration - класс определения разницы между двумя временами

        //статический метод now для получения текущей даты
        LocalDateTime date1 = LocalDateTime.now();
        //геттер на каждое поле (параметр класса)
        System.out.println(date1.getMonth()); //месяц перечислением
        System.out.println(date1.getMonthValue());
        System.out.println(date1.getDayOfWeek());//день недели перечислением
        System.out.println(date1.getDayOfMonth());

        //можно отправить один из элементов перечисления
        //ChronoField
        System.out.println(date1.get(ChronoField.YEAR));

        //объекты новых классов являются immutable
        //with по смыслу тоже самое что и set, но он не меняет значения поля,
        //а создает новый объект с другим значением поля (потому что immutable)
        LocalDateTime date2 = date1.withHour(20);//при изменении ловим новый объект
        LocalDateTime date3 = date1.with(ChronoField.HOUR_OF_DAY,23);
        System.out.println(date3);

        //методы увеличения и уменьшения даты на единицу времени
        //date1.plus(4);
        //date1.minus(4);

        //класс для создания шаблона представления в виде строки и преобразования строки в объект
        //DateTimeFormatter
        //статический метод для создания объекта шаблона даты и времени
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(formatter1.format(date1));

        System.out.println("*******");
        //из строки получить LocalDate
        String dataStr = "18.06.2024";
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //статический метод класса parse получит из строки по указанному формату нужный объект
        LocalDate ldate1 = LocalDate.parse(dataStr, formatter2);
        System.out.println(formatter2.format(ldate1));

    }
}
