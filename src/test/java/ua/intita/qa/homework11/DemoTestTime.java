package ua.intita.qa.homework11;

import org.junit.Test;

import javax.swing.*;
import java.sql.Time;

public class DemoTestTime {
    @Test
    public void demoTestTime(){
        Time time = Time.valueOf("10:00:00");
        System.out.println(time);

        Time time1 = new Time(121212121212L);

        System.out.println(time1);
        System.out.println(time1.toString());

        Time time2 = new Time(12,38,25);
        System.out.println(time2);
        time2.setTime(1212121212121212L);
        System.out.println(time2);

    }
}
