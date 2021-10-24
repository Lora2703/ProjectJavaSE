package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.LocalDateTime;

public class DemoTestLocalDateTime {
    @Test
    public void demoTestLocalDateTime(){
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println(localDateTime1);

        int day = localDateTime1.getDayOfYear();
        int hour = localDateTime1.getHour();
        System.out.println(day + "   "+ hour);

        LocalDateTime date1 = localDateTime1.withMonth(8).minusYears(3);
        System.out.println(date1);

        System.out.println(localDateTime1.isAfter(date1));


    }
}
