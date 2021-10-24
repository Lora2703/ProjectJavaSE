package ua.intita.qa.homework11;

import org.junit.Test;



import java.util.Date;

public class DemoTestDate {
    @Test
    public void demoTestDate() throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(2000);
        Date date2 = new Date();

        System.out.println((date1.getTime() > date2.getTime())? "date1>date2": "date1<date2");

        System.out.println(date1.before(date2));

        System.out.println(date1.after(date2));

        System.out.println(date1.equals(date2));

        Date date3 = new Date();
        Date date4 = new Date();

        System.out.println(date3.equals(date4));

        System.out.println(date3.compareTo(date4));
        System.out.println(date1.compareTo(date4));
        System.out.println(date3.compareTo(date1));


    }
}
