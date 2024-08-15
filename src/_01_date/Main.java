package _01_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        //количество миллисекунд с 1970 года 00:00:00
        System.out.println(date1.getTime());

        Date date2 = new Date(1723564002407l);
        System.out.println(date2);

        //?
        Date date3 = new Date(2024, 8, 14);
        System.out.println(date3);

        //1900+year, month 0-11
        Date date4 = new Date(124, 7, 14);
        System.out.println(date4);

        System.out.println(date1.getDate() + "." + (date1.getMonth() + 1) + "." + (date1.getYear() + 1900));
        System.out.println(date1.getHours() + ":" + date1.getMinutes() + ":" + date1.getSeconds());

        System.out.println(date1.before(date2));//date1 перед date2
        System.out.println(date1.after(date2));//date1 после date2

        //SimpleDateFormat - класс определяющий шаблон перевода даты в строку и строки в дату
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(simpleDateFormat1.format(date1));

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM yy");
        System.out.println(simpleDateFormat2.format(date1));

        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("'Сегодня' d MMMM yyyy 'года'");
        System.out.println(simpleDateFormat3.format(date1));

        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(simpleDateFormat4.format(date1));

        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("'Текущее время' HH:mm:ss");
        System.out.println(simpleDateFormat5.format(date1));

        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("HH:mm:ss zzzz");
        System.out.println(simpleDateFormat6.format(date1));

        System.out.println("*******************");
        String dateStr = "24.09.2024"; //НЕУДОБНО
        SimpleDateFormat formatFrom = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat formatTo = new SimpleDateFormat("MM/dd/yyyy");
        try {
            //из строки получаем дату в соответствии с шаблоном
            Date dateParse = formatFrom.parse(dateStr);
            System.out.println(dateParse);
            //из даты получаем строку в соответствии с шаблоном
            System.out.println(formatTo.format(dateParse));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
