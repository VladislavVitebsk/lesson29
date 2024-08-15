package _02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        //Calendar класс позволяет хранить дату и перемещаться по ней
        //увеличивать или уменьшать дату
        Calendar calendar1 = new GregorianCalendar(); //текущая дата и время
        System.out.println(calendar1);

        //универсальный гетер который вернет поле по значению одной из статических констант класса
        System.out.println(calendar1.get(5) + " " + (calendar1.get(2)+1) + " " + calendar1.get(1));
        System.out.println("или");
        System.out.println(calendar1.get(Calendar.DATE) + " " +
                (calendar1.get(Calendar.MONTH)+1) + " " +
                calendar1.get(Calendar.YEAR));

        //универсальный сеттер (что меняем, на что меняем)
        calendar1.set(Calendar.YEAR, 2025); //меняем текущий год на 2025
        calendar1.set(Calendar.MINUTE, 51);//меняем текущие минуты на 51

        //увеличить или уменьшить дату
        calendar1.add(Calendar.DATE, 28);//изменение даты увеличением на 28 дней
        calendar1.add(Calendar.MONTH, -10);//изменение даты уменьшением на 10 месяцев

        Date date1 = calendar1.getTime(); //вернет дату в виде объекта Date
        //вывод: число, месяц_слово, гoд, часы(24)-мин-сек
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd MMMM yyyy HH-mm-ss");
        System.out.println(simpleDateFormat1.format(date1));

        Calendar calendar2 = new GregorianCalendar(2024, 11, 30, 18, 25, 30);
        System.out.println(simpleDateFormat1.format(calendar2.getTime()));

    }
}
