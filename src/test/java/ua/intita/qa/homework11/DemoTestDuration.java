package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.Duration;

public class DemoTestDuration {
    @Test
    public void demoTestDuration(){
        Duration duration1 = Duration.ofDays(5);
        System.out.println(duration1);

        Duration duration2 = Duration.ofHours(1);
        System.out.println(duration2);

        long duration3 = duration2.getSeconds();
        System.out.println(duration3);

        System.out.println(duration1.equals(duration2));

        Duration duration4 = duration2.minusSeconds(1000000000L);
        System.out.println(duration4);
    }
}
