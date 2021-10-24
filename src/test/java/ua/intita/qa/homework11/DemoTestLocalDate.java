package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.LocalDate;

public class DemoTestLocalDate {
    @Test
    public void demoTestLocalDate(){
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.of(2020,12,14);
        System.out.println(localDate2);
        LocalDate localDate3 = LocalDate.ofYearDay(1995, 185);
        System.out.println(localDate3);
        LocalDate localDate4 = LocalDate.ofEpochDay(20000);
        System.out.println(localDate4);

        LocalDate localDate5 = LocalDate.parse("1968-02-12");
        System.out.println(localDate5);

        LocalDate localDate6 = LocalDate.now();
        int year = localDate6.getYear();
        System.out.println(year);

        int day = localDate6.getDayOfMonth();
        System.out.println(day);

        int day1 = localDate6.lengthOfMonth();
        System.out.println(day1);

        LocalDate withDayOfMonth = localDate6.withDayOfMonth(30);
        System.out.println(withDayOfMonth);

        LocalDate plusYear = localDate6.plusYears(2);
        System.out.println(plusYear);

        long toEpochDay = localDate6.toEpochDay();
        System.out.println(toEpochDay);

        System.out.println(localDate6.equals(plusYear));
        System.out.println(plusYear.compareTo(localDate6));



    }
}
