package ua.intita.qa.homework11;

import org.junit.Test;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class DemoTestInstant {
    @Test
    public void demoTestInstant(){
        Instant now = Instant.now();
        System.out.println(now);
        Instant instant1 = now.with(ChronoField.NANO_OF_SECOND, 10);
        System.out.println(instant1);

        long seconds = now.getEpochSecond();
        System.out.println(seconds);
        long nano = now.getNano();
        System.out.println(nano);


        Instant afterEpoch = Instant.ofEpochSecond(100);
        System.out.println(afterEpoch);

        System.out.println(now.isAfter(afterEpoch));
        System.out.println(now.isBefore(afterEpoch));
        System.out.println(now.equals(afterEpoch));

    }
}
